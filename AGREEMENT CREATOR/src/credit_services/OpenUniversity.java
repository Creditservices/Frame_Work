package credit_services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.codoid.products.fillo.Recordset;
import io.restassured.path.xml.XmlPath;

public class OpenUniversity extends BaseClass{
	
	static boolean flag;
	
	public static void agrGenerator(String strXmlData, int intCount, String strUrl) throws Exception{
		
		for (int i = 1; i <= intCount; i++) {
			
			String xmlData=strXmlData, responseData="", updateQuery="", emailId="", pinum="", agrNum="", studentUrl="";
			Recordset OU_recordSet;
			
			DateFormat df = new SimpleDateFormat("dMyyHms");
			DateFormat df1 = new SimpleDateFormat("dMHms");
			Date date = new Date();
			String uniqueKey = df.format(date);
			String uniqueKey1 = df1.format(date);
			
			emailId = "fmail"+uniqueKey+"@googly.com";
			pinum = uniqueKey1;
			
			OU_recordSet = connection.executeQuery("Select * from OPENUNIVERSITY Where SI_NO='"+i+"'");
			OU_recordSet.next();
			
			//***replace variables with values in parameterised XML
			xmlData = xmlData.replace("{{EMAIL}}", emailId);
			xmlData = xmlData.replace("{{PI NUMBER}}", pinum);
			for (int j = 0; j < OU_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(OU_recordSet.getField(j).name().toLowerCase());
				if (xmlData.contains(variable)) {
					String value =OU_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
					xmlData =  xmlData.replace(variable, value);
		       	 	
				}
			}
			//System.out.println(xmlData);
			
			responseData = execute("text/xml", xmlData, strUrl);
			//System.out.println(responseData);
			
			//Parse the response with XmlPath 			
			XmlPath xml = new XmlPath(responseData).setRoot("Envelope.Body.CreateProposalResponseParameter");
			//Get the value by giving the node name
			String status = xml.getString("CompletedWithSuccess");
						
		    if (status.equalsIgnoreCase("true")) {
				agrNum = xml.getString("AgreementNumber");
			    studentUrl = xml.getString("LoanApplicationURL");
		    	if (activateAgreement(OU_recordSet, studentUrl, pinum)) {
		    		updateQuery = "Update OPENUNIVERSITY Set AGREEMENT_NUMBER ='"+agrNum+"', STUDENT_URL='"+studentUrl+"', PI_NUM='"+pinum+"', MAIL_ID='"+emailId+"' Where SI_NO='"+i+"'";
				}else{
					updateQuery = "Update OPENUNIVERSITY Set AGREEMENT_NUMBER = error while activating'"+agrNum+"', STUDENT_URL='"+studentUrl+"', PI_NUM='"+pinum+"', MAIL_ID='"+emailId+"' Where SI_NO='"+i+"'";
				}
			}
		    else{
		    	updateQuery = "Update OPENUNIVERSITY Set AGREEMENT_NUMBER ='error!', STUDENT_URL='error!!', PI_NUM='"+pinum+"', MAIL_ID='"+emailId+"' Where SI_NO='"+i+"'";
		    }
		    connection.executeUpdate(updateQuery);
		}
		
	}
	
	//****Agreement activation start***
	public static boolean activateAgreement(Recordset OU_recordSet, String studentUrl, String pinum){
		
	    try {
	    	initializeWebDriver();
			ouStudentPortalLogin(OU_recordSet, studentUrl);
			if (flag) {
				ouStudentPortal(OU_recordSet);
			}
		    //OU_Staff_Login();
		    //OU_Staff_Portal(OU_recordSet, pinum);
		} catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
	    return flag;
	    
	}
	
	public static void ouStudentPortalLogin(Recordset recordset, String Stundentportalurl) throws  Exception
    {    
		flag = false;
		try
		{
			driver.get(Stundentportalurl);					
			driver.findElement(POM_Repository.OU_Studentportal_continuebutton).click();	
			driver.findElement(POM_Repository.OU_Studentportal_Password).sendKeys(recordset.getField("Pasword"));
			driver.findElement(POM_Repository.OU_Studentportal_Confirmpaswd).sendKeys(recordset.getField("Confirmpaswd"));
			driver.findElement(POM_Repository.OU_Studentportal_submitlogin).click();
			flag = driver.findElement(POM_Repository.OU_Studentporatl_continueapplicationbutton).isDisplayed();
		}			    	   
		catch (Exception e) 	
		{   
			System.out.println("The exception was "+e);		   	      
		}
		
    }
	
	public static void ouStudentPortal(Recordset recordset) throws  Exception
    {   
		flag = false;
		try
		{
			driver.findElement(POM_Repository.OU_Studentporatl_continueapplicationbutton).click();
			driver.findElement(POM_Repository.OU_Studentporatl_continueapplicationbutton).click();
			driver.findElement(POM_Repository.OU_Studentporatl_UKaddresslink).click();
			driver.findElement(POM_Repository.OU_Studentportal_Propertynumber).sendKeys(recordset.getField("Searchpropernum"));
			driver.findElement(POM_Repository.OU_Studentportal_Postcode).sendKeys(recordset.getField("Searchpostcode"));
			driver.findElement(POM_Repository.OU_Studentportal_Searchbutton).click();
			driver.findElement(POM_Repository.OU_Studentportal_Addressnotfounlink).click();
			driver.findElement(POM_Repository.OU_Studentportal_Addresspostcode).sendKeys(recordset.getField("Adrspostcode"));
			driver.findElement(POM_Repository.OU_Studentportal_Addressflatnum).sendKeys(recordset.getField("AdrsFlatnum"));
			driver.findElement(POM_Repository.OU_Studentportal_Addresspropertynum).sendKeys(recordset.getField("Adrspropertynum"));
			driver.findElement(POM_Repository.OU_Studentportal_Addresspropertyname).sendKeys(recordset.getField("Adrspropertyname"));
			driver.findElement(POM_Repository.OU_Studentportal_Addressstreetname).sendKeys(recordset.getField("AdrsStreetname"));
			driver.findElement(POM_Repository.OU_Studentportal_Addressdistrict).sendKeys(recordset.getField("Adrsdistrict"));
			driver.findElement(POM_Repository.OU_Studentportal_Addresspostaltown).sendKeys(recordset.getField("AdrsPostaltown"));
			driver.findElement(POM_Repository.OU_Studentportal_Addressflatcounty).sendKeys(recordset.getField("AdrsCounty"));
			Select select = new Select (driver.findElement(POM_Repository.OU_Studentportal_Addressday));
			select.selectByValue(recordset.getField("OUday"));
			
			Select select1 = new Select (driver.findElement(POM_Repository.OU_Studentportal_Addressmonth));
			select1.selectByValue(recordset.getField("OuMonth"));
			
			Select select2 = new Select (driver.findElement(POM_Repository.OU_Studentportal_AddressYear));
			select2.selectByValue(recordset.getField("Ouyear"));
			
			driver.findElement(POM_Repository.OU_Studentportal_Continuebutton).click();
			driver.findElement(POM_Repository.OU_Studentportal_Continuelink).click();
			
			//financialpage
			driver.findElement(POM_Repository.OU_Studentportal_Checkbox).click();
			
			Select select3 = new Select (driver.findElement(POM_Repository.OU_Studentportal_Empoccupancy));
			select3.selectByValue(recordset.getField("Empoccupation1"));
			
			Select select4 = new Select (driver.findElement(POM_Repository.OU_Studentportal_Empstatus));
			select4.selectByValue(recordset.getField("Empoccstatus"));
			
			driver.findElement(POM_Repository.OU_Studentportal_Emppaymethod).click();
			
			//income
			driver.findElement(POM_Repository.OU_Studentportal_Annualincome).sendKeys(recordset.getField("Iannnualincome"));
			driver.findElement(By.name("monthlyIncome")).sendKeys(recordset.getField("Imonthlyincome"));
			driver.findElement(By.name("dividendsReceived")).sendKeys(recordset.getField("Idividend"));
			driver.findElement(POM_Repository.OU_Studentportal_Benefit).sendKeys(recordset.getField("Ibenefitreceived"));
			driver.findElement(By.name("rentReceived")).sendKeys(recordset.getField("Irentreceived"));
			driver.findElement(POM_Repository.OU_Studentportal_Maintenance).sendKeys(recordset.getField("Imaintenancereceived"));
			//String Totalmonthincome=driver.findElement(POM_Repository.OU_Studentportal_Totalincome).getText().toString();
			//System.out.println(Totalmonthincome);
			
			//expenditure
			driver.findElement(POM_Repository.OU_Studentportal_Creditcard).sendKeys(recordset.getField("Ecreditcard"));
			driver.findElement(POM_Repository.OU_Studentportal_Loans).sendKeys(recordset.getField("Eloans"));
			driver.findElement(POM_Repository.OU_Studentportal_Counciltax).sendKeys(recordset.getField("Ecounciltax"));
			driver.findElement(POM_Repository.OU_Studentportal_Utilities).sendKeys(recordset.getField("Eutilities"));
			driver.findElement(POM_Repository.OU_Studentportal_Mortgage).sendKeys(recordset.getField("Emortgage"));
			driver.findElement(POM_Repository.OU_Studentportal_Noofdependants).clear();
			driver.findElement(POM_Repository.OU_Studentportal_Noofdependants).sendKeys(recordset.getField("Enoofdependants"));
			driver.findElement(POM_Repository.OU_Studentportal_Noofadults).clear();
			driver.findElement(POM_Repository.OU_Studentportal_Noofadults).sendKeys(recordset.getField("Enoofadults"));
			driver.findElement(POM_Repository.OU_Studentportal_Savebutton).click();
									
			//employment
			driver.findElement(POM_Repository.OU_Studentportal_Employeename).sendKeys(recordset.getField("Employeename"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeetelephone).sendKeys(recordset.getField("Emptelephonenumber"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeepropertynumber).sendKeys(recordset.getField("Emppropertynumber"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeestreetname).sendKeys(recordset.getField("Empstreetname"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeedistrict).sendKeys(recordset.getField("Empdistrict"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeeposttown).sendKeys(recordset.getField("Emppostaltown"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeepostcode).sendKeys(recordset.getField("Emppostcode"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeecounty).sendKeys(recordset.getField("Empcounty"));
						
			Select select5 = new Select (driver.findElement(POM_Repository.OU_Studentportal_Employeecountry));
			select5.selectByValue(recordset.getField("Empcounty1"));
						
			driver.findElement(POM_Repository.OU_Studentportal_Employeeyear).sendKeys(recordset.getField("Noofyears"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeemonth).sendKeys(recordset.getField("Noofmonths"));
			driver.findElement(POM_Repository.OU_Studentportal_Employeeoccupation).sendKeys(recordset.getField("Empoccupation"));
			
			Select select6 = new Select (driver.findElement(POM_Repository.OU_Studentportal_Employeepositionid));
			select6.selectByValue(recordset.getField("EmpPosition"));
						
			Select select7 = new Select (driver.findElement(POM_Repository.OU_Studentportal_Employeesectorid));
			select7.selectByValue(recordset.getField("Empsectionid"));
						
			driver.findElement(POM_Repository.OU_Studentportal_Employeesave).click();
						
			//directdebit
			driver.findElement(POM_Repository.OU_Studentportal_Banksortcode).sendKeys(recordset.getField("Banksortcode"));
			driver.findElement(POM_Repository.OU_Studentportal_Search).click();
			driver.findElement(POM_Repository.OU_Studentportal_Banknamelink1).click();
			driver.findElement(POM_Repository.OU_Studentportal_Bankaccountname).sendKeys(recordset.getField("Bankaccountname"));
			driver.findElement(POM_Repository.OU_Studentportal_Bankaccountnumber).sendKeys(recordset.getField("Bankaccountnumber"));
			driver.findElement(POM_Repository.OU_Studentportal_Onesignature).click();
			driver.findElement(POM_Repository.OU_Studentportal_Directdebitsave).click();
			driver.findElement(POM_Repository.OU_Studentportal_Directdebitcontinue).click();
			driver.findElement(POM_Repository.OU_Studentportal_DDconitue).click();
						
			driver.findElement(POM_Repository.OU_Studentportal_DDContinuewithapplink).click();
			driver.findElement(POM_Repository.OU_Studentportal_DDContinuewithapplink).click();
			//String OUrefststus=driver.findElement(POM_Repository.OU_Studentportal_OuStudentstatus).getText().toString();
			driver.findElement(POM_Repository.OU_Student_Checkbox).click();
			flag = driver.findElement(POM_Repository.OU_Student_Accept).isDisplayed();
			driver.findElement(POM_Repository.OU_Student_Accept).click();
			//driver.findElement(POM_Repository.OU_Student_Accept).click();
		}			    
		catch (Exception e) 
		{   
			System.out.println("The exception was "+e);	   	      
		}
    				
    }
	
	public static void ouStaffLogin() throws  Exception
    {   
		driver.get("https://outest.pancredit.com/ousbaStaff/");
		Thread.sleep(1000);
		driver.findElement(POM_Repository.OU_Staffcontinuelink).click();
		driver.findElement(POM_Repository.OU_Usernamestaff).sendKeys("ouadmin");
		driver.findElement(POM_Repository.OU_Passwordstaff).sendKeys("ouadmin");
		driver.findElement(POM_Repository.OU_Submitlogin).click();
    }
	
	public static void ouStaffPortal(Recordset recordset, String PiNum) throws  Exception
    {    			
		try
		{
			driver.findElement(POM_Repository.OU_Staff_Pinumber).sendKeys(PiNum);
			driver.findElement(POM_Repository.OU_Staff_Seacrhbutton).click();
			driver.findElement(POM_Repository.OU_Staff_PIdetails).click();
			String Acceptstatus=driver.findElement(POM_Repository.OU_Staff_Agrstatus).getText().toString();
			System.out.println(Acceptstatus);
			driver.findElement(POM_Repository.OU_Staff_Agreementlink).click();
			driver.findElement(POM_Repository.OU_Staff_Continueapplicationbutton).click();
			driver.findElement(POM_Repository.OU_Staff_Continueapplicationbutton).click();			
			/*driver.findElement(POM_Repository.OU_Staff_Checkbox).click();
			driver.findElement(POM_Repository.OU_Staff_Save).click();
			*/
			driver.findElement(POM_Repository.OU_Staffportal_finishbutton).click();
			driver.findElement(POM_Repository.OU_Staff_Pinumber).sendKeys(PiNum);
			driver.findElement(POM_Repository.OU_Staff_Seacrhbutton).click();
			driver.findElement(POM_Repository.OU_Staff_PIdetails).click();
			String ActiveStatus=driver.findElement(POM_Repository.OU_Staff_Agrstatus).getText().toString();
			System.out.println(ActiveStatus);
			driver.findElement(POM_Repository.OU_Staff_Agreementlink).click();
			driver.findElement(POM_Repository.OU_Staff_logout).click();
		}			    
		catch (Exception e) 
		{   
			System.out.println("The exception was "+e);   	      
		}			
    }
}
