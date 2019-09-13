package credit_services;

import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.restassured.path.xml.XmlPath;

public class Startline extends BaseClass{
	
	public static void agrGenerator(String strXmlData, int intCount, String strUrl) throws FilloException, InterruptedException{
		
		for (int i = 1; i <= intCount; i++) {
			
			String xmlData=strXmlData, responseData="", updateQuery="", agrNum="";
			Recordset SL_recordSet;
			
			//***replace variables with values in parameterised XML
			SL_recordSet = connection.executeQuery("Select * from STARTLINE Where SI_NO='"+i+"'");
			SL_recordSet.next();
			for (int j = 0; j < SL_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(SL_recordSet.getField(j).name().toLowerCase());
				if (xmlData.contains(variable)) {
					String value =SL_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
					xmlData =  xmlData.replace(variable, value);
		       	 	
				}
			}
			//System.out.println(xmlData);
			
			responseData = execute("text/xml", xmlData, strUrl);
			
			//Parse the response with XmlPath 			
			XmlPath xml = new XmlPath(responseData).setRoot("Envelope.Body.CreateProposalResponseParameter.AgreementList.Agreement");
			//Get the value by giving the node name
			agrNum = xml.getString("AgreementNumber");
			//System.out.println(agrNum);
		    if (!agrNum.equalsIgnoreCase("")) {
		    	if (activateAgreement(SL_recordSet, agrNum)) {
		    		updateQuery = "Update STARTLINE Set AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";
				}else{
			    	updateQuery = "Update STARTLINE Set AGREEMENT_NUMBER ='error in activating "+agrNum+"' Where SI_NO='"+i+"'";
			    }
			} 
		    else{
		    	updateQuery = "Update STARTLINE Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
		    }
		    connection.executeUpdate(updateQuery); 
		}
		
	}
	
	//****Agreement activation start***
	public static boolean activateAgreement(Recordset SL_recordSet, String agrNum){
		boolean activated = false;
		String advance="", installment="", status="";
		try {
			Thread.sleep(20000);
			initializeWebDriver();
			frontofficeLogin(recordSet.getField("FO_URL"), recordSet.getField("USERNAME"), recordSet.getField("PASSWORD"));
			status = searchAgreement(SL_recordSet, agrNum);
			if (status.equalsIgnoreCase("Referred")) {
				advance = driver.findElement(POM_Repository.SL_Elm_Advance).getText();
				installment = driver.findElement(POM_Repository.SL_Elm_Installment).getText();
				//manual override and pay out
				payoutGolive(SL_recordSet);
				enterAmount(advance, installment, SL_recordSet.getField("Baloon"), "0.00");
				driver.findElement(POM_Repository.SL_Btn_1stCheck).click();
				Thread.sleep(2000);
				driver.findElement(POM_Repository.SL_Btn_Yes).click();
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_ConfSpecTerms)));
				driver.findElement(POM_Repository.SL_Btn_ConfSpecTerms).click();
				enterAmount(advance, installment, SL_recordSet.getField("Baloon"), "0.00");
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_DocsApproved)));
				driver.findElement(POM_Repository.SL_Btn_DocsApproved).click();
				Thread.sleep(2000);
				driver.findElement(POM_Repository.SL_Btn_Yes).click();
				enterAmount(advance, installment, SL_recordSet.getField("Baloon"), "0.00");
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_PayoutGolive)));
				driver.findElement(POM_Repository.SL_Btn_PayoutGolive).click();
				Thread.sleep(2000);
				driver.findElement(POM_Repository.SL_Btn_Yes).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.SL_Elm_status)));
				status = driver.findElement(POM_Repository.SL_Elm_status).getText();
				if (status.equalsIgnoreCase("Awaiting Payout")) {
					activated = true;
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
		return activated;
	}
	
	//Search agreement and refresh page untill decision become referred
	public static String searchAgreement(Recordset SL_recordSet ,String agrNum){
		String status="";
		try{
			driver.findElement(POM_Repository.SL_Lnk_MotorProposal).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.SL_Edt_AgrNum)));
			driver.findElement(POM_Repository.SL_Edt_AgrNum).sendKeys(agrNum);
			driver.findElement(POM_Repository.SL_Lnk_SearchAgr).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.SL_Lnk_AgrNum)));
			driver.findElement(POM_Repository.SL_Lnk_AgrNum).click();
			if (driver.findElement(POM_Repository.SL_Elm_Financials).isDisplayed()) {
				driver.findElement(POM_Repository.SL_Btn_Continue).click();
			}
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.SL_Elm_status)));
			status = driver.findElement(POM_Repository.SL_Elm_status).getText();
			if (SL_recordSet.getField("Brndname").equalsIgnoreCase("Finishline Brand")) {
				Select s1 = new Select(driver.findElement(POM_Repository.SL_Lst_Brand));
				s1.selectByVisibleText(SL_recordSet.getField("Brndname"));
				driver.findElement(POM_Repository.SL_Btn_Refresh).click();
			}		
			//Refresh untill status changes to referred
			if (!status.equalsIgnoreCase("Referred")) {
				for (int i = 0; i < 5; i++) {
					if (!(driver.findElement(POM_Repository.SL_Elm_status).getText().equalsIgnoreCase("Referred"))) {
						/*wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_Refresh)));
						driver.findElement(POM_Repository.SL_Btn_Refresh).click();*/
						driver.navigate().refresh();
					}else {
						break;
					}
				}
			}
			status = driver.findElement(POM_Repository.SL_Elm_status).getText();
		}catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
		return status;
	}
	
	//payout and go live
	public static void payoutGolive(Recordset SL_recordSet){
		try{
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_ManualOverride)));
			driver.findElement(POM_Repository.SL_Btn_ManualOverride).click();
			if (SL_recordSet.getField("Brndname").equalsIgnoreCase("Finishline Brand")) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_PayoutGolive)));
				driver.findElement(POM_Repository.SL_Btn_PayoutGolive).click();
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_Back)));
				driver.findElement(POM_Repository.SL_Btn_Back).click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_PayoutGolive)));
			driver.findElement(POM_Repository.SL_Btn_PayoutGolive).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Btn_DocsReceived)));
			driver.findElement(POM_Repository.SL_Btn_DocsReceived).click();
			Thread.sleep(2000);
			driver.findElement(POM_Repository.SL_Btn_Yes1).click();
		}catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
	}
	//entering amount in front office to activate
	public static void enterAmount(String adv, String installment, String balloon, String docFee){
		
		try{
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.SL_Edt_Advance)));
			driver.findElement(POM_Repository.SL_Edt_Advance).sendKeys(adv);
			driver.findElement(POM_Repository.SL_Edt_Installment).sendKeys(installment);
			driver.findElement(POM_Repository.SL_Edt_Balloon).sendKeys(balloon);
			driver.findElement(POM_Repository.SL_Edt_DocFee).sendKeys(docFee);
		}catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
	}
}
