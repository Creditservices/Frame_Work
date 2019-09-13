package credit_services;

import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public class Ikano extends BaseClass {
	
	public static void agrGenerator(String strXmlData1, String strXmlData2, String strXmlData3,
			int intCount, String StrUrl, String strUsrName, String strPassWord) throws FilloException{
				
		for (int i = 1; i <= intCount; i++) {
			
			String xmlData1=strXmlData1, xmlData2=strXmlData2, xmlData3=strXmlData3;
			String responseData="",apply="",quotationSearch="",eSignatureURL="";
			Recordset IK_recordSet;
									
			boolean flag = true;
			String agrNum = "", decisionCode = "";
			String eSignUrl = "", agrStatus ="", updateQuery = "", contentType = "text/xml";
			
			//***replace variables with values in parameterised XML
			IK_recordSet = connection.executeQuery("Select * from IKANO Where SI_NO='"+i+"'");
			IK_recordSet.next();
			for (int j = 0; j < IK_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(IK_recordSet.getField(j).name().toLowerCase());
				if (xmlData1.contains(variable)) {
					String value =IK_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
		       	 	xmlData1 =  xmlData1.replace(variable, value);
				}			
			}
			
			responseData = execute(contentType, StrUrl+"/ikanoD2CApi/token/?username="+strUsrName+"&password="+strPassWord);
			//System.out.println(responseData);
			
			//***quotationSearch
	        if (responseData.contains("<apply>")) {
	        	
				//Extract token values from responseData
				apply= splitValues(responseData, "<apply>","</apply>");
				quotationSearch= splitValues(responseData, "<quotationSearch>","</quotationSearch>");	
			    eSignatureURL= splitValues(responseData, "<eSignatureURL>","</eSignatureURL>");
			   
		        		        
		        responseData = execute(contentType, StrUrl+quotationSearch+"?xml="+xmlData1);
		        //Extract person Id from response data
		        if (responseData.contains("<agreementNumber>")) {
		        	agrNum = splitValues(responseData, "<agreementNumber>","</agreementNumber>");
				}
		            
			}else {
				flag = false;
				updateQuery = "Update IKANO Set AGREEMENT_NUMBER ='error in getting tokens!' Where SI_NO='"+i+"'";	
			}
	        
	        //***apply
	        if (!agrNum.equalsIgnoreCase("") && flag) {
	        	apply = apply.replace("AGRNUM", agrNum);
		        
		        responseData = execute(contentType, StrUrl+apply+"?xml="+xmlData2);
		        //Extract agreement number from response data
		        if (responseData.contains("<decision>")) {
		        	decisionCode = splitValues(responseData, "<decision>","</decision>");
				}
		        
			}else {
				flag = false;
				updateQuery = "Update IKANO Set AGREEMENT_NUMBER ='error in generating agreement number!' Where SI_NO='"+i+"'";	
			}
	        
	        //***Front office approval
	        if (decisionCode.equalsIgnoreCase("Refer/1")) {
	        	
	    		try {
	    			initializeWebDriver();
	    			frontofficeLogin(recordSet.getField("FO_URL"), strUsrName, strPassWord);
	    			agrStatus = frontofficeApprove(agrNum);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		
			}else if (decisionCode.equalsIgnoreCase("Approved")) {
				System.out.println("Agreement number: "+agrNum+" is in appoved status. So no need to launch from office****");
			} else {
				flag = false;
				updateQuery = "Update IKANO Set AGREEMENT_NUMBER ='error in apply step!' Where SI_NO='"+i+"'";	
			}
	        
	        //***eSignature
	        if (agrStatus.equalsIgnoreCase("Approved") && flag) {
	        	eSignatureURL = eSignatureURL.replace("AGRNUM", agrNum);
		        responseData = execute(contentType, StrUrl+eSignatureURL+"?xml="+xmlData3);
		        //Extract document eSign URL from response data
		        if (responseData.contains("<eSigURL>")) {
		        	eSignUrl = splitValues(responseData, "<eSigURL>","</eSigURL>");
		        	flag = eSignAgrDocuments(eSignUrl);
				}
		        
			}else {
				flag = false;
				updateQuery = "Update IKANO Set AGREEMENT_NUMBER ='error in generating Agreement number!' Where SI_NO='"+i+"'";	
			}
	        
	        //***after validating the agreement documents
	        if (flag) {
	        	updateQuery = "Update IKANO Set apply='"+apply+"',AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";
			} else {
				updateQuery = "Update IKANO Set apply='"+apply+"',AGREEMENT_NUMBER ='error in agreement eSigning #"+agrNum+"' Where SI_NO='"+i+"'";	
			}
	        
	        connection.executeUpdate(updateQuery);
		}       	
	}
	
	//***agreement approval
	public static String frontofficeApprove(String agrNum) throws  Exception
	{	
		String agrStatus = "";
		try
		{
			//***agreement search
			driver.findElement(POM_Repository.FO_AgreementNumber).sendKeys(agrNum);
			driver.findElement(POM_Repository.FO_SubmitAgreement).click();
			//String FOstatus=driver.findElement(POM_Repository.FO_Agreementstatus).getText().toString();
			//System.out.println(FOstatus);
			driver.findElement(POM_Repository.FO_AgreementLink).click();
			//Approve
			driver.findElement(POM_Repository.FO_Approvebutton).click();
			//Approvebutton
			driver.findElement(POM_Repository.FO_Clickapprovebutton).click();
			agrStatus=driver.findElement(POM_Repository.FO_Agrapprovestatus).getText().toString();
			//System.out.println(agrStatus);
		}	    
		
		catch (Exception e) 
		{   
			System.out.println("The exception was: "+e);	   	      
		}
		return agrStatus;
    }
	
	//***eSigning agreement documents
	public static boolean eSignAgrDocuments(String url){
		boolean flag = false;
		try {
			driver.get(url);
			driver.findElement(POM_Repository.IK_Chk_ESign).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.IK_Btn_Proceed)));
	    	driver.findElement(POM_Repository.IK_Btn_Proceed).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.IK_Chk_AgrSign)));
	    	driver.findElement(POM_Repository.IK_Chk_AgrSign).click();
	    	driver.findElement(POM_Repository.IK_Chk_WarrantySign).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.IK_Btn_Submit)));
	    	driver.findElement(POM_Repository.IK_Btn_Submit).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.IK_Btn_Next)));
	    	driver.findElement(POM_Repository.IK_Btn_Next).click();
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(POM_Repository.IK_Btn_Confirm)));
	    	flag = driver.findElement(POM_Repository.IK_Btn_Confirm).isDisplayed();
	    
		} catch (Exception e) {
			System.out.println("The exception was: "+e);
		}
		return flag;
    	
	}
	
}
