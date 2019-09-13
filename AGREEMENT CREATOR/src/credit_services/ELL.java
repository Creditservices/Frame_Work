package credit_services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import org.openqa.selenium.support.ui.Select;

public class ELL extends BaseClass{
	
	public static void agrGenerator(String strJsonData, int intCount, String strUrl, String strUsrName, String strPassWord) throws FilloException{
		
		for (int i = 1; i <= intCount; i++) {
			
			String jsonData = strJsonData, updateQuery="", agrNum="";
			Recordset EL_recordset;
			
			DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmSSS");
			Date date = new Date();
			String uniqueKey = df.format(date);
						
			//***replace variables with values in parameterised JSON
			jsonData = jsonData.replace("{{$timestamp}}", uniqueKey);
			EL_recordset = connection.executeQuery("Select * from ELL Where SI_NO='"+i+"'");
			EL_recordset.next();
			for (int j = 0; j < EL_recordset.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(EL_recordset.getField(j).name().toLowerCase());
				if (jsonData.contains(variable)) {
					String value =EL_recordset.getField(j).value();
					jsonData =  jsonData.replace(variable, value);
		       	 	
				}
			}
			//System.out.println(jsonData);
			
			ValidatableResponse response = execute("application/json", strUsrName, strPassWord, strUrl, jsonData);
			
			int statusCode = response.extract().statusCode();
			//System.out.println(response.extract().body().asString());
			JsonPath jsonPath =  new JsonPath(response.extract().body().asString());
			agrNum = jsonPath.getString("agreementNumber");
			//System.out.println(agrNum);
			if (statusCode == 201) {
				if (activateAgreement(EL_recordset, agrNum)) {
					updateQuery = "Update ELL Set AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";
				}else{
			    	updateQuery = "Update ELL Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
			    }
			}
		    else{
		    	updateQuery = "Update ELL Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
		    }
		    connection.executeUpdate(updateQuery);  
		}
		
	}
	
	//****Agreement activation start****
	public static boolean activateAgreement(Recordset EL_recordSet, String agrNum){
		boolean activated = false;
	    try {
	    	initializeWebDriver();
			frontofficeLogin(recordSet.getField("FO_URL"), recordSet.getField("USERNAME"), recordSet.getField("PASSWORD"));
			foAgreementSearch(agrNum);
			queueProposal(EL_recordSet);
			foAgreementSearch(agrNum);
			loanOption(EL_recordSet);
			approveLoan(EL_recordSet);
			foAgreementSearch(agrNum);
			activated = payoutActivate(EL_recordSet);
		} catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
	    return activated;
	}
	
	//Search agreement
	public static void foAgreementSearch(String agrNum) throws  Exception {  
		 try{
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.FO_Lnk_NewProposal)));
			 driver.findElement(POM_Repository.FO_Lnk_NewProposal).click();
			 driver.findElement(POM_Repository.FO_AgreementNumber).sendKeys(agrNum);
			 driver.findElement(POM_Repository.FO_SubmitAgreement).click();
			 driver.findElement(POM_Repository.FO_AgreementLink).click();
		 }
		 catch(Exception e){
			 System.out.println("The exception was "+e);  
		 }		
    }
	
	//Queue agreement
	public static void queueProposal(Recordset EL_recordSet) throws  Exception {    	
	   
		 try{
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Queue_proposal)));
			 driver.findElement(POM_Repository.EL_Queue_proposal).click();
			 Select select2 = new Select(driver.findElement(POM_Repository.EL_Work_queue));
			 select2.selectByVisibleText(EL_recordSet.getField("Work_queue1"));			
			 driver.findElement(POM_Repository.EL_queue).click();
		 }
		 catch(Exception e){
			 System.out.println("The exception was "+e);  
		 }		
	}
	
	//Entering loan options
	public static void loanOption(Recordset EL_recordSet) throws  Exception { 
		 try{
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Loanoption)));
			 driver.findElement(POM_Repository.EL_Loanoption).click();
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Newoption)));
			 driver.findElement(POM_Repository.EL_Newoption).click();
			 driver.findElement(POM_Repository.EL_cashtocustomer).sendKeys(EL_recordSet.getField("Cashtocustomer"));
			 Select select2 = new Select(driver.findElement(POM_Repository.EL_Rate));
			 select2.selectByVisibleText(EL_recordSet.getField("Rate"));			
		 	 driver.findElement(POM_Repository.EL_Term).sendKeys(EL_recordSet.getField("Term"));
		 	 driver.findElement(POM_Repository.EL_Recalculate).click();
		 	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Btn_Save)));
		 	 driver.findElement(POM_Repository.EL_Btn_Save).click();
		 	 driver.switchTo().alert().accept();
		 	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Btn_Takeup)));
		 	 driver.findElement(POM_Repository.EL_Btn_Takeup).click();
		 	 
		 }
		 catch(Exception e){
			 System.out.println("The exception was "+e);  
		 }
	}
	
	//Approve loan
	public static void approveLoan(Recordset EL_recordSet) throws  Exception {
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Approve_loan)));
			driver.findElement(POM_Repository.EL_Approve_loan).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Btn_Approve)));
			driver.findElement(POM_Repository.EL_Btn_Approve).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Queue_proposal)));
			driver.findElement(POM_Repository.EL_Queue_proposal).click();
		 	Select select3 = new Select(driver.findElement(POM_Repository.EL_Work_queue));
			select3.selectByVisibleText(EL_recordSet.getField("Work_queue2"));			
		    Thread.sleep(700);
		    driver.findElement(POM_Repository.EL_queue).click();
		}
		catch(Exception e){
			 System.out.println("The exception was "+e);  
		}
	}
	
	//Payout and Activate
	public static boolean payoutActivate(Recordset EL_recordSet) throws  Exception {
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_payoutButton)));
			driver.findElement(POM_Repository.EL_payoutButton).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_Btn_Activate)));
			driver.findElement(POM_Repository.EL_Btn_Activate).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.EL_ActivationSuccessMsg)));
		}
		catch(Exception e){
			 System.out.println("The exception was "+e);  
		}
		//return true or false based on success message display
		return driver.findElement(POM_Repository.EL_ActivationSuccessMsg).isDisplayed();
	}
	
}
