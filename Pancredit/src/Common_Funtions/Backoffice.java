package Common_Funtions;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import Provident.Provident;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;

public class Backoffice 
{
static String Settlementvalue=" ";
static String EMI_STRING;
static String Lastduedate; 
static String Targetdate;
static String Transamt;



public static void Date_Fetch()throws Exception
{

String currentdate=Common_Property.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div")).getText().toString();
System.out.println(currentdate);
//Testdata.StoreTD(currentdate, "systemdate");	
}

public static void Paymentdate_BO() throws Exception	
{
				System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
				String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				//
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
				Date sdate = new Date();
				String datetimestart=dateFormat.format(sdate);	
	try{
		//NAVIGATION
		Thread.sleep(5050);
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(5000);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(5750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();
	
		Thread.sleep(3050);
	
		//MAINTAIN CUSTOMER AGREEMENT
	
		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(2700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(1700);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
		Thread.sleep(700);
		//Reschedules
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Reschedules']")).click();//DOCUMENT 
		Thread.sleep(1750);
	
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain Next Due Date']")).click(); 
		Thread.sleep(1200);
		
	//PATH-CHANGE EXECUTION
		if(Driver.getData("PD_Verificationtype").equalsIgnoreCase("DateChange"))
		{      
        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).click();
        Thread.sleep(700);
        
       
      
        
        if(Driver.getData("Due_Date_Type").equalsIgnoreCase("All due dates"))
        {
        //	Common_Property.driver.findElement(By.xpath("//div[text()='All due dates.']")).click();
        	 Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).sendKeys(Keys.ARROW_DOWN);
		        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).sendKeys(Keys.ENTER);
        }
        
        else if(Driver.getData("Due_Date_Type").equalsIgnoreCase("Just The Next Due Date"))
        	
        {	
        	//Common_Property.driver.findElement(By.xpath("//div[text()='Just the next due date']")).click();
        	for(int z=0;z<=2;z++){ 
        	Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).sendKeys(Keys.ARROW_DOWN);}
		        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).sendKeys(Keys.ENTER);
        }
        
        
		Thread.sleep(1750);
		
		String Str_Date = Common_Property.driver.findElement(By.xpath("//input[@name='DueDateWindow.DueDateView.dfMaximumBackwardsDueDate']")).getAttribute("value");
			
		 	DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy"); 
		    Calendar c = Calendar.getInstance();
	        c.setTime(formatter.parse(Str_Date));
	        String  First_Date_Addition_str=Driver.getData("First_Date_Addition");
	        int First_Date_Addition_int = Integer.parseInt(First_Date_Addition_str);
	        
	        c.add(Calendar.DATE,First_Date_Addition_int);	        
	        String Targetdate = formatter.format(c.getTime());  
	        System.out.println("The added date is "+Targetdate); 
	        
		  String  Targetdate1=(Targetdate.substring(0,2));
	        System.out.println("Segricated date "+Targetdate1);
	                
	        
	        		int int_date = Integer.parseInt(Targetdate1);
	        		
			        if(int_date==29||int_date==30 ||int_date==31)
			        {
			        	DateFormat formatter1 = new SimpleDateFormat("dd-MMM-yyyy");
			        	Calendar c1 = Calendar.getInstance();
					        c1.setTime(formatter.parse(Str_Date));
					        c1.add(Calendar.DATE, 2);
			            Targetdate = formatter1.format(c1.getTime());  
			        }
			        Common_Property.driver.findElement(By.xpath("//input[@name='DueDateWindow.DueDateView.dfNewNextDueDate']")).click();
				    Common_Property.driver.findElement(By.xpath("//input[@name='DueDateWindow.DueDateView.dfNewNextDueDate']")).sendKeys(Targetdate); 
		   
			        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.pbOK']")).click();	    
			   
			        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateAcceptWindow.pbOK']")).click();
			        Thread.sleep(1750);
			        String Str_Date2 = Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfNextDueDate']")).getAttribute("value");
				    
			        
		   
		//VP1
		    if(Str_Date2.equalsIgnoreCase(Targetdate)) 
			 {
				
		   		
		   		
				String Desc="The date got updated to "+Targetdate;		 
		        Utilities.ExtentPassReport(methodname);
		      }
			 	else
			 		{
			 	
			 		
			 		
			 		String Desc="The date is not updated as Expected";
			 		Utilities.ExtentFailReport1(methodname,Desc);
			 		
			 		}
		}
			// PATH-CHANGE EXECUTION  
		else if(Driver.getData("PD_Verificationtype").equalsIgnoreCase("Lengthcheck"))
		
		{
			   Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).click();
		        Thread.sleep(700);
		        
		        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).sendKeys(Keys.ARROW_DOWN);
		        Common_Property.driver.findElement(By.xpath("//div[@name='DueDateWindow.DueDateView.dlDueDateType']")).sendKeys(Keys.ENTER);
		        
				//Common_Property.driver.findElement(By.xpath("//div[text()='All due dates.']")).click();
				Thread.sleep(1750);
				
				String Str_Date = Common_Property.driver.findElement(By.xpath("//input[@name='DueDateWindow.DueDateView.dfMaximumBackwardsDueDate']")).getAttribute("value");
				
				 int strlen=Str_Date.length();
				
				 //VP2
				 if(strlen==11)
				 {
					
			   		
			   		
					String Desc="The date Fortmat is Correct";		 
			        Utilities.ExtentPassReport(methodname);
			      }
				 	else
				 		{
				 	
				 		
				 		
				 		String Desc="The date Fortmat is In-Correct";
				 		Utilities.ExtentFailReport1(methodname,Desc);
				 		
				 		}
			
		}			
			    				   
			    	
			    	
	
	
	}
	 
	 catch (Exception e)
	{
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Utilities.ExtentFailReport(methodname,e);
		

	}
	Thread.sleep(1750);
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
	 Thread.sleep(1750);
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
	 Thread.sleep(1750);
	 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
	 Thread.sleep(1750);
	
}

public static void Temporary_Arrangement()throws Exception
{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	//
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	Date sdate = new Date();
	String datetimestart=dateFormat.format(sdate);	
	
	
try{

Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//NAVIGATION
Thread.sleep(250);
WebDriverWait wait = new WebDriverWait(Common_Property.driver,6000);
wait.until(ExpectedConditions.visibilityOf(Common_Property.driver.findElement(By.xpath("//div[text()='Open']")))).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

      //MAINTAIN CUSTOMER AGREEMENT

Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
Thread.sleep(700);

//TEMPORARY ARRANGEMENT NAVIGATION
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Arrangements']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Temporary ']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.insertBelow']")).click();
Thread.sleep(1900);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[6]")).click();
Thread.sleep(1700);
 
 
String a=Driver.getData("temp_arg_value");

Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.gfArrayDetailGrid']/child::div[1]/child::div[1]/following-sibling::div[6]/child::input[1]")).sendKeys(a);
 
 
 
Thread.sleep(2700);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).click();
Thread.sleep(1550);
// Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).sendKeys(Keys.ESCAPE);;
String b = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofArrangement']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[3]")).getText();


Thread.sleep(2050);
if(a.contentEquals(b))
{
System.out.println();
System.out.println("Temporary Arrangement Build Verifed Succefully");


String Desc="Temporary Arrangement Build Verifed Succefully";		 
Utilities.ExtentPassReport(methodname);


}
else
{
System.out.println("Temporary Arrangement has not as Expected");


String Desc="Temporary Arrangement has not as Expected";
Utilities.ExtentFailReport1(methodname,Desc);
}
Thread.sleep(1550);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.pbOK']")).click();
Thread.sleep(3550);

Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
Thread.sleep(2750);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
Thread.sleep(2750);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();

}
	
catch (Exception e)
{
// TODO: handle exception
	
	System.out.println("The exception was "+e);
	System.out.println("Abnormal Termination due to "+e);
	
	String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	Utilities.ExtentFailReport(methodname,e);
	

}
 
}	

public static void BO_Welcomepack() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
	{	
		
			
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			//
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);
			
			try{
		
		Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		 
		
		//NAVIGATION
	Thread.sleep(250);	
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(700);	
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Document Production']")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.View Document Requests']")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestWindow.DocumentRequestView.pbFilter']")).click();
	Common_Property.driver.findElement(By.xpath("//input[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.pbDocumentRequestName']")).click();
	Common_Property.driver.findElement(By.xpath("//input[@name='DocumentSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Documentname"));  //Welcome Pack
	Common_Property.driver.findElement(By.xpath("//div[@name='DocumentSearchWindow.pbOK']")).click();
	Thread.sleep(1000);
	Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.pbOK']")).click();
	Common_Property.driver.findElement(By.xpath("//div[text()='Welcome Pack']")).click();
	Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestWindow.DocumentRequestView.pbDetails']")).click();
	
	//Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestDetailWindow.DocumentRequestDetailView.dfName']")).click();
	
	/*
	DocumentRequestDetailWindow.pbBespoke
	DocumentRequestRecipientWindow.DocumentRequestRecipientView.pbDocuments
	ViewDocumentPagesWindow.ViewDocumentPagesOutlineView.pbDetails
	DocumentWindow.pbCancel*/

	//Document Verification
	  		
	 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='DocumentRequestDetailWindow.DocumentRequestDetailView.dfName']")).getAttribute("value");
	 Thread.sleep(1750); 
	 System.out.println(ver);
	 
	 
	 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
	 {
		
		
		String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
		Utilities.ExtentPassReport(methodname);
		 
	 }
	 	else
	 	{
	 	
		
		String Desc="For the customer agreement of "+Driver.getData("Documentname")+" Document has not generated";
		Utilities.ExtentFailReport1(methodname,Desc);
	 	}
	 
	 
	 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestDetailWindow.pbOK']")).click();
	 Thread.sleep(3000);
	 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestWindow.pbCancel']")).click();
	 
	     

	}catch (Exception e) {
		
	
	System.out.println("The exception was "+e);
	System.out.println("Abnormal Termination due to "+e);
	
	String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	Utilities.ExtentFailReport(methodname,e);
	

			}
		}
	
public static void BO_StopCategory() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
	{			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			//
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);
			
			try{
		
		Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//NAVIGATION
				Thread.sleep(250);	
				Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
				Thread.sleep(700);	
				Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
				Thread.sleep(1750);
				Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

				String keypress=Driver.getData("VerificationData2");

				//MAINTAIN CUSTOMER AGREEMENT

				Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
				Thread.sleep(700);
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
				Thread.sleep(2700);
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
				Thread.sleep(1700);
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.pbStopCategorySearch']")).click();
				Thread.sleep(2000);
				Common_Property.driver.findElement(By.xpath("//input[@name='StopCategorySimpleSearchWindow.dfCriteriaEntry']")).clear();
				Thread.sleep(1500);
				Common_Property.driver.findElement(By.xpath("//input[@name='StopCategorySimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData"));
				Thread.sleep(1500);
				Common_Property.driver.findElement(By.xpath("//div[@name='StopCategorySimpleSearchWindow.pbOK']")).click();
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				Thread.sleep(1550);
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Save']")).click();
				Thread.sleep(2000);
				
				if(keypress.equalsIgnoreCase("unwind"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='OK']")).click();
					Thread.sleep(2000);
					Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).sendKeys(Keys.ENTER);

				}		
			
				else if(keypress.equalsIgnoreCase("Bankruptcy"))
				{
					
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				Thread.sleep(1750);				
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
				Thread.sleep(1750);		
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
				Thread.sleep(3700);
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
				Thread.sleep(1700);
				
				}
				
				else if(keypress.equalsIgnoreCase("Abusive"))
				{
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				Thread.sleep(1750);				
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
				Thread.sleep(1750);		
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
				Thread.sleep(2700);
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
				Thread.sleep(1700);
				
				}
				else if(keypress.equalsIgnoreCase("unwind"))
				{
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				Thread.sleep(1750);				
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
				Thread.sleep(1750);		
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
				Thread.sleep(2700);
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
				Thread.sleep(1700);
				}
				
				else if(keypress.equalsIgnoreCase("unwind1"))
				{
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				Thread.sleep(1750);
				Thread.sleep(1750);
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
				Thread.sleep(1750);	
				Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
				Thread.sleep(1700);
				Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStopCategory']")).clear();
				Thread.sleep(700);
				//Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.AgreementDetailsTabViewController.Profile']")).click();
				//Thread.sleep(700);
				//Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				//Thread.sleep(1750);
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.ToolBar.Save']")).click();
				Thread.sleep(1000);
					
				}
				Thread.sleep(1000);				
				//MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfDateStopped
				
				 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
				 Thread.sleep(1750); 
				 System.out.println(ver);
				 
		if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
		 {
			
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
			 
		 }
		 	else
		 	{
		 	
			
				String Desc="For the customer agreement  "+Driver.getData("Documentname")+" Document has not generated";
				Utilities.ExtentFailReport1(methodname,Desc);
		 	}
		 
				 Thread.sleep(2550);
				 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
				 Thread.sleep(1750);
				 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
				 Thread.sleep(1750);
				 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
				 Thread.sleep(1750);
		 
		     

		}
		catch (Exception e)
		{
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Utilities.ExtentFailReport(methodname,e);
		
        }
		}
		
public static void BO_DocumentVerification() throws IOException, InterruptedException, FilloException 
	{
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//NAVIGATION
			Thread.sleep(250);	
			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
			Thread.sleep(1700);	
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



			//MAINTAIN CUSTOMER AGREEMENT

			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(1700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
			Thread.sleep(15000);
		
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
			Thread.sleep(1700);
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Documents']")).click();//DOCUMENT 
			Thread.sleep(1000);
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Document Requests']")).click();
			Thread.sleep(4000);
			Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.pbFilter']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.dfName']")).sendKeys(Driver.getData("Documentname"));
			Thread.sleep(1750);	
			Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.pbOK']")).click();
			Thread.sleep(1750);
			//
			
			 String ver =Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.gfSurroundOutlineFieldPanel']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]")).getText().toString();
			 Thread.sleep(1750); 
			 System.out.println(ver);
			 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
			 {
				
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
				String Desc="For The customer agreement  "+Driver.getData("Documentname")+" Document has not generated";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	}
			 
			 
			 //
			 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.pbCancel']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
			 Thread.sleep(1750);
			 
			  

			}catch (Exception e) {
				
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			

					}
				}

public static void documentverifcation_BO() throws Exception
{
System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());


DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
Date sdate = new Date();
String datetimestart=dateFormat.format(sdate);

try{

 
//NAVIGATION
Thread.sleep(250);
Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
Thread.sleep(2000);                          //MainUI.Open.Agreement Servicing
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



//Maintain CUSTOMER AGREEMENT

Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
Thread.sleep(2700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
Thread.sleep(5000);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //Maintain MENU BUTTON
Thread.sleep(2000);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Documents']")).click();//DOCUMENT 
Thread.sleep(3000);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Document Requests']")).click();
Thread.sleep(4000);
Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.pbFilter']")).click();
Thread.sleep(2050);
Common_Property.driver.findElement(By.xpath("//input[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.dfName']")).sendKeys(Driver.getData("Documentname"));
Thread.sleep(2050);
Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.pbOK']")).click();
Thread.sleep(2050);
//
String ver =Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.gfSurroundOutlineFieldPanel']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]")).getText().toString();
Thread.sleep(3050); 
System.out.println(ver);
 
 
if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
  {
 
 
  
  String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
  Utilities.ExtentPassReport(methodname);
   
  }
  else
  {

  
	  String Desc="For The customer agreement  "+Driver.getData("Documentname")+" Document has not generated";
  Utilities.ExtentFailReport1(methodname,Desc);
  }
   
   
  Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.pbCancel']")).click();
  Thread.sleep(3050);
  Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
  Thread.sleep(3050);
  Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
  Thread.sleep(3050);
  Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
  Thread.sleep(3050);
   
  
}
catch(Exception e)
{

	System.out.println("The exception was "+e);
	System.out.println("Abnormal Termination due to "+e);
	
	String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	Utilities.ExtentFailReport(methodname,e);
	

}
}

public static void BO_Address() throws IOException, InterruptedException, FilloException 
	{
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
			Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//NAVIGATION
			Thread.sleep(1250);	
			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
			Thread.sleep(1000);	
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
			Thread.sleep(2050);
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();
			Thread.sleep(2050);
			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(1700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindCustomersForAgreementsView.pbDetails']")).click();
			Thread.sleep(1700);
			
			
			String Keypress=Driver.getData("VerificationData");
			
			if(Keypress.contentEquals("EmailAddress"))
			{
			Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfEmailAddress']")).clear();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfEmailAddress']")).sendKeys(Driver.getData("Documentname"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Save']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Close']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindCustomersForAgreementsView.pbDetails']")).click();
			Thread.sleep(700);
			
			
			 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfEmailAddress']")).getAttribute("value").toString();
			 Thread.sleep(1750); 
			 System.out.println(ver);
			 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
			 {
				
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
			 	String Desc="For The customer agreement  "+Driver.getData("Documentname")+" Document has not generated";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	}
			 
			}
			if(Keypress.contentEquals("Address"))
			{
			Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfMobileNumber']")).clear();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfMobileNumber']")).sendKeys(Driver.getData("Documentname"));
			Thread.sleep(1750);	
			//Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.ToolBar.Save']")).click();
			//Thread.sleep(2750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Save']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Close']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindCustomersForAgreementsView.pbDetails']")).click();
			Thread.sleep(700);
			
			
			 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfMobileNumber']")).getAttribute("value").toString();
			 Thread.sleep(1750); 
			 System.out.println(ver);
			 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
			 {
				
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
			 	String Desc="For The customer agreement  "+Driver.getData("Documentname")+" Document has not generated";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	}
			 
			}
			
			
			if(Keypress.contentEquals("EditAtAddress"))
			{
			Thread.sleep(1750);	
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.cmCombinedCorrespondenceView.pbQuickAddress']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='HabitationsSelectionWindow.pbDetails']")).click();
			Thread.sleep(1750);	
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfPropertyNumber']")).clear();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfPropertyNumber']")).sendKeys(Driver.getData("Documentname"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='HabitationsDetailsWindow.pbOK']")).click();
			Thread.sleep(1750); 	
			Common_Property.driver.findElement(By.xpath("//div[@name='HabitationsSelectionWindow.pbOK']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Save']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Close']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindCustomersForAgreementsView.pbDetails']")).click();
			Thread.sleep(700);
			
			
			 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfPropertyNumber']")).getAttribute("value").toString();
			 Thread.sleep(1750); 
			 System.out.println(ver);
			 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
			 {
				
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
			 	String Desc="For The customer agreement  "+Driver.getData("Documentname")+" Document has not generated";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	}
			 
			}
			
			if(Keypress.contentEquals("NewAtAddress"))
			{
			Thread.sleep(1750);	
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.cmCombinedCorrespondenceView.pbQuickAddress']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='HabitationsSelectionWindow.pbInsert']")).click();
			Thread.sleep(1750);	
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfPostCode']")).sendKeys(Driver.getData("Postal_Code"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfPropertyNumber']")).sendKeys(Driver.getData("Documentname"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfStreetName']")).sendKeys(Driver.getData("Address1"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfDistrict']")).sendKeys(Driver.getData("District"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfPostalTown']")).sendKeys(Driver.getData("Town"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.AddressPanel.dfCounty']")).sendKeys(Driver.getData("Country"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.HabitationsTenancyView.dfMovingInDate']")).clear();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//input[@name='HabitationsDetailsWindow.HabitationsTenancyView.dfMovingInDate']")).sendKeys(Driver.getData("date"));
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='HabitationsDetailsWindow.pbOK']")).click();
			Thread.sleep(1750); 	
			Common_Property.driver.findElement(By.xpath("//div[@name='HabitationsSelectionWindow.pbOK']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Save']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Close']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindCustomersForAgreementsView.pbDetails']")).click();
			Thread.sleep(700);
			
			
			 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.cmCombinedCorrespondenceView.dfPropertyNumber']")).getAttribute("value").toString();
			 Thread.sleep(1750); 
			 System.out.println(ver);
			 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
			 {
				
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
				String Desc="For The customer agreement  "+Driver.getData("Documentname")+"has not updated";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	}
			 
			}
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Close']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
			 Thread.sleep(1750);
			 
			  

			}catch (Exception e) {
				
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			

					}
				}

public static void BO_BankDetails() throws IOException, InterruptedException, FilloException
   {	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		

		Common_Property.driver.findElement(By.xpath("//input[@id='agreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	//	Thread.sleep(1000);
		Common_Property.driver.findElement(By.xpath("//a[@id='PanLinkSubmit_0']")).click();
		Thread.sleep(1000);
		Common_Property.driver.findElement(By.xpath("//a[@class='linkWithBullet']")).click();
		Thread.sleep(1000);
		//Common_Property.driver.findElement(By.xpath("//a[text()='Bank Details']")).click();
		//Common_Property.driver.findElement(By.xpath("//form[@id='PanForm']/div[2]/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/a/span")).click();
		String keypress=Driver.getData("VerificationData");
		if(keypress.equalsIgnoreCase("servicing"))
		{
			Thread.sleep(4000);
			Common_Property.driver.findElement(By.xpath("//form[@id='PanForm']/div[2]/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/a/span")).click();
		}
		else
		{
		Common_Property.driver.get("https://provsys.pancredit.com/panCoreSaas/app?page=Collections%2FCOBankDetails&service=page");	 
		}
		Thread.sleep(2000);
		
		
		Common_Property.driver.findElement(By.xpath("//input[@name='accountNumber']")).clear();
		Thread.sleep(800);
		Common_Property.driver.findElement(By.xpath("//input[@name='accountNumber']")).sendKeys(Driver.getData("Number"));
		Thread.sleep(800);
		
		Common_Property.driver.findElement(By.xpath("//input[@name='sortCode1']")).clear();
		Thread.sleep(800);
		Common_Property.driver.findElement(By.xpath("//input[@name='sortCode1']")).sendKeys(Driver.getData("sortcode1"));
		Thread.sleep(800);
		
		Common_Property.driver.findElement(By.xpath("//input[@name='sortCode2']")).clear();
		Thread.sleep(800);
		Common_Property.driver.findElement(By.xpath("//input[@name='sortCode2']")).sendKeys(Driver.getData("sortcode2"));
		Thread.sleep(800);
		
		Common_Property.driver.findElement(By.xpath("//input[@name='sortCode3']")).clear();
		Thread.sleep(800);
		Common_Property.driver.findElement(By.xpath("//input[@name='sortCode3']")).sendKeys(Driver.getData("date"));
		Thread.sleep(800);
					
		Common_Property.driver.findElement(By.xpath("//a[text()='Save']")).click();
		
		Thread.sleep(1000);
		
		if(keypress.equalsIgnoreCase("servicing"))
		{
			Common_Property.driver.findElement(By.xpath("//form[@id='PanForm']/div[2]/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/a/span")).click();
		}
		else
		{
		Common_Property.driver.get("https://provsys.pancredit.com/panCoreSaas/app?page=Collections%2FCOBankDetails&service=page");	 
		}
		
		Thread.sleep(1000);
				
		String ver=Common_Property.driver.findElement(By.xpath("//input[@name='accountNumber']")).getAttribute("value").toString();
		
		if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
		 {
			
			
			String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
			Utilities.ExtentPassReport(methodname);
			 
		 }
		 	else
		 	{
		 	
			
			String Desc="For The customer agreement  "+Driver.getData("Documentname")+"has not as Expected";
			Utilities.ExtentFailReport1(methodname,Desc);
		 	}
		
		Common_Property.driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		//}
	 
	}
		catch (Exception e) 
		{
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);



		
		Common_Property.driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		}
}
  
public static void BO_Settlement_Quote() throws IOException, InterruptedException, FilloException 
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);
		
	try{

		//MAINTAIN CUSTOMER AGREEMENT
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(700);	
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(2700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(3000);
	
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
		Thread.sleep(700);
		Common_Property.driver.manage().window().fullscreen();
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Settlements']")).click();//DOCUMENT 
		Thread.sleep(1000);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Settlement Quote']")).click();
		Thread.sleep(5000);

		//Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[4]/div[1]")).click();
		//Thread.sleep(2000);
		Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.pbBespoke']")).click();
		Thread.sleep(3000);
		Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.pbBespoke']")).sendKeys(Keys.ENTER);
		Thread.sleep(2550);
		Settlementvalue=Common_Property.driver.findElement(By.xpath("//input[@name='QuotationWindow.QuoteTabView.dfSettlement']")).getAttribute("value");//742.72
		Thread.sleep(2000);
		System.out.println("Value is"+Settlementvalue);
		
		//Common_Property.driver.findElement(By.xpath("//div[@name='QuotationWindow.pbOK']")).sendKeys(Keys.ESCAPE);
		//Thread.sleep(1750);
		//Common_Property.driver.findElement(By.xpath("//div[@name='QuotationWindow.pbOK']")).sendKeys(Keys.ENTER);
		//Thread.sleep(1750);
		//Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.buttons']/child::div[2]")).click();
		//Thread.sleep(1750);
		
		//Common_Property.driver.findElement(By.xpath("//div[@name='QuotationWindow.pbOK']")).click();
		Thread.sleep(5050);                                     //ModifyDocumentRequestWindow.pbOK
		Common_Property.driver.findElement(By.xpath("//div[@name='ModifyDocumentRequestWindow.pbOK']")).click();
		Thread.sleep(5050);
		Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.buttons']/child::div[2]")).click();
		Thread.sleep(3750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
		Thread.sleep(1700);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Documents']")).click();//DOCUMENT 
		Thread.sleep(1000);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Document Requests']")).click();
		Thread.sleep(5000);
		Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.pbFilter']")).click();
		Thread.sleep(3750);		
		Common_Property.driver.findElement(By.xpath("//input[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.dfName']")).sendKeys(Driver.getData("Documentname"));
		Thread.sleep(2750);
		Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.pbOK']")).click();
		Thread.sleep(4750);
		//
		
		 String ver =Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.gfSurroundOutlineFieldPanel']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]")).getText().toString();
		 Thread.sleep(1750); 
		 System.out.println(ver);
		 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
		 {
			
			
			String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
			Utilities.ExtentPassReport(methodname);
			

		 }
		 	else
		 	{
		 	
			
			String Desc="For The customer agreement  "+Driver.getData("Documentname")+"value has not picked";
			Utilities.ExtentFailReport1(methodname,Desc);
			

		 	}
		 
		 
		 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.pbCancel']")).click();
		 Thread.sleep(2750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(2750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(2750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		 Thread.sleep(2750);
		 
		 
		
		}catch (Exception e) {
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			String Exce=e.toString();
			String report="Exception "+Exce.substring(0,87);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);	
			
			
		}
		}
  
public static void BO_Logout() throws Exception
	{	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[text()='File']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[text()='Exit']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(1750);
	}

public static void SettlementCheck() throws Exception
{
	//MAINTAIN CUSTOMER AGREEMENT
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(700);	
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	Thread.sleep(700);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	Thread.sleep(2700);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	Thread.sleep(1700);

	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
	Thread.sleep(700);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Settlements']")).click();//DOCUMENT 
	Thread.sleep(1000);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Settlement Quote']")).click();
	Thread.sleep(1000);
	//
	//Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[4]/div[1]")).click();
	//Thread.sleep(2000);
	Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.pbBespoke']")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.pbBespoke']")).sendKeys(Keys.ENTER);
	Thread.sleep(1750);
	Settlementvalue=Common_Property.driver.findElement(By.xpath("//input[@name='QuotationWindow.QuoteTabView.dfSettlement']")).getAttribute("value");//742.72
	Thread.sleep(1750);
	System.out.println("Value is"+Settlementvalue);			
	
	Common_Property.driver.findElement(By.xpath("//div[@name='QuotationWindow.pbOK']")).sendKeys(Keys.ESCAPE);
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='QuotationWindow.pbOK']")).sendKeys(Keys.ENTER);
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='SelectionWindow.buttons']/child::div[2]")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
	 Thread.sleep(1750);
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
	 Thread.sleep(1750);
	 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
	Thread.sleep(1750);


}

public static void Amount() throws Exception
{
	//MAINTAIN CUSTOMER AGREEMENT
	WebElement source=Common_Property.driver.findElement(By.xpath("//div[@tabindex='1']//div[text()='Create Cash Batch']"));
    WebElement dest=Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Cash and Posting']"));
	Actions action=new Actions(Common_Property.driver);
	action.dragAndDrop(source, dest).build().perform();
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(700);	
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	Thread.sleep(1700);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	Thread.sleep(4800);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	Thread.sleep(1700);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.pbTransactions']")).click();
	Thread.sleep(700);
	Transamt=Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsWindow.TransactionBalanceView.dfAmountPaid']")).getAttribute("value");
	Thread.sleep(700);
	//ViewTransactionsWindow.TransactionBalanceView.dfAmountPaid
	
	 Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.pbCancel']")).click();
	 Thread.sleep(2050);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		Thread.sleep(1750);
		
		WebElement dest1=Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Audit']"));
		Thread.sleep(3050);
		action.dragAndDrop(source, dest1).build().perform();
		
	
}

public static void BO_cashposting() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
{	
  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

	
	 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	 Date sdate = new Date();
	 String datetimestart=dateFormat.format(sdate);

try{
	//NAVIGATION
	Thread.sleep(250);
	if(Driver.getData("EMI_RETREVAL").equalsIgnoreCase("Yes"))
	{			
		
		System.out.println(Settlementvalue);
		
		//NAVIGATION
		Thread.sleep(250);
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(1700);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(250);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

		      //MAINTAIN CUSTOMER AGREEMENT

		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(550);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(1550);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(10250);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.View']")).click();
		Thread.sleep(1250);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Schedules']")).click();
		Thread.sleep(1250);
		 EMI_STRING= Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.ViewSchedulesView.ofDisplayScheduleItems']/div/div/div/div[2]")).getText().toString();
		 Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.pbCancel']")).click();
		 Thread.sleep(1250);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(1050);		 
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(1250);			 
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		 Thread.sleep(1250);
		 
	}
	//settlement quote amount
	
	
	
    Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
    Thread.sleep(700);	
    Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash and Posting']")).click();
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Transactions']")).click();
	Thread.sleep(1050);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Posting']")).click();
	Thread.sleep(1550);                                         //input[@name='CashPostingWindow.CashBatchDetailsView.dfReference']
	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfReference']")).sendKeys(Driver.getData("Agreement_Number"));    	
	Thread.sleep(1550);
	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.CashBatchDetailsView.dlDefaultPaymentMethod']")).click();
	Common_Property.driver.findElement(By.xpath("//div[text()='Cash']")).click();
	Thread.sleep(2050);
	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).click();
	Thread.sleep(1500);
		Thread.sleep(3000);
		boolean present=isAlertPresent();
		if(present==true)                    //html/body/div[8]/div[4]/div
		{                                            //html/body/div[8]/div[4]/div
		Common_Property.driver.findElement(By.xpath("//div/div[4]/div[@tabindex='2']")).click();
		Thread.sleep(1500);                            
		}
	
	
	String keypress=Driver.getData("VerificationData") 	;
System.out.println("Data should be"+keypress);
	if(keypress.equalsIgnoreCase("PAY"))
	{
		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(2000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(2700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).sendKeys(Keys.F11);  	
		Common_Property.driver.manage().window().fullscreen();

//		Thread.sleep(2050);
//		Common_Property.driver.findElement(By.xpath("//div[@tabindex='89']/input[@type='text']")).clear();
//		Thread.sleep(2050);
//		Common_Property.driver.findElement(By.xpath("//div[@tabindex='89']/input[@type='text']")).sendKeys(EMI_STRING);
		System.out.println("Payment");
		boolean element2=isAlertPresent();
		if(element2==true)
		{
		  Thread.sleep(2000);
	      Common_Property.driver.findElement(By.xpath("//div[@tabindex='2']/div[text()='OK']")).click();
		}
		
		boolean element3=isAlertPresent();
		if(element3==true)
		{
		  Thread.sleep(2000);
	      Common_Property.driver.findElement(By.xpath("//div[@tabindex='2']/div[text()='OK']")).click();
		}
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	}
	else if(keypress.equalsIgnoreCase("BRT"))
	{
		//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		Common_Property.driver.manage().window().fullscreen();
		Thread.sleep(2000);  	
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(1000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(1700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata1"));    	
    	Thread.sleep(1700); 
    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
    	Thread.sleep(1700);
    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbBACSFailCodeLoV']")).click();
    	Thread.sleep(1700);    	
    	Common_Property.driver.findElement(By.xpath("//input[@name='BACSFailCodeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata2"));    	
    	Thread.sleep(1700); 
    	Common_Property.driver.findElement(By.xpath("//div[@name='BACSFailCodeSimpleSearchWindow.pbOK']")).click();
    	Thread.sleep(1700);
		
	}
	else if(keypress.equalsIgnoreCase("SET"))
	{
		
		WebElement source=Common_Property.driver.findElement(By.xpath("//div[@tabindex='1']//div[text()='Create Cash Batch']"));
	    WebElement dest=Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Cash and Posting']"));
		Actions action=new Actions(Common_Property.driver);
		action.dragAndDrop(source, dest).build().perform();
		BO_Settlement_Quote();
		
		
		//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		WebElement dest1=Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Audit']"));
		action.dragAndDrop(source, dest1).build().perform();
	   	
	   	Common_Property.driver.manage().window().fullscreen();
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(3000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(1700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
		System.out.println("Settlement");
		Thread.sleep(3700);
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
    	Thread.sleep(4000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
    	Thread.sleep(2700);
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).click();
    	Thread.sleep(2700);
    	Common_Property.driver.manage().window().fullscreen();
		Thread.sleep(1000);
		
    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
    	Thread.sleep(2700);  
    	
    	boolean present1=isAlertPresent();
    	if(present1==true)
    	{
    		Common_Property.driver.findElement(By.xpath("//div[@tabindex='2']//div[text()='OK']")).click();
    	}
    	Thread.sleep(1700);
    	boolean present2=isAlertPresent1();
    	if(present2==true)
    	{
    		Common_Property.driver.findElement(By.xpath("//div[@tabindex='2']//div[text()='OK']")).click();
    	}
	}
	else if(keypress.equalsIgnoreCase("RET"))
	{
		SettlementCheck();
		//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
	   	Thread.sleep(2000);
	   	Common_Property.driver.manage().window().fullscreen();
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(1000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(1700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata1"));    	
    	Thread.sleep(1700); 
    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
    	Thread.sleep(1700);	
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
    	Thread.sleep(1700);
    	Common_Property.driver.manage().window().fullscreen();
		Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
    	Thread.sleep(1700);
    	
    	
	}
	else if(keypress.equalsIgnoreCase("REVSET"))
	{
		//Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[4]/div")).sendKeys(Keys.ENTER);
	   	Thread.sleep(2000); 
	   	Amount();
	   	Common_Property.driver.manage().window().fullscreen();
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(1000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(2000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
	//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
	    System.out.println("Payment");
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData3"));    	
    	Thread.sleep(1700); 
    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
    	Thread.sleep(1700);	
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Transamt);    	
    	Thread.sleep(1700);
    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
    	Thread.sleep(1700);
    	Common_Property.driver.manage().window().fullscreen();
		Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
    	Thread.sleep(1700);
	}
	else if(keypress.equalsIgnoreCase("REV"))
	{
		//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
	   	Thread.sleep(2000); 
	   	Common_Property.driver.manage().window().fullscreen();
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(1000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(1700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
	//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
	   System.out.println("Payment");
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
    	Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData"));    	
    	Thread.sleep(1700); 
    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
    	Thread.sleep(1700);	
    	Common_Property.driver.manage().window().fullscreen();
		Thread.sleep(1000);
    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
    	Thread.sleep(1700);
	}
	else if(keypress.equalsIgnoreCase("CPA_REV"))
	{
		//Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(1000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(1700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);
	 	Thread.sleep(3700);
	 
	//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
	    System.out.println("Payment");
	    Common_Property.driver.manage().window().fullscreen();
	    Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    Thread.sleep(1000);
	    Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    Thread.sleep(1000);
	    Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys("REV");    
	    Thread.sleep(1700); 
	    Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    Thread.sleep(1700);
	    Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    Thread.sleep(1000);
	    Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);    
	    Thread.sleep(1700);
	    Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    Thread.sleep(1700);
	}
	
	//vishnu
	
	
	//if(Common_Property.driver.findElements( By.xpath("//div[text()='OK']")).size() != 0)
	//{
		//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
	//}
	Thread.sleep(1750);
	String Click=Driver.getData("VerificationData");
		System.out.println("Data should be"+keypress);
		if(Click.equalsIgnoreCase("PAY"))
		{
			Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
			//System.out.println("Payment");
		}
		else if(Click.equalsIgnoreCase("BRT"))
		{
			Common_Property.driver.findElement(By.xpath("//div[text()='Unpaid BACS']")).click();
			System.out.println("Unpaid BACS");
		}
		else if(Click.equalsIgnoreCase("SET"))
		{
			
			
			Common_Property.driver.findElement(By.xpath("//div[@tabindex='31']/div/div[1]/div[1]")).click();
			Thread.sleep(1750);
			//Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[4]/div")).click();
		    //Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@tabindex='31']/div/div[1]/div[1]/div[text()='Settlement']")).click();
			System.out.println("Settlement");
		}
		else if(Click.equalsIgnoreCase("RET"))
		{
			Common_Property.driver.findElement(By.xpath("//div[text()='Returned SET']")).click();
			System.out.println("Settlement");
		}
		else if(Click.equalsIgnoreCase("PayArrearAmt"))
		{
			Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
			System.out.println("Payment");
		}
		else if(Click.equalsIgnoreCase("REVSET"))
		{
			Common_Property.driver.findElement(By.xpath("//div[text()='Reversal']")).click();
			System.out.println("Reverse");
		}
		else if(keypress.equalsIgnoreCase("REV"))
		{
			Common_Property.driver.findElement(By.xpath("//div[text()='Reversal']")).click();
			System.out.println("Reverse");
		}
	Thread.sleep(1700);
	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).click();    	
	String BatchTotal = Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).getAttribute("value");
	System.out.println(BatchTotal);
	Thread.sleep(1700);	
	Thread.sleep(1750);
	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).clear();
	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).sendKeys(BatchTotal);
	Thread.sleep(1700);
	Thread.sleep(2000); 
	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.buttons']//child::div[2]/child::div[1]")).click();
	Thread.sleep(1700);
	//CashPostingWindow.buttons
	//value[1] = driver.findElement(By.xpath("//div[@name='CashPostingWindow.pbBespoke']")).getText().toString();

	//String str1=driver.findElement(By.xpath("//div[@name='CashPostingWindow.pbBespoke']//child::div[1]/child::div[1]")).getAttribute("value");
	//System.out.println(value[1]);
	//Thread.sleep(700);	
	Thread.sleep(15750);
		//NAVIGATION
			Thread.sleep(1250);	
			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
			Thread.sleep(1700);	
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



			//MAINTAIN CUSTOMER AGREEMENT

			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(1700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
			Thread.sleep(1700);    		
			String status=Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value")	;
			//
			
		// Validation
			String ver="";
			String Validation=Driver.getData("Status");
			
			if(Validation.equalsIgnoreCase(status))  				
	  			{
	  			//
	  			ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
	  			Thread.sleep(1750); 
	  			System.out.println("1"+ver+"1");
	  			System.out.println("1"+Driver.getData("Documentname")+"1");
	  			
	  			 if(status.contentEquals(Driver.getData("Status")))  				 				  
	  			 {
	  				
	  				
	  				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
	  				Utilities.ExtentPassReport(methodname);
	  				 
	  			 }
	  			 	else
	  			 	{
	  			 	
	  				
	  				String Desc="For The customer agreement  "+Driver.getData("Documentname")+"has not as Expected";
	  				Utilities.ExtentFailReport1(methodname,Desc);
	  				
	  			 	} 			 
	  			}
			else
			{ //ViewTransactionsWindow.TransactionBalanceView.dfAmountPaid
				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.pbTransactions']")).click();
				Thread.sleep(700);
				 
				Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.ViewTransactionsUpdatedView.pbFilter']")).click();
				Thread.sleep(700);
				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedStart']")).sendKeys(Firstinstaldate);
				//Thread.sleep(700);
				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedEnd']")).sendKeys(Firstinstaldate);
				//Thread.sleep(700);
				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfTransactionType']")).sendKeys(Driver.getData("VerificationData2"));
				Thread.sleep(1700);
				String currentdate1=Common_Property.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div")).getText().toString();
				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedStart']")).sendKeys(currentdate1);
				Thread.sleep(1700);
				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedEnd']")).sendKeys(currentdate1);
				Thread.sleep(1700);
		    	Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsFilterWindow.pbOK']")).click();
		    	Thread.sleep(1750);
			
			    Thread.sleep(1750);
			    ver =Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.ViewTransactionsUpdatedView.ofViewTransactionsPreUpdateOutlineField']/child::div[1]/child::div[1]/child::div[1]/child::div[2]")).getText().toString();
			    Thread.sleep(1750);  			    
			    Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.pbCancel']")).click();
			Thread.sleep(700);
			if(ver.contentEquals(Driver.getData("Documentname")))  				 				  
	  			 {
	  				
	  				
	  				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
	  				Utilities.ExtentPassReport(methodname);
	  				 
	  			 }
	  			 	else
	  			 	{
	  			 	
	  				
	  				String Desc="For The customer agreement  "+Driver.getData("Documentname")+"has not as Expected";
	  				Utilities.ExtentFailReport1(methodname,Desc);
	  			 	} 	
			}
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
			 Thread.sleep(1750);
			 
			 
			
			}
			catch (Exception e) 
		{				
				// TODO: handle exception				
								
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);				
								
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Utilities.ExtentFailReport(methodname,e);
				
			}
			}

public static void BO_cashpostingC1() throws IOException, InterruptedException , FilloException
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		//NAVIGATION
		Thread.sleep(250);
		if(Driver.getData("EMI_RETREVAL").equalsIgnoreCase("Yes")){
			Thread.sleep(250);
			PaymentAmt();
			System.out.println(Settlementvalue);			
		}
		//settlement quote amount
	
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(1700);	
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash and Posting']")).click();
  	Thread.sleep(1750);
  	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Transactions']")).click();
  	Thread.sleep(1050);
  	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Posting']")).click();
  	Thread.sleep(1550);
  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfReference']")).sendKeys(Driver.getData("Agreement_Number"));    	
  
  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.CashBatchDetailsView.dlDefaultPaymentMethod']")).click();
  	Common_Property.driver.findElement(By.xpath("//div[text()='Cash']")).click();
  	Thread.sleep(2050);
  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).click();
  	Thread.sleep(1500);
  	boolean present=isAlertPresent();
	if(present==true)  
	{
	Common_Property.driver.findElement(By.xpath("//html/body/div[8]/div[4]/div")).click();
	Thread.sleep(1500);
	}
  	
  	if(Driver.getData("EMI_RETREVAL").equalsIgnoreCase("Yes"))
  	{
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
  	  	Thread.sleep(1000);
  	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
  	  	Thread.sleep(1700);
  	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
  	  	Thread.sleep(2750);
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);
  	 	Thread.sleep(3700);
  	}
  	//END
  	
  	
  	
  	String keypress=Driver.getData("VerificationData");  	
	System.out.println("Data should be"+keypress);
		if(keypress.equalsIgnoreCase("PAY"))
		{
			//Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	//Thread.sleep(1000);
		  	//Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	//Thread.sleep(1700);
		  	//Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	//Thread.sleep(2750);

			//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
			System.out.println("Payment");
			Common_Property.driver.manage().window().fullscreen();
			Thread.sleep(1000);
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
		}
		else if(keypress.equalsIgnoreCase("BRT"))
		{
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata1"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbBACSFailCodeLoV']")).click();
	    	Thread.sleep(1700);    	
	    	Common_Property.driver.findElement(By.xpath("//input[@name='BACSFailCodeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata2"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='BACSFailCodeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);
			
		}
		else if(keypress.equalsIgnoreCase("SET"))
		{
			SettlementCheck();
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
			System.out.println("Settlement");
			Thread.sleep(3700);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    	Thread.sleep(4000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
	    	Thread.sleep(2700);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).click();
	    	Thread.sleep(2700);
	    	Common_Property.driver.manage().window().fullscreen();
			Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(2700);  	    	
		}
		else if(keypress.equalsIgnoreCase("RET"))
		{
			SettlementCheck();
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata1"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);	
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
	    	Thread.sleep(1700);
	    	Common_Property.driver.manage().window().fullscreen();
			Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(1700);
		}
		else if(keypress.equalsIgnoreCase("REVSET"))
		{
			SettlementCheck();
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
		//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
		    System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);	
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
	    	Thread.sleep(1700);
	    	Common_Property.driver.manage().window().fullscreen();
			Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(1700);
		}
		else if(keypress.equalsIgnoreCase("REV"))
		{
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
		//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
		   System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);	
	    	Common_Property.driver.manage().window().fullscreen();
			Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(1700);
		}
		else if(keypress.equalsIgnoreCase("CPA_REV"))
		{
			Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);		 
		    //Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
			System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
		    Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
		    Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys("REV");    
		    Thread.sleep(1700); 
		    Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
		    Thread.sleep(1700);
		    Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
		    Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);    
		    Thread.sleep(1700);
		    Common_Property.driver.manage().window().fullscreen();
			Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
		    Thread.sleep(1700);
		}
		
		
  	Thread.sleep(1750);
  	String Click=Driver.getData("VerificationData");
	System.out.println("Data should be"+keypress);
			if(Click.equalsIgnoreCase("PAY"))
			{
				Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
				System.out.println("Payment");
			}
			else if(Click.equalsIgnoreCase("BRT"))
			{
				Common_Property.driver.findElement(By.xpath("//div[text()='Unpaid BACS']")).click();
				System.out.println("Unpaid BACS");
			}
			else if(Click.equalsIgnoreCase("SET"))
			{
				Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
		        Thread.sleep(1750);
		        Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
		        Thread.sleep(1750);
		        Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
		        Thread.sleep(1750);
				Common_Property.driver.findElement(By.xpath("//div[text()='Settlement']")).click();
				System.out.println("Settlement");
			}
			else if(Click.equalsIgnoreCase("RET"))
			{
				Common_Property.driver.findElement(By.xpath("//div[text()='Returned SET']")).click();
				System.out.println("Settlement");
			}
			else if(Click.equalsIgnoreCase("PayArrearAmt"))
			{
				Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
				System.out.println("Payment");
			}
			else if(Click.equalsIgnoreCase("REVSET"))
			{
				Common_Property.driver.findElement(By.xpath("//div[text()='Reversal']")).click();
				System.out.println("Reverse");
			}
			else if(keypress.equalsIgnoreCase("REV"))
			{
				Common_Property.driver.findElement(By.xpath("//div[text()='Reversal']")).click();
				System.out.println("Reverse");
			}
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).click();    	
		  	String BatchTotal = Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).getAttribute("value");
		  	System.out.println(BatchTotal);
		  	Thread.sleep(1700);	
		  	Thread.sleep(2750);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).clear();
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).sendKeys(BatchTotal);
		  	Thread.sleep(2700);  	
		  	Thread.sleep(2000); 
		  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.buttons']//child::div[2]/child::div[1]")).click();
		  	Thread.sleep(1700);
  	//CashPostingWindow.buttons
		//value[1] = driver.findElement(By.xpath("//div[@name='CashPostingWindow.pbBespoke']")).getText().toString();

  	//String str1=driver.findElement(By.xpath("//div[@name='CashPostingWindow.pbBespoke']//child::div[1]/child::div[1]")).getAttribute("value");
  	//System.out.println(value[1]);
  	//Thread.sleep(700);	
  	       Thread.sleep(1750);
  		//NAVIGATION
  			Thread.sleep(250);	
  			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
  			Thread.sleep(700);	
  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
  			Thread.sleep(1750);
  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



  			//MAINTAIN CUSTOMER AGREEMENT

  			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
  			Thread.sleep(1700);
  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
  			Thread.sleep(2700);
  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
  			Thread.sleep(1700);    		
  				
  			//
  			
  		// Validation
  			String ver="";
  			String Validation=Driver.getData("VerificationData");
  			
  			if(Validation.equalsIgnoreCase("Status"))  				
  	  			{
  	  			//
  	  			ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
  	  			Thread.sleep(1750); 
  	  			System.out.println("1"+ver+"1");
  	  			System.out.println("1"+Driver.getData("Documentname")+"1");
  	  			
  	  			 if(ver.contentEquals(Driver.getData("Documentname")))  				 				  
  	  			 {
  	  				
  	  				
  	  				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
  	  				Utilities.ExtentPassReport(methodname);
  	  				 
  	  			 }
  	  			 	else
  	  			 	{
  	  			 	String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
  	  				Utilities.ExtentFailReport1(methodname,Desc);
  	  			 	} 			 
  	  			}
  			else
  			{ 
  				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.pbTransactions']")).click();
  				Thread.sleep(700);
  				Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.ViewTransactionsUpdatedView.pbFilter']")).click();
  				Thread.sleep(700);
  				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedStart']")).sendKeys(Firstinstaldate);
  				//Thread.sleep(700);
  				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedEnd']")).sendKeys(Firstinstaldate);
  				//Thread.sleep(700);
  				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfTransactionType']")).sendKeys(Driver.getData("VerificationData"));
  				Thread.sleep(1700);
  				String currentdate1=Common_Property.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div")).getText().toString();
  				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedStart']")).sendKeys(currentdate1);
  				Thread.sleep(1700);
  				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedEnd']")).sendKeys(currentdate1);
  				Thread.sleep(1700);
  		    	Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsFilterWindow.pbOK']")).click();
  		    	Thread.sleep(1750);  				
  			    Thread.sleep(1750);
  			    ver =Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.ViewTransactionsUpdatedView.ofViewTransactionsPreUpdateOutlineField']/child::div[1]/child::div[1]/child::div[1]/child::div[2]")).getText().toString();
  			    Thread.sleep(1750);  			    
  			    Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.pbCancel']")).click();
				Thread.sleep(700);
				//String amt=Driver.getData("Documentname");
				if(ver.equalsIgnoreCase(Driver.getData("Documentname")))  				 				  
 	  			 {
 	  				
 	  				
 	  				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
 	  				System.out.println(Desc);
 	  				Utilities.ExtentPassReport(methodname);
 	  				 
 	  			 }
 	  			 	else
 	  			 	{
 	  			 	
 	  				
 	  				String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
 	  				Utilities.ExtentFailReport1(methodname,Desc);
 	  			 	} 	
  			}
  			 Thread.sleep(1750);
  			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
  			 Thread.sleep(1750);
  			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
  			 Thread.sleep(1750);
  			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
  			 Thread.sleep(1750);
  			 
  			 
  			
  			}
  			catch (Exception e) 
			{
  				// TODO: handle exception
  				
  				System.out.println("The exception was "+e);
  				System.out.println("Abnormal Termination due to "+e);
  				
  				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
  				Utilities.ExtentFailReport(methodname,e);
  				
  			}
  			}

public static void BO_cashpostingC() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		//NAVIGATION
		Thread.sleep(250);
		if(Driver.getData("EMI_RETREVAL").equalsIgnoreCase("Yes")){
			Thread.sleep(250);
			PaymentAmt();
			System.out.println(Settlementvalue);			
		}
		//settlement quote amount
	
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(1700);	
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash and Posting']")).click();
  	Thread.sleep(1750);
  	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Transactions']")).click();
  	Thread.sleep(1050);
  	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Posting']")).click();
  	Thread.sleep(1550);
  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfReference']")).sendKeys(Driver.getData("Agreement_Number"));    	
  
  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.CashBatchDetailsView.dlDefaultPaymentMethod']")).click();
  	Common_Property.driver.findElement(By.xpath("//div[text()='Cash']")).click();
  	Thread.sleep(2050);
  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).click();
  	Thread.sleep(1500);
  	boolean present=isAlertPresent();
	if(present==true)  
	{
	Common_Property.driver.findElement(By.xpath("//html/body/div[8]/div[4]/div")).click();
	Thread.sleep(1500);
	}
  	if(Driver.getData("EMI_RETREVAL").equalsIgnoreCase("Yes"))
  	{
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
  	  	Thread.sleep(1000);
  	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
  	  	Thread.sleep(1700);
  	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
  	  	Thread.sleep(2750);
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);
  	 	Thread.sleep(3700);
  	}
  	//END
  	
  	
  	
  	String keypress=Driver.getData("VerificationData");  	
	System.out.println("Data should be"+keypress);
		if(keypress.equalsIgnoreCase("PAY"))
		{
			Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);

			//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
			System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
		}
		else if(keypress.equalsIgnoreCase("BRT"))
		{
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata1"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbBACSFailCodeLoV']")).click();
	    	Thread.sleep(1700);    	
	    	Common_Property.driver.findElement(By.xpath("//input[@name='BACSFailCodeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata2"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='BACSFailCodeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);
			
		}
		else if(keypress.equalsIgnoreCase("SET"))
		{
			SettlementCheck();
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
			System.out.println("Settlement");
			Thread.sleep(3700);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    	Thread.sleep(4000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
	    	Thread.sleep(2700);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).click();
	    	Thread.sleep(2700);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(2700);  	    	
		}
		else if(keypress.equalsIgnoreCase("RET"))
		{
			SettlementCheck();
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("Testdata1"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);	
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
	    	Thread.sleep(1700);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(1700);
		}
		else if(keypress.equalsIgnoreCase("REVSET"))
		{
			SettlementCheck();
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
		//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
		System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);	
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(Settlementvalue);    	
	    	Thread.sleep(1700);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(1700);
		}
		else if(keypress.equalsIgnoreCase("REV"))
		{
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).sendKeys(Keys.ENTER);
		   	Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
		  	Thread.sleep(2750);
		//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
		System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
	    	Thread.sleep(1000);
	    	Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys(Driver.getData("VerificationData"));    	
	    	Thread.sleep(1700); 
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
	    	Thread.sleep(1700);	
	    	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
	    	Thread.sleep(1700);
		}
		else if(keypress.equalsIgnoreCase("CPA_REV"))
		{
			Thread.sleep(2000);  	
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
		  	Thread.sleep(1000);
		  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
		  	Thread.sleep(1700);		 
		//Common_Property.driver.findElement(By.xpath("//div[@name='PaymentDetailsWindow.PaymentDetailsView.dlPaymentMethod']/child::div[1]/child::input[1]")).sendKeys("cc");
			System.out.println("Payment");
			Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbTypeLoV']")).click();
		    Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).clear();
		    Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//input[@name='TransactionTypeSimpleSearchWindow.dfCriteriaEntry']")).sendKeys("REV");    
		    Thread.sleep(1700); 
		    Common_Property.driver.findElement(By.xpath("//div[@name='TransactionTypeSimpleSearchWindow.pbOK']")).click();
		    Thread.sleep(1700);
		    Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
		    Thread.sleep(1000);
		    Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);    
		    Thread.sleep(1700);
		    Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
		    Thread.sleep(1700);
		}
		
		//vishnu
		
		
		//if(Common_Property.driver.findElements( By.xpath("//div[text()='OK']")).size() != 0)
		//{
			//Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
		//}
			  	Thread.sleep(1750);
			  	String Click=Driver.getData("VerificationData");
				System.out.println("Data should be"+keypress);
				if(Click.equalsIgnoreCase("PAY"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
					System.out.println("Payment");
				}
				else if(Click.equalsIgnoreCase("BRT"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='Unpaid BACS']")).click();
					System.out.println("Unpaid BACS");
				}
				else if(Click.equalsIgnoreCase("SET"))
				{
					Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
			        Thread.sleep(1750);
			        Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
			        Thread.sleep(1750);
			        Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).sendKeys(Keys.ENTER);
			        Thread.sleep(1750);
					Common_Property.driver.findElement(By.xpath("//div[text()='Settlement']")).click();
					System.out.println("Settlement");
				}
				else if(Click.equalsIgnoreCase("RET"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='Returned SET']")).click();
					System.out.println("Settlement");
				}
				else if(Click.equalsIgnoreCase("PayArrearAmt"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
					System.out.println("Payment");
				}
				else if(Click.equalsIgnoreCase("REVSET"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='Reversal']")).click();
					System.out.println("Reverse");
				}
				else if(keypress.equalsIgnoreCase("REV"))
				{
					Common_Property.driver.findElement(By.xpath("//div[text()='Reversal']")).click();
					System.out.println("Reverse");
				}
			  	Thread.sleep(1700);
			  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).click();    	
			  	String BatchTotal = Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).getAttribute("value");
			  	System.out.println(BatchTotal);
			  	Thread.sleep(1700);	
			  	Thread.sleep(2750);
			  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).clear();
			  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).sendKeys(BatchTotal);
			  	Thread.sleep(2700);  	
			  	Thread.sleep(2000); 
			  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.buttons']//child::div[2]/child::div[1]")).click();
			  	Thread.sleep(1700);
  	//CashPostingWindow.buttons
		//value[1] = driver.findElement(By.xpath("//div[@name='CashPostingWindow.pbBespoke']")).getText().toString();

  	//String str1=driver.findElement(By.xpath("//div[@name='CashPostingWindow.pbBespoke']//child::div[1]/child::div[1]")).getAttribute("value");
  	//System.out.println(value[1]);
  	//Thread.sleep(700);	
  	            Thread.sleep(1750);
  		//NAVIGATION
	  			Thread.sleep(250);	
	  			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	  			Thread.sleep(700);	
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	  			Thread.sleep(1750);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();
	


  			//MAINTAIN CUSTOMER AGREEMENT

  			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
  			Thread.sleep(1700);
  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
  			Thread.sleep(2700);
  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
  			Thread.sleep(1700);    		
  				
  			//
  			
  		// Validation
  			String ver="";
  			String Validation=Driver.getData("VerificationData");
  			
  			if(Validation.equalsIgnoreCase("Status"))  				
  	  			{
  	  			//
  	  			ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
  	  			Thread.sleep(1750); 
  	  			System.out.println("1"+ver+"1");
  	  			System.out.println("1"+Driver.getData("Documentname")+"1");
  	  			
  	  			 if(ver.contentEquals(Driver.getData("Documentname")))  				 				  
  	  			 {
  	  				
  	  				
  	  				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
  	  				Utilities.ExtentPassReport(methodname);
  	  				 
  	  			 }
  	  			 	else
  	  			 	{
  	  			 	
  	  				
  	  				String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
  	  				Utilities.ExtentFailReport1(methodname,Desc);
  	  			 	} 			 
  	  			}
  			else
  			{ 
  				Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.pbTransactions']")).click();
  				Thread.sleep(700);
  				Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.ViewTransactionsUpdatedView.pbFilter']")).click();
  				Thread.sleep(700);
  				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedStart']")).sendKeys(Firstinstaldate);
  				//Thread.sleep(700);
  				//Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedEnd']")).sendKeys(Firstinstaldate);
  				//Thread.sleep(700);
  				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfTransactionType']")).sendKeys(Driver.getData("VerificationData"));
  				Thread.sleep(1700);
  				String currentdate1=Common_Property.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div")).getText().toString();
  				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedStart']")).sendKeys(currentdate1);
  				Thread.sleep(1700);
  				Common_Property.driver.findElement(By.xpath("//input[@name='ViewTransactionsFilterWindow.ViewTransactionsFilterView.dfDateAppliedEnd']")).sendKeys(currentdate1);
  				Thread.sleep(1700);
  		    	Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsFilterWindow.pbOK']")).click();
  		    	Thread.sleep(1750);  				
  			    Thread.sleep(1750);
  			    ver =Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.ViewTransactionsUpdatedView.ofViewTransactionsPreUpdateOutlineField']/child::div[1]/child::div[1]/child::div[1]/child::div[2]")).getText().toString();
  			    Thread.sleep(1750);  			    
  			    Common_Property.driver.findElement(By.xpath("//div[@name='ViewTransactionsWindow.pbCancel']")).click();
				Thread.sleep(700);
				//String amt=Driver.getData("Documentname");
				if(ver.equalsIgnoreCase(Driver.getData("Documentname")))  				 				  
 	  			 {
 	  				
 	  				
 	  				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
 	  				System.out.println(Desc);
 	  				Utilities.ExtentPassReport(methodname);
 	  				 
 	  			 }
 	  			 	else
 	  			 	{
 	  			 	
 	  				
 	  				String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
 	  			    Utilities.ExtentFailReport1(methodname,Desc);
 	  			 	} 	
  			}
  			 Thread.sleep(1750);
  			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
  			 Thread.sleep(1750);
  			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
  			 Thread.sleep(1750);
  			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
  			 Thread.sleep(1750);
  			 
  			 
  			
  			}
  			catch (Exception e) 
			{
  				// TODO: handle exception
  				
  				System.out.println("The exception was "+e);
  				System.out.println("Abnormal Termination due to "+e);
  				
  				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
  				Utilities.ExtentFailReport(methodname,e);
  				
  			}
  			}

public static void PaymentAmt() throws Exception
{	
	//NAVIGATION
	Thread.sleep(1250);
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	Thread.sleep(250);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	      //MAINTAIN CUSTOMER AGREEMENT

	Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	Thread.sleep(550);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	Thread.sleep(550);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	Thread.sleep(5250);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.View']")).click();
	Thread.sleep(250);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Schedules']")).click();
	Thread.sleep(250);
	 EMI_STRING= Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.ViewSchedulesView.ofDisplayScheduleItems']/div/div/div/div[2]")).getText().toString();
	 Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.pbCancel']")).click();
	 Thread.sleep(1250);
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
	 Thread.sleep(1050);		 
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
	 Thread.sleep(1250);			 
	 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
	 Thread.sleep(2250);
}
public static void BO_Reshedule() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		
		//Thread.sleep(700);	
	  	Thread.sleep(1750);
	  	Actions axn=new Actions(Common_Property.driver);
	  	//NAVIGATION
	  			Thread.sleep(250);	
	  			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	  			Thread.sleep(700);	
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	  			Thread.sleep(1750);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	  			//MAINTAIN CUSTOMER AGREEMENT

	  			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	  			Thread.sleep(700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	  			Thread.sleep(2700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	  			Thread.sleep(1700);    		
	  				
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
	  			Thread.sleep(2700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Reschedules']")).click();
	  			Thread.sleep(5000);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Reschedule Quote']")).click();
	  			Thread.sleep(1000);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleSelectComponentsWindow.pbBespoke']")).click();
	  			Thread.sleep(2700);
	  			
	  			//Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleSelectComponentsWindow.pbBespoke']")).sendKeys(Keys.ENTER);
	  			//Thread.sleep(1750);
	  			
	  			Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.insertBelow']")).click();
	  			Common_Property.driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  			 Thread.sleep(550);
	  			 WebElement Number = Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[4]"));
	  			 Number.click();			 
	  			 Thread.sleep(200);
	  			 
	  			
	  				 Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[5]/input[1]")).sendKeys(Driver.getData("Reshedule_NumPay"));
	  				
	  				 Thread.sleep(200);
	  				 
	  				 WebElement Number1 = Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]"));
	  				 Number1.click();			 
	  				 Thread.sleep(500);
		             Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[6]/child::div[1]/input[1]")).sendKeys(Driver.getData("Reshedule_Frequency"));
	  				 
	  				 Thread.sleep(500);
	  				 WebElement Number3 = Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[7]"));
	  				 Number3.click();			 
	  				 Thread.sleep(5200);
	  				 
	  				String a=Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[8]/input[1]")).getAttribute("value").toString();	  			
	  				
	  				 //Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[8]/input[1]")).sendKeys(Driver.getData("Batch_Date"));
	  				
	  				 Thread.sleep(2000);
	  				 WebElement web = Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.RescheduleQuoteArrayView.afSchedules']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[6]"));
	  				 web.click();			 
	  				 Thread.sleep(200);
	  				 
	  				 Thread.sleep(200);
	  				 axn.contextClick(web).build().perform();
	  				Thread.sleep(1500);
	  				 Common_Property.driver.findElement(By.xpath("//div[@name='SolvableGuiContextMenu.Solve']")).click();
	  				 Thread.sleep(2550);
	  			 
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.pbBespoke']/child::div[text()='Calculate']")).click();
	  			 Thread.sleep(3000);
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.pbBespoke']/child::div[text()='Accept']")).click();
	  			 Thread.sleep(1050);			 
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleAcceptWindow.pbOK']")).click();
	  			 Thread.sleep(2050);
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleQuoteWindow.pbBespoke']/child::div[text()='Take Up']")).click();
	  			 Thread.sleep(1900);
	  			 Common_Property.driver.findElement(By.xpath("//div[text()='OK']")).click();
	  			 
	  			 Thread.sleep(4500);
	  			                                               //          RescheduleSelectComponentsWindow.pbCancel   
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='RescheduleSelectComponentsWindow.pbCancel']")).click();
	  			
	  			//String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
	  			Thread.sleep(700); 
	  			
	  			String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfNextDueDate']")).getAttribute("value");
	  			Thread.sleep(1750);
	  			
	  			
	  			String val="Expected is "+ver+" actual is "+a;
	  			 if(ver.contentEquals(a))  				 				  
	  			 {
	  				
	  				
	  				String Desc="Successfully  "+Driver.getData("Batch_Date")+" Passed";
	  				Utilities.ExtentPassReport(methodname);
	  				 
	  			 }
	  			 	else
	  			 	{
	  			 	
	  				
	  				String Desc="For The customer agreement  "+Driver.getData("Batch_Date")+" has not as Expected";
	  				Utilities.ExtentFailReport1(methodname,Desc);
	  			 	} 			 
	  			 
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
	  			 Thread.sleep(1750);
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
	  			 Thread.sleep(1750);
	  			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
	  			 Thread.sleep(1750);
	  			 
	  			 
	  			
	  			}catch (Exception e) {
	  				
	  				System.out.println("The exception was "+e);
	  				System.out.println("Abnormal Termination due to "+e);
	  				
	  				String Desc="Test Run of "+methodname+" was not completed Sucessfully";
	  				Utilities.ExtentFailReport(methodname,e);
	  				
	  			}
	  			}	

public static void BO_Refund() throws Exception
{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
	 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	 Date sdate = new Date();
	 String datetimestart=dateFormat.format(sdate);
	try
		{
	
	Thread.sleep(2050);
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(1700);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	Thread.sleep(250);
	Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	      //MAINTAIN CUSTOMER AGREEMENT

	Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	Thread.sleep(550);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	Thread.sleep(1050);
	Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	Thread.sleep(3050);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.View']")).click();
	Thread.sleep(3050);
	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Schedules']")).click();
	Thread.sleep(2050);
	 EMI_STRING= Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.ViewSchedulesView.ofDisplayScheduleItems']/div/div/div/div[2]")).getText().toString();
	
	 float EMI_NUMBER=Float.parseFloat(EMI_STRING);	 
	 
	 EMI_NUMBER =EMI_NUMBER+20; 
	 EMI_STRING=""+EMI_NUMBER;
	 Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.pbCancel']")).click();
	 Thread.sleep(1250);
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
	 Thread.sleep(1050);		 
	 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
	 Thread.sleep(1250);			 
	 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
	 Thread.sleep(1250);	
	 
	 	//Payment 
	 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	    Thread.sleep(700);	
	    Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash and Posting']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Transactions']")).click();
		Thread.sleep(1050);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Cash Posting']")).click();
		Thread.sleep(1550);                                         //input[@name='CashPostingWindow.CashBatchDetailsView.dfReference']
		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfReference']")).sendKeys(Driver.getData("Agreement_Number"));    	
		Thread.sleep(1550);
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.CashBatchDetailsView.dlDefaultPaymentMethod']")).click();
		Common_Property.driver.findElement(By.xpath("//div[text()='Cash']")).click();
		Thread.sleep(2050);
		Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.DisplayCashTransactionsView.pbInsert']")).click();
		Thread.sleep(1500);
			Thread.sleep(3000);
			boolean present=isAlertPresent();
			if(present==true)                    //html/body/div[8]/div[4]/div
			{                                            //html/body/div[8]/div[4]/div
			Common_Property.driver.findElement(By.xpath("//div/div[4]/div[@tabindex='2']")).click();
			Thread.sleep(1500);                            
			}
		
	  	//Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	   	//Thread.sleep(3000);
	   //	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).click();
	  	Thread.sleep(1000);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAccount']")).sendKeys(Driver.getData("Agreement_Number"));    	
	  	Thread.sleep(1700);
	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).click();  	
	  	Thread.sleep(2750);
	  	
		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).clear();
  		Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfAmount']")).sendKeys(EMI_STRING);
  	 	Thread.sleep(3700);
  	 	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.MaintainCashTransactionView.dfComment']")).sendKeys(Keys.F11);  	
		Common_Property.driver.manage().window().fullscreen();
  	 	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.MaintainCashTransactionView.pbApplyTransaction']")).click();
  	 	Thread.sleep(3700);
  	 	boolean element=isAlertPresent();
  	 	if(element==true)
  	 	{
  	 		Common_Property.driver.findElement(By.xpath("//div[@tabindex='1']/following::div[text()='Warning']/following::div[text()='OK']")).click();
  	 	}
  	 	boolean element1=isAlertPresent();
  	 	if(element1==true)
  	 	{
  	 		Thread.sleep(3000);
  	 		Common_Property.driver.findElement(By.xpath("//div[@tabindex='1']/following::div[text()='Warning']/following::div[text()='OK']")).click();
  	 	}
  	 	    Thread.sleep(3000);
	  	 	Common_Property.driver.findElement(By.xpath("//div[text()='Payment']")).click();
	  	 	System.out.println("Payment");
	  	 	Thread.sleep(1700);
  	 	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).click();    	
  	 	  	String BatchTotal = Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfBatchTotal']")).getAttribute("value");
  	 	  	System.out.println(BatchTotal);
  	 	  	Thread.sleep(2000);	
  	 	  	//Thread.sleep(1750);
  	 	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).clear();
  	 	  	Common_Property.driver.findElement(By.xpath("//input[@name='CashPostingWindow.CashBatchDetailsView.dfControlTotal']")).sendKeys(BatchTotal);
  	 	  	//Thread.sleep(1700);
  	 	  	Thread.sleep(2000); 
  	 	  	Common_Property.driver.findElement(By.xpath("//div[@name='CashPostingWindow.buttons']//child::div[2]/child::div[1]")).click();
  	 	  	Thread.sleep(4000);
  	 
  	 	
  	 	
  	 	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
  		Thread.sleep(1700);
  		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
  		Thread.sleep(250);
  		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

  		      //MAINTAIN CUSTOMER AGREEMENT

  		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
  		Thread.sleep(1550);
  		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
  		Thread.sleep(1550);
  		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
  		Thread.sleep(1250);
  		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click();
  		Thread.sleep(1250);
  		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Refund']")).click();
  		Thread.sleep(1250);
  		Common_Property.driver.findElement(By.xpath("//div[@name='RefundRequestSearchWindow.RefundRequestSearchView.pbInsert']")).click();
  		Thread.sleep(1250);
  		//Common_Property.driver.findElement(By.xpath("//html/body/div[13]/div[4]/div")).sendKeys(Keys.ENTER);
  		Thread.sleep(250);
  		Common_Property.driver.findElement(By.xpath("//input[@name='AddRefundRequestWindow.AddRefundRequestView.dfAmount']")).clear();
  		Common_Property.driver.findElement(By.xpath("//input[@name='AddRefundRequestWindow.AddRefundRequestView.dfAmount']")).sendKeys("20");
  		Thread.sleep(1250);
  		Common_Property.driver.findElement(By.xpath("//div[@name='AddRefundRequestWindow.AddRefundRequestView.dlPaymentMethod']/following-sibling::div[2]/div/div")).click();
  		Thread.sleep(1250);
  		//Common_Property.driver.findElement(By.xpath("//div[text()='Over Payment']")).click();
  		Common_Property.driver.findElement(By.xpath("//div[@name='AddRefundRequestWindow.AddRefundRequestView.dlPaymentMethod']/following-sibling::div[2]/div/input")).sendKeys("Over Payment");
  		Thread.sleep(250);
  		Common_Property.driver.findElement(By.xpath("//div[@name='AddRefundRequestWindow.pbBespoke']")).click();
  		Thread.sleep(2050);
  		Common_Property.driver.findElement(By.xpath("//div[@name='AddRefundRequestWindow.pbBespoke']")).sendKeys(Keys.ENTER);
  		Thread.sleep(250);
  		String ver =Common_Property.driver.findElement(By.xpath("//div[@name='RefundRequestSearchWindow.RefundRequestSearchView.gfOuter']/div/div/div/div[1]/div[3]")).getText().toString();
  		System.out.println(ver);
  		Thread.sleep(2000);
  		Common_Property.driver.findElement(By.xpath("//div[@name='RefundRequestSearchWindow.buttons']")).sendKeys(Keys.ENTER);
  		Thread.sleep(1000);
  		//Common_Property.driver.findElement(By.xpath("//html/body/div[13]/div[4]/div")).sendKeys(Keys.ENTER);
  		
  
  		 if(ver.equalsIgnoreCase("20.00"))  				 				  
			 {
				
				
				String Desc="Successfully  "+ver+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
				String Desc="The  Fund Reversal  "+Driver.getData("Documentname")+" has not as Expected";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	} 			 
  	 	
  	 	
  	 	
	}catch (Exception e) {
		
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			
	}
  }

public static void BO_CheckFinalDate() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		
		//Thread.sleep(700);	
	  	Thread.sleep(1750);
	  	
	  	//NAVIGATION
	  			Thread.sleep(250);	
	  			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	  			Thread.sleep(700);	
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	  			Thread.sleep(1750);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	  			//MAINTAIN CUSTOMER AGREEMENT

	  			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	  			Thread.sleep(700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	  			Thread.sleep(2700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	  			Thread.sleep(1700);    		
	  			Lastduedate=Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).getAttribute("value").toString();
	  			Thread.sleep(1700);
	  			
	  			String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
			
		
		 if(ver.contentEquals(Lastduedate))  				 				  
		 {
			
			
			String Desc="Successfully  "+Lastduedate+" Passed";
			Utilities.ExtentPassReport(methodname);
			 
		 }
		 	else
		 	{
		 	
			
			String Desc="For The customer agreement  "+Lastduedate+" has not as Expected";
			Utilities.ExtentFailReport1(methodname,Desc);
		 	} 			 
		 
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		 Thread.sleep(1750);
		 
		
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
 			 Thread.sleep(1750);
 			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
 			 Thread.sleep(1750);
 			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
 			 Thread.sleep(1750);
 			 
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			
		}
		
	  		
	}
 
public static void BO_GetFinalDate() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
	{	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		
			
	  	Thread.sleep(1750);
	  	
	  	//NAVIGATION
	  			Thread.sleep(250);	
	  			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	  			Thread.sleep(700);	
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
	  			Thread.sleep(1750);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

	  			//MAINTAIN CUSTOMER AGREEMENT

	  			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
	  			Thread.sleep(700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
	  			Thread.sleep(2700);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
	  			Thread.sleep(1700);    		
	  			Lastduedate=Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfEndDate']")).getAttribute("value").toString();
	  			Thread.sleep(1700);
	  			
	  			String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
				
	  			
	  			 if(ver.contentEquals("Completed, Term"))  				 				  
	  			 {
	  				
	  				
	  				String Desc="Successfully  "+Lastduedate+" Passed";
	  				Utilities.ExtentPassReport(methodname);
	  				 
	  			 }
	  			 	else
	  			 	{
	  			 	
	  				
	  				String Desc="For The customer agreement  "+Lastduedate+" has not as Expected";
	  				Utilities.ExtentFailReport1(methodname,Desc);
	  			 	} 			 
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
	  			Thread.sleep(1750);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
	  			Thread.sleep(1750);
	  			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
	  			Thread.sleep(1750);
	  			//Completed, Term
	  			
	  			
	  			}
	catch (Exception e) 
					{
	  				
	  				System.out.println("The exception was "+e);
	  				System.out.println("Abnormal Termination due to "+e);
	  				
	  				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	  				Utilities.ExtentFailReport(methodname,e);
	  				
	  				}
				}

public static void BO_CheckWriteoff() throws IOException, InterruptedException, FilloException 
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{
		//NAVIGATION
		Thread.sleep(250);	
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(700);	
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



		//MAINTAIN CUSTOMER AGREEMENT

		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(2700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(1700);
		if(Driver.getData("VerificationData").equals("WRT"))
		{
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
			Thread.sleep(700);
			Common_Property.driver.manage().window().fullscreen();
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Write-offs']")).click();    
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Initial Write-off']")).click();
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	//driver.findElement(By.xpath("//div[text()='Warning']")).click();
	    	//driver.findElement(By.xpath("//div[text()='OK']")).click(); 
	    	//driver.findElement(By.xpath("//div[@style='position: absolute; overflow: hidden; white-space: nowrap; text-decoration: inherit; left: 43px; width: 17px; top: 3px; height: 17px;']")).click();
	    	String Initialwriteamt = Common_Property.driver.findElement(By.xpath("//input[@name='InitialWriteOffWindow.InitialWriteOffView.dfWriteOffAmount']")).getAttribute("value");
	    	System.out.println("Initial writeoff amt"+Initialwriteamt);
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	String Balance = Common_Property.driver.findElement(By.xpath("//input[@name='InitialWriteOffWindow.InitialWriteOffView.dfBalance']")).getAttribute("value");
	    	System.out.println("Iniital writeoff balance"+Balance);
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	//String[] value =new String[10];
	    	//value[1] = driver.findElement(By.xpath("//div[@name='InitialWriteOffWindow.buttons']")).getText().toString();
	    	//System.out.println(value[1]);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='InitialWriteOffWindow.buttons']//child::div[1]/child::div[1]")).click();
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@style='position: absolute; overflow: hidden; white-space: nowrap; text-decoration: inherit; left: 43px; width: 17px; top: 3px; height: 17px;']")).click();
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	System.out.println("Initial write off finished");
		
		
		}//

		if(Driver.getData("VerificationData").equals("Recoveries"))
		{
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
	    	Thread.sleep(1750);
	    	Common_Property.driver.manage().window().fullscreen();
	    	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Write-offs']")).click();
	    	Thread.sleep(1750);
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Transfer To Recoveries']")).click();
	    	Thread.sleep(1750);
	    	Thread.sleep(1750);
	    	//driver.findElement(By.xpath("//div[text()='Warning']")).click();
	    	//driver.findElement(By.xpath("//div[text()='OK']")).click(); 
	    	//driver.findElement(By.xpath("//div[@style='position: absolute; overflow: hidden; white-space: nowrap; text-decoration: inherit; left: 43px; width: 17px; top: 3px; height: 17px;']")).click();
	    	String Recoverieswriteamt = Common_Property.driver.findElement(By.xpath("//input[@name='TransferToRecoveriesWindow.TransferToRecoveriesView.dfWriteOffAmount']")).getAttribute("value");
	    	System.out.println(Recoverieswriteamt);
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='TransferToRecoveriesWindow.pbBespoke']")).click();    	
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	//String[] value =new String[10];
	    	//value[1] = driver.findElement(By.xpath("//div[@name='InitialWriteOffWindow.buttons']")).getText().toString();
	    	//System.out.println(value[1]);
	    	//driver.findElement(By.xpath("//div[@name='InitialWriteOffWindow.buttons']//child::div[1]/child::div[1]")).click();
	    	Common_Property.driver.findElement(By.xpath("//div[@style='position: absolute; overflow: hidden; white-space: nowrap; text-decoration: inherit; left: 43px; width: 17px; top: 3px; height: 17px;']")).click();
	    	//System.out.println("Initial write off finished");
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);    	
		
		
		}
		if(Driver.getData("VerificationData").equals("FinalWRT"))
		{
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
	    	Thread.sleep(1750);
	    	Common_Property.driver.manage().window().fullscreen();
	    	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Write-offs']")).click();
	    	Thread.sleep(1750);
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Final Write-off']")).click();
	    	Thread.sleep(1750);
	    	Thread.sleep(1750);
	    	
	    	
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@name='FinalWriteOffWindow.pbOK']")).click();    	
	    	Thread.sleep(700);	
	    	Thread.sleep(1750);
	    	Common_Property.driver.findElement(By.xpath("//div[@style='position: absolute; overflow: hidden; white-space: nowrap; text-decoration: inherit; left: 43px; width: 17px; top: 3px; height: 17px;']")).click();
	    	
	    	Thread.sleep(1750);
	    	Thread.sleep(1750);
		
		
		}
		
 	Thread.sleep(1750);
 	System.out.println("Initial write off finished");
 	Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		 Thread.sleep(1750);
		//
 	Thread.sleep(250);	
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(700);	
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();


		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(2700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(1700);
		
		 String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
		 Thread.sleep(1750);
		 System.out.println(ver);
		 if(ver.contentEquals(Driver.getData("Documentname")))  				 				  
			 {
				
				
				String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	
				
				String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	} 			 
			 
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
			 Thread.sleep(1750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
			 Thread.sleep(1750);
			 
			 
			
			}catch (Exception e) {
				// TODO: handle exception
				
 				System.out.println("The exception was "+e);
 				System.out.println("Abnormal Termination due to "+e);
 				
 				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 				Utilities.ExtentFailReport(methodname,e);
 				
			}
			}

public static void BO_DocumentVerification_WelcomePack() throws IOException, InterruptedException, FilloException 
	{
	    
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	        Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
			Thread.sleep(250);	
			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
			Thread.sleep(700);	
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



			//MAINTAIN CUSTOMER AGREEMENT
			System.out.println(Driver.getData("Agreement_Number"));
			Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
			Thread.sleep(2700);
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindCustomersForAgreementsView.pbDetails']")).click();
			Thread.sleep(1700);
			String Customername=Common_Property.driver.findElement(By.xpath("//input[@name='CustomerWindow.PartyIdentityView.dfFirstname']")).getAttribute("value").toString();
			Thread.sleep(700);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File']")).click();
			Thread.sleep(700);
			Common_Property.driver.findElement(By.xpath("//div[@name='CustomerWindow.File.Close']")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
			Thread.sleep(1700);
		
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
			Thread.sleep(700);
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Documents']")).click();//DOCUMENT 
			Thread.sleep(1000);
			Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Document Requests']")).click();
			Thread.sleep(4000);
			Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.pbFilter']")).click();
			Thread.sleep(3050);
			Common_Property.driver.findElement(By.xpath("//input[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.dfName']")).sendKeys(Driver.getData("Documentname"));
			Thread.sleep(1550);	
			Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.pbOK']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.gfSurroundOutlineFieldPanel']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]")).click();
			Thread.sleep(1750);
			
			Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.pbDetails']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestDetailWindow.pbBespoke']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestRecipientWindow.DocumentRequestRecipientView.pbDocuments']")).click();
			Thread.sleep(1750);
			Common_Property.driver.findElement(By.xpath("//div[@name='ViewDocumentPagesWindow.ViewDocumentPagesOutlineView.pbDetails']")).click();
			Thread.sleep(5050);
			String ver1=Common_Property.driver.findElement(By.xpath("//div[@name='DocumentWindow.DocumentView.ofVariable']/div/div/div[2]/div[4]")).getText().toString();
			Thread.sleep(3050);
			System.out.println("Variable is "+ver1);
			//
			
			 //String ver =Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.gfSurroundOutlineFieldPanel']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]")).getText().toString();
			 Thread.sleep(5050); 
			 System.out.println(ver1);
			 if(ver1.equalsIgnoreCase(Customername))
			 {
				 System.out.println("pass document welcome"+ver1);
				
				
				String Desc="Successfully  "+Customername+" Passed";
				Utilities.ExtentPassReport(methodname);
				 
			 }
			 	else
			 	{
			 	System.out.println("Fail document welcome"+ver1);
			 	
				
				String Desc="For The customer agreement  "+Customername+" has not as Expected";
				Utilities.ExtentFailReport1(methodname,Desc);
			 	}
			 Thread.sleep(5050); 
			 
			 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentWindow.pbCancel']")).click();
			 Thread.sleep(1700);
			 Common_Property.driver.findElement(By.xpath("//div[@name='ViewDocumentPagesWindow.pbCancel']")).sendKeys(Keys.ESCAPE);
			 Thread.sleep(1700);
			 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestRecipientWindow.pbCancel']")).sendKeys(Keys.ESCAPE);
			 Thread.sleep(1700);
			 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestDetailWindow.pbCancel']")).sendKeys(Keys.ESCAPE);
			 Thread.sleep(2700);
			 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.pbCancel']")).click();
			 Thread.sleep(2050);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
			 Thread.sleep(2050);
			 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
			 Thread.sleep(2750);
			 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
			 Thread.sleep(2750);
			 
			  

			}catch (Exception e) {
				
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			

					}
				}
		
public static void Batchrun() throws InterruptedException, IOException, FilloException
{
	

	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	Date sdate = new Date();
	String datetimestart=dateFormat.format(sdate);

	try{
		

   Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    //NAVIGATION
	
		
				Thread.sleep(2250);
				Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
				Thread.sleep(250);
				Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Batches']")).click();
				Thread.sleep(250);
				Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Display Job Queues']")).click();
				Thread.sleep(550);
				Common_Property.driver.findElement(By.xpath("//div[@name='QueueWindow.QueueView.pbSubmit']")).click();
				Thread.sleep(500);
				Common_Property.driver.findElement(By.xpath("//input[@name='SubmitBatchJobWindow.SubmitBatchJobView.dfJobToSubmit']"));
				
				Common_Property.driver.findElement(By.xpath("//input[@name='SubmitBatchJobWindow.SubmitBatchJobView.dfJobToSubmit']")).sendKeys("Prov Overnight Group");   	

		

				Common_Property.driver.findElement(By.xpath("//input[@name='SubmitBatchJobWindow.SubmitBatchJobView.dfJobToSubmit']/parent::div[1]/parent::div[1]/following-sibling::div[2]/child::div[1]/child::div[2]")).click();
				Thread.sleep(500);
				Common_Property.driver.findElement(By.xpath("//div[text()='Daily']")).click();
				Thread.sleep(500);

				Thread.sleep(150);
				Common_Property.driver.findElement(By.xpath("//div[@name='SubmitBatchJobWindow.SubmitBatchJobView.pbNow']")).click();
				Thread.sleep(900);
				String test=Driver.getData("Batch_Date");
				System.out.println(test);
				Common_Property.driver.findElement(By.xpath("//input[@name='SubmitBatchJobWindow.SubmitBatchJobView.dfEndDate']")).sendKeys(Driver.getData("Batch_Date"));
				Thread.sleep(200);
				Common_Property.driver.findElement(By.xpath("//div[@name='SubmitBatchJobWindow.pbOK']")).click();
				Thread.sleep(200);
				float val=Float.parseFloat(Driver.getData(("Batch_Delay_Time")));
				Thread.sleep((long) val);
				Common_Property.driver.findElement(By.xpath("//div[@name='QueueWindow.QueueView.tfAuto']")).click();
				// driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromMilliseconds(320000));
				// driver.close();
				Common_Property.driver.findElement(By.xpath("//div[@name='QueueWindow.QueueView.pbRefreshNow']")).click();
                Thread.sleep(100000);
				System.out.println("Sucessfully Completed");
				Thread.sleep(5500);
				Common_Property.driver.findElement(By.xpath("//div[@name='QueueWindow.pbCancel']")).click();
				
				Thread.sleep(5250);
				Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
				Thread.sleep(250);
				Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Batches']")).click();
				Thread.sleep(250);
				Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Display Job Queues']")).click();
				Thread.sleep(5500);
				
		        
				//Retrive target date
				Targetdate = Common_Property.driver.findElement(By.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]//following-sibling::div[10]")).getText().toString();
				String Targetdate2 = Targetdate.substring(0, 11);
				System.out.println("Target date should "+(Driver.getData("Testdata1"))+" Target date is before pass"+Targetdate2+" End date "+(Driver.getData("Batch_Date")));
				
				
				String Systemdat = Common_Property.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div")).getText().toString();
				//String Systemdate = Targetdate.substring(0, 11);
				System.out.println("system date should "+(Driver.getData("Batch_Date"))+" Systemdate date is before pass "+Systemdat+" End date "+(Driver.getData("Batch_Date")));
				
				
				//String enddate = "09-May-2021";
				if (Systemdat.equals(Driver.getData("Batch_Date"))) 
						//&& Systemdate.equals(Driver.getData("Batch_Date")))
				{
					
       				System.out.println("Successfully  "+Driver.getData("Batch_Date")+"   "+Driver.getData("DocumentnameerifiedPass"));
       				
					   				
					String Desc="Successfully  "+Driver.getData("Batch_Date")+" Passed";
					System.out.println("Pass Target date should "+(Driver.getData("Batch_Date"))+" Target date is pass"+Systemdat);
					Utilities.ExtentPassReport(methodname);
					
				}
				else 
				{	    
					
   				String Desc="For The customer agreement  "+Driver.getData("Batch_Date")+" "+Driver.getData("DocumentnameverifiedFail");
   				System.out.println("Fail Target date should "+(Driver.getData("Batch_Date"))+" Target date is Fail"+Systemdat);
   				Utilities.ExtentFailReport1(methodname,Desc);	
   				
				
						
					}
				
				//}
				
				
				
				
				// DISPLAY JOB QUEUE
				/*String[] value = new String[10];

				value[1] = driver
						.findElement(
								By.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]")).getText().toString();
				value[2] = driver
						.findElement(By
								.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]//following-sibling::div[2]"))
						.getText().toString();
				value[3] = driver
						.findElement(By
								.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]//following-sibling::div[4]"))
						.getText().toString();
				value[4] = driver
						.findElement(By
								.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]//following-sibling::div[6]"))
						.getText().toString();
				value[5] = driver
						.findElement(By
								.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]//following-sibling::div[8]"))
						.getText().toString();
				value[6] = driver
						.findElement(By
								.xpath("//div[@name='QueueWindow.QueueView.ofFinished']//child::div[1]/child::div[2]//following-sibling::div[10]"))
						.getText().toString();

				for (int j = 1; j <= 6; j++) {
					System.out.println(value[j] + "\n");
				}*/
				Thread.sleep(500);
				Common_Property.driver.findElement(By.xpath("//div[@name='QueueWindow.pbCancel']")).click();
				Thread.sleep(500);
				 
			} 
	
	catch (Exception e) {
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		String Exce=e.toString();
		String report="Exception "+Exce.substring(0,87);
		
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Utilities.ExtentFailReport(methodname,e);	
		
		
		}
	
}
//BARGAVI
public static void Low_tempoarg() throws Exception, InterruptedException
{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	Date sdate = new Date();
	String datetimestart=dateFormat.format(sdate);
	
	
	
try{

Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//NAVIGATION
Thread.sleep(250);
Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

      //MAINTAIN CUSTOMER AGREEMENT

Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
Thread.sleep(700);

//TEMPORARY ARRANGEMENT NAVIGATION
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Arrangements']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Temporary ']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.insertBelow']")).click();
Thread.sleep(1900);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[6]")).click();
Thread.sleep(1700);
//gettemp value
String scheduleamt =Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofRepayment']/div/div/div[2]/div[4]")).getText();
float result = Float.parseFloat(scheduleamt);
float subtractamount = result-5;

String finalamt=  String.valueOf(subtractamount);
Thread.sleep(1150);
 



Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.gfArrayDetailGrid']/child::div[1]/child::div[1]/following-sibling::div[6]/child::input[1]")).sendKeys(finalamt);
 
 
 


//build profile
Thread.sleep(2700);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).click();
Thread.sleep(1550);
String a = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/div/div/div/div[7]")).getText().toString();
// Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).sendKeys(Keys.ESCAPE);;
String b = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofArrangement']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[3]")).getText();
String c="value of A "+a+" Value of B "+b;

Thread.sleep(2550);
if(a.contentEquals(b))
{


String Desc="Temporary Arrangement less than the normal scheduled amount-Passed";
Utilities.ExtentPassReport(methodname);
}
else
{

String Desc="Temporary Arrangement less than the normal scheduled amount- has not as Expected ";
Utilities.ExtentFailReport1(methodname,Desc);

}
Thread.sleep(1550);

Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.pbOK']")).click();
Thread.sleep(2550);

Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
Thread.sleep(2750);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();

}

catch (Exception e) {
// TODO: handle exception
	
	System.out.println("The exception was "+e);
	System.out.println("Abnormal Termination due to "+e);
	
	String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	Utilities.ExtentFailReport(methodname,e);
	

}
 
 
}
//BARGAVI
public static void high_tempoarg() throws Exception, InterruptedException
{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	Date sdate = new Date();
	String datetimestart=dateFormat.format(sdate);
	
	
try{
  

//NAVIGATION
Thread.sleep(250);
Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

      //MAINTAIN CUSTOMER AGREEMENT

Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
Thread.sleep(700);

//TEMPORARY ARRANGEMENT NAVIGATION
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Arrangements']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Temporary ']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.insertBelow']")).click();
Thread.sleep(1900);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[6]")).click();
Thread.sleep(1700);
//gettemp value
String scheduleamt =Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofRepayment']/div/div/div[2]/div[4]")).getText();
float result = Float.parseFloat(scheduleamt);
float subtractamount = result+5;
String finalamt=  String.valueOf(subtractamount);
Thread.sleep(1150);
 
String a=finalamt;
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.gfArrayDetailGrid']/child::div[1]/child::div[1]/following-sibling::div[6]/child::input[1]")).sendKeys(finalamt);
 
 


Thread.sleep(2700);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).click();
Thread.sleep(1550);
 a = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/div/div/div/div[7]")).getText().toString();
// Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).sendKeys(Keys.ESCAPE);;
String b = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofArrangement']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[3]")).getText();

Thread.sleep(2550);
;
if(a.contentEquals(b))
{


String Desc="Temporary Arrangement more than the normal scheduled amount-Passed";
Utilities.ExtentPassReport(methodname);
}
else
{

String Desc="Temporary Arrangement less more the normal scheduled amount- has not as Expected ";
Utilities.ExtentFailReport1(methodname,Desc);

}
Thread.sleep(1550);

Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.pbOK']")).click();
Thread.sleep(1550);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();

}

catch (Exception e) {
	
	System.out.println("The exception was "+e);
	System.out.println("Abnormal Termination due to "+e);
	
	String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	Utilities.ExtentFailReport(methodname,e);
	
}
 
 
}
//BARGAVI
public static void newmontly_tempoarg() throws Exception, InterruptedException
{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	Date sdate = new Date();
	String datetimestart=dateFormat.format(sdate);
	
	
try{


//NAVIGATION
Thread.sleep(250);
Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

      //MAINTAIN CUSTOMER AGREEMENT

Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
Thread.sleep(700);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
Thread.sleep(700);

//TEMPORARY ARRANGEMENT NAVIGATION
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Arrangements']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Temporary ']")).click();
Thread.sleep(1150);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.insertBelow']")).click();
Thread.sleep(1900);
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[6]")).click();
Thread.sleep(1700);
//gettemp value
String scheduleamt =Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofRepayment']/div/div/div[2]/div[4]")).getText();
float result = Float.parseFloat(scheduleamt);
float subtractamount = result+5;
String finalamt=  String.valueOf(subtractamount);
Thread.sleep(1150);
 

Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.gfArrayDetailGrid']/child::div[1]/child::div[1]/following-sibling::div[6]/child::input[1]")).sendKeys(finalamt);
 Thread.sleep(2700);

 //calculation
 
String getdate = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[7]")).getText().toString();
 Thread.sleep(1700);
 
/*SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-YYYY");
Date convertedDate = dateFormat1.parse(getdate);
Calendar c = Calendar.getInstance();
c.setTime(convertedDate);
c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
String target = dateFormat1.format(c.getTime());*/
 
 
 
 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	
	Calendar c = Calendar.getInstance();
	c.setTime(sdf.parse(getdate));
	c.add(Calendar.DATE, 1); 
	String target = sdf.format(c.getTime());
	
 
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.afProfile']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[7]")).click();
 
Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.gfArrayDetailGrid']/child::div[1]/child::div[1]/following-sibling::div[7]/child::input[1]")).sendKeys(target);
 
 //buildprofile
 Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).click();
Thread.sleep(1550);
// Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.pbBuildProfile']")).sendKeys(Keys.ESCAPE);;
String b = Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.TemporaryDeferralArrangementView.ofArrangement']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[1]")).getText();


Thread.sleep(550);
if(target.contentEquals(b))
{


String Desc="temporary arrangement date falls on end of the month ";
Utilities.ExtentPassReport(methodname);
}
else
{
	

String Desc="temporary arrangement date falls on end of the month ";
Utilities.ExtentFailReport1(methodname,Desc);

}
Thread.sleep(1550);

Common_Property.driver.findElement(By.xpath("//div[@name='TemporaryArrangementWindow.pbOK']")).click();
Thread.sleep(1550);

Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
Thread.sleep(1750);
Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();

}

catch (Exception e) {
	
	System.out.println("The exception was "+e);
	System.out.println("Abnormal Termination due to "+e);
	
	String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	Utilities.ExtentFailReport(methodname,e);
	

}
 
 
}

public static void BO_DateMatch() throws IOException, InterruptedException, FilloException 
	{	
	  System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());

		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);

	try{

		
		
		//MAINTAIN CUSTOMER AGREEMENT
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(700);	
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();

		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(1700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(1700);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.View']")).click(); //MAINTAIN MENU BUTTON
		 Thread.sleep(3500);
		 Common_Property.driver.findElement(By.xpath("//div[text()='Schedules']")).click();
		 Thread.sleep(1500);
		 Common_Property.driver.findElement(By.xpath("//div[text()='Repayment']")).click();
		 Thread.sleep(1500);
		//DISPLAY JOB QUEUE
//				String[] value =new String[10];	
//				value[1] =Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.ViewSchedulesView.ofDisplayScheduleItems']//div[1]")).getText().toString();
//				System.out.println("Date and Instalment Amt in Schedule= "+"\n"+value[1]+"\n");
//			    String matchdate=value[1];
//				String matchdate1 = matchdate.substring(matchdate.lastIndexOf(" ")+1);
//				System.out.println(matchdate1);
				
		        String date=Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.ViewSchedulesView.ofDisplayScheduleItems']//div[1]")).getText();
				String[] det=date.split("/n");
				System.out.println(det.length);
				List<String> det2=Arrays.asList(date.split("[\\r\\n]+"));
				String result=det2.get(det2.size()-2);
				
				Thread.sleep(700);
				Common_Property.driver.findElement(By.xpath("//div[@name='ViewSchedulesWindow.pbCancel']")).click();
				Thread.sleep(1700);
				
					

				String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfEndDate']")).getAttribute("value");
		 Thread.sleep(1700); 
		 System.out.println(ver);
		 if(ver.contains(result))
		 {
			
			
			String Desc="Successfully  "+Driver.getData("matchdate")+" Passed";
			Utilities.ExtentPassReport(methodname);
			 
		 }
		 	else
		 	{
		 	
			
			String Desc="For The customer agreement  "+Driver.getData("matchdate")+" has not as Expected";
			Utilities.ExtentFailReport1(methodname,Desc);
		 	}
		 
		 
		 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.pbCancel']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		 Thread.sleep(1750);
		 
		 
		
		}catch (Exception e) {
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			
		}
	
	}

public static void BO_Status_check() throws IOException, InterruptedException //AXC-REGR-190

{	
	
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	    DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	                        Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                            Thread.sleep(250);	
							Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
							Thread.sleep(700);	
							Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
							Thread.sleep(1750);
							Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();
							
							
							
							//MAINTAIN CUSTOMER AGREEMENT
							
							Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
							Thread.sleep(700);
							Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
							Thread.sleep(2700);
							Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
							Thread.sleep(1700);    		
						    String ver =Common_Property.driver.findElement(By.xpath("//input[@name='MaintainAgreementDetailsWindow.MaintainAgreementDetailsView1.dfStatus']")).getAttribute("value");
						    Thread.sleep(1750); 
						    System.out.println(ver);
							
							 
							 
							 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
							 {
								
								//Utilities.Capture_Screenshot();
								String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
								Utilities.ExtentPassReport(methodname);
								
								 
							 }
							 	else
							 	{
							 	
								//Utilities.Capture_Screenshot();
								String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
								Utilities.ExtentFailReport1(methodname,Desc);
								
							 	}
							 
							 
							 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
							 Thread.sleep(1750);
							 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
							 Thread.sleep(1750);
							 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
							 Thread.sleep(1750);
							 
   

}
		catch (Exception e) 
		{
	

								System.out.println("The exception was "+e);
								System.out.println("Abnormal Termination due to "+e);
								String Exce=e.toString();
								String report="Exception "+Exce.substring(0,87);
								//Utilities.Capture_Screenshot();
								String Desc="Test Run of"+methodname+"was not completed Sucessfully";

		}
	
}

public static void BO_DocumentVerification1() throws IOException, InterruptedException, FilloException 
{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	Date sdate = new Date();
	String datetimestart=dateFormat.format(sdate);
	
	try{

Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//NAVIGATION
		Thread.sleep(250);	
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(700);	
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Agreement Servicing']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//div[@name='MainUI.Open.Maintain Customer Agreements']")).click();



		//MAINTAIN CUSTOMER AGREEMENT

		Common_Property.driver.findElement(By.xpath("//input[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.dfAgreementNumber']")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbFind']")).click();
		Thread.sleep(2700);
		Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.FindAgreementsForCustomersView.pbDetails']")).click();
		Thread.sleep(1700);
	
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Maintain']")).click(); //MAINTAIN MENU BUTTON
		Thread.sleep(700);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Documents']")).click();//DOCUMENT 
		Thread.sleep(1000);
		Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.Document Requests']")).click();
		Thread.sleep(4000);
		Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.pbFilter']")).click();
		Thread.sleep(1750);
		Common_Property.driver.findElement(By.xpath("//input[@name='FilterDocumentRequestsWindow.FilterDocumentRequestsGeneralTabView.dfName']")).sendKeys(Driver.getData("Documentname"));
		Thread.sleep(1750);	
		Common_Property.driver.findElement(By.xpath("//div[@name='FilterDocumentRequestsWindow.pbOK']")).click();
		Thread.sleep(1750);
		//
		
		 String ver =Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.DocumentRequestView.gfSurroundOutlineFieldPanel']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following-sibling::div[5]")).getText().toString();
		 Thread.sleep(1750); 
		 System.out.println(ver);
		 if(ver.equalsIgnoreCase(Driver.getData("Documentname")))
		 {
			
			String Desc="Successfully  "+Driver.getData("Documentname")+" Passed";
			Utilities.ExtentPassReport(methodname);
			 
		 }
		 else
		 {
		 	
			String Desc="For The customer agreement  "+Driver.getData("Documentname")+" has not as Expected";
			Utilities.ExtentFailReport1(methodname,Desc);
		 }
		 
		 
		 //
		 Common_Property.driver.findElement(By.xpath("//div[@name='DocumentRequestModalWindow.pbCancel']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='MaintainAgreementDetailsWindow.File.Close']")).click();
		 Thread.sleep(1750);
		 Common_Property.driver.findElement(By.xpath("//div[@name='FindCustomersAndAgreementsWindow.pbCancel']")).click();
		 Thread.sleep(1750);
		}
	   catch (Exception e) 
	   {
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Utilities.ExtentFailReport(methodname,e);
			
	   }
			}

public static boolean isAlertPresent() 
{ 
    try 
    { 
    	boolean result= false;
    	WebElement alert1=Common_Property.driver.findElement(By.xpath("//div[text()='Warning']"));
    	//Common_Property.driver.switchTo().alert(); 
    	//Common_Property.driver.findElement(By.xpath("//html/body/div[8]/div[4]/div")).
    	
    	////div[@tabindex='1']/following::div[text()='Warning']/following::div[text()='OK']
    	if(alert1.isDisplayed())
    	{
    		result=true;
    	}
         return result;
    }   // try 
    catch (Exception e) 
    { 
        return false; 
    }   // catch 
}

public static boolean isAlertPresent1() 
{ 
    try 
    { 
    	boolean result= false;
    	WebElement alert1=Common_Property.driver.findElement(By.xpath("//div[@tabindex='1']//div[text()='Information']"));
    	//Common_Property.driver.switchTo().alert(); 
    	//Common_Property.driver.findElement(By.xpath("//html/body/div[8]/div[4]/div")).
    	
    	////div[@tabindex='1']/following::div[text()='Warning']/following::div[text()='OK']
    	if(alert1.isDisplayed())
    	{
    		result=true;
    	}
         return result;
    }   // try 
    catch (Exception e) 
    { 
        return false; 
    }   // catch 
}



}
