package credit_services;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.restassured.path.json.JsonPath;

public class Telefonica extends BaseClass{
	
	public static void agrGenerator(String strJsonData1, String strJsonData2, String strJsonData3, int intCount, String strUrl, String strUsrName, String strPassWord) throws FilloException{
		
		for (int i = 1; i <= intCount; i++) {
			
			String jsonData1=strJsonData1, responseData="", updateQuery="", agrNum="", eSignUrl="";
			Recordset TF_recordSet;
			
			Date date= new Date();
			SimpleDateFormat sf = new SimpleDateFormat("Hms");
			String uniquekey = sf.format(date);
			
			//***replace variables with values in parameterised XML
			TF_recordSet = connection.executeQuery("Select * from TELEFONICA Where SI_NO='"+i+"'");
			TF_recordSet.next();
			jsonData1 = jsonData1.replace("Refnum", uniquekey);
			for (int j = 0; j < TF_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(TF_recordSet.getField(j).name().toLowerCase());
				if (jsonData1.contains(variable)) {
					String value =(TF_recordSet.getField(j).value());
					//System.out.println(variable+": "+value);
					jsonData1 =  jsonData1.replace(variable, value);
				}
			}
			//System.out.println(jsonData1);
									
			responseData = execute(uniquekey, strUsrName, strPassWord, strUrl+"HardwareLoanAgreement/"+"?json="+jsonData1);
			//System.out.println(responseData);
			
			//Parse the response with JsonPath	
			JsonPath jsonPath =  new JsonPath(responseData);
			agrNum = jsonPath.getString("AgreementNumber");
			//System.out.println(agrNum);
			
			responseData = execute(uniquekey, strUsrName, strPassWord, strUrl+"HardwareLoanAgreement/"+agrNum+"/ESignature/?json="+strJsonData2);
			//System.out.println(responseData);
			
			//Parse the response with JsonPath	
			jsonPath =  new JsonPath(responseData).setRoot("LoanAgreement");
			eSignUrl = jsonPath.getString("ESignatureCallUrl");
			//System.out.println(eSignUrl);
			
		    if (activateAgreement(eSignUrl)) {
		    	execute(uniquekey, strUsrName, strPassWord, strUrl+"HardwareLoanAgreement/"+agrNum+"/Attribute/?json="+strJsonData3);
		    	updateQuery = "Update TELEFONICA Set AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";
			}
		    else{
		    	updateQuery = "Update TELEFONICA Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
		    }
		    connection.executeUpdate(updateQuery);
		}
	}
	
	//****Agreement activation start***
	public static boolean activateAgreement(String eSignUrl){
		boolean activated = false;
	    try {
	    	initializeWebDriverTF();
	    	driver.get(eSignUrl);
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.TUK_Chk_Secci)));
	    	driver.findElement(POM_Repository.TUK_Chk_Secci).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.TUK_Btn_Proceed)));
	    	driver.findElement(POM_Repository.TUK_Btn_Proceed).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.TUK_Chk_AgrSign)));
	    	if (driver.findElement(POM_Repository.TUK_Chk_AgrSign).isDisplayed()) {
	    		driver.navigate().refresh();
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.TUK_Chk_AgrSign)));
	    		driver.findElement(POM_Repository.TUK_Chk_AgrSign).click();
			}
	    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(POM_Repository.TUK_Btn_Submit)));
	    	driver.findElement(POM_Repository.TUK_Btn_Submit).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.TUK_Btn_Next)));
	    	driver.findElement(POM_Repository.TUK_Btn_Next).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.TUK_Btn_Continue)));
	    	driver.findElement(POM_Repository.TUK_Btn_Continue).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.TUK_FinalMsg)));
	    	activated = driver.findElement(POM_Repository.TUK_FinalMsg).isDisplayed();
	    	driver.close();
		} catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
	    return activated;
	}
	
}
