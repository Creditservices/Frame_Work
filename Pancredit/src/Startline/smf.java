package Startline;

import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.Clipboard;
//import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.structurals.ExceptionHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;

import Common_Funtions.Agreement_Store;
import Common_Funtions.Common_Property;
import Common_Funtions.Driver;
import Common_Funtions.Utilities;






public class smf 
{

   private static final long timeOutInSeconds = 0;
   static String brandverify;
   static String agreementno =null, installment = null,goodsvalue=null, goodscost,goodscost1; 
   static String Vehiclecst=null;
   static String Advance1 =null;
   static String Customersurnname=null;
   static String Brandname=null;
   static String Status=null;   
   static String Balloon=null;
   static String Adminfee=null;
   static String Term=null;
   static String Status1=null;
   static String Status2=null;
   static String Status3=null;
   static String Cashprice=null;
   static String Advance=null;
   static String goodscostvalue= null;
   static String goodscostvalue1= null;
   static String goodscst=null;
   static String goodscst1=null;
   static String Plan=null;
   static String Plan1=null;
   static String Plan2=null;
   static String Pln2=null;
   static String Addresshistory= null;
   static String Pdiadresshistory=null;
   static String Adrshistory=null;
   static String adresshistory=null;
   static String Refevent1=null;
   static String Refevent2,Refevent5vRefevent5valuealue=null;
   static String Refevent3=null;
   static String Refevent3value=null;
   static String Refevent4value=null;
   static String Refevent4=null;
   static String Refevent5=null;
   static String Customer=null;
   static String Customer2=null;
   static String Brandnname= null;
   static String Reason=null;
   static String pagename=null;
   static String Refevent1value=null;
   static String BankEnhancedscore=null;
   static String Delaerdeposit=null;
   static String IOCSurl=null;
   public static String TP_Rate_Sheet;
   public static String TIP_THIRD_PARTY_NAME,TIP_PRODUCT_NAME,TIP_TIER_NAME,TIP_LOWER_LIMIT,TIP_UPPER_LIMIT,TIP_DEFAULT_RATE,TIP_MIN_RATE,TIP_MAX_RATE,TIP_PRODUCT_NAME1;
   public static String FTIP_THIRD_PARTY_NAME,FTIP_PRODUCT_NAME,FTIP_TIER_NAME,FTIP_LOWER_LIMIT,FTIP_UPPER_LIMIT,FTIP_DEFAULT_RATE,FTIP_MIN_RATE,FTIP_MAX_RATE,FTIP_PRODUCT_NAME1;
   public static List<String> Testdatasheet= new ArrayList<String>();
   public static  String Databinding1;
  static float DecisionAPR;
	public static void PersonSearch() throws  Exception
    {    	
   
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();  
		String datetimestart=dateFormat.format(sdate);		
			
		try
		{
		            
			//Driver.getDataFiloconnection();	
			Customer=Driver.getData("Srnam");
				    
				if(Customer.contains("Subaru"))
				{
				    
    				Common_Property.driver.findElement(By.name("surname")).sendKeys(Driver.getData("Srnam"));
    				Common_Property.driver.findElement(By.name("forename")).sendKeys(Driver.getData("Frnam"));
    				Thread.sleep(750);
    		        
    				Common_Property.driver.findElement(By.xpath("//div[@id='personSearchBody']/form/table[2]/tbody/tr/td[2]/div/a")).click();

    				Thread.sleep(2000);
    				
    				Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[4]/td[1]/a")).click();
    				
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart); 
				}
				  
				if(Customer.contains("Angola"))
				{
				    	
					Common_Property.driver.findElement(By.name("surname")).sendKeys(Driver.getData("Srnam"));
					Common_Property.driver.findElement(By.name("forename")).sendKeys(Driver.getData("Frnam"));
					Thread.sleep(750);
	    				
					Common_Property.driver.findElement(By.xpath("//div[@id='personSearchBody']/form/table[2]/tbody/tr/td[2]/div/a")).click();
	    				
					Thread.sleep(2000);
	    				
					Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[4]/td[1]/a")).click();
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				}
				    
				    
				    
				if(Customer.contains("Doxey"))
				{
				    	
					Common_Property.driver.findElement(By.name("surname")).sendKeys(Driver.getData("Srnam"));
					Common_Property.driver.findElement(By.name("forename")).sendKeys(Driver.getData("Frnam"));
					Thread.sleep(750);
	    				
					Common_Property.driver.findElement(By.xpath("//div[@id='personSearchBody']/form/table[2]/tbody/tr/td[2]/div/a")).click();
	    				
					Thread.sleep(2000);
	    			
					Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[5]/td[1]/a")).click();
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart); 
				}
				   
			}			    
				   
			
			catch (Exception e) 
			{   
			
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
			}
    				
  }
	
	

	public static void Terms() throws  Exception
    {    	
   
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
			
		try
		{
				
			Common_Property.driver.findElement(By.name("dealerCode")).sendKeys(Driver.getData("Dealercode1"));  				
			Thread.sleep(350);  
			
			Common_Property.driver.findElement(By.linkText("Search")).click();				
			Thread.sleep(350);
    				
			 
			Common_Property.driver.findElement(By.linkText("DEL0238")).click();				
			Thread.sleep(350);
			Thread.sleep(350);
    				
			Select select = new Select (Common_Property.driver.findElement(By.name("representativeID")));
			select.selectByValue("100002");
			Thread.sleep(350);
        			
			Select select1 = new Select (Common_Property.driver.findElement(By.name("branchID")));
			select1.selectByValue("2462770");;
			Thread.sleep(350);
        			
			Select select2 = new Select(Common_Property.driver.findElement(By.name("brandID")));
			select2.selectByVisibleText(Driver.getData("Brnd"));
			brandverify = Driver.getData("Brnd");
			Thread.sleep(350);
        			
			Common_Property.driver.findElement(By.name("dateOfBirth")).clear();  
			Thread.sleep(350);
			Common_Property.driver.findElement(By.name("dateOfBirth")).sendKeys(Driver.getData("DOB"));  				
			Thread.sleep(350);
    				
    				
			Select select3 = new Select(Common_Property.driver.findElement(By.name("classificationID")));
			select3.selectByVisibleText(Driver.getData("Classfname1"));
			Thread.sleep(350);
    				
			Common_Property.driver.findElement(By.name("costOfGoods")).sendKeys(Driver.getData("Goodcosts"));				
			Thread.sleep(750);
    				
			goodscost=Driver.getData("Goodcosts");
			System.out.println(goodscost);
    			
    	}
    		   
		catch (Exception e) 
		{   
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
    		   	
		}
    				
    

    }
		
	public static void Termscontinue() throws Exception, Exception  
	
	{
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
    	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	    Date sdate = new Date();
	    String datetimestart=dateFormat.format(sdate);	
	

		try
		{
		
		//continue
		
		Common_Property.driver.findElement(By.linkText("Continue")).click();			
		Thread.sleep(750);
		
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		
		}
		
		catch (Exception e) 	
		{  
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
	   	}
	}	


	public static void Personaldetails() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				Select select = new Select(Common_Property.driver.findElement(By.name("paymentMethodID")));
				select.selectByVisibleText(Driver.getData("Methodofpay"));
				Thread.sleep(750);
    			
				Common_Property.driver.findElement(By.name("custSortCode1")).clear();
				Common_Property.driver.findElement(By.name("custSortCode1")).sendKeys(Driver.getData("Bnksrtcode1"));
				Thread.sleep(750);
				 
				Common_Property.driver.findElement(By.name("custSortCode2")).clear();
				Common_Property.driver.findElement(By.name("custSortCode2")).sendKeys(Driver.getData("Bnksrtcode2"));
				Thread.sleep(750);
				 
				Common_Property.driver.findElement(By.name("custSortCode3")).clear();
				Common_Property.driver.findElement(By.name("custSortCode3")).sendKeys(Driver.getData("Bnksrtcode3"));
				Thread.sleep(750);
				 
				Common_Property.driver.findElement(By.name("custAccountNumber")).clear();
				Common_Property.driver.findElement(By.name("custAccountNumber")).sendKeys(Driver.getData("Bnkacno"));
				Thread.sleep(750);
    			 
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
    			 //continue
    				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
    				
			}
			catch (Exception e) 
			{  
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
    		  
			}
    				
    

    }
	
	public static void DL_license_validation() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				
				Select select = new Select(Common_Property.driver.findElement(By.name("paymentMethodID")));
				select.selectByVisibleText(Driver.getData("Methodofpay"));
				Thread.sleep(750);
    			
				Common_Property.driver.findElement(By.name("custSortCode1")).clear();
				Common_Property.driver.findElement(By.name("custSortCode1")).sendKeys(Driver.getData("Bnksrtcode1"));
				Thread.sleep(750);
				 
				Common_Property.driver.findElement(By.name("custSortCode2")).clear();
				Common_Property.driver.findElement(By.name("custSortCode2")).sendKeys(Driver.getData("Bnksrtcode2"));
				Thread.sleep(750);
				 
				Common_Property.driver.findElement(By.name("custSortCode3")).clear();
				Common_Property.driver.findElement(By.name("custSortCode3")).sendKeys(Driver.getData("Bnksrtcode3"));
				Thread.sleep(750);
				 
				Common_Property.driver.findElement(By.name("custAccountNumber")).clear();
				Common_Property.driver.findElement(By.name("custAccountNumber")).sendKeys(Driver.getData("Bnkacno"));
				Thread.sleep(750);
				
				
				
				Common_Property.driver.findElement(By.name("drivingLicence")).clear();
				Common_Property.driver.findElement(By.name("drivingLicence")).sendKeys(Driver.getData("DL_invalidnumber"));
				Thread.sleep(750);
					
				Select select1 = new Select(Common_Property.driver.findElement(By.name("drivingLicenceOriginID")));
				select1.selectByValue(Driver.getData("DLorginvalue1"));//Uk
				Thread.sleep(750);
				
				//continue
    				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
    			
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				String DL_errormsg=Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[1]/tbody/tr[2]/td")).getText().toString();		
				Thread.sleep(750);
    			
				if(DL_errormsg.contains(Driver.getData("DL_errormsg")))
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "Error Displayed as expected for UK orgin_invalid DrivingLicensenumber", DL_errormsg, datetimestart);
				}
				else
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "Driving license invalid Error Not Displayed ", DL_errormsg, datetimestart);
				}
				
				
				//error back
				Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[2]/tbody/tr/td[1]/div/a")).click();  				
				Thread.sleep(750);
				
			
				Select select2 = new Select(Common_Property.driver.findElement(By.name("drivingLicenceOriginID")));
				select2.selectByValue(Driver.getData("DLorginvalue2"));//Other
				Thread.sleep(750);
				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
				
				//pagename
				String pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();  				
				Thread.sleep(750);
				
				if(pagename.contains(Driver.getData("Pagename")))
			
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "DL_orgin:Other-page navigated to nextpage affordability", pagename, datetimestart);
				}
				else
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "DL_orgin:Other-page not navigated to nextpage affordability", pagename, datetimestart);
				}
				
				Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[2]/a[1]")).click();  				
				Thread.sleep(750);
				
				Select select3 = new Select(Common_Property.driver.findElement(By.name("drivingLicenceOriginID")));
				select3.selectByValue(Driver.getData("DLorginvalue3"));//northern ireland
				Thread.sleep(750);
				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
				
				//pagename
				String pagename1=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();  				
				Thread.sleep(750);
				
				if(pagename1.contains(Driver.getData("Pagename")))
			
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "DL_orgin:Other-page navigated to nextpage affordability", pagename1, datetimestart);
				}
				else
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "DL_orgin:Other-page not navigated to nextpage affordability", pagename1, datetimestart);
				}
				

				Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[2]/a[1]")).click();  				
				Thread.sleep(750);
				
				Select select4 = new Select(Common_Property.driver.findElement(By.name("drivingLicenceOriginID")));
				select4.selectByValue(Driver.getData("DLorginvalue4"));//european
				Thread.sleep(750);
				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
				
				//pagename
				String pagename3=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();  				
				Thread.sleep(750);
				
				if(pagename3.contains(Driver.getData("Pagename")))
			
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "DL_orgin:Other-page navigated to nextpage affordability", pagename3, datetimestart);
				}
				else
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "DL_orgin:Other-page not navigated to nextpage affordability", pagename3, datetimestart);
				}
				
			
				
    				
			}
			catch (Exception e) 
			{  
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
    		  
			}
    				
    

    }
	
	public static void Affordabilitydetails() throws  Exception
    {    	
   
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
			
		try
		{
			//Affortability     	
			 //continue
			
			Common_Property.driver.findElement(By.linkText("Continue")).click();  				
			Thread.sleep(750);
			 
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
    		agreementno = Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[4]")).getText().toString();
		    System.out.println(agreementno);
		    SMF_RestAssured.Agreement_Number=agreementno;
		    Utilities.ExtentPassReport(methodname);
            

    		
    		if(agreementno!=null) 
				{
					
    			   		
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					String Desc="Agreement is Created Successfully "+agreementno;		 
					Startline.ExtentPassReport(methodname,Desc,agreementno,datetimestart);
					Thread.sleep(9000);
					Common_Funtions.Agreement_Store.Store_Data(Driver.Project,SMF_RestAssured.Agreement_Number,SMF_RestAssured.Student_Url,Driver.recordset2);  
    			        
				}
				else
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					String Desc="Agreement Number is not Generated ";
					Startline.ExtentFailReport(methodname,Desc,agreementno,datetimestart);
				}
    				
			}
			catch (Exception e) 
				{  
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    

    }

	public static void Employmentdetails() throws  Exception
    {    	
   
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
			
			try
			{
				
				//Employment continue
				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
				
				String Desc="Emplyment details are passed";
				Startline.ExtentPassReport(methodname, Desc, null, null);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
		   }
			
			catch (Exception e) 
			{  
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
			}
    }
	public static void Guarantorsdetails() throws  Exception
    {    	
   
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
			
			try
			{
				
				//NoGuarantors continue
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc1="Agreement generated Without Guarantors" ;		 
		        Startline.ExtentPassReport(methodname,Desc1,agreementno,datetimestart);
		        Thread.sleep(750);
				Common_Property.driver.findElement(By.linkText("No Guarantors")).click();  				
				Thread.sleep(750);
					
		   }
			catch (Exception e) 
			{  
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
			}
    				
    

    }
	public static void Securitydetails() throws  Exception
    {    	
   
		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try
			{
				 
				   
				Thread.sleep(750);
				Select select = new Select(Common_Property.driver.findElement(By.name("newOrUsedID")));
				select.selectByVisibleText(Driver.getData("Newused1"));
				Thread.sleep(750);
   			
				Common_Property.driver.findElement(By.name("regNumber")).sendKeys(Driver.getData("Regnumber"));
				Thread.sleep(750);
    				
    				
				Common_Property.driver.findElement(By.name("mileage")).sendKeys(Driver.getData("Milge"));  				
				Thread.sleep(750);
   

				Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/a")).click(); 				
				Thread.sleep(750); 	
    				
    			Common_Property.driver.findElement(By.name("annualMileage")).clear();
    			Common_Property.driver.findElement(By.name("annualMileage")).sendKeys(Driver.getData("Anualmlge"));  				
    			Thread.sleep(750);
    				
    		
    			Common_Property.driver.findElement(By.name("secFixValue")).click();  				
    			Thread.sleep(750);
    			
    			Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();	
    			Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Exmileagechrge"));  				
				Thread.sleep(750);
    				//continue
    				
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);  								
    				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
    			
    				
		   }
			
			catch (Exception e) 
			{   
    				
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
			}
    				
    }
	public static void Financials() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try
		{
				
				
			Common_Property.driver.findElement(By.name("numberOfPayments")).clear(); 
			Common_Property.driver.findElement(By.name("numberOfPayments")).sendKeys(Driver.getData("Installment"));  				
			Thread.sleep(750);

			Common_Property.driver.findElement(By.name("displayFlatRate")).clear();
			Common_Property.driver.findElement(By.name("displayFlatRate")).sendKeys(Driver.getData("Proposrate"));  				
			Thread.sleep(750);
				
			Adminfee=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/input[1]")).getAttribute("value");
			Thread.sleep(350);
			System.out.println("admin fee is"+Adminfee);
			
					
			Balloon=Driver.getData("Baloon");			
			Thread.sleep(350);
			System.out.println(Balloon);
					
			String Delaerdepo=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[3]/td[5]/input")).getAttribute("Value");
			Thread.sleep(350);
					
			String	Partex=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[4]/td[6]/input")).getAttribute("Value");
			Thread.sleep(350);
			Advance=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[2]/td[2]")).getText().toString();
			Thread.sleep(350);
			float Adv=Float.parseFloat(Advance);
			String goodscost=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[7]/td[3]")).getText().toString();
			Thread.sleep(350);
					 
			float Delaerdepo1=Float.parseFloat(Delaerdepo);
			float Partex1=Float.parseFloat(Partex);
			float totalamnt=Delaerdepo1+Partex1;
			float goodscost1=Float.parseFloat(goodscost);
			float Advance1=goodscost1-totalamnt;
					
			if(Advance1==Adv)
			{
							
								
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Advance amount verified is"+Advance;		 
				Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
			}
			else
			{	 
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Advance amount is updated incorrectly";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
			}
			 //calculate
						
			Common_Property.driver.findElement(By.linkText("Calculate")).click();  				
			Thread.sleep(750);; 
			// continue			
			Common_Property.driver.findElement(By.linkText("Continue")).click();  				
			Thread.sleep(20000);
		
			// newgareement			
			Common_Property.driver.findElement(By.linkText("new agreement")).click();  				
			Thread.sleep(5000);
						
		    
			
		}	
		catch (Exception e) 
		{   
		
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
    		   	
		}
    				
    

    }
	
	public static void CallvalBureaudatas() throws  Exception
	   {    	
	   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
				
			try{
				
						
				
				Thread.sleep(2000);
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
				
				
				
				Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[8]/a[1]")).click(); 				 
				Thread.sleep(2000);
				
				//Dealflo
					
				String Agency=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/table/tbody/tr[2]/td[3]")).getText().toString();			 
				Thread.sleep(800);
				
				
					 if(Agency.contains(Driver.getData("Agency")))
					 {
					  
						 Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/table/tbody/tr[2]/td[1]/a")).click(); 				 
						 Thread.sleep(800);
						
						 String BankStandard=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/div/div/table[2]/tbody/tr[1]/td[2]/font")).getText().toString(); 				 
						 Thread.sleep(700);
						 
						 String BankEnhanced=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/div/div/table[2]/tbody/tr[2]/td[2]/font")).getText().toString(); 				 
						 Thread.sleep(700);
						 
						 String IDEnhanced=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/div/div/table[2]/tbody/tr[5]/td[2]/font")).getText().toString(); 				 
						 Thread.sleep(700);
						 
						 BankEnhancedscore=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/div/div/table[9]/tbody/tr[2]/td[2]")).getText().toString(); 				 
						 Thread.sleep(700);
						 
						 if(BankStandard.equalsIgnoreCase(Driver.getData("BankStandard"))&&BankEnhanced.equalsIgnoreCase(Driver.getData("BankEnhanced"))&&IDEnhanced.equalsIgnoreCase(Driver.getData("IDEnhanced"))&&BankEnhancedscore.equalsIgnoreCase(Driver.getData("BankEnhancedscore")))
						 {	
							
							
						    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						    Startline.ExtentPassReport(methodname, "Bank Standard displayed as"+BankStandard , BankStandard, datetimestart);
						    Startline.ExtentPassReport(methodname, "BankEnhanced displayed as"+BankEnhanced , BankEnhanced, datetimestart);
						    Startline.ExtentPassReport(methodname, "IDEnhanced displayed as "+IDEnhanced , IDEnhanced, datetimestart);
						    Startline.ExtentPassReport(methodname, "BankEnhancedscore displayed as"+BankEnhancedscore, BankEnhancedscore, datetimestart);
						    Startline.ExtentPassReport(methodname, "BankEnhancedscore is less than 45"  , BankEnhancedscore, datetimestart);
						 }
					 
						 else
						 {
							
						   
						   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentFailReport(methodname, "Bank Standard NOT displayed as YES"  , null, datetimestart);
						   Startline.ExtentFailReport(methodname, "BankEnhanced displayed as"+BankEnhanced , BankEnhanced, datetimestart);
						   Startline.ExtentFailReport(methodname, "IDEnhanced NOT displayed as YES"  , null, datetimestart);
						   Startline.ExtentPassReport(methodname, "BankEnhancedscore is less than 45"  , BankEnhancedscore, datetimestart);
						   Thread.sleep(700);
						 }
					  
					 //Back
						 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/table/tbody/tr/td[1]/a")).click(); 				 
						 Thread.sleep(700);
						 
					 }
					 
					 
					 else
					 {
						 Startline.ExtentFailReport(methodname, "Agency is not displayed as Dealflo", null, datetimestart);
					 }
				//Call tac
					 
					 String Agency1=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/table/tbody/tr[3]/td[3]")).getText().toString();			 
					 Thread.sleep(800);
					 
					 if(Agency1.contains(Driver.getData("Agency1")))
					 {
					  
						
						 Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/table/tbody/tr[3]/td[1]/a")).click(); 				 
						 Thread.sleep(700);
					
						 String Warningmsg=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/div/div/span")).getText().toString(); 				 
						 Thread.sleep(700);
						 
					 
						 if(Warningmsg.contains(Driver.getData("Warningmsg")))
						 {
							 
						    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						    Startline.ExtentPassReport(methodname, "Warning message is displayed as expected", Warningmsg, datetimestart);
						    Thread.sleep(700); 
						 
						 }
					 
					 
						 else
						 {
							 
						   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentFailReport(methodname,"Warning message is NOT displayed", null, datetimestart);
						   Thread.sleep(700);
						 }
					 
						 WebElement searchid=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/div/table[2]/tbody/tr[2]/td[2]")); 				 
						 Thread.sleep(700);
						 String SearchID=searchid.getText().toString();
					 
					
						 if(searchid.isDisplayed())
						 {

						    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						    Startline.ExtentPassReport(methodname, "Search ID is displayed as expected", SearchID, datetimestart);
						    Thread.sleep(700); 
						 
						 }
					 
					 
						 else
						 {
							
						   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentFailReport(methodname,"Search ID is NOT displayed ", null, datetimestart);
						   Thread.sleep(700);
						 }
						//back
						 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/table/tbody/tr/td[1]/a")).click(); 				 
						 Thread.sleep(700);
					 }  
					 
					 else
					 {
						 Startline.ExtentFailReport(methodname, "Agency is not displayed as Calltac", null, datetimestart);
					 }
					 
					   //CallReport
					 
					 	String Agency2=Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/table/tbody/tr[4]/td[3]")).getText().toString();			 
					 	Thread.sleep(800);
					 
					 	if(Agency2.contains(Driver.getData("Agency2")))
					 	
					 	{
					   
						 Common_Property.driver.findElement(By.xpath("//div[@id='bureauPanelBody']/table/tbody/tr[4]/td[1]/a")).click(); 				 
						 Thread.sleep(700);
					 
						 Common_Property.driver.findElement(By.xpath("//div[@id='tabs0']/ul/li[3]/a/span")).click(); 				 
						 Thread.sleep(700);
					
			
				 		WebElement share=Common_Property.driver.findElement(By.xpath("//div[@id='share0']/div")); 				 
						Thread.sleep(700);
						
						 if(share.isDisplayed())
						 {
							 	
							    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							    Startline.ExtentPassReport(methodname, "Customer Call Report BSB Quotation row is greater than 0", null, datetimestart);
							    Thread.sleep(700); 
							 
						 }
						 
						 
						 else
						 {
							 
							   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							   Startline.ExtentFailReport(methodname,"Customer Call Report BSB Quotation is NOT greater than 0", null, datetimestart);
							   Thread.sleep(700);
						 }
						 
						
						 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/table/tbody/tr/td[1]/a")).click(); 				 
						 Thread.sleep(1000);
	       
						 
				 	}
				 	
				 	else
					 {
						 Startline.ExtentFailReport(methodname, "Agency is not displayed as Call report", null, datetimestart);
					 }
				
				 	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click(); 				 
					 Thread.sleep(1000);
				
			}
				
	    			catch (Exception e) 

				     {   
	    				
				
	    				System.out.println("The exception was "+e);
	    				System.out.println("Abnormal Termination due to "+e);
	    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				  				   	      
	    		   	}

		
	 }
	   
	public static void PDIAgrReferred() throws  Exception
	{    	

			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
	try{
			
			
			WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
			JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
			jse.executeScript("arguments[0].click();", element);
			
			
			String Status = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			Startline.ExtentPassReport(methodname, "Agreement status is"+ Status,Status, datetimestart);
			Thread.sleep(700);
			
			Plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			Startline.ExtentPassReport(methodname, "Agreement Plan is"+ Plan,Plan, datetimestart);
			
			installment = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[6]/td[4]")).getText().toString();
			Startline.ExtentPassReport(methodname,"Installment amount is "+ installment,installment,datetimestart);
			Thread.sleep(750);
			
			
			
			String Residualval = Common_Property.driver.findElement(By.name("residualValue")).getAttribute("value");
			Thread.sleep(750);
			
			String Halfway = Common_Property.driver.findElement(By.name("halfwayValue")).getAttribute("value");
			Thread.sleep(750);
			
			String VTexposure = Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr/td[2]/table/tbody/tr[6]/td[2]")).getText().toString();
			Thread.sleep(750);
			
			
		
			String specialterm = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[2]/td[3]")).getText().toString();
			Thread.sleep(750);
			if(specialterm.contains(Driver.getData("specialterm")))
			{
				Startline.ExtentPassReport("Event log ","Special term count is greater than 0 ",null,datetimestart);
				Thread.sleep(750);
				
			}
			else
			{
				Startline.ExtentPassReport("Event log ","Special term count is less than 0 ",null,datetimestart);//pcp brand no special term will present
				Thread.sleep(750);
				
			}
		
			
			if(Status.contains(Driver.getData("RefStatus")) && Plan.contains(Driver.getData("Refplanname")))
		    {
				
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				    Startline.ExtentPassReport(methodname, "Status is displayed as"+Status, Status, datetimestart);
				    Startline.ExtentPassReport(methodname, "Plan is displayed as"+Plan, Plan, datetimestart);
					Thread.sleep(700);		
				
			}
			
			else
			{
				
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				    Startline.ExtentPassReport(methodname, "Status is NOT displayed as expected", null, datetimestart);
				    Startline.ExtentPassReport(methodname, "Plan is NOT displayed as expected",  null, datetimestart);
					Thread.sleep(700);		
			}
			
			String bal=Driver.getData("Baloon");
			Float balloon=Float.parseFloat(bal);
			
			Float HWval=Float.parseFloat(Halfway);
			Float VTexpo=Float.parseFloat(VTexposure);
			
			if(balloon>0.00)
			{
				Float RVvalue=Float.parseFloat(Residualval);
				if( (RVvalue>0.00)&&(HWval>0.00)&&(VTexpo>=0.00))
				{
					
					String Resvalue=RVvalue.toString();
					String Halfvalue=HWval.toString();
					String Vtex=VTexpo.toString();
					Startline.ExtentPassReport(methodname, "Residual value calculated and the value"+RVvalue, Resvalue, datetimestart);
					Startline.ExtentPassReport(methodname, "Halfway value calculated and the value is"+HWval, Halfvalue, datetimestart);
					Startline.ExtentPassReport(methodname, "VT exposure value calculated and the value is"+VTexpo, Vtex, datetimestart);
				}
				else
				{
					Startline.ExtentFailReport(methodname, "Residual/HW/Vt exposure value not calculated as expected with balloon",null, datetimestart);
				}
				
				
			}
			
			if(balloon==0.00)
			{ 
				

				if( (Residualval.isEmpty()||Residualval.equals("0.00"))&&(HWval>0.00)&&(VTexpo>=0.00))
				{
					
					Startline.ExtentPassReport(methodname, "Residual value is displayed as blank or equal to Zero"+Residualval, Residualval, datetimestart);
					Startline.ExtentPassReport(methodname, "Halfway value calculated and the value is"+HWval, Residualval, datetimestart);
					Startline.ExtentPassReport(methodname, "VT exposure value calculated and the value is"+VTexpo, Residualval, datetimestart);
				}
				else
				{
					Startline.ExtentFailReport(methodname, "Residual/HW/Vt exposure value not calculated as expected without a balloon",null, datetimestart);
				}
				
				
			}
			
			//PDI check decision
			SMF_RestAssured.CheckDecision();
			String a=Checkdecision.AgreementPDIstatus;
			
			if(SMF_RestAssured.Tag_value.get("tns:Decision").contains(Driver.getData("Verification")))
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Status, Status, datetimestart);
				Thread.sleep(700);
			}
			else
			{
				Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Status, Status, datetimestart);
				Thread.sleep(700);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			}
		
			
			//Referred Events Query
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
			Common_Property.st = Common_Property.SQLcon.createStatement();
			
			String Agreementno = "'" + Driver.getData("Agreement_Number") +  "'" ;
			System.out.println(Agreementno);
			String Query1 = "select AGR_SERIAL from agreements Where AGR_AGREEMENT_NUMBER="+Agreementno+" ";
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
			Common_Property.rs = Common_Property.st.executeQuery(Query1);
			Common_Property.rs.next();
				 
			String AgrSerial =  "'" + Common_Property.rs.getString("AGR_SERIAL")+ "'";
			System.out.println(AgrSerial);
				
				 
			ArrayList<String> activitys = new ArrayList<String>();
			ArrayList<String> eventvalue = new ArrayList<String>();
			
			//Activities ArrayList
			
			activitys.add(0,"Automatically Referred");
			activitys.add(1,"Call Validate Decision Made");
			
			eventvalue.add(0, "SMF VT Exposure");
			eventvalue.add(1, "SMF Halfway Value");
		
			
		for(int index = 0; index <=activitys.size()-1; index ++)
		{
			String ActivityN = "'" + activitys.get(index) + "'";
			Query1= "Select A.ACT_DESCRIPTION,A.ACT_EVENT_VALUE_TITLE,B.EVE_VALUE,B.EVE_VALUE1 from Activities A, Events B Where (A.Act_serial = B.Eve_activity) and B.eve_agreement = "+AgrSerial+" and A.Act_Description = " + ActivityN + "";
			Common_Property.rs1 = Common_Property.st.executeQuery(Query1);
		    Common_Property.rs1.next();
		    String evetitle=Common_Property.rs1.getString("ACT_EVENT_VALUE_TITLE");
		    String Primaryvalue=Common_Property.rs1.getString("EVE_VALUE");
		    String Secondaryvalue=Common_Property.rs1.getString("EVE_VALUE1");
		    String eventdescription=Common_Property.rs1.getString("ACT_DESCRIPTION");
			
			
		if(index==0)
		{
			if(eventdescription.contains(Driver.getData("Referredeve1")))
			{
				Startline.ExtentPassReport(methodname,"Automatically Referred events generated succesfully",eventdescription,datetimestart);
				Startline.ExtentPassReport(methodname,"Event value displayed","Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secondaryvalue,datetimestart);
				
			}
			
			else
			{
				Startline.ExtentFailReport(methodname,"Automatically Referred event NOT generated succesfully",eventdescription,datetimestart);
			}
		}
		else if(index==1)
		{
			if(eventdescription.contains(Driver.getData("Referredeve2")))
			{
				Startline.ExtentPassReport(methodname,"Call Validate Decision Made events generated succesfully",eventdescription,datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname,"Call Validate Decision Made event NOT generated succesfully",eventdescription,datetimestart);
			}
			
		}
		
	//	Startline.ExtentPassReport(methodname ,eventdescription,"Title:"+evetitle+",Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secondaryvalue,datetimestart);
		
	}	
		activitys.add(2,"Additional Attribute Added");
		for(int index = 0; index <=eventvalue.size()-1; index ++)
		{
				
			String ActivityN = "'" + activitys.get(2) + "'";
			String EventN = "'" + eventvalue.get(index) + "'";
			Query1= "Select A.ACT_DESCRIPTION,A.ACT_EVENT_VALUE_TITLE,B.EVE_VALUE,B.EVE_VALUE1 from Activities A, Events B Where (A.Act_serial = B.Eve_activity) and B.eve_agreement = "+AgrSerial+" and A.Act_Description = " + ActivityN + " and B.EVE_VALUE= "+EventN+ "";
			Common_Property.rs1 = Common_Property.st.executeQuery(Query1);
		    Common_Property.rs1.next();
		    String Primaryvalue=Common_Property.rs1.getString("EVE_VALUE");
		    String Secondaryvalue=Common_Property.rs1.getString("EVE_VALUE1");
			
		   if(index==0)
		   {
			   
			   Float Secvalue=Float.parseFloat(Secondaryvalue);
				Float VTexposre=Float.parseFloat(VTexposure);
				
			if((Primaryvalue.contains(eventvalue.get(index)))&&(Secvalue.equals(VTexposre)))
			{
			
					Startline.ExtentPassReport(methodname,"VT exposure value  in Event and the decision page are same","Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secondaryvalue,datetimestart);
			}
				
			else
			{
					Startline.ExtentFailReport(methodname,"VT exposure value  in Event and the decision page are NOT same","Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secondaryvalue,datetimestart);
			}
		
		   }
		  else if(index==1)
		  {
			   Float Secvalue=Float.parseFloat(Secondaryvalue);
				Float Halfwayval=Float.parseFloat(Halfway);
			   
				if((Primaryvalue.contains(eventvalue.get(index)))&&(Secvalue.equals(Halfwayval)))
				{
			
					Startline.ExtentPassReport(methodname,"HAlfwayvalue  in Event and the decision page are same","Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secvalue,datetimestart);
				}
				
				else
				{
					Startline.ExtentFailReport(methodname,"HAlfwayvalue value  in Event and the decision page are NOT same","Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secvalue,datetimestart);
				}
		  }
		   
		 //  Startline.ExtentPassReport(methodname ,eventdescription,"Title:"+evetitle+",Primaryvalue:"+Primaryvalue+",Secondaryvalue:"+Secondaryvalue,datetimestart);
		   
	 }	
				
			
	}
	catch (Exception e) 
	{   
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
		
	}
				
				
	
	}
	public static void Newagrsearch() throws  Exception
	{    	

			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try			
			{
			
		
			
			Common_Property.driver.findElement(By.linkText("new agreement")).click();
			Thread.sleep(1000);
		
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(750);
		
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(750);
		
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(750);
			
			
			//refresh
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			Thread.sleep(1000);
		
			
	}
	catch (Exception e) 
	{   
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
		
	}
				
				
	
	}
		
		
	/*-------------------------------------------------------------
	  -------------------------------------------------------------
	
	Database:Oracle SQL Developer
	Technology Used:JDBC Driver
	
	Definition : JDBC driver is a software component enabling a 
	Java application to interact with a database.The JDBC driver gives out the 
	connection to the database and implements the protocol for transferring the 
	query and result between client and database.
	
	---------------------------------------------------------------
	--------------------------------------------------------------*/
	

	public static void SQLrefjdbc() throws Exception

	{
		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);	

	 try 
	    {	
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
			Common_Property.st = Common_Property.SQLcon.createStatement();
			
			String Agreementno = "'" + Driver.getData("Agreement_Number") +  "'" ;
			System.out.println(Agreementno);
			String Query1 = "select AGR_SERIAL from agreements Where AGR_AGREEMENT_NUMBER="+Agreementno+" ";
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
			Common_Property.rs = Common_Property.st.executeQuery(Query1);
			Common_Property.rs.next();
				 
			String AgrSerial =  "'" + Common_Property.rs.getString("AGR_SERIAL")+ "'";
			System.out.println(AgrSerial);
				
				 
			ArrayList<String> activitys = new ArrayList<String>();
			ArrayList<String> eventtitle = new ArrayList<String>();
			ArrayList<String> eventvalue = new ArrayList<String>();
			
			//Activities ArrayList
			
			activitys.add(0,"Quality+ and PCP Exceptions");
			activitys.add(1,"Finishline Available Set");
			activitys.add(2,"Product Evaluated");
			activitys.add(3,"Decisioning Started");
			activitys.add(4,"Call Report Search Required");
			activitys.add(5,"Call Report Search Completed");
			activitys.add(6,"Trace Score Set");
			activitys.add(7,"OI Score Set");
			activitys.add(8,"Gauge Score Set");
			activitys.add(9,"Pre Vet Ruleset Evaluated");
			activitys.add(10,"Post Bureau Ruleset Evaluated");
			activitys.add(11,"CallValidate Ruleset Evaluated");
			activitys.add(12,"E-sig required set");
			
			for(int index = 0; index <=activitys.size()-1; index ++)
			{
			String ActivityN = "'" + activitys.get(index) + "'";
			Query1= "Select A.ACT_DESCRIPTION,A.ACT_EVENT_VALUE_TITLE,B.EVE_VALUE from Activities A, Events B Where (A.Act_serial = B.Eve_activity) and B.eve_agreement = "+AgrSerial+" and A.Act_Description = " + ActivityN + "";
			Common_Property.rs1 = Common_Property.st.executeQuery(Query1);
		    Common_Property.rs1.next();
			Startline.ExtentPassReport(Common_Property.rs1.getString("ACT_DESCRIPTION") ,"Event generated sucessfully",Common_Property.rs1.getString("ACT_EVENT_VALUE_TITLE")+ ":" + Common_Property.rs1.getString("EVE_VALUE"),datetimestart);
			
			
			//Event Notes counts for Quality+ and Pcp exceptions
			
			if (Common_Property.rs1.getString("ACT_DESCRIPTION").equalsIgnoreCase("Quality+ and PCP Exceptions") && Common_Property.rs1.getString("EVE_VALUE").equalsIgnoreCase("SMF Common Ruleset"))
				{
					Common_Property.rs2 = Common_Property.st.executeQuery("select Count(*) as CNT from notes where not_foreign_serial in (select eve_serial from events where  eve_agreement = "+AgrSerial+" and events.EVE_VALUE = 'SMF Common Ruleset') ");
					Common_Property.rs2.next();
					System.out.println(Common_Property.rs2.getString("CNT"));
					Startline.ExtentPassReport("Quality+ and PCP Exceptions" ,"Event Notes count for" + "Quality+ and PCP Exceptions","SMF Common Ruleset" + ":" + Common_Property.rs2.getString("CNT"),datetimestart);
						
	     	    }
			
			}
			Common_Property.rs2.close();
			Common_Property.rs1.close();
			
			
			// Decision reason counts for an agreements
			
			Common_Property.rs1 = Common_Property.st.executeQuery("select count(*) as CNT1 from notes where not_foreign_serial in (select eve_serial from events where  eve_agreement = "+AgrSerial+") ");
			Common_Property.rs1.next();
			if (!Common_Property.rs1.wasNull())
			{
				Startline.ExtentPassReport("Decision Reason Count" + Agreementno,"Decision reason count greater than 1", Common_Property.rs1.getString("CNT1"),datetimestart);
			}
			Common_Property.rs1.close();
			Common_Property.rs.close();
			Common_Property.st.close();
			Common_Property.SQLcon.close();
			
	    }
	 
	 catch (Exception ex) 
		{
		    System.err.print("Exception: ");
		    System.err.println(ex.getMessage());
		}
	}    		
			
	public static void Eventactivity() throws Exception

	{
		
		 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		 Date sdate = new Date();
		 String datetimestart=dateFormat.format(sdate);	

	 try 
	    {	
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
			Common_Property.st = Common_Property.SQLcon.createStatement();
			
			String Agreementno = "'" + Driver.getData("Agreement_Number") +  "'" ;
			System.out.println(Agreementno);
			String Query1 = "select AGR_SERIAL from agreements Where AGR_AGREEMENT_NUMBER="+Agreementno+" ";
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
			Common_Property.rs = Common_Property.st.executeQuery(Query1);
			Common_Property.rs.next();
				 
			String AgrSerial =  "'" + Common_Property.rs.getString("AGR_SERIAL")+ "'";
			System.out.println(AgrSerial);
			
			
				 
		
			
	    }
	 
	 catch (Exception ex) 
		{
		    System.err.print("Exception: ");
		    System.err.println(ex.getMessage());
		}
	}    		
			
			
	public static void PDI_Score_Validate() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				
				int f = Integer.parseInt(BankEnhancedscore);
				 System.out.println(f);
				 int G=45;
			
				 if (f==G)
						
				 {      
					//manual over ride
						Common_Property.driver.findElement(By.linkText("Manual Override")).click();
						Thread.sleep(700);
						
						
						 String Status = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
						 Startline.ExtentPassReport(methodname, "Status is " + Status, Status, datetimestart);
						 Thread.sleep(700);
					
							
						 Plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
						 Startline.ExtentPassReport(methodname, "Agreement plan is"+ Plan ,Plan, datetimestart);
						 
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						
						 int i=0;
						 for(i=0;i<=20;i++)
						 {
							 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[1]")).click();
							 Thread.sleep(700);
							 String EsignURL=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[15]/td[2]")).getText().toString();
							 Thread.sleep(700);
							 boolean a=EsignURL.contains("https");
							 if(a)
							 break;
								
						 }
						
						 	String EsignURL=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[15]/td[2]")).getText().toString();
							Thread.sleep(700);
							
							
							 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							 
							 Startline.ExtentPassReport(methodname, "Esign url generated", EsignURL, datetimestart);
							 SMF_RestAssured.Student_Url=EsignURL;
							 Common_Funtions.Agreement_Store.Store_Data(Driver.Project,SMF_RestAssured.Agreement_Number,SMF_RestAssured.Student_Url,Driver.recordset2);
					
		//Accpetd events query
			// Events Query
								Class.forName("oracle.jdbc.driver.OracleDriver");
								Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
								Common_Property.st = Common_Property.SQLcon.createStatement();
								
								String Agreementno = "'" + Driver.getData("Agreement_Number") +  "'" ;
								System.out.println(Agreementno);
								String Query1 = "select AGR_SERIAL from agreements Where AGR_AGREEMENT_NUMBER="+Agreementno+" ";
								Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
								Common_Property.rs = Common_Property.st.executeQuery(Query1);
								Common_Property.rs.next();
									 
								String AgrSerial =  "'" + Common_Property.rs.getString("AGR_SERIAL")+ "'";
								System.out.println(AgrSerial);
									
									 
								ArrayList<String> activitys = new ArrayList<String>();
								ArrayList<String> eventtitle = new ArrayList<String>();
								ArrayList<String> eventvalue = new ArrayList<String>();
								
								//Activities ArrayList
								
								activitys.add(0,"Automatically Approved");
								activitys.add(1,"CV Override Decision Made");
								activitys.add(2,"Document sent to Dealflo");
								activitys.add(3,"IOCS Initiate Success");
								activitys.add(4,"IOCS Dealer URL Set");
								activitys.add(5,"Document Emailed");
							
								
								for(int index = 0; index <=activitys.size()-1; index ++)
								{
								String ActivityN = "'" + activitys.get(index) + "'";
								Query1= "Select A.ACT_DESCRIPTION,A.ACT_EVENT_VALUE_TITLE,B.EVE_VALUE,B.EVE_VALUE1 from Activities A, Events B Where (A.Act_serial = B.Eve_activity) and B.eve_agreement = "+AgrSerial+" and A.Act_Description = " + ActivityN + "";
								Common_Property.rs1 = Common_Property.st.executeQuery(Query1);
							    Common_Property.rs1.next();
							    String eventdescription=Common_Property.rs1.getString("ACT_DESCRIPTION");
								
								if((index==0)) //Automatically Approved
								
								{
									if(eventdescription.contains(Driver.getData("WEevent1")))
									{
									Startline.ExtentPassReport(methodname ,"Accpeted event1:Automatically Approved generated",eventdescription,datetimestart);
									}
								
									else
									{
									Startline.ExtentFailReport(methodname ,"Accpeted event1:Automatically Approved NOT generated",eventdescription,datetimestart);
									}
								}
								if((index==1)) //CV Override Decision Made
									
								{
									if(eventdescription.contains(Driver.getData("WEevent2")))
									{
									Startline.ExtentPassReport(methodname ,"Accpeted event2:CV Override Decision Made generated",eventdescription,datetimestart);
									}
								
									else
									{
									Startline.ExtentFailReport(methodname ,"Accpeted event2:CV Override Decision Made NOT generated",eventdescription,datetimestart);
									}
								}
								if((index==2)) //Document sent to Dealflo
									
								{
									if(eventdescription.contains(Driver.getData("WEevent3")))
									{
									Startline.ExtentPassReport(methodname ,"Accpeted event3:Document sent to Dealflo generated",eventdescription,datetimestart);
									}
								
									else
									{
									Startline.ExtentFailReport(methodname ,"Accpeted event3:Document sent to Dealflo NOT generated",eventdescription,datetimestart);
									}
								}
								if((index==3)) //IOCS Initiate Success
									
								{
									if(eventdescription.contains(Driver.getData("WEevent4")))
									{
									Startline.ExtentPassReport(methodname ,"Accpeted event4:IOCS Initiate Success generated",eventdescription,datetimestart);
									}
								
									else
									{
									Startline.ExtentFailReport(methodname ,"Accpeted event4:IOCS Initiate Success NOT generated",eventdescription,datetimestart);
									}
								}
								if((index==4)) //IOCS Dealer URL Set
									
								{
									if(eventdescription.contains(Driver.getData("WEevent5")))
									{
									Startline.ExtentPassReport(methodname ,"Accpeted event5:IOCS Dealer URL Set generated",eventdescription,datetimestart);
									}
								
									else
									{
									Startline.ExtentFailReport(methodname ,"Accpeted event5:IOCS Dealer URL Set NOT generated",eventdescription,datetimestart);
									}
								}
								if((index==5)) //Document Emailed
									
								{
									if(eventdescription.contains(Driver.getData("WEevent6")))
									{
									Startline.ExtentPassReport(methodname ,"Accpeted event6:Document Emailed generated",eventdescription,datetimestart);
									}
								
									else
									{
									Startline.ExtentFailReport(methodname ,"Accpeted event6:Document Emailed NOT generated",eventdescription,datetimestart);
									}
								}
						/*		
							//events
							 Common_Property.driver.findElement(By.linkText("events")).click(); 
							 Thread.sleep(850);
							//Automatically approved
							 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[8]/td[3]")).getText().toString();				 
							 Thread.sleep(850);
						
							 //cv overrride
							 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[7]/td[3]")).getText().toString();				 
						     Thread.sleep(850);
						
						     //Intiatesuccess
						     Refevent3=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();				 
							  Thread.sleep(850);
							 
							//IOCS Dealer URL Set
							   Refevent4=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();				 
							   Thread.sleep(850);
						
									   
							if(Refevent1.contains(Driver.getData("WEevent1"))&&Refevent2.contains(Driver.getData("WEevent2"))&&Refevent3.contains(Driver.getData("WEevent3"))&&Refevent4.contains(Driver.getData("WEevent4")))
							{				
												 
											    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);  
											    Startline.ExtentPassReport(methodname, "Accepted Auto approved and it's loan amount event generated"+ Refevent1,"Autoapproved event:"+Refevent1, datetimestart);
											    Startline.ExtentPassReport(methodname, " Accepted Override Decision Made Event verified sucessfully and the event is"+Refevent2, "Cv override event:"+Refevent2, datetimestart);
											    Startline.ExtentPassReport(methodname, "IOCS initiate success evenst is generated"+ Refevent3,"Esignature event:"+Refevent3, datetimestart);
											    Startline.ExtentPassReport(methodname, "IOCS initiate Set evenst is generated"+ Refevent4,"Esignature event:"+Refevent4, datetimestart);
							}
										
							else
								{				
												
											   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
											   Startline.ExtentFailReport(methodname, "Accepetd Awaiting esign Events generation not generated as expected" , null, datetimestart);
											   Thread.sleep(700);
								}
							//back
							Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
							Thread.sleep(850);
			  
						
							 //documents
							 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[2]")).click(); 				 
							 Thread.sleep(850);
						
							 String AcceptDocument1=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
							 Thread.sleep(850);
						
							 String AcceptDocument2=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[3]/td[1]")).getText().toString();			 
							 Thread.sleep(850);
							 
							 String AcceptDocument3=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[4]/td[1]")).getText().toString();			 
							 Thread.sleep(850);
							 
							 
							 if((AcceptDocument1.contains(Driver.getData("AccEDocumentname1"))||AcceptDocument1.contains(Driver.getData("AccEDocumentname2")))&&(AcceptDocument2.contains(Driver.getData("AccEDocumentname1"))||AcceptDocument2.contains(Driver.getData("AccEDocumentname2")))&&AcceptDocument3.contains(Driver.getData("AccEDocumentname3")))
							 {
								 
								 	
								   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
								   Startline.ExtentPassReport(methodname, "Document1"+ AcceptDocument1 +" is generated  " , AcceptDocument1, datetimestart);
								   Startline.ExtentPassReport(methodname, "Document2"+ AcceptDocument2 +" is generated " , AcceptDocument2, datetimestart);
								   Startline.ExtentPassReport(methodname, "Document3"+ AcceptDocument3 +" is generated " , AcceptDocument3, datetimestart);
								   Thread.sleep(700);
							}
							
							 else
							 {
								 	
								   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
								   Startline.ExtentFailReport(methodname, "Accpeted awaiting esign documents is not generated as expected" , null, datetimestart);
								   Thread.sleep(700);
							 }
							 
							//Docment back
							 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 
							 Thread.sleep(850);
							 
							 	Checkdecision.Agr_checkdecision();
								String a=Checkdecision.AgreementPDIstatus;
								
								if(a.contains(Status))
								{
									
									Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
									Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Status, Status, datetimestart);
									Thread.sleep(700);
								}
								else
								{
									Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Status, Status, datetimestart);
									Thread.sleep(700);
									
									Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
								}*/
					 	}
				 }
						 else
						 {
					  
							 
							 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							 Startline.ExtentPassReport(methodname, "plan and the status is not displayed as Awaiting esign and Accepted" , null, datetimestart);
							 Thread.sleep(700);
						 }
				 
				 	
						 
			}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
}

   			
	public static void GetEsignURL() throws  Exception
    {    	
   
		
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				if(Plan.contains(Driver.getData("Esignplan")))
				{
					
					
					String url=Driver.getData("EsignatureURL");
					Startline.ExtentPassReport(methodname, "esign url generated ", url, datetimestart);
					Common_Property.driver.get(url);	 			
					Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 			Thread.sleep(2000);
				}
				else
				{
					Startline.ExtentPassReport(methodname, "The plan is displayed as", Plan, datetimestart);
				}
			  }
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

    
	
	public static void IOCSURL() throws  Exception
    {    	
		
   
		
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				if(Plan.contains(Driver.getData("Esignplan")))
				{
					
					
					IOCSurl=Driver.getData("EsignatureURL");
						 			
					Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 			Thread.sleep(2000);
				}
				else
				{
					Startline.ExtentPassReport(methodname, "The plan is displayed as", Plan, datetimestart);
				}
			 }
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

    
	
	public static void PutIOCSURL() throws  Exception
    		{    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				
				if(Plan.contains(Driver.getData("Esignplan")))
					{
					
					Common_Property.driver.get(IOCSurl);	 			
					Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 			Thread.sleep(2000);
		 			
		 			
		 			String message=Common_Property.driver.findElement(By.xpath("//*[@id='aws_main_pane']/h1")).getText().toString();
					Thread.sleep(2000);
					
					if(message.contains(Driver.getData("Agrcancel")))
					{	
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "IOCS URL is cancelled and cancelled message displayed as"+message, message, datetimestart);
						Thread.sleep(950);
					}
		 			
					else
					{
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentFailReport(methodname, "Cancelled message is not displayed", Plan, datetimestart);
						Thread.sleep(950);
					}
		 			
				}
				
				
				else
				{
					Startline.ExtentPassReport(methodname, "The plan is displayed as", Plan, datetimestart);
				}
				
				
				
				
			}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

   
	/*-------------------------------------------------------------
	  -------------------------------------------------------------
	
	Class: Esignature Workflow 
	Toolused Used:AutoIT -----ForFilecupload
	
	Definition:Fillo is an Excel API for Java and you can query xls & xlsx files.
	it supports SELECT, UPDATE & INSERT SQL queries with or without WHERE clause.
	Queries Used here in Driver:SELECT

	---------------------------------------------------------------
	--------------------------------------------------------------*/
	public static void Esignflow() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
				{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("printConsent")).click();
				Thread.sleep(2000);
			
			 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
			 	Common_Property.driver.switchTo().window(tabs2.get(1));
			 	Common_Property.driver.close();
			 	Thread.sleep(750);
			 	Common_Property.driver.switchTo().window(tabs2.get(0));
			 	Thread.sleep(750);
			
			 	Common_Property.driver.findElement(By.id("continue")).click();		
				Thread.sleep(750);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
				Thread.sleep(1000);
				
				Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);

				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				ArrayList<String> Questions = new ArrayList<String>();
				
				Questions.add(0,"How long have you had a personal mobile phone contract with your current provider?*");
				Questions.add(1,"Which one of the following addresses have you been associated with?*");
				Questions.add(2,"When did you last take out a personal loan (excluding student loans)?*");
				Questions.add(3,"When did you last take out a personal mortgage?*");
				Questions.add(4,"What is the current outstanding balance of your most recent mortgage?*");
				Questions.add(5,"When did you last take out a hire purchase agreement?*");
				Questions.add(6,"When did you last take out a personal credit card?*");
				Questions.add(7,"When did you last open a personal current account?*");
				Questions.add(8,"Do you have a personal mobile phone contract registered to your current address?*");
				Questions.add(9,"When did you last open a mail order account with a credit facility?*");
				
				ArrayList<String> answers = new ArrayList<String>();
				answers.add(0,"4");
				answers.add(1,"4");
				answers.add(2,"1");
				answers.add(3,"1");
				answers.add(4,"0");
				answers.add(5,"3");
				answers.add(6,"3");
				answers.add(7,"3");
				answers.add(8,"0");
				answers.add(9,"3");
				
				int QLoop = 1,AnsLoop = 1;
				while(QLoop <=7)
				{
					String Qnames= Common_Property.driver.findElement(By.xpath("//*[@id='kba_questions_answers']"+ "[" + QLoop + "]" )).getText().toString();
					System.out.println(Qnames);
					System.out.println(Qnames.length());
					int CntIterator = 0 ;
					Iterator it  = Questions.iterator();
					while (it.hasNext())
					{
						
						Object ele = it.next();
						System.out.println(ele);
						System.out.println(ele.toString().length());
						
						String Cmp = ele.toString();
						if (Cmp.equalsIgnoreCase(Qnames.trim()))
						{
							//System.out.println(answers.get(CntIterator));
							java.util.List<WebElement> quetion1 = Common_Property.driver.findElements(By.name("kbaQuestion_" + AnsLoop +"_answer"));
							int ActClik = Integer.parseInt(answers.get(CntIterator));
							quetion1.get(ActClik).click();
							AnsLoop++;
							break;
						}
						CntIterator++;
						
					}
					
					QLoop = QLoop + 2;
					
				}
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.name("drivingLicenceNumber")).sendKeys(Driver.getData("DLnumber"));
				Thread.sleep(950);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(6000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				JavascriptExecutor jse6 = (JavascriptExecutor)Common_Property.driver;
				jse6.executeScript("window.scrollBy(0,6000)", "");
				
				Thread.sleep(6000);
				
				Common_Property.driver.findElement(By.id("Required_tick")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				
				Common_Property.driver.findElement(By.xpath("//span[@class='to_click signature_block_text']")).click();
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				JavascriptExecutor jse7 = (JavascriptExecutor)Common_Property.driver;
				jse7.executeScript("window.scrollBy(0,6000)", "");
				Thread.sleep(2000);
				
				Common_Property.driver.findElement(By.xpath("//span[@class='to_click signature_block_text']")).click();
				Thread.sleep(6000);
				
				Common_Property.driver.findElement(By.id("iAccept")).click();
				Thread.sleep(6000);
				
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(10000); 
				
				Common_Property.driver.findElement(By.xpath("//*[@id='file_browse_wrapper']/label")).click();
				Thread.sleep(15000);
				
				Runtime.getRuntime().exec("C:\\Users\\emayavs\\Desktop\\AutoIT\\Fileupload.exe");
				Thread.sleep(20200);
			/*	//upload a docment step pending
				// upload code
				 	StringSelection stringSelection = new StringSelection("C:\\Startline file upload\\Print pre document.pdf");
			        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			        clipboard.setContents(stringSelection, null);
			        Thread.sleep(2000);
			        
			        Robot robot = new Robot();
			        robot.setAutoDelay(1000);
			        robot.keyPress(KeyEvent.VK_CONTROL);
			        robot.keyPress(KeyEvent.VK_V);
			        robot.keyRelease(KeyEvent.VK_CONTROL);
			        robot.keyRelease(KeyEvent.VK_V);
			        robot.setAutoDelay(2000);
			        
			       
			        robot.keyPress(KeyEvent.VK_ENTER);
			        robot.delay(150);
			        robot.keyRelease(KeyEvent.VK_ENTER);
			        Thread.sleep(2000);
				//upload code
		      */
			       Common_Property.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			       Thread.sleep(750);
			       
			        Common_Property.driver.findElement(By.id("evidence_upload_submit")).click();
			        Thread.sleep(3000);
				
			        Common_Property.driver.findElement(By.id("confirmPopup")).click(); //pop up
			        Thread.sleep(3000);
				
				JavascriptExecutor jse8 = (JavascriptExecutor)Common_Property.driver;
				jse8.executeScript("window.scrollBy(0,6000)", "");
				
				Common_Property.driver.findElement(By.id("requiredTick")).click(); 
				Thread.sleep(3000);
				
				Common_Property.driver.findElement(By.id("request_payment")).click(); 
				Thread.sleep(3000);
				
				
				Common_Property.driver.findElement(By.id("continue")).click(); 
				Thread.sleep(2000);
				
				Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/div/adobe_reader_link_old/div/a")).click(); 
				Thread.sleep(2000);
				
				
			 	ArrayList<String> tabs3 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
			 	Common_Property.driver.switchTo().window(tabs3.get(1));
			 	Thread.sleep(750);
			 	Common_Property.driver.close();
			 	Thread.sleep(750);
			 	
			 	Common_Property.driver.switchTo().window(tabs3.get(0));
			 	Thread.sleep(950);
			 	Common_Property.driver.findElement(By.id("printSecciLink")).click(); 
				Thread.sleep(950);
				
				ArrayList<String> tabs4 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
				Common_Property.driver.switchTo().window(tabs4.get(1));
				Common_Property.driver.close();
			 	Thread.sleep(750);
			 	
			 	Common_Property.driver.switchTo().window(tabs4.get(0));
			 	Thread.sleep(750);
			 	
			 	Common_Property.driver.findElement(By.id("printAgreementLink")).click(); 
				Thread.sleep(950);
				
				ArrayList<String> tabs5 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
				Common_Property.driver.switchTo().window(tabs5.get(1));
				Thread.sleep(750);
				Common_Property.driver.close();
			 	Thread.sleep(750);
			 	
			 	Common_Property.driver.switchTo().window(tabs5.get(0));
			 	Common_Property.driver.close();

		}
			
		else
		{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
		}
			
			
	}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }
	
	public static void Fileuploadesignflow() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
			{
				
				Common_Property.driver.findElement(By.id("printConsent")).click();
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
			 	Common_Property.driver.switchTo().window(tabs2.get(1));
			 	Common_Property.driver.close();
			 	Thread.sleep(750);
			 	Common_Property.driver.switchTo().window(tabs2.get(0));
			 	Thread.sleep(750);
			 	
			 	Common_Property.driver.findElement(By.id("continue")).click();		
				Thread.sleep(750);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
				Thread.sleep(1000);
				
				Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);

				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				ArrayList<String> Questions = new ArrayList<String>();
				
				Questions.add(0,"How long have you had a personal mobile phone contract with your current provider?*");
				Questions.add(1,"Which one of the following addresses have you been associated with?*");
				Questions.add(2,"When did you last take out a personal loan (excluding student loans)?*");
				Questions.add(3,"When did you last take out a personal mortgage?*");
				Questions.add(4,"What is the current outstanding balance of your most recent mortgage?*");
				Questions.add(5,"When did you last take out a hire purchase agreement?*");
				Questions.add(6,"When did you last take out a personal credit card?*");
				Questions.add(7,"When did you last open a personal current account?*");
				Questions.add(8,"Do you have a personal mobile phone contract registered to your current address?*");
				Questions.add(9,"When did you last open a mail order account with a credit facility?*");
				
				ArrayList<String> answers = new ArrayList<String>();
				answers.add(0,"4");
				answers.add(1,"4");
				answers.add(2,"1");
				answers.add(3,"1");
				answers.add(4,"0");
				answers.add(5,"3");
				answers.add(6,"3");
				answers.add(7,"3");
				answers.add(8,"0");
				answers.add(9,"3");
				
				int QLoop = 1,AnsLoop = 1;
				while(QLoop <=7)
				{
					String Qnames= Common_Property.driver.findElement(By.xpath("//*[@id='kba_questions_answers']"+ "[" + QLoop + "]" )).getText().toString();
					System.out.println(Qnames);
					System.out.println(Qnames.length());
					int CntIterator = 0 ;
					Iterator it  = Questions.iterator();
					while (it.hasNext())
					{
						
						Object ele = it.next();
						System.out.println(ele);
						System.out.println(ele.toString().length());
						
						String Cmp = ele.toString();
						if (Cmp.equalsIgnoreCase(Qnames.trim()))
						{
							//System.out.println(answers.get(CntIterator));
							java.util.List<WebElement> quetion1 = Common_Property.driver.findElements(By.name("kbaQuestion_" + AnsLoop +"_answer"));
							int ActClik = Integer.parseInt(answers.get(CntIterator));
							quetion1.get(ActClik).click();
							AnsLoop++;
							break;
						}
						CntIterator++;
						
					}
					
					QLoop = QLoop + 2;
					
				}
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.name("drivingLicenceNumber")).sendKeys(Driver.getData("DLnumber"));
				Thread.sleep(950);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(6000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				JavascriptExecutor jse6 = (JavascriptExecutor)Common_Property.driver;
				jse6.executeScript("window.scrollBy(0,6000)", "");
				
				Thread.sleep(6000);
				
				Common_Property.driver.findElement(By.id("Required_tick")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Common_Property.driver.findElement(By.xpath("//span[@class='to_click signature_block_text']")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				JavascriptExecutor jse7 = (JavascriptExecutor)Common_Property.driver;
				jse7.executeScript("window.scrollBy(0,6000)", "");
				Thread.sleep(1000);
				
				Common_Property.driver.findElement(By.xpath("//span[@class='to_click signature_block_text']")).click();
				Thread.sleep(6000);
				
				Common_Property.driver.findElement(By.id("iAccept")).click();
				Thread.sleep(6000);
				
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(2000); 
				
				Common_Property.driver.findElement(By.xpath("//*[@id='file_browse_wrapper']/label")).click();
				Thread.sleep(8000);
				
				Runtime.getRuntime().exec("C:\\Users\\emayavs\\Documents\\ExceldocAutoIT\\ExcelFileupload.exe");
				Thread.sleep(20100);
				
				
				String fileformaterror=Common_Property.driver.findElement(By.xpath("//*[@id='evidence_upload_message']")).getText().toString();
				Thread.sleep(8000);
				
				if (fileformaterror.contains(Driver.getData("FileUpload_error1")))
				{
					Startline.ExtentPassReport(methodname, "File upload with the format of Excel(xlsx) throws error As expected ", fileformaterror, datetimestart);
				}
				
				else
				{
					Startline.ExtentFailReport(methodname, "File upload with the format of Excel(xlsx) accepted", fileformaterror, datetimestart);
				}
				
				
				
			

		}
			
		else
		{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
		}
			
			
	}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }
	public static void Redoesignflow() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
			{
				
				
			
				Common_Property.driver.findElement(By.id("printConsent")).click();
				Thread.sleep(2000);
				
			//	String mainwindow=Common_Property.driver.getWindowHandle();
				
				ArrayList<String> tabs3 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
				Common_Property.driver.switchTo().window(tabs3.get(1));
			 	Thread.sleep(5000);
			 	
			 	Common_Property.driver.switchTo().window(tabs3.get(0));
				Thread.sleep(5000);
				
			
			
				Thread.sleep(750);
				Common_Property.driver.findElement(By.id("continue")).click();		
				Thread.sleep(750);
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
				Thread.sleep(1000);
				
				Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);

				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
			    String identitymsg=Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/h1")).getText().toString(); 
				Thread.sleep(950);
				if(identitymsg.contains(Driver.getData("Identitymsg")))
				{
					Startline.ExtentPassReport(methodname, "After redo an agreement Newly generated Esignature URL has been successfully gone through as expected", null, datetimestart);
				}
				
				else
				{
					Startline.ExtentFailReport(methodname, "After redo an agreement Newly generated Esignature URL Workflow is not successful", null, datetimestart);
				}
				
		}
			
		else
		{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
		}
			
			
	}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

    
	
	public static void Esignpassevents() throws  Exception
    {    	
   
		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
			
			
			 String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			 Thread.sleep(700);
			 Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			 String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			 Thread.sleep(700);
			 Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			
			 
			Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
			Thread.sleep(950);
			
			
			Common_Property.driver.findElement(By.linkText("events")).click(); 
			Thread.sleep(950);
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			//*[@id="eventsBody"]/table[1]/tbody/tr[2]/td[3]
			
			String activity1=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[9]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_KBA_PASS=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[9]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			String activity2=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[7]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_DLCHECK_PASS=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[7]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			String activity3=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_ACCEPT=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			String activity4=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_REQUEST_PAYMENT=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			if(activity1.contains(Driver.getData("Activity"))&&Event_KBA_PASS.contains(Driver.getData("Event_KBA_PASS"))&& activity2.contains(Driver.getData("Activity"))&&Event_DLCHECK_PASS.contains(Driver.getData("Event_DLCHECK_PASS")) )
			{
				Startline.ExtentPassReport(methodname, "KBA_PASS(Security pass)event is generated as expected", Event_KBA_PASS, datetimestart);
				Startline.ExtentPassReport(methodname, "DL_CEHCK_PASS(Driving licencecheck pass)event is generated as expected", Event_DLCHECK_PASS, datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname, "KBA_PASS(Security pass)event is not generated as expected", Event_KBA_PASS, datetimestart);
				Startline.ExtentFailReport(methodname, "DL_CEHCK_PASS(Driving licencecheck pass)event is not generated as expected", Event_DLCHECK_PASS, datetimestart);
			}
			if(activity3.contains(Driver.getData("Activity"))&&Event_ACCEPT.contains(Driver.getData("Event_ACCEPT"))&&activity4.contains(Driver.getData("Activity"))&&Event_REQUEST_PAYMENT.contains(Driver.getData("Event_REQUEST_PAYMENT")))
			{
				Startline.ExtentPassReport(methodname, "Accept event is generated as expected", Event_ACCEPT, datetimestart);
				Startline.ExtentPassReport(methodname, "Request payment event is generated as expected", Event_REQUEST_PAYMENT, datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname, "Accept event is not generated as expected", Event_KBA_PASS, datetimestart);
				Startline.ExtentFailReport(methodname, "Request payment events is not generated as expected", Event_DLCHECK_PASS, datetimestart);
			}
			
			Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 
			Thread.sleep(950);
			
			
			
		}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

   
	public static void Esignsessiontimeout() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
			
				
			
			WebDriverWait wait = new WebDriverWait(Common_Property.driver,840000); 
			WebElement alert;
			alert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timeout-watchdog-extend-time")));
			String message=Common_Property.driver.findElement(By.xpath("//*[@id='ui-dialog-title-1']")).getText().toString();
			Thread.sleep(950);
			System.out.println(message);
			
		
		
				if(message.contains(Driver.getData("Timeoutwarning")))
				{	
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "Warning message is displayed as"+message, message, datetimestart);
					Thread.sleep(950);
				}
	 			
				else
				{   
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "Warning message is not displayed", Plan, datetimestart);
					Thread.sleep(950);
				}
				
			
				WebDriverWait wait1 = new WebDriverWait(Common_Property.driver,100000); 
				WebElement alert1;
				alert1= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='awsForm']/timeout_instructions/h1")));
				String message2=Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/timeout_instructions/h1")).getText().toString();
				Thread.sleep(950);
				System.out.println(message2);
		
				
				if(message2.contains(Driver.getData("Timeout")))
				{	
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "Session timed out and displayed as"+message2, message2, datetimestart);
					Thread.sleep(950);
				}
	 			
				else
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "Session timedout is not displayed", message2, datetimestart);
					Thread.sleep(950);
				}
				
			}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

    
	
	public static void Esigneventpassgeneration() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try
			{
			
			ArrayList<String> passevents=new ArrayList<String>();
			
			passevents.add(0, "KBA_PASS");
			passevents.add(1, "DLCHECK_PASS");
			passevents.add(2,"ACCEPT");
			passevents.add(3,"REQUEST_PAYMENT");
			for(int index=0; index<=passevents.size()-1;index++)
			{	
				
				Common_Property.IntiateBrowser();
				Common_Property.driver.get("https://smfsys.pancredit.com/smfIocsInterface/callback?status="+passevents.get(index)+"&partner_transaction_verification_token="+Driver.getData("Agreement_Number")+"&IOCSTransactionId=1234");
				Common_Property.driver.close();
			}
			
	}
			
			
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

    
	public static void Reverttoesign() throws  Exception
    	{    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
					
			{
				
			Common_Property.driver.findElement(By.id("printConsent")).click();
			Thread.sleep(2000);
			
		 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
		 	Common_Property.driver.switchTo().window(tabs2.get(1));
		 	Common_Property.driver.close();
		 	Thread.sleep(2000);
		 	Common_Property.driver.switchTo().window(tabs2.get(0));
		 	Thread.sleep(2000);
		 	
		 	Common_Property.driver.findElement(By.id("continue")).click();		
		 	Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
			Thread.sleep(2000);
			

			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			
			ArrayList<String> Questions = new ArrayList<String>();
			
			Questions.add(0,"How long have you had a personal mobile phone contract with your current provider?*");
			Questions.add(1,"Which one of the following addresses have you been associated with?*");
			Questions.add(2,"When did you last take out a personal loan (excluding student loans)?*");
			Questions.add(3,"When did you last take out a personal mortgage?*");
			Questions.add(4,"What is the current outstanding balance of your most recent mortgage?*");
			Questions.add(5,"When did you last take out a hire purchase agreement?*");
			Questions.add(6,"When did you last take out a personal credit card?*");
			Questions.add(7,"When did you last open a personal current account?*");
			Questions.add(8,"Do you have a personal mobile phone contract registered to your current address?*");
			Questions.add(9,"When did you last open a mail order account with a credit facility?*");
			
			ArrayList<String> answers = new ArrayList<String>();
			answers.add(0,"4");
			answers.add(1,"4");
			answers.add(2,"1");
			answers.add(3,"1");
			answers.add(4,"0");
			answers.add(5,"3");
			answers.add(6,"3");
			answers.add(7,"3");
			answers.add(8,"0");
			answers.add(9,"3");
			
			int QLoop = 1,AnsLoop = 1;
			while(QLoop <=7)
			{
				String Qnames= Common_Property.driver.findElement(By.xpath("//*[@id='kba_questions_answers']"+ "[" + QLoop + "]" )).getText().toString();
				System.out.println(Qnames);
				System.out.println(Qnames.length());
				int CntIterator = 0 ;
				Iterator it  = Questions.iterator();
				while (it.hasNext())
				{
					
					Object ele = it.next();
					System.out.println(ele);
					System.out.println(ele.toString().length());
					
					String Cmp = ele.toString();
					if (Cmp.equalsIgnoreCase(Qnames.trim()))
					{
						//System.out.println(answers.get(CntIterator));
						java.util.List<WebElement> quetion1 = Common_Property.driver.findElements(By.name("kbaQuestion_" + AnsLoop +"_answer"));
						int ActClik = Integer.parseInt(answers.get(CntIterator));
						quetion1.get(ActClik).click();
						AnsLoop++;
						break;
					}
					CntIterator++;
					
				}
				
				QLoop = QLoop + 2;
				
			}
			Thread.sleep(2000);
			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.name("drivingLicenceNumber")).sendKeys(Driver.getData("DLnumber"));
			Thread.sleep(3000);
			
			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(10000);
			
			JavascriptExecutor jse6 = (JavascriptExecutor)Common_Property.driver;
			jse6.executeScript("window.scrollBy(0,7000)", "");
			
			Thread.sleep(8000);
			
			Common_Property.driver.findElement(By.id("Required_tick")).click();
			Thread.sleep(3000);
			
			Common_Property.driver.findElement(By.id("wetSign")).click();
			Thread.sleep(3000);
				
			Common_Property.driver.findElement(By.id("wetSignDownloadAgreement")).click();
			Thread.sleep(5000);
			
			String message=Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/instructions/h1")).getText().toString();
			Thread.sleep(2000);
			
			if(message.contains(Driver.getData("Agrcancel")))
			{	
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Agreement cancelled and cancelled message displayed as"+message, message, datetimestart);
				Thread.sleep(950);
			}
 			
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Cancelled message is not displayed", Plan, datetimestart);
				Thread.sleep(950);
			}
			
			
			Common_Property.driver.findElement(By.id("downloadAgreement")).click();
			Thread.sleep(2000);
			
			ArrayList<String> tabs3 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
			Common_Property.driver.switchTo().window(tabs3.get(1));
			Common_Property.driver.close();
		 	Thread.sleep(750);
		 	Common_Property.driver.switchTo().window(tabs2.get(0));
		 	Thread.sleep(750);
		 	
		 	Common_Property.Launch_smf_Url();
		 	Common_Property.Startline_Login();
		 	
		 	Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			//Refresh
			Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
			Thread.sleep(950);
			
			String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			 Thread.sleep(700);
			 Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			 
			  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			  
			  //Events
			  Common_Property.driver.findElement(By.linkText("events")).click();
			  Thread.sleep(750);
			
			
			String activity1=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[9]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_KBA_PASS=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[9]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			String activity2=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[7]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_DLCHECK_PASS=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[7]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			String activity3=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_RTWS=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[6]")).getText().toString();
			Thread.sleep(950);
			
			String activity4=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();
			Thread.sleep(950);
			
			String Event_DOC=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[4]")).getText().toString();
			Thread.sleep(950);
			
			if(activity1.contains(Driver.getData("Activity"))&&Event_KBA_PASS.contains(Driver.getData("Event_KBA_PASS"))&& activity2.contains(Driver.getData("Activity"))&&Event_DLCHECK_PASS.contains(Driver.getData("Event_DLCHECK_PASS")) )
			{
				Startline.ExtentPassReport(methodname, "KBA_PASS(Security pass)event is generated as expected", Event_KBA_PASS, datetimestart);
				Startline.ExtentPassReport(methodname, "DL_CEHCK_PASS(Driving licencecheck pass)event is generated as expected", Event_DLCHECK_PASS, datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname, "KBA_PASS(Security pass)event is not generated as expected", Event_KBA_PASS, datetimestart);
				Startline.ExtentFailReport(methodname, "DL_CEHCK_PASS(Driving licencecheck pass)event is not generated as expected", Event_DLCHECK_PASS, datetimestart);
			}
			if(activity3.contains(Driver.getData("Activity"))&&Event_RTWS.contains(Driver.getData("Event_RTWS"))&& activity4.contains(Driver.getData("Event_approve"))&&Event_DOC.contains(Driver.getData("Event_DOC")) )
			{
				Startline.ExtentPassReport(methodname, "Revert to wet sign (RTWS)event is generated as expected", Event_RTWS, datetimestart);
				Startline.ExtentPassReport(methodname, "Document is generated as expected", Event_DOC, datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname, "Accept event is not generated as expected", Event_KBA_PASS, datetimestart);
				Startline.ExtentFailReport(methodname, "Request payment events is not generated as expected", Event_DLCHECK_PASS, datetimestart);
			}
			
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();	
			Thread.sleep(750);
			
			//document 
			Common_Property.driver.findElement(By.linkText("Documents")).click(); 
			Thread.sleep(950);
			 
			 String AccDocname=Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();
			 Thread.sleep(850);
			
			 if(AccDocname.contains(Driver.getData("AccDocumentname1")))
			 {	
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				   Startline.ExtentPassReport(methodname, "Document is generated sucessfully" ,AccDocname, datetimestart);
				   Thread.sleep(700); 
			 }
			 
			 else
		 	{
			  
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			   Startline.ExtentFailReport(methodname, "Document is NOT generated " , null, datetimestart);
			   Thread.sleep(700);
			}
			 
			 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click();
			 Thread.sleep(850);
			 
				String FinalStatus1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				 Thread.sleep(700);
				  
				 Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus1, FinalStatus1, datetimestart);
				  String FinalPlan1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan1, FinalPlan1, datetimestart);
				
	
			}
		
			else
			{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
			}
		
	}
		   catch (Exception e) 

			  {       
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
    		   	  }
    				
      }

    
	
	public static void Esigsecurityfail() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
					
			{
				
			Common_Property.driver.findElement(By.id("printConsent")).click();
			Thread.sleep(2000);
			
		 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
		 	Common_Property.driver.switchTo().window(tabs2.get(1));
		 	Common_Property.driver.close();
		 	Thread.sleep(750);
		 	Common_Property.driver.switchTo().window(tabs2.get(0));
		 	Thread.sleep(750);
		 	
		 	Common_Property.driver.findElement(By.id("continue")).click();		
			Thread.sleep(750);
			
			Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
			Thread.sleep(1000);
			
			Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
			Thread.sleep(2000);
			

			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(5000);
			
			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(8000);
			
			ArrayList<String> Questions = new ArrayList<String>();
			
			Questions.add(0,"How long have you had a personal mobile phone contract with your current provider?*");
			Questions.add(1,"Which one of the following addresses have you been associated with?*");
			Questions.add(2,"When did you last take out a personal loan (excluding student loans)?*");
			Questions.add(3,"When did you last take out a personal mortgage?*");
			Questions.add(4,"What is the current outstanding balance of your most recent mortgage?*");
			Questions.add(5,"When did you last take out a hire purchase agreement?*");
			Questions.add(6,"When did you last take out a personal credit card?*");
			Questions.add(7,"When did you last open a personal current account?*");
			Questions.add(8,"Do you have a personal mobile phone contract registered to your current address?*");
			Questions.add(9,"When did you last open a mail order account with a credit facility?*");
			
			ArrayList<String> answers = new ArrayList<String>();
			answers.add(0,"3");
			answers.add(1,"3");
			answers.add(2,"0");
			answers.add(3,"0");
			answers.add(4,"1");
			answers.add(5,"2");
			answers.add(6,"2");
			answers.add(7,"2");
			answers.add(8,"1");
			answers.add(9,"2");
			
			int QLoop = 1,AnsLoop = 1;
			while(QLoop <=7)
			{
				String Qnames= Common_Property.driver.findElement(By.xpath("//*[@id='kba_questions_answers']"+ "[" + QLoop + "]" )).getText().toString();
				System.out.println(Qnames);
				System.out.println(Qnames.length());
				int CntIterator = 0 ;
				Iterator it  = Questions.iterator();
				while (it.hasNext())
				{
					
					Object ele = it.next();
					System.out.println(ele);
					System.out.println(ele.toString().length());
					
					String Cmp = ele.toString();
					if (Cmp.equalsIgnoreCase(Qnames.trim()))
					{
						//System.out.println(answers.get(CntIterator));
						java.util.List<WebElement> quetion1 = Common_Property.driver.findElements(By.name("kbaQuestion_" + AnsLoop +"_answer"));
						int ActClik = Integer.parseInt(answers.get(CntIterator));
						quetion1.get(ActClik).click();
						AnsLoop++;
						break;
					}
					CntIterator++;
					
				}
				
				QLoop = QLoop + 2;
				
			}
			

			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(3000);
			
			String warmessage=Common_Property.driver.findElement(By.xpath("//*[@id='kba_fail_message']/p/error_message_kba")).getText().toString();
			Thread.sleep(2000);
			
			if(warmessage.contains(Driver.getData("Warmessage")))
			{
				Startline.ExtentPassReport(methodname, " Warning Message is displayed", warmessage, datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname, "Warning message is not displayed", warmessage, datetimestart);
			}
			
			
			ArrayList<String> Questions1 = new ArrayList<String>();
			
			Questions1.add(0,"How long have you had a personal mobile phone contract with your current provider?*");
			Questions1.add(1,"Which one of the following addresses have you been associated with?*");
			Questions1.add(2,"When did you last take out a personal loan (excluding student loans)?*");
			Questions1.add(3,"When did you last take out a personal mortgage?*");
			Questions1.add(4,"What is the current outstanding balance of your most recent mortgage?*");
			Questions1.add(5,"When did you last take out a hire purchase agreement?*");
			Questions1.add(6,"When did you last take out a personal credit card?*");
			Questions1.add(7,"When did you last open a personal current account?*");
			Questions1.add(8,"Do you have a personal mobile phone contract registered to your current address?*");
			Questions1.add(9,"When did you last open a mail order account with a credit facility?*");
			
			ArrayList<String> answers1 = new ArrayList<String>();
			answers1.add(0,"3");
			answers1.add(1,"3");
			answers1.add(2,"0");
			answers1.add(3,"0");
			answers1.add(4,"1");
			answers1.add(5,"2");
			answers1.add(6,"2");
			answers1.add(7,"2");
			answers1.add(8,"1");
			answers1.add(9,"2");
			
			int QLoop1 = 1,AnsLoop1 = 1;
			while(QLoop1 <=7)
			{
				String Qnames1= Common_Property.driver.findElement(By.xpath("//*[@id='kba_questions_answers']"+ "[" + QLoop1 + "]" )).getText().toString();
				System.out.println(Qnames1);
				System.out.println(Qnames1.length());
				int CntIterator = 0 ;
				Iterator it  = Questions1.iterator();
				while (it.hasNext())
				{
					
					Object ele = it.next();
					System.out.println(ele);
					System.out.println(ele.toString().length());
					
					String Cmp = ele.toString();
					if (Cmp.equalsIgnoreCase(Qnames1.trim()))
					{
						//System.out.println(answers.get(CntIterator));
						java.util.List<WebElement> quetion2 = Common_Property.driver.findElements(By.name("kbaQuestion_" + AnsLoop1 +"_answer"));
						int ActClik1 = Integer.parseInt(answers1.get(CntIterator));
						quetion2.get(ActClik1).click();
						AnsLoop1++;
						break;
					}
					CntIterator++;
					
				}
				
				QLoop1 = QLoop1 + 2;
				
			}
			
			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			
			
			
			String wartext1=Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/h1")).getText().toString();
			Thread.sleep(2000);
		
			if(wartext1.contains(Driver.getData("Wartext1")))
			{
				Startline.ExtentPassReport(methodname, " Identity Message is displayed", wartext1, datetimestart);
			}
			
			else
			{
				Startline.ExtentFailReport(methodname, "Identity message is not displayed", wartext1, datetimestart);
			}
			
			String url=Driver.getData("EsignatureURL");
			Common_Property.driver.get(url);
			Thread.sleep(1000);
			 
			String message=Common_Property.driver.findElement(By.xpath("//*[@id='aws_main_pane']/h1")).getText().toString();
			Thread.sleep(2000);
			
			if(message.contains(Driver.getData("Agrcancel")))
			{	
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Agreement cancelled and cancelled message displayed as"+message, message, datetimestart);
				Thread.sleep(950);
			}
 			
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Cancelled message is not displayed", Plan, datetimestart);
				Thread.sleep(950);
			}
			
			Common_Property.driver.close();
			
			Common_Property.IntiateBrowser();
			Common_Property.Launch_smf_Url();
			Common_Property.Startline_Login();
			
			
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			//refresh
			
			Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
			Thread.sleep(950);
			
		     //events
			Common_Property.driver.findElement(By.linkText("events")).click();
			 Thread.sleep(750);
			
			 
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
			String esignactivity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();
			Thread.sleep(750);
			
			String Event_KBADLCHECK_FAIL=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[6]")).getText().toString();
			Thread.sleep(750);
			
			if(esignactivity.contains(Driver.getData("Activity"))&&Event_KBADLCHECK_FAIL.contains(Driver.getData("Event_KBADLCHECK_FAIL")))
			{
				Startline.ExtentPassReport(methodname, "Esign Security KBA_fail event is displayed as expected"+Event_KBADLCHECK_FAIL,Event_KBADLCHECK_FAIL, datetimestart);
			}
			else
			{
				Startline.ExtentFailReport(methodname, "Esign Security KBA_fail event is NOT displayed as expected"+Event_KBADLCHECK_FAIL,Event_KBADLCHECK_FAIL, datetimestart);
			}
			
			
			//Back
			Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();	
			Thread.sleep(750);
			
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			
			String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			 Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			
			//Documents
			Common_Property.driver.findElement(By.linkText("Documents")).click();	
			Thread.sleep(750);
			
			String esigndocemail=Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();
			 Thread.sleep(850);
			
			 if(esigndocemail.contains(Driver.getData("AccDocumentname1")))
			 {
				  
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 Startline.ExtentPassReport(methodname, "Document is generated sucessfully" ,esigndocemail, datetimestart);
				   Thread.sleep(700); 
			 }
			 
			 else
		 	{
			  
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			   Startline.ExtentFailReport(methodname, "Document is NOT generated " , esigndocemail, datetimestart);
			   Thread.sleep(700);
			}
			 
			 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click();
			 Thread.sleep(850);
			 
			}
		
			else
			{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
			}
		
	}
		   catch (Exception e) 

			  {       
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
    		  }
    				
      }

    
	public static void Esigdrivefail() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
					
			{
				
				Common_Property.driver.findElement(By.id("printConsent")).click();
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
			 	Thread.sleep(2000);
			 	Common_Property.driver.switchTo().window(tabs2.get(1));
			 	Thread.sleep(2000);
			 	Common_Property.driver.close();
			 	Thread.sleep(2000);
			 	Common_Property.driver.switchTo().window(tabs2.get(0));
			 	Thread.sleep(750);
			 	
			 	Common_Property.driver.findElement(By.id("continue")).click();		
				Thread.sleep(750);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
				Thread.sleep(1000);
				
				Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);

				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				ArrayList<String> Questions = new ArrayList<String>();
				
				Questions.add(0,"How long have you had a personal mobile phone contract with your current provider?*");
				Questions.add(1,"Which one of the following addresses have you been associated with?*");
				Questions.add(2,"When did you last take out a personal loan (excluding student loans)?*");
				Questions.add(3,"When did you last take out a personal mortgage?*");
				Questions.add(4,"What is the current outstanding balance of your most recent mortgage?*");
				Questions.add(5,"When did you last take out a hire purchase agreement?*");
				Questions.add(6,"When did you last take out a personal credit card?*");
				Questions.add(7,"When did you last open a personal current account?*");
				Questions.add(8,"Do you have a personal mobile phone contract registered to your current address?*");
				Questions.add(9,"When did you last open a mail order account with a credit facility?*");
				
				ArrayList<String> answers = new ArrayList<String>();
				answers.add(0,"4");
				answers.add(1,"4");
				answers.add(2,"1");
				answers.add(3,"1");
				answers.add(4,"0");
				answers.add(5,"3");
				answers.add(6,"3");
				answers.add(7,"3");
				answers.add(8,"0");
				answers.add(9,"3");
				
				int QLoop = 1,AnsLoop = 1;
				while(QLoop <=7)
				{
					String Qnames= Common_Property.driver.findElement(By.xpath("//*[@id='kba_questions_answers']"+ "[" + QLoop + "]" )).getText().toString();
					System.out.println(Qnames);
					System.out.println(Qnames.length());
					int CntIterator = 0 ;
					Iterator it  = Questions.iterator();
					while (it.hasNext())
					{
						
						Object ele = it.next();
						System.out.println(ele);
						System.out.println(ele.toString().length());
						
						String Cmp = ele.toString();
						if (Cmp.equalsIgnoreCase(Qnames.trim()))
						{
							//System.out.println(answers.get(CntIterator));
							java.util.List<WebElement> quetion1 = Common_Property.driver.findElements(By.name("kbaQuestion_" + AnsLoop +"_answer"));
							int ActClik = Integer.parseInt(answers.get(CntIterator));
							quetion1.get(ActClik).click();
							AnsLoop++;
							break;
						}
						CntIterator++;
						
					}
					
					QLoop = QLoop + 2;
					
				}
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Thread.sleep(2000);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(3000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				Common_Property.driver.findElement(By.name("drivingLicenceNumber")).sendKeys(Driver.getData("DLnumber"));
				Thread.sleep(10000);
				
				Common_Property.driver.findElement(By.name("drivingLicenceNumber")).click();
				Thread.sleep(5000);
				Common_Property.driver.findElement(By.id("continue")).click();
				Thread.sleep(6000);
				
				String warningmsg=Common_Property.driver.findElement(By.id("error-message")).getText().toString();
				if(warningmsg.contains(Driver.getData("DLwarmessage1")))
				{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Agreement warning messageis displayed as expected" +warningmsg, warningmsg, datetimestart);
				Thread.sleep(950);
				}
 			
				else
				{
					
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Warning message is not displayed", warningmsg, datetimestart);
				Thread.sleep(950);
				}
				Thread.sleep(950);
				WebElement element=Common_Property.driver.findElement(By.id("continue"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				Thread.sleep(1000);
				jse.executeScript("arguments[0].click();", element);
				Thread.sleep(10000);
				element.click();
				Thread.sleep(10000);
			
				
				String message=Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/h1")).getText().toString();
				Thread.sleep(2000);
					
		
				
				if(message.contains(Driver.getData("DLwarmessage2")))
				{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Agreement cancelled and cancelled message displayed as"+message, message, datetimestart);
				Thread.sleep(950);
				}
 			
				else
				{
					
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Cancelled message is not displayed", Plan, datetimestart);
				Thread.sleep(950);
				}
			
			Common_Property.IntiateBrowser();
			Common_Property.Launch_smf_Url();
			Common_Property.Startline_Login();
			
			
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			//refresh
			Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
			Thread.sleep(950);
			//Events
			Common_Property.driver.findElement(By.linkText("events")).click();
			Thread.sleep(750);
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
			String esignactivity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();
			Thread.sleep(750);
			
			String Event_KBADLCHECK_FAIL=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[6]")).getText().toString();
			Thread.sleep(750);
			
			if(esignactivity.contains(Driver.getData("Activity"))&&Event_KBADLCHECK_FAIL.contains(Driver.getData("Event_KBADLCHECK_FAIL")))
			{
				Startline.ExtentPassReport(methodname, "Esign Security DLCHECK_fail event is displayed as expected"+esignactivity,Event_KBADLCHECK_FAIL, datetimestart);
			}
			else
			{
				Startline.ExtentFailReport(methodname, "Esign Security DLCHECK_fail event is NOT displayed as expected"+Event_KBADLCHECK_FAIL,Event_KBADLCHECK_FAIL, datetimestart);
			}
			
			
			//back
			Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();	
			Thread.sleep(750);
			
			//Documents
			Common_Property.driver.findElement(By.linkText("Documents")).click();	
			Thread.sleep(750);
			
			
			
			 String esigndocemail=Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();
			 Thread.sleep(850);
			
			 if(esigndocemail.contains(Driver.getData("AccDocumentname1")))
			 {
				 
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				   Startline.ExtentPassReport(methodname, "Document is generated sucessfully" ,esigndocemail, datetimestart);
				   Thread.sleep(700); 
			 }
			 
			 else
		 	{
				 
			   Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			   Startline.ExtentFailReport(methodname, "Document is NOT generated " , esigndocemail, datetimestart);
			   Thread.sleep(700);
			}
			 
			 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click();
			 Thread.sleep(850);
			
			
		}
		
		
			else
			{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
			}
		
	}
		   catch (Exception e) 

			  {       
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
    		   	  }
    				
      }

    
	public static void Esigncancel() throws  Exception
    {    	
   
		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
			{
				
			Common_Property.driver.findElement(By.id("printConsent")).click();
			Thread.sleep(2000);
			
		 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
		 	Common_Property.driver.switchTo().window(tabs2.get(1));
		 	Common_Property.driver.close();
		 	Thread.sleep(750);
		 	Common_Property.driver.switchTo().window(tabs2.get(0));
		 	Thread.sleep(750);
		 	
		 	Common_Property.driver.findElement(By.id("continue")).click();		
			Thread.sleep(750);
			
			Common_Property.driver.findElement(By.id("doNotProceed")).click();		
			Thread.sleep(750);
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Common_Property.driver.findElement(By.id("cancelAgreement")).click();	//pop up	
			Thread.sleep(750);
			
			
 			
 			String message=Common_Property.driver.findElement(By.xpath("//*[@id='awsForm']/instructions_onpremise/h1")).getText().toString();
			Thread.sleep(2000);
			
			if(message.contains(Driver.getData("Agrcancel")))
			{	
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Agreement cancelled and cancelled message displayed as"+message, message, datetimestart);
				Thread.sleep(950);
			}
 			
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Cancelled message is not displayed", Plan, datetimestart);
				Thread.sleep(950);
			}
			
			Common_Property.IntiateBrowser();
			Common_Property.Launch_smf_Url();
			Common_Property.Startline_Login();
			
			
			
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			//Refresh
			
			Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
			Thread.sleep(950);
			//Events
			Common_Property.driver.findElement(By.linkText("events")).click();
		    Thread.sleep(750);
			
			String esignactivity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();
			Thread.sleep(750);
			
			String Event_CANCEL=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[5]/td[6]")).getText().toString();
			Thread.sleep(750);
			
			if(esignactivity.contains(Driver.getData("Activity"))&&Event_CANCEL.contains(Driver.getData("Event_CANCEL")))
			{
				Startline.ExtentPassReport(methodname, "Esignature Cancel event is displayed as expected"+Event_CANCEL,Event_CANCEL, datetimestart);
			}
			else
			{
				Startline.ExtentFailReport(methodname, "Esignature Cancel event is NOT displayed as expected"+Event_CANCEL,Event_CANCEL, datetimestart);
			}
			
			
			//Back
			Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();	
			Thread.sleep(750);
			
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			
			String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			 Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			
				//Documents
				Common_Property.driver.findElement(By.linkText("Documents")).click();	
				Thread.sleep(750);
				
				
				
				 String esigndocemail=Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();
				 Thread.sleep(850);
				
				 if(esigndocemail.contains(Driver.getData("AccDocumentname1")))
				 {
					  
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					   Startline.ExtentPassReport(methodname, "Document is generated sucessfully" ,esigndocemail, datetimestart);
					   Thread.sleep(700); 
				 }
				 
				 else
			 	{
				  
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				   Startline.ExtentFailReport(methodname, "Document is NOT generated " , esigndocemail, datetimestart);
				   Thread.sleep(700);
				}
				 
				 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click();
				 Thread.sleep(850);
			}
		
			else
			{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
			}
		
	}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }

    
	
	public static void Esignsaveexit() throws  Exception
    {    	
   
		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
		
				
		try{
				
			if(Plan.contains(Driver.getData("Esignplan")))
				
			{
					
				
			Common_Property.driver.findElement(By.id("printConsent")).click();
			Thread.sleep(2000);
			
		 	ArrayList<String> tabs2 = new ArrayList<String> (Common_Property.driver.getWindowHandles());
		 	Common_Property.driver.switchTo().window(tabs2.get(1));
		 	Common_Property.driver.close();
		 	Thread.sleep(2000);
		 	Common_Property.driver.switchTo().window(tabs2.get(0));
		 	Thread.sleep(2000);
		 	
		 	Common_Property.driver.findElement(By.id("exit")).click();
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("closeSaveExit")).click();// popup
			Thread.sleep(2000);
			
			Startline.ExtentPassReport(methodname, "Save and Exit on the Important information page is done Succesfully", null, datetimestart);
			String url=Driver.getData("EsignatureURL");
			Common_Property.driver.get(url);
			Thread.sleep(2000);
			Startline.ExtentPassReport(methodname, "After save & Exit and re-Opened Esignature directing the saved page(Important information page) as expected", null, datetimestart);
		 	Common_Property.driver.findElement(By.id("continue")).click();		
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("exit")).click();
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("closeSaveExit")).click();// popup
			Thread.sleep(2000);
			Startline.ExtentPassReport(methodname, "Save and Exit on the Dealer's Confirm page is done Succesfully", null, datetimestart);
			
			String url1=Driver.getData("EsignatureURL");
			Common_Property.driver.get(url1);
			Thread.sleep(2000);
			
			Startline.ExtentPassReport(methodname, "After save & Exit and re-Opened Esignature directing the saved page(Dealer's Confirm page) as expected", null, datetimestart);
			Common_Property.driver.findElement(By.id("agentfirstName")).sendKeys(Driver.getData("EsigdealerSrname"));
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.id("agentlastName")).sendKeys(Driver.getData("Esigdealerfrname"));
			Thread.sleep(2000);

			Common_Property.driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			Startline.ExtentPassReport(methodname, "Successfully proceed after the save & exit process", null, datetimestart);
			}
		
			else
			{
			Startline.ExtentPassReport(methodname, "Plan is displayed as", Plan, datetimestart);
			}
		
	}	
		
		   		catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }
	
	

public static void Agreementsearch() throws Exception, Exception  
	
	{
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
    	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	    Date sdate = new Date();
	    String datetimestart=dateFormat.format(sdate);	
	

		try
		{
		
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Startline.ExtentPassReport(methodname, "Agreement created through PDI is " +agreementno, agreementno, datetimestart);
			
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
			
			//View
			Common_Property.driver.findElement(By.linkText("View")).click();
			Thread.sleep(700);
			
			//Close
			Common_Property.driver.findElement(By.linkText("Close")).click();
			Thread.sleep(700);
			
			//Agreementlink
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		//ChromeDriver d = new ChromeDriver(dc);
		}
		
		
		 catch (UnhandledAlertException f) 
		{
		    try 
		    {
		    	
		    	
		        Alert alert = Common_Property.driver.switchTo().alert();
		        String alertText = alert.getText();
		        System.out.println("Alert data: " + alertText);
		        alert.accept();
		    } 
		    
		    catch (NoAlertPresentException e) 
		    {
		        e.printStackTrace();
		    }
		}
		

		catch (Exception e) 	
		{  
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
	   	}
	}

public static void Motoagrsearch() throws Exception, Exception  

{
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
    Date sdate = new Date();
    String datetimestart=dateFormat.format(sdate);	


	try
	{
	
		Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		agreementno=Driver.getData("Agreement_Number");
		
		Startline.ExtentPassReport(methodname, "Agreement created through PDI is " +agreementno, agreementno, datetimestart);
		
		
		Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
		Thread.sleep(700);
		
		
		//Agreementlink
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(700);
		
	}
	
	catch (Exception e) 	
	{  
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				   	      
   	}
}	 

	
	public static void PDIPayoutandGolive() throws  Exception


	{    		
				
				System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
				String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
				Date sdate = new Date();
				String datetimestart=dateFormat.format(sdate);		
				
			try	
	
				{
				
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
		     //PAyout golive
				 
				Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
				Thread.sleep(950);
				
				 
				  //document verify  
					
					 String Docrecevidedcomnt=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr/td[2]")).getText().toString();
					 Thread.sleep(1000);
					 if(Docrecevidedcomnt.isEmpty())
					 {
						 
						 
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						 Startline.ExtentPassReport(methodname, "Docs received is displayed without User/Date", Docrecevidedcomnt, datetimestart);
					 }
					 else
					 {
						 
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						 Startline.ExtentFailReport(methodname, "Docs received is displayed with User/Date", Docrecevidedcomnt, datetimestart);
					 }
					 
				 
			 //document verify  
				Common_Property.driver.findElement(By.linkText("Docs Received")).click();
				Thread.sleep(950);
					 
				 Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[4]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(850);
	 				
				String Docstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + Docstatus, Docstatus, datetimestart);
				Thread.sleep(700);
				
				Checkdecision.Agr_checkdecision();
				String a=Checkdecision.AgreementPDIstatus;
				
				if(a.contains(Docstatus))
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Docstatus, Docstatus, datetimestart);
					Thread.sleep(700);
				}
				else
				{
					Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Docstatus, Docstatus, datetimestart);
					Thread.sleep(700);
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				}
			
				
				
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(700);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(700);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(2000);
				Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
				Thread.sleep(5000);
				//1st check validated	
				Common_Property.driver.findElement(By.linkText("1st Check Validated")).click();
				Thread.sleep(950);
	 			
	 			Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(950);
				
				String checkstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + checkstatus, checkstatus, datetimestart);
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				 Checkdecision.Agr_checkdecision();
					String a1=Checkdecision.AgreementPDIstatus;
					
					if(a1.contains(checkstatus))
					{
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+checkstatus, checkstatus, datetimestart);
						Thread.sleep(700);
					}
					else
					{
						Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ checkstatus, checkstatus, datetimestart);
						Thread.sleep(700);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					}
				
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
				Thread.sleep(1000);
				
				//confirmspecial terms	
				
				
				String specialtermcontent=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[4]/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/span")).getText().toString();
				Thread.sleep(950);
				
				if (specialtermcontent.contains(Driver.getData("Specialterm")))
				{
					
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "Special term content displayed as Confirmed special terms", specialtermcontent, datetimestart);
				
				}
				
				else
				{	
					

					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "Special term content displayed as UnConfirmed special terms", specialtermcontent, datetimestart);
				}
				
				
				Common_Property.driver.findElement(By.linkText("Confirm Special Terms")).click();
				Thread.sleep(950);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String specialtermcontent1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[4]/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/span")).getText().toString();
				Thread.sleep(950);
				
				if (specialtermcontent1.contains(Driver.getData("Specialterm1")))
				{
					
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "Special term content displayed as UnConfirmed special terms", specialtermcontent, datetimestart);
				
				}
				
				else
				{	
					

					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentFailReport(methodname, "Special term content displayed as UnConfirmed special terms", specialtermcontent, datetimestart);
				}
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
				Thread.sleep(1000);
				
				
				//Docs approved	
				Common_Property.driver.findElement(By.linkText("Docs Approved")).click();
				Thread.sleep(950);
				
				
				
				Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(1000);
				 
				 
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				
				String awaitstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + awaitstatus, awaitstatus, datetimestart);
				Thread.sleep(700);
				
				Checkdecision.Agr_checkdecision();
				String a2=Checkdecision.AgreementPDIstatus;
				
				if(a2.contains(awaitstatus))
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+awaitstatus, awaitstatus, datetimestart);
					Thread.sleep(700);
				}
				else
				{
					Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ awaitstatus, awaitstatus, datetimestart);
					Thread.sleep(700);
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				}
			
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart); 
				
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(900);
				Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[4]/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/input")).sendKeys(Adminfee);
				//payout go live
				
				Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
				Thread.sleep(950);
				
				Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				Thread.sleep(1000);
				
				
				  
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				
				
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(750);
			
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
				 if(Refevent1.contains(Driver.getData("Payouteve")))
					{
						
					 		    
					 	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "Payout anfd golive Event verified sucessfully and the event is " + Refevent1, Refevent1, datetimestart);
							Thread.sleep(700);
						 
					}
			
					Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
					Thread.sleep(850);
					//document
					Common_Property.driver.findElement(By.linkText("Documents")).click();
					  Thread.sleep(750);
					
					String payoutdoc=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
					Thread.sleep(850);
					if (payoutdoc.contains(Driver.getData("Payoutdoc")))
						  
					{
					  		
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentPassReport(methodname, "document generated successfully" + payoutdoc, payoutdoc, datetimestart);
						Thread.sleep(700);
					}
				 
				  Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 				 
				  Thread.sleep(850);
				  
				 //new agreements 
				  Common_Property.driver.findElement(By.linkText("new agreement")).click();
				  Thread.sleep(750);
				  
				  
				  Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
				  Thread.sleep(700);
				  
					agreementno=Driver.getData("Agreement_Number");
					
					Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
					
					Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
					Thread.sleep(700);
					
					Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
					Thread.sleep(700);
					
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					String ActiveStatus=Common_Property.driver.findElement(By.xpath("//*[@id='topStrip']/span[10]")).getText().toString();
					Thread.sleep(700);
					 Startline.ExtentPassReport(methodname, "Status is displayed as"+ActiveStatus, ActiveStatus, datetimestart);
					 
					 Checkdecision.Agr_checkdecision();
						String a3=Checkdecision.AgreementPDIstatus;
						
						if(a3.contains(ActiveStatus))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+ActiveStatus, ActiveStatus, datetimestart);
							Thread.sleep(700);
						}
						else
						{
							Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ ActiveStatus, ActiveStatus, datetimestart);
							Thread.sleep(700);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						}
	    }

			catch (Exception e) 

				     {       
	    				
	    				System.out.println("The exception was "+e);
	    				System.out.println("Abnormal Termination due to "+e);
	    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
	    						   	      
	    		   	}
	    				
			}

	    
	
	public static void Mpayoutgolive() throws  Exception


	{    	
	   
			
				System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
				String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
				Date sdate = new Date();
				String datetimestart=dateFormat.format(sdate);		
				
	try{
					
			     
				
		     	//PAyout golive   
				Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
				Thread.sleep(950);
			
				 //document verify  
						
				Common_Property.driver.findElement(By.linkText("Docs Received")).click();
				Thread.sleep(950);
					 
				 Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[4]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(850);
	 				
				String Docstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + Docstatus, Docstatus, datetimestart);
				Thread.sleep(700);
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(700);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(700);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(2000);
				Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
				Thread.sleep(5000);
				//1st check validated	
				Common_Property.driver.findElement(By.linkText("1st Check Validated")).click();
				Thread.sleep(950);
	 			
	 			Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(1000);
				
				String checkstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + checkstatus, checkstatus, datetimestart);
				Thread.sleep(1000);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
				Thread.sleep(1000);
				//confirmspecial terms	
				Common_Property.driver.findElement(By.linkText("Confirm Special Terms")).click();
				Thread.sleep(950);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
				Thread.sleep(1000);
				
				//Docs approved	
				Common_Property.driver.findElement(By.linkText("Docs Approved")).click();
				Thread.sleep(950);

				
				Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(1000);
				 
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				String awaitstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + awaitstatus, awaitstatus, datetimestart);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				
				Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
				Thread.sleep(850);
				Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
				Thread.sleep(1000);
				Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[4]/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/input")).sendKeys(Adminfee);
				Thread.sleep(1000);
				
				
				//payout go live
				
				Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
				Thread.sleep(950);
				
				Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				 Thread.sleep(1000);
				
				 
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String payoutstatus=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + payoutstatus, payoutstatus, datetimestart);
				if(payoutstatus.contains(Driver.getData("Payoutstatus")))
				{
					Startline.ExtentPassReport(methodname, "Status is " + payoutstatus, payoutstatus, datetimestart);
				}
				
				else{
					Startline.ExtentFailReport(methodname, "Status is not awaitingpayout " + payoutstatus, payoutstatus, datetimestart);
				}
				
				String payoutplan=Common_Property.driver.findElement(By.xpath("	//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + payoutplan, payoutplan, datetimestart);
				
				if(payoutplan.contains(Driver.getData("Payplanname")))
				{
					Startline.ExtentPassReport(methodname, "Status is " + payoutplan, payoutplan, datetimestart);
				}
				
				else
				{
					Startline.ExtentFailReport(methodname, "plan is not callval manual approved " + payoutplan, payoutplan, datetimestart);
				}
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				//Events
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(750);
			
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
				 if(Refevent1.contains(Driver.getData("Payouteve")))
					{
						
					 	   
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						    Startline.ExtentPassReport(methodname, "Payout and golive Event verified sucessfully and the event is " + Refevent1, Refevent1, datetimestart);
							Thread.sleep(700);
						 
					}
				 else
				 {
					 	
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentFailReport(methodname, "Payout anfd golive Event not generated " + Refevent1, Refevent1, datetimestart);
						Thread.sleep(700);
				 }
				 
					Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
					Thread.sleep(850);
					

					Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[2]")).click(); 				 
					Thread.sleep(850);
					
					String payoutdoc=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
					Thread.sleep(850);
				  if (payoutdoc.contains(Driver.getData("Payoutdoc")))
						  
				  {
					  		
					  	
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentPassReport(methodname, "document generated successfully" + payoutdoc, payoutdoc, datetimestart);
						Thread.sleep(700);
					}
				  
				  else
				  {
					  	
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentFailReport(methodname, "payout document not generated successfully" + payoutdoc, payoutdoc, datetimestart);
						Thread.sleep(700);
					  
				  }
				 
				  Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 				 
				  Thread.sleep(850);
				  
				//new agreements 
				  Common_Property.driver.findElement(By.linkText("new agreement")).click();
				  Thread.sleep(750);;
				  
				  Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
					Thread.sleep(700);
					agreementno=Driver.getData("Agreement_Number");
					
					Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
					
					Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
					Thread.sleep(700);
					
					Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
					Thread.sleep(700);
					
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					  String ActiveStatus=Common_Property.driver.findElement(By.xpath("//*[@id='topStrip']/span[10]")).getText().toString();
					  Thread.sleep(700);
					  Startline.ExtentPassReport(methodname, "Status is displayed as"+ActiveStatus, ActiveStatus, datetimestart);
			
	    }

			catch (Exception e) 

				     {       
	    				
	    				System.out.println("The exception was "+e);
	    				System.out.println("Abnormal Termination due to "+e);
	    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
	    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
	    						   	      
	    		   	}
	    				
			}

	    

	
	public static void Agreementrigrredo() throws  Exception
	{    	

			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
	try{
		
		Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[1]/a[1]")).click();  				
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.name("forename")).click();  			
		Thread.sleep(750);
		Common_Property.driver.findElement(By.name("forename")).clear();
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.name("forename")).sendKeys(Driver.getData("Changefrnam"));
		Thread.sleep(750);
		
		//termscontinue
		Common_Property.driver.findElement(By.linkText("Continue")).click();			
		Thread.sleep(750);
		
		//Personalcontinue
		Common_Property.driver.findElement(By.linkText("Continue")).click();			
		Thread.sleep(750);
		
		//afforabilitycontinue
		Common_Property.driver.findElement(By.linkText("Continue")).click();			
		Thread.sleep(750);
		
		//employmentcontinue
		Common_Property.driver.findElement(By.linkText("Continue")).click();			
		Thread.sleep(750);
			
			//No Gurantors
		Common_Property.driver.findElement(By.linkText("No Guarantors")).click();			
		Thread.sleep(750);
			
		

			//security continue
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[2]/div/a")).click();
			Thread.sleep(750);
			
			
			//financials continue
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[2]")).click();
			Thread.sleep(950);
			
			
			//refresh
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[1]")).click();  				
			Thread.sleep(750);
			
			//status
			String status=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			Thread.sleep(750);
			
			
			
			if (status.contains(Driver.getData("RefStatus")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			    Startline.ExtentPassReport(methodname, "Status getting into" + status+" after redo", status, datetimestart);
				Thread.sleep(700);
			}
			
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			    Startline.ExtentPassReport(methodname, "Status getting into" + status+" after redo", status, datetimestart);
				Thread.sleep(700);
			}
			
			
		}
	catch (Exception e) 
	{   
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
		
	}
				
				
	}
	
	public static void Agr_afteresign_redo() throws  Exception
	{    	

			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
	try{
		
		WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
		JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
		jse.executeScript("arguments[0].click();", element);
     //PAyout golive
		 
		Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
		Thread.sleep(950);
		
		 
		  //document verify  
			
			 String Docrecevidedcomnt=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr/td[2]")).getText().toString();
			 Thread.sleep(1000);
			 if(Docrecevidedcomnt.isEmpty())
			 {
				 
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 Startline.ExtentPassReport(methodname, "Docs received is displayed without User/Date", Docrecevidedcomnt, datetimestart);
			 }
			 else
			 {
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 Startline.ExtentFailReport(methodname, "Docs received is displayed with User/Date", Docrecevidedcomnt, datetimestart);
			 }
			 
		 
	 //document verify  
		Common_Property.driver.findElement(By.linkText("Docs Received")).click();
		Thread.sleep(950);
			 
		 Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[4]/div[3]/div/button[1]/span")).click(); 
		 Thread.sleep(850);
				
		String Docstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
		Startline.ExtentPassReport(methodname, "Status is " + Docstatus, Docstatus, datetimestart);
		Thread.sleep(700);
		
		Checkdecision.Agr_checkdecision();
		String a=Checkdecision.AgreementPDIstatus;
		
		if(a.contains(Docstatus))
		{
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Docstatus, Docstatus, datetimestart);
			Thread.sleep(700);
		}
		else
		{
			Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Docstatus, Docstatus, datetimestart);
			Thread.sleep(700);
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		}
	
		
		
		Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
		Thread.sleep(700);
		Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
		Thread.sleep(700);
		Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
		Thread.sleep(2000);
		Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
		Thread.sleep(5000);
		//1st check validated	
		Common_Property.driver.findElement(By.linkText("1st Check Validated")).click();
		Thread.sleep(950);
			
			Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
		 Thread.sleep(950);
		
		String checkstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
		Startline.ExtentPassReport(methodname, "Status is " + checkstatus, checkstatus, datetimestart);
		Thread.sleep(1000);
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		
		 Checkdecision.Agr_checkdecision();
			String a1=Checkdecision.AgreementPDIstatus;
			
			if(a1.contains(checkstatus))
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+checkstatus, checkstatus, datetimestart);
				Thread.sleep(700);
			}
			else
			{
				Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ checkstatus, checkstatus, datetimestart);
				Thread.sleep(700);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			}
		
		Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
		Thread.sleep(850);
		Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
		Thread.sleep(850);
		Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
		Thread.sleep(1000);
		Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
		Thread.sleep(1000);
		
		//confirmspecial terms	
		
		
		String specialtermcontent=Common_Property.driver.findElement(By.linkText("Confirm Special Terms")).getText().toString();
		Thread.sleep(950);
		System.out.println(specialtermcontent.length());
		System.out.println(Driver.getData("Specialterm1"));
		if (specialtermcontent.contains(Driver.getData("Specialterm1")))
		{
			
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentPassReport(methodname, "Special term content displayed as Confirmed special terms", specialtermcontent, datetimestart);
		
		}
		
		else
		{	
			

			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentFailReport(methodname, "Special term content displayed as UnConfirmed special terms", specialtermcontent, datetimestart);
		}
		
		
		Common_Property.driver.findElement(By.linkText("Confirm Special Terms")).click();
		Thread.sleep(950);
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String specialtermcontent1=Common_Property.driver.findElement(By.linkText("Unconfirm Special Terms")).getText().toString();
		Thread.sleep(950);
		
		if (specialtermcontent1.contains(Driver.getData("Specialterm2")))
		{
			
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentPassReport(methodname, "Special term content displayed as UnConfirmed special terms", specialtermcontent, datetimestart);
		
		}
		
		else
		{	
			

			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentFailReport(methodname, "Special term content displayed as UnConfirmed special terms", specialtermcontent, datetimestart);
		}
		Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
		Thread.sleep(850);
		Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
		Thread.sleep(850);
		Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
		Thread.sleep(1000);
		Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
		Thread.sleep(1000);
		
		
		//Docs approved	
		Common_Property.driver.findElement(By.linkText("Docs Approved")).click();
		Thread.sleep(950);
		
		
		
		Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
		 Thread.sleep(1000);
		 
		 
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		
		
		String awaitstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
		Startline.ExtentPassReport(methodname, "Status is " + awaitstatus, awaitstatus, datetimestart);
		Thread.sleep(700);
		
		Checkdecision.Agr_checkdecision();
		String a2=Checkdecision.AgreementPDIstatus;
		
		if(a2.contains(awaitstatus))
		{
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+awaitstatus, awaitstatus, datetimestart);
			Thread.sleep(700);
		}
		else
		{
			Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ awaitstatus, awaitstatus, datetimestart);
			Thread.sleep(700);
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		}
	
		
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart); 	
		
		
		Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[7]/a[1]")).click();  				
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.name("numberOfPayments")).click();  			
		Thread.sleep(750);
		Common_Property.driver.findElement(By.name("numberOfPayments")).clear();
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.name("numberOfPayments")).sendKeys(Driver.getData("Redo_instalamnt"));
		Thread.sleep(750);
		
		//Financial
		Common_Property.driver.findElement(By.linkText("Calculate")).click();			
		Thread.sleep(750);
		
		//continue
		Common_Property.driver.findElement(By.linkText("Continue")).click();			
		Thread.sleep(750);
		
		WebElement element1=Common_Property.driver.findElement(By.linkText("Refresh"));
		JavascriptExecutor jse1 = (JavascriptExecutor)Common_Property.driver; 
		jse1.executeScript("arguments[0].click();", element1);
		
		}
	catch (Exception e) 
	{   
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
		
	}
				
				
	}
	
	
	
	public static void Managedocerror() throws  Exception
	{    	

			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
	try{
		
		
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			Thread.sleep(950);
			//PAyout golive
		 
			Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
			Thread.sleep(950);
			
			 //document verify  
			Common_Property.driver.findElement(By.linkText("Docs Received")).click();
			Thread.sleep(950);
				 
			 Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[4]/div[3]/div/button[1]/span")).click(); 
			 Thread.sleep(850);
 				
			String Docstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
			Startline.ExtentPassReport(methodname, "Status is " + Docstatus, Docstatus, datetimestart);
			Thread.sleep(700);
			
			Checkdecision.Agr_checkdecision();
			String a=Checkdecision.AgreementPDIstatus;
			
			if(a.contains(Docstatus))
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Docstatus, Docstatus, datetimestart);
				Thread.sleep(700);
			}
			else
			{
				Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Docstatus, Docstatus, datetimestart);
				Thread.sleep(700);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			}
		
			
			
			
			//Manage Doc Errors
			 Common_Property.driver.findElement(By.linkText("Manage Doc Errors")).click();
			Thread.sleep(950);
			
			Common_Property.driver.findElement(By.xpath("//*[@id='docPackErrorsTable']/tbody/tr[22]/td[1]/input[1]")).click(); 
				 Thread.sleep(850);
			
				Common_Property.driver.findElement(By.linkText("Docs Received with Errors")).click();
				Thread.sleep(950);
				//pop up	 
		
				Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
				Thread.sleep(850);
				
			
			
				String docerror=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
				Thread.sleep(850);
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Status is in" + docerror, docerror, datetimestart);
				
				Checkdecision.Agr_checkdecision();
				String a1=Checkdecision.AgreementPDIstatus;
				
				if(a1.contains(docerror))
				{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+docerror, docerror, datetimestart);
					Thread.sleep(700);
				}
				else
				{
					Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ docerror, docerror, datetimestart);
					Thread.sleep(700);
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				}
				
					
		}
	catch (Exception e) 
	{   
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
		
	}
				
				
}
	
	
		
public static void Addresshistory() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
    			
					//refresh
    				Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[1]")).click();  				
    				Thread.sleep(750);
    				
    				
					Common_Property.driver.findElement(By.xpath("//*[@id='footer']/p/a[5]")).click();
					Thread.sleep(1000);
					
					Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
					Thread.sleep(750);
					
					Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
					Thread.sleep(750);
					
					Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
					Thread.sleep(750);
					
					Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[2]/a[1]")).click();
					Thread.sleep(750);
					
					Common_Property.driver.findElement(By.name("addresses[0].timeAtAddressYears")).sendKeys(Driver.getData("AddressinYears"));
					Thread.sleep(750);
					
					Common_Property.driver.findElement(By.name("addresses[0].timeAtAddressYears")).sendKeys(Driver.getData("AddressinYears"));
					Thread.sleep(750);
					
					
				   Adrshistory=Common_Property.driver.findElement(By.name("addresses[0].timeAtAddressYears")).getAttribute("value");
   				  Thread.sleep(750);
   				  int f = Integer.parseInt(Adrshistory);
 				  System.out.println(f);
 				  adresshistory=Driver.getData("Addresshistory");
 				  int G = Integer.parseInt(adresshistory);
 				  System.out.println(G);
 				
 				 
   				  if(f>=G)
   				  {
   				  
   				   
   					
   				    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					String Desc1="Agreement provided a required  Address history" ;		 
			        Startline.ExtentPassReport(methodname,Desc1,Adrshistory,datetimestart);
			        Thread.sleep(1000);
    			  
   				  }
   				  
   				  else
   				  {
	   					
	   					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 					 String Desc1="Agreement Address history is less than Required" ;		 
 			         Startline.ExtentPassReport(methodname,Desc1,Adrshistory,datetimestart);
 			         Thread.sleep(1000);
     			  
   				  }
    			
   				Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[9]")).click();
				Thread.sleep(750);
			  
   				  
   				
			   }
    			catch (Exception e) 
    			{  
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

    
	
	public static void PDIAddresshistory() throws  Exception
    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);
			
			try{
				
				
				 Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[2]/a[1]")).click(); 				
  			     Thread.sleep(1000); 
  			     
  			     Pdiadresshistory=Driver.getData("Agreementdata");
  			     
  			     Adrshistory=Common_Property.driver.findElement(By.name("addresses[0].timeAtAddressYears")).getAttribute("value");
				  Thread.sleep(750);
				  
			
				  
				  int f = Integer.parseInt(Pdiadresshistory);
				  System.out.println(f);
				  adresshistory=Driver.getData("Addresshistory");
				   int G = Integer.parseInt(adresshistory);
				  System.out.println(G);
				
				 
				  if((f)>=G)
				  {
				  
				   
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart); 
			        Startline.ExtentPassReport(methodname,"Agreement provided a required  Address history"+Pdiadresshistory,"PDIadrshistory:"+Pdiadresshistory,datetimestart);
			        Thread.sleep(9000);
 			  
				  }
				  
				  else
				  {    
					  
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentFailReport(methodname,"Agreement Doesn't provided a required  Address history"+Adrshistory,Adrshistory,datetimestart);
			         Thread.sleep(9000);
  			  
				  }
				  
			  	
				    Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click(); 				
	  			   Thread.sleep(1000);
	  			   
	  			
		}
			
			
			
			
			
			
			catch (Exception e) 
			{  
				
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
		   	}
				
		}
    

public static void Balloonfinancials() throws  Exception
    {    	
   
		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				
				
				Common_Property.driver.findElement(By.name("numberOfPayments")).clear(); 
				
				Common_Property.driver.findElement(By.name("numberOfPayments")).sendKeys(Driver.getData("Installment"));  				
			    Thread.sleep(750);

				Common_Property.driver.findElement(By.name("displayFlatRate")).clear();
				Common_Property.driver.findElement(By.name("displayFlatRate")).sendKeys(Driver.getData("Proposrate"));  				
				Thread.sleep(750);
				
				Common_Property.driver.findElement(By.name("finFixValue")).click();
				Thread.sleep(750);
				Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Baloon"));  				
				Thread.sleep(750);
				
				   Adminfee=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/input[1]")).getAttribute("value");
					Thread.sleep(350);
					System.out.println("admin fee is"+Adminfee);
			
					
					Balloon=Driver.getData("Baloon");			
					Thread.sleep(350);
					System.out.println(Balloon);
					
					String Delaerdepo=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[3]/td[5]/input")).getAttribute("Value");
					Thread.sleep(350);
					
					String	Partex=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[4]/td[6]/input")).getAttribute("Value");
					 Thread.sleep(350);
					 Advance=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[2]/td[2]")).getText().toString();
					 Thread.sleep(350);
					 float Adv=Float.parseFloat(Advance);
					  String goodscost=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[7]/td[3]")).getText().toString();
					 Thread.sleep(350);
					 
					
					   float Delaerdepo1=Float.parseFloat(Delaerdepo);
					   float Partex1=Float.parseFloat(Partex);
					   float totalamnt=Delaerdepo1+Partex1;
					   float goodscost1=Float.parseFloat(goodscost);
					   float Advance1=goodscost1-totalamnt;
					
					
				
					   if(Advance1==Adv)
						{
							
											
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String Desc="Advance amount verified is"+Advance;		 
					        Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
						}
						else
						{	 
				 		    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 		    String Desc="Advance amount is updated incorrectly";
				 	    	Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						}
					   
					 //calculate
						
						Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[1]")).click();  				
						Thread.sleep(850); 
						
						//continue 
						Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[2]")).click();  				
		    			Thread.sleep(30000);
		    			
		    			//Refresh
		    			Common_Property.driver.findElement(By.linkText("Refresh")).click();  				
		    			Thread.sleep(30000);
				
    				
    		   }
    			catch (Exception e) 
    			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

    
	
	
	

  public static void Docsreceived() throws  Exception
    {    	
   
	  		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				
			    
					WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
					JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
					jse.executeScript("arguments[0].click();", element);
					     //PAyout golive
							 
							Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
							Thread.sleep(950);
							 
						  //document verify  
							
							 String Docrecevidedcomnt=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr/td[2]")).getText().toString();
							 Thread.sleep(1000);
							 if(Docrecevidedcomnt.isEmpty())
							 {
								 
								 
								 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
								 Startline.ExtentPassReport(methodname, "Docs received is displayed without User/Date", Docrecevidedcomnt, datetimestart);
							 }
							 else
							 {
								 
								 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
								 Startline.ExtentFailReport(methodname, "Docs received is displayed with User/Date", Docrecevidedcomnt, datetimestart);
							 }
							 
							 
							 Common_Property.driver.findElement(By.linkText("Docs Received")).click(); 
							 Thread.sleep(1000);
						
							 Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[4]/div[3]/div/button[1]/span")).click(); 
							 Thread.sleep(850);
				 				
							String Docstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
							Startline.ExtentPassReport(methodname, "Status is " + Docstatus, Docstatus, datetimestart);
							Thread.sleep(700);
								
				
				
					if(Docstatus.contains("Docs Received"))
					{
						
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "Status is displayed as"+Docstatus,Docstatus, datetimestart);
					}
					else
					{
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentFailReport(methodname, "document is not generated"+Docstatus,Docstatus, datetimestart);
					
					}
					
					Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
					Thread.sleep(700);
					Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
					Thread.sleep(700);
					Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
					Thread.sleep(2000);
					Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
					Thread.sleep(5000);
					//1st check validated	
					Common_Property.driver.findElement(By.linkText("1st Check Validated")).click();
					Thread.sleep(950);
		 			
		 			Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
					 Thread.sleep(950);
					
					String checkstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Status is " + checkstatus, checkstatus, datetimestart);
					Thread.sleep(1000);
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
					Thread.sleep(850);
					Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
					Thread.sleep(850);
					Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
					Thread.sleep(1000);
					Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
					Thread.sleep(1000);
					
					//confirmspecial terms	
					Common_Property.driver.findElement(By.linkText("Confirm Special Terms")).click();
					Thread.sleep(950);
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
					Thread.sleep(850);
					Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
					Thread.sleep(850);
					Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
					Thread.sleep(1000);
					Common_Property.driver.findElement(By.name("documentDocumentFee")).sendKeys(Adminfee);
					Thread.sleep(1000);
					
					
					//Docs approved	
					Common_Property.driver.findElement(By.linkText("Docs Approved")).click();
					Thread.sleep(950);
					
					
					
					Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
					 Thread.sleep(1000);
					 
					 
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					
					String awaitstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Status is " + awaitstatus, awaitstatus, datetimestart);
					Thread.sleep(700);
					
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart); 
					
					Common_Property.driver.findElement(By.name("documentAdvance")).sendKeys(Advance);;
					Thread.sleep(850);
					Common_Property.driver.findElement(By.name("documentInstalment")).sendKeys(installment);;
					Thread.sleep(850);
					Common_Property.driver.findElement(By.name("documentBalloon")).sendKeys(Balloon);
					Thread.sleep(900);
					Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[4]/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/input")).sendKeys(Adminfee);
					//payout go live
					
					Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
					Thread.sleep(950);
					
					Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span")).click(); 
					Thread.sleep(1000);
					
					String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
					 Thread.sleep(700);
					 
					  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
					  
					  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
					  Thread.sleep(700);
					  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
					  
					  
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					  Common_Property.driver.findElement(By.linkText("events")).click();
					  Thread.sleep(750);
				
					 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
					 Thread.sleep(850);
					 
					 if(Refevent1.contains(Driver.getData("Payouteve")))
						{
							
						 		    
						 	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Payout anfd golive Event verified sucessfully and the event is " + Refevent1, Refevent1, datetimestart);
								Thread.sleep(700);
							 
						}
				
						Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
						Thread.sleep(850);
						//document
						Common_Property.driver.findElement(By.linkText("Documents")).click();
						  Thread.sleep(750);
						
						String payoutdoc=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
						Thread.sleep(850);
						if (payoutdoc.contains(Driver.getData("Payoutdoc")))
							  
						{
						  		
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						    Startline.ExtentPassReport(methodname, "document generated successfully" + payoutdoc, payoutdoc, datetimestart);
							Thread.sleep(700);
						}
					 
					  Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 				 
					  Thread.sleep(850);
					  
					 //new agreements 
					  Common_Property.driver.findElement(By.linkText("new agreement")).click();
					  Thread.sleep(750);
					  
					  
					  Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
					  Thread.sleep(700);
					  
						agreementno=Driver.getData("Agreement_Number");
						
						Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
						
						Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
						Thread.sleep(700);
						
						Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
						Thread.sleep(700);
						
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						
						String ActiveStatus=Common_Property.driver.findElement(By.xpath("//*[@id='topStrip']/span[10]")).getText().toString();
						Thread.sleep(700);
						 Startline.ExtentPassReport(methodname, "Status is displayed as"+ActiveStatus, ActiveStatus, datetimestart);
				
					
					
			}
		   catch (Exception e) 

			     {       
    				
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	  }
    				
      }


	public static void Update_compareV2() throws Exception
	 {
		 
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
			 
			
			WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
			JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
			jse.executeScript("arguments[0].click();", element);
			
			
			Common_Property.driver.findElement(By.xpath("//div[@id='footer']/p/a[5]")).click();
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			
			agreementno=Driver.getData("Agreement_Number");
			
			Startline.ExtentPassReport(methodname, "Updated data of an agreement is " +agreementno, agreementno, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
	       
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[2]/a[1]")).click();
			Thread.sleep(1000);
			
			String bankacno=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[4]/td[2]/input")).getAttribute("value");
			Thread.sleep(1000);
			//drivinglicensetype
			
			String Dtype = Common_Property.driver.findElement(By.xpath("//select[@name='drivingLicenceTypeID']/option[@selected='selected']")).getText().toString();
			Thread.sleep(1000);
			String Dorgin=Common_Property.driver.findElement(By.xpath("//select[@name='drivingLicenceOriginID']/option[@selected='selected']")).getText().toString();
			Thread.sleep(1000);
			String noofdependent=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[7]/td[4]/input")).getAttribute("value");
			Thread.sleep(1000);
			String sortcode1= Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[3]/td[2]/input[1]")).getAttribute("value");
			String sortcode2= Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[3]/td[2]/input[2]")).getAttribute("value");	
			String sortcode3= Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[3]/td[2]/input[3]")).getAttribute("value");	
			
				
				
			if(sortcode1.contains(Driver.getData("Ubanksrtcode1")) &&	sortcode2.contains(Driver.getData("Ubanksrtcode2")) &&sortcode3.contains(Driver.getData("Ubanksrtcode3")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank sortcode1 updated successfully with the value"+sortcode1,sortcode1, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank sortcode2 updated successfully with the value"+sortcode2,sortcode2, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank sortcode3 updated successfully with the value"+sortcode3,sortcode3, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank sortcode1 is not Updated",sortcode1, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank sortcode2 is not Updated",sortcode2, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank sortcode3 is not Updated",sortcode3, datetimestart);
			}
			
			if(bankacno.contains(Driver.getData("Ubankacno")))
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank accountnumber updated successfully with the value"+bankacno,bankacno, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank accountnumber is not Updated",bankacno, datetimestart);
			}
			
			if(Dtype.equalsIgnoreCase(Driver.getData("Udrivetype")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Driving licence type updated successfully with the value"+Dtype,Dtype, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Driving licence type is not Updated",Dtype, datetimestart);
			}
			
			
			if(Dorgin.equalsIgnoreCase(Driver.getData("Udriveorgin")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Driving licence orgin updated successfully with the value"+Dorgin,Dorgin, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Driving licence orgin is not Updated",Dorgin, datetimestart);
			}
			
			if(noofdependent.equalsIgnoreCase(Driver.getData("Unoofdepent")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "No of Dependants updated successfully with the value"+noofdependent,noofdependent, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "No of Dependants is not Updated",noofdependent, datetimestart);
			}
			
			
		//affordabilitypagetab
			Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[3]/a[1]")).click();
			Thread.sleep(1000);
			
			String grossamnt=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr/td[1]/table/tbody/tr[3]/td[3]/input")).getAttribute("value");
			Thread.sleep(750);
			String netamnt=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr/td[1]/table/tbody/tr[4]/td[3]/input")).getAttribute("value");
			Thread.sleep(750);
			String caramnt=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td[3]/input")).getAttribute("value");
			Thread.sleep(750);
			String rentamnt=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr/td[2]/table/tbody/tr[6]/td[3]/input")).getAttribute("value");
			Thread.sleep(750);
			
			float grossamnt1=Float.parseFloat(grossamnt);
			String a=Driver.getData("Ugrossamnt");
			float grosamnt2=Float.parseFloat(a);
			
			float netamnt1=Float.parseFloat(netamnt);
			String a1=Driver.getData("Unetamnt");
			 float netamnt2=Float.parseFloat(a1);
			 
			 float caramnt1=Float.parseFloat(caramnt);
			String a2=Driver.getData("Ucaramnt");
			float caramnt2=Float.parseFloat(a2);
			
			float rentamnt1=Float.parseFloat(rentamnt);
			String a3=Driver.getData("Urentamnt");
			 float rentamnt2=Float.parseFloat(a3);
			
			if(grossamnt1==grosamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Grossamount updated successfully with the value"+grossamnt,grossamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Grossamount is not Updated",grossamnt, datetimestart);
			}
			
			if(netamnt1==netamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "netamnt updated successfully with the value"+netamnt,netamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "netamnt is not Updated",netamnt, datetimestart);
			}
			
				if(caramnt1==caramnt2)
			{
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "caramnt updated successfully with the value"+caramnt,caramnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "caramnt is not Updated",caramnt, datetimestart);
			}
			if(rentamnt1==rentamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "rentamnt updated successfully with the value"+rentamnt,rentamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "rentamnt is not Updated",rentamnt, datetimestart);
			}
			
			//financials tab
			Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
			Thread.sleep(1000);
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[7]/td[2]/div/a/img")).click();
			Thread.sleep(1000);
			String gapamnt=Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[1]/tbody/tr[3]/td[2]/input")).getAttribute("value");
			Thread.sleep(750);
			String paintproamnt=Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[1]/tbody/tr[4]/td[2]/input")).getAttribute("value");
			Thread.sleep(750);
			String tyreinsamnt=Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[1]/tbody/tr[5]/td[2]/input")).getAttribute("value");		
			Thread.sleep(750);
			String warrantyamnt=Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[1]/tbody/tr[6]/td[2]/input")).getAttribute("value");
			Thread.sleep(750);
			
			float gapamnt1=Float.parseFloat(gapamnt);
			String a4=Driver.getData("Ugapamnt");
			 float gapamnt2=Float.parseFloat(a4);
			 
			 float paintproamnt1=Float.parseFloat(paintproamnt);
			 String a5=Driver.getData("Upaintproamnt");
			 float paintproamnt2=Float.parseFloat(a5);
			 
			 float tyreinsamnt1=Float.parseFloat(tyreinsamnt);
			String a6=Driver.getData("Utyreamnt");
			float tyreinsamnt2=Float.parseFloat(a6);
				
			float warrantyamnt1=Float.parseFloat(warrantyamnt);
			String a7=Driver.getData("Uwarrantyamnt");
			 float warrantyamnt2=Float.parseFloat(a7);
			
			if(gapamnt1==gapamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Gapamount updated successfully with the value"+gapamnt,gapamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Gapamount is not Updated",gapamnt, datetimestart);
			}
			
			
			if(paintproamnt1==paintproamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Paint protect amount updated successfully with the value"+paintproamnt,paintproamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Paint protect amount  is not Updated",paintproamnt, datetimestart);
			}
			if(tyreinsamnt1==tyreinsamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Tyre insurance amount updated successfully with the value"+tyreinsamnt,tyreinsamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Tyre insurance amount is not Updated",tyreinsamnt, datetimestart);
			}
			
			if(warrantyamnt1==warrantyamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Warranty amount updated successfully with the value"+warrantyamnt,warrantyamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Warranty amount is not Updated",warrantyamnt, datetimestart);
			}
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[2]/tbody/tr/td[1]/a")).click();
			Thread.sleep(1000);
			
			//financial tab
			//calculate
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[1]")).click();
			Thread.sleep(1000);
			//continue
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[2]")).click();
			Thread.sleep(1000);
			
		   
		        
		}	
		catch (Exception e) 

	     {       
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
	   	  }
	 
	}
	public static void Update_compareV1() throws Exception
	 {
		  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
			 
			WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
			JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
			jse.executeScript("arguments[0].click();", element);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='footer']/p/a[5]")).click();
			Thread.sleep(2000);
			
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			
			agreementno=Driver.getData("Agreement_Number");
			
			Startline.ExtentPassReport(methodname, "Updated data of an agreement is " +agreementno, agreementno, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
	       
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[2]/a[1]")).click();
			Thread.sleep(1000);
		
			String bankacno=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[4]/td[2]/input")).getAttribute("value");
			Thread.sleep(1000);
			
			//drivinglicensetype
			
			String sortcode1= Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[3]/td[2]/input[1]")).getAttribute("value");
			String sortcode2= Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[3]/td[2]/input[2]")).getAttribute("value");	
			String sortcode3= Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[3]/tbody/tr[3]/td[2]/input[3]")).getAttribute("value");	
			
			if(bankacno.contains(Driver.getData("Ubankacno")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank accountnumber updated successfully with the value"+bankacno,bankacno, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank accountnumber is not Updated",bankacno, datetimestart);
			}	
				
			if(sortcode1.contains(Driver.getData("Ubanksrtcode1")) &&	sortcode2.contains(Driver.getData("Ubanksrtcode2")) &&sortcode3.contains(Driver.getData("Ubanksrtcode3")))
			{
				
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank sortcode1 updated successfully with the value"+sortcode1,sortcode1, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank sortcode2 updated successfully with the value"+sortcode2,sortcode2, datetimestart);
				Startline.ExtentPassReport(methodname, "Bank sortcode3 updated successfully with the value"+sortcode3,sortcode3, datetimestart);
			}
			else
			{	
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank sortcode1 is not Updated",sortcode1, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank sortcode2 is not Updated",sortcode2, datetimestart);
				Startline.ExtentFailReport(methodname, "Bank sortcode3 is not Updated",sortcode3, datetimestart);
			}
			
			
			
		//financials tab
			Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
			Thread.sleep(1000);
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[7]/td[2]/div/a/img")).click();
			Thread.sleep(1000);
			String gapamnt=Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[1]/tbody/tr[3]/td[2]/input")).getAttribute("value");
			Thread.sleep(750);
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/table[2]/tbody/tr/td[1]/a")).click();
			Thread.sleep(1000);
			String partex=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[4]/td[6]/input")).getAttribute("value");
			Thread.sleep(750);
			
			float partex1=Float.parseFloat(partex);
			String a5=Driver.getData("Upartex");
			 float partex2=Float.parseFloat(a5);
			
			float gapamnt1=Float.parseFloat(gapamnt);
			String a4=Driver.getData("Ugapamnt");
			 float gapamnt2=Float.parseFloat(a4);
			 
			if(gapamnt1==gapamnt2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Gapamount updated successfully with the value"+gapamnt,gapamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Gapamount is not Updated",gapamnt, datetimestart);
			}
			
			if(partex1==partex2)
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "Partexchange amount updated successfully with the value"+gapamnt,gapamnt, datetimestart);
			}
			else
			{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentFailReport(methodname, "Partexchange amount is not Updated",gapamnt, datetimestart);
			}
			
			
			//financial tab
			//calculate
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[1]")).click();
			Thread.sleep(1000);
			//continue
			Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[2]")).click();
			Thread.sleep(1000);
			
		}   
		        
		
		catch (Exception e) 

	     {       
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
	   	  }
	 }
	
	
	
  
	public static void Callmanualapproved() throws  Exception


    {    	
   
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			

			try
			{
				int f = Integer.parseInt(BankEnhancedscore);
				System.out.println(f);
				int G=45;
				if (f<G)
					
				{    
					
					 //manual over ride
					Common_Property.driver.findElement(By.linkText("Manual Override")).click();
					Thread.sleep(700);
						
						
					String Status = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Status is " + Status, Status, datetimestart);
					Thread.sleep(700);
					Plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Agreement plan is"+ Plan ,Plan, datetimestart);	
					
					
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					//events
					 Common_Property.driver.findElement(By.linkText("events")).click(); 
					 Thread.sleep(850);
					
					Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();
					Thread.sleep(850);
					Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();
					Thread.sleep(850);
						 
						if(Refevent1.contains(Driver.getData("WEevent1"))&& Refevent2.contains(Driver.getData("WEevent2")))
						{
						   
							  
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Callvalidate manual approved events are generated as expeccted","Accpetevents1:"+Refevent1+"Acceptedevents2:"+Refevent2, datetimestart);
							  
						}
						 
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "Callvalidate manual approved events are Not generated as expeccted" , null, datetimestart);
							   
						}
						
					//events back
					Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
					Thread.sleep(850);
						
					//documents
					 Common_Property.driver.findElement(By.linkText("Documents")).click(); 
					 Thread.sleep(850);
							 
					String AccDocname=Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();
					Thread.sleep(850);
							
						if(AccDocname.contains(Driver.getData("AccDocumentname1")))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Document is generated sucessfully" ,AccDocname, datetimestart);
							Thread.sleep(700); 
						}
							 
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "Document is NOT generated " , null, datetimestart);
							Thread.sleep(700);
						}
							 //documents back
					Common_Property.driver.findElement(By.xpath("//*[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click();
					Thread.sleep(850);
					
					
					 Checkdecision.Agr_checkdecision();
						String a2=Checkdecision.AgreementPDIstatus;
						
						if(a2.contains(Status))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Status, Status, datetimestart);
							Thread.sleep(700);
						}
						else
						{
							Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Status, Status, datetimestart);
							Thread.sleep(700);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						}
				} 
				
			}
			
							
    		catch (Exception e) 

				{       
					
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
		}

    
    


	
	
	
public static void Callcondionalapproved() throws  Exception
    
    {    	
   
		
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
		
				
				//Refresh
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
				
				Common_Property.driver.findElement(By.linkText("Manual Override")).click(); 				 
				 Thread.sleep(850);
			
				 String Status1 = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				 
				 String plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 
				 if(Status1.contains(Driver.getData("AccStatus")))
				 {
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentPassReport(methodname, "Status is " + Status1, null, datetimestart);
					 Thread.sleep(700); 
				 }
				 
				 else{
					 
					 
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentFailReport(methodname, "Status is " + Status1, null, datetimestart);
					 Thread.sleep(700);
				 }
				 
				 if(plan.contains(Driver.getData("AccplannameE")))
				 {
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentPassReport(methodname, "Status is " + Status1, null, datetimestart);
					 Thread.sleep(700); 
				 }
				 
				 else
				 {
					 
					 
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentFailReport(methodname, "Status is " + Status1, null, datetimestart);
					 Thread.sleep(700);
				 }
				 
				 
				 Common_Property.driver.findElement(By.linkText("events")).click(); 				 
				 Thread.sleep(850);
				
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
				 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
				 if(Refevent1.contains(Driver.getData("WEevent2"))&& Refevent2.contains(Driver.getData("WEevent1")))
					{
						
					 		    
					 	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentPassReport(methodname, "Condionally Accepted Event verified sucessfully and the event is" + Refevent1, "Conditinal accpeted event1:"+Refevent1+" Conditinallyacceptevent2:"+Refevent2, datetimestart);
						Thread.sleep(700);
						 
					}
					
					 else
					 {
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentFailReport(methodname, "Condionally AcceptedEvents not generated" , null, datetimestart);
						   Thread.sleep(700);
					 }
					 
					
				 
					Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
					Thread.sleep(850);
					
					
					//PAyout golive
					 
					Common_Property.driver.findElement(By.linkText("Payout & Golive")).click();
					Thread.sleep(950);
					 
				 //document verify  
					Common_Property.driver.findElement(By.linkText("Docs Received")).click();
					Thread.sleep(950);
						 
					 Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[4]/div[3]/div/button[1]/span")).click(); 
					 Thread.sleep(850);
		 				
					String Docstatus=Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[10]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Status is " + Docstatus, Docstatus, datetimestart);
					Thread.sleep(700);
					
					
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					
					Checkdecision.Agr_checkdecision();
					String a=Checkdecision.AgreementPDIstatus;
					
					if(a.contains(Docstatus))
					{
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "Checkdecision_PDI_Motorfrontend_are equal as expected"+Docstatus, Docstatus, datetimestart);
						Thread.sleep(700);
					}
					else
					{
						Startline.ExtentFailReport(methodname, "Checkdecision_PDI_Motorfrontend_are not equal"+ Docstatus, Docstatus, datetimestart);
						Thread.sleep(700);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					}
					
				
					
	}
				
    		  
			
    			catch (Exception e) 

			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

    

	public static void WithGuarantors() throws  Exception
    {    	
   
		{ 
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{

    		 
    				
    			
    				
  				Common_Property.driver.findElement(By.name("guarantorSurname")).sendKeys(Driver.getData("Gsurname"));
				Thread.sleep(250);
				
				Common_Property.driver.findElement(By.name("guarantorForename")).sendKeys(Driver.getData("Gforename"));
				Thread.sleep(250);
				
				Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr/td[2]/a")).click();  				
				Thread.sleep(750);
				
				Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();  				
				Thread.sleep(750);
				 
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 
				//Guarantors continue
				Common_Property.driver.findElement(By.linkText("Continue")).click();  				
				Thread.sleep(750);
    	
    		//get agreement number
    				
    		agreementno = Common_Property.driver.findElement(By.xpath("//div[@id='topStrip']/span[4]")).getText().toString();
    		System.out.println(agreementno);
    		Startline.ExtentPassReport(methodname,"Guarantors added successfully",agreementno,datetimestart);
    		SMF_RestAssured.Agreement_Number=agreementno;
		    Utilities.ExtentPassReport(methodname);		
    				if(agreementno!=null) 
    				 {
    			   		
    			   		
    					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    					String Desc="Agreement is Created Successfully "+agreementno;		 
    			        Startline.ExtentPassReport(methodname,Desc,agreementno,datetimestart);
    			        Thread.sleep(9000);
    			        Common_Funtions.Agreement_Store.Store_Data(Driver.Project,SMF_RestAssured.Agreement_Number,SMF_RestAssured.Student_Url,Driver.recordset2);     
    			        
    				 }
    				else
    				{
    					
    			 		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    			 		String Desc="Agreement Number is not Generated ";
    			 		Startline.ExtentFailReport(methodname,Desc,agreementno,datetimestart);
    				}
    				
    				
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			
    				
    				
    		   }
    			catch (Exception e) 
    			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

    }
	public static void Finishlinebrand() throws  Exception
    
    {    	
   
		{ 
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				 
				//Refresh
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
				
				 Select select = new Select (Common_Property.driver.findElement(By.name("changeBrandID")));
    			 select.selectByValue("102724");
    			 Thread.sleep(950);
    			 
				Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				Thread.sleep(700);
				
				Common_Property.driver.findElement(By.name("displayFlatRate")).clear();
				Thread.sleep(700);
				
				Common_Property.driver.findElement(By.name("displayFlatRate")).sendKeys(Driver.getData("Fproposrate"));
				Thread.sleep(700);
				
				Common_Property.driver.findElement(By.linkText("Calculate")).click();
				Thread.sleep(700);
				
				Common_Property.driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(700);
				
				
				//refresh
				Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[1]")).click();
				Thread.sleep(700);
				
				String Status = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Agreement status is"+ Status,Status, datetimestart);
				Thread.sleep(700);
				
				Plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Agreement Plan is"+ Plan,Plan, datetimestart);
				
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				installment = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[6]/td[4]")).getText().toString();
				
				Startline.ExtentPassReport(methodname,"Installment amount is "+ installment,installment,datetimestart);
				Thread.sleep(750);
				//financial tab
				Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				Thread.sleep(700);
				
				Adminfee=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/input[1]")).getAttribute("value");
				Thread.sleep(350);
				System.out.println("admin fee is"+Adminfee);
				
						
				Balloon=Driver.getData("Baloon");			
				Thread.sleep(350);
				System.out.println(Balloon);
						
				String Delaerdepo=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[3]/td[5]/input")).getAttribute("Value");
				Thread.sleep(350);
						
				String	Partex=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[4]/td[6]/input")).getAttribute("Value");
				Thread.sleep(350);
				Advance=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[2]/td[2]")).getText().toString();
				Thread.sleep(350);
				float Adv=Float.parseFloat(Advance);
				String goodscost=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[7]/td[3]")).getText().toString();
				Thread.sleep(350);
						 
				float Delaerdepo1=Float.parseFloat(Delaerdepo);
				float Partex1=Float.parseFloat(Partex);
				float totalamnt=Delaerdepo1+Partex1;
				float goodscost1=Float.parseFloat(goodscost);
				float Advance1=goodscost1-totalamnt;
						
				if(Advance1==Adv)
				{
								
									
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					String Desc="Advance amount verified is"+Advance;		 
					Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
				}
				else
				{	 
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					String Desc="Advance amount is updated incorrectly";
					Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				}
				
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 
				Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
				Thread.sleep(950);
				
					
			}
			
    		  
			
    			catch (Exception e) 

			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

    }





	public static void Returntointroducer() throws  Exception
    { 
		{
			
			
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
		
		try{
			
			
			//Refresh
			
			WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
			JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
			jse.executeScript("arguments[0].click();", element);
			 // Return to introducer
			
		
			Common_Property.driver.findElement(By.linkText("Return to Introducer")).click(); 
			Thread.sleep(950);
			 
			 String Returnstatus=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			 Thread.sleep(700);
			 
			 Startline.ExtentPassReport(methodname, "Status is " + Returnstatus, Returnstatus, datetimestart);
			 
			 String Returnplan=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			 Thread.sleep(700);
			 Startline.ExtentPassReport(methodname, "Plan is " + Returnplan, Returnplan, datetimestart);	
			 
			 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			 
			 if(Returnstatus.contains(Driver.getData("AccStatus")) && Returnplan.contains(Driver.getData("AccplannameE")))
				 {
				 
				 Startline.ExtentPassReport(methodname, "Status is " + Returnstatus, Returnstatus, datetimestart);
				 Startline.ExtentPassReport(methodname, "Plan is " + Returnplan, Returnplan, datetimestart);	
				 
				 
				 }
			 
			 else
			 {
				 
				 Startline.ExtentPassReport(methodname, "Status is  not as expected"+ Returnstatus, Returnstatus, datetimestart);
				 Startline.ExtentPassReport(methodname, "Plan is  not as expected" + Returnplan, Returnplan, datetimestart);	
				 
			 }
			
			//Events
			  Common_Property.driver.findElement(By.linkText("events")).click();
			  Thread.sleep(750);
				 
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();
				 Thread.sleep(700);
				
				 
				 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();
				 Thread.sleep(700);
				
			
				 if (Refevent1.equalsIgnoreCase(Driver.getData("WEevent1")) && Refevent2.equalsIgnoreCase(Driver.getData("WEevent2")))
				 {
					
					    
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "Agreement status event generated successfullly and the event is"+Refevent1, null, datetimestart);
						Startline.ExtentPassReport(methodname, "Agreement deler letter event generated successfullly ", null, datetimestart);
						Thread.sleep(700);
					 
				 }
				 
				 else
				 {      
					    
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentFailReport(methodname, "Agreement status event  NOT generated", null, datetimestart);
						Startline.ExtentFailReport(methodname, "deler letter  event is  NOT generated", null, datetimestart);
						Thread.sleep(700);
					 
				 }
				 
				
				 
				 Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				 Thread.sleep(700);
				
						
				Common_Property.driver.findElement(By.linkText("Documents")).click(); 
				Thread.sleep(950);
					 
					 String Document=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();
					 Thread.sleep(700);
					 
					 if(Document.contains(Driver.getData("AccEDocumentname1")))
						 
					 {
						 
						 
						    
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Document generated successfullly and its name is"+Document, null, datetimestart);
							Thread.sleep(700);
					 }
					 
					 
					 else
					 
					 {
						    
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "Documentis NOT generated", null, datetimestart);
							Thread.sleep(700);
					}
					 
					
					 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click();
					 Thread.sleep(700);
					
					 
					 Checkdecision.Agr_checkdecision();
					 String a=Checkdecision.AgreementPDIstatus;
						
						if(a.contains(Returnstatus))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are equal as expected"+Returnstatus, Returnstatus, datetimestart);
							Thread.sleep(700);
						}
						else
						{
							Startline.ExtentFailReport(methodname, "CheckdecisionAgreementstatus_PDI_Motorfrontend_are not equal"+ Returnstatus, Returnstatus, datetimestart);
							Thread.sleep(700);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						}
				 }
		
			catch (Exception e) 

			{   
				
		
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					
			}
		   	
		}		


		}
    


	public static void Manualrejection() throws  Exception
    
    {    	
   
		{
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				 //new agreements
					
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
				
				
				/*	
				  Common_Property.driver.findElement(By.linkText("new agreement")).click();
				  Thread.sleep(1000);
				
					Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
					Thread.sleep(750);
				
					Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
					Thread.sleep(750);
				
					Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
					Thread.sleep(750);
					
					
					
					//refresh
					Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
					Thread.sleep(950);*/
				
					//Reject
					Common_Property.driver.findElement(By.linkText("Reject")).click(); 
					Thread.sleep(950);
				 
				 Select select = new Select (Common_Property.driver.findElement(By.name("rejectionReasonID")));
     			 select.selectByValue("103990");
     			 Thread.sleep(350);
     			 
     			 Common_Property.driver.findElement(By.xpath("//div[@id='personSearchBody']/form/table[2]/tbody/tr/td[2]/a")).click(); 				
				 Thread.sleep(850);
				
				 String Status1 = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 
				 if(Status1.contains(Driver.getData("AccStatus")))
				 {
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentPassReport(methodname, "Status is " + Status1, null, datetimestart);
					 Thread.sleep(700); 
				 }
				 
				 else{
					 
					 
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentPassReport(methodname, "Status is " + Status1, null, datetimestart);
					 Thread.sleep(700);
				 }
				 
				 Plan1 = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 if (Plan1.contains(Driver.getData("AccplannameE")))
					
				 {
					
					 
					Startline.ExtentPassReport(methodname, "Agreement Plan is under " + Plan1, null, datetimestart);
					Thread.sleep(700);
				
					
				 }
					
				else
				{
						Startline.ExtentFailReport(methodname,"Plan is not under the" + Plan1, null,datetimestart);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				}
				 
				//Events
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(750);

		
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
				 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 System.out.println(Refevent2);
				 
				 
				 if(Refevent1.contains(Driver.getData("Rejeceve1")) && Refevent2.contains(Driver.getData("Rejeceve2")))
				{
					
					    
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentPassReport(methodname, "Rejected letter Event verified sucessfully and the event is " + Refevent1, null, datetimestart);
					    Startline.ExtentPassReport(methodname, "Manual rejected event verified sucessfully and the event is " + Refevent2, null, datetimestart);
						Thread.sleep(700);
					 
				}
				
				 else
				 {
					 
					 	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					   Startline.ExtentFailReport(methodname, "Rejected letter Event not generated" , null, datetimestart);
					   Startline.ExtentFailReport(methodname, "Manual rejected event not generated" , null, datetimestart);
					   Thread.sleep(700);
				 }
				 
				
				 Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
				 Thread.sleep(850);
				 
				 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[3]")).click(); 				 
				 Thread.sleep(850);
					
					 String Document=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
					 Thread.sleep(850);
				
					 if(Document.contains(Driver.getData("Docname")))
					 {
						 
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentPassReport(methodname, "Document"+ Document +" is generated and it has been validated successfully" , Document, datetimestart);
						   Thread.sleep(700);
						 
					}
					
					 else
					 {
						  
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						 Startline.ExtentFailReport(methodname, "Document" + Document + "is NOT generated" , Document, datetimestart);
						 Thread.sleep(700);
					 }
					 
					 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 
					 Thread.sleep(850);  
					
					 
					 Checkdecision.Agr_checkdecision();
						String a=Checkdecision.AgreementPDIstatus;
						
						if(a.contains(Status1))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Checkdecision_PDI_Motorfrontend_are equal as expected"+Status1, Status1, datetimestart);
							Thread.sleep(700);
						}
						else
						{
							Startline.ExtentFailReport(methodname, "Checkdecision_PDI_Motorfrontend_are not equal"+ Status1, Status1, datetimestart);
							Thread.sleep(700);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						}
						
						
                   }
					 
			catch (Exception e) 

			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

}

public static void FLAutoRejection() throws  Exception
    
    {    	
   
		{ 
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				//Refresh
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
			
				Select select = new Select (Common_Property.driver.findElement(By.name("changeBrandID")));
				select.selectByValue("102724");
				Thread.sleep(950);
				//Refresh
				
				Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
				Thread.sleep(950);
				
				 	String Status = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Status is " + Status, null, datetimestart);
					Thread.sleep(700);
					
					String Plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
					Startline.ExtentPassReport(methodname, "Status is " + Plan, null, datetimestart);
					
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 
					 if(Status.contains(Driver.getData("AccStatus"))&& Plan.contains(Driver.getData("AccplannameE")))
					 {
						 
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						 Startline.ExtentPassReport(methodname, "Status is " + Status, Status, datetimestart);
						 Startline.ExtentPassReport(methodname, "Plan is " + Plan, Plan, datetimestart);
						 Thread.sleep(700); 
					 }
					 
					 else
					 {
						 
						 
						 
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						 Startline.ExtentFailReport(methodname, "Status is NOT displayed as" + Status, Status, datetimestart);
						 Startline.ExtentFailReport(methodname, "Plan is  not displayed as" + Plan, Plan, datetimestart);
						 Thread.sleep(700);
					 }
					 
				
					//Events
					  Common_Property.driver.findElement(By.linkText("events")).click();
					  Thread.sleep(750);
				
				
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				
				 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				
				 
				 Refevent3=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
		
				 
				 if(Refevent1.contains(Driver.getData("Rejeceve1")) && Refevent2.contains(Driver.getData("Rejeceve2")) && Refevent3.contains(Driver.getData("Rejeceve3")))
				{
					
					 	   
					 	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentPassReport(methodname, "Reject letter Event verified sucessfully and the event is " + Refevent1, null, datetimestart);
					    Startline.ExtentPassReport(methodname, "Decision Made	 Event verified sucessfully and the event is " + Refevent2, null, datetimestart);
					    Startline.ExtentPassReport(methodname, "Automatically Rejected Event verified sucessfully and the event is " + Refevent3, null, datetimestart);
					    Thread.sleep(700);
					    
					 
				}
				
				 else
				 {
					 	
					 Startline.ExtentFailReport(methodname, "Reject letter Event NOT generated ", null, datetimestart);
					 	Startline.ExtentFailReport(methodname, "Decision Made Event Not generated", null, datetimestart);
					    Startline.ExtentFailReport(methodname, "Automatically Rejected Event NOT generated", null, datetimestart);
				 }
				 
				
				
				 Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
				 Thread.sleep(850);
				 
				 
				 if(Refevent1.contains(Driver.getData("Rejevents"))) 
                 {
					 
					 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[3]")).click(); 				 
					 Thread.sleep(850);
					 
					 String Document=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
					 Thread.sleep(850);
				
					 if(Document.contains(Driver.getData("Docname")))
					 {
						 
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentPassReport(methodname, "Document"+ Document +" is generated and it has been validated successfully" , Document, datetimestart);
						   Thread.sleep(700);
						 
						 
					 }
					
					 else
					 {
						  
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentFailReport(methodname, "Document" + Document + "is NOT generated" , Document, datetimestart);
						   Thread.sleep(700);
						 
						 
					 }
					 
					 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 
					 Thread.sleep(850);  
					 
					 Checkdecision.Agr_checkdecision();
					String a=Checkdecision.AgreementPDIstatus;
						
						if(a.contains(Status))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Checkdecision_PDI_Motorfrontend_are equal as expected"+Status, Status, datetimestart);
							Thread.sleep(700);
						}
						else
						{
							Startline.ExtentFailReport(methodname, "Checkdecision_PDI_Motorfrontend_are not equal"+ Status, Status, datetimestart);
							Thread.sleep(700);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						}
						
                 }			
				
				 
		}
				 
	catch (Exception e) 

			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

}

@SuppressWarnings("unused")
public static void Prevetmanualdecline() throws  Exception

{    	

	{ 
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
		
		try{
			
			 //new agreements
				
			
			WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
			JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
			jse.executeScript("arguments[0].click();", element);
			
			
			WebElement element1=Common_Property.driver.findElement(By.linkText("Reject"));
			JavascriptExecutor jse1 = (JavascriptExecutor)Common_Property.driver; 
			jse1.executeScript("arguments[0].click();", element1);
			
			
			 
			 Select select = new Select (Common_Property.driver.findElement(By.name("rejectionReasonID")));
			 select.selectByValue("103990");
			 Thread.sleep(350);
			 
			 Common_Property.driver.findElement(By.xpath("//div[@id='personSearchBody']/form/table[2]/tbody/tr/td[2]/a")).click(); 				
			 Thread.sleep(850);
			
			 String Status1 = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			 
			 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			 
			 if(Status1.contains(Driver.getData("AccStatus")))
			 {
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 Startline.ExtentPassReport(methodname, "Status is " + Status1, null, datetimestart);
				 Thread.sleep(700); 
			 }
			 
			 else{
				 
				 
				 
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 Startline.ExtentPassReport(methodname, "Status is " + Status1, null, datetimestart);
				 Thread.sleep(700);
			 }
			 
			 Plan1 = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			 
			 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			 if (Plan1.contains(Driver.getData("AccplannameE")))
				
			 {
				
				 
				Startline.ExtentPassReport(methodname, "Agreement Plan is under " + Plan1, null, datetimestart);
				Thread.sleep(700);
			
				
			 }
				
			else
			{
					Startline.ExtentFailReport(methodname,"Plan is not under the" + Plan1, null,datetimestart);
					
					Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			}
			 
			//Events
			  Common_Property.driver.findElement(By.linkText("events")).click();
			  Thread.sleep(750);

	
			 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
			 Thread.sleep(850);
			 
			 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();				 
			 Thread.sleep(850);
			 System.out.println(Refevent2);
			 
			 
			 if(Refevent1.contains(Driver.getData("Rejeceve1")) && Refevent2.contains(Driver.getData("Rejeceve2")))
			{
				
				    
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				    Startline.ExtentPassReport(methodname, "Rejected letter Event verified sucessfully and the event is " + Refevent1, null, datetimestart);
				    Startline.ExtentPassReport(methodname, "Manual rejected event verified sucessfully and the event is " + Refevent2, null, datetimestart);
					Thread.sleep(700);
				 
			}
			
			 else
			 {
				 
				 	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				   Startline.ExtentFailReport(methodname, "Rejected letter Event not generated" , null, datetimestart);
				   Startline.ExtentFailReport(methodname, "Manual rejected event not generated" , null, datetimestart);
				   Thread.sleep(700);
			 }
			 
			
			 Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
			 Thread.sleep(850);
			 
			 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[3]")).click(); 				 
			 Thread.sleep(850);
				
				 String Document=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
				 Thread.sleep(850);
			
				 if(Document.contains(Driver.getData("Docname")))
				 {
					 
					   
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					   Startline.ExtentPassReport(methodname, "Document"+ Document +" is generated and it has been validated successfully" , Document, datetimestart);
					   Thread.sleep(700);
					 
				}
				
				 else
				 {
					  
					   
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentFailReport(methodname, "Document" + Document + "is NOT generated" , Document, datetimestart);
					 Thread.sleep(700);
				 }
				 
				 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 
				 Thread.sleep(850);  
				  
				 
				 Checkdecision.Agr_checkdecision();
					String a=Checkdecision.AgreementPDIstatus;
					
					if(a.contains(Status1))
					{
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "Checkdecision_PDI_Motorfrontend_are equal as expected"+Status1, Status1, datetimestart);
						Thread.sleep(700);
					}
					else
					{
						Startline.ExtentFailReport(methodname, "Checkdecision_PDI_Motorfrontend_are not equal"+ Status1, Status1, datetimestart);
						Thread.sleep(700);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					}
              }

		catch (Exception e) 
		{   
			
			System.out.println("The exception was "+e);
			System.out.println("Abnormal Termination due to "+e);
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Test Run of"+methodname+"was not completed Sucessfully";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
					   	      
		}

	}

}
	

public static void Declinedecisionresaon() throws  Exception
{    	

	{	
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
		
		try{
			
			
		    
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
		   //view
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
			Thread.sleep(1000);
			
			 //scroll down
			 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
			 jse.executeScript("window.scrollBy(0,6000)");
			
			//close
			Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
			Thread.sleep(700);
			//agreementlink
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
			
			 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			if (pagename.contains("Financials"))
			{
				Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[2]")).click();
				Thread.sleep(700);
			}
			else
			{
				Common_Property.driver.findElement(By.linkText("Refresh")).click();
			}
			
			WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
			JavascriptExecutor jse1 = (JavascriptExecutor)Common_Property.driver; 
			jse1.executeScript("arguments[0].click();", element);
			
			
			 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			 
			String Decisionreasons=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr/td[1]/table/tbody/tr[5]/td[1]")).getText().toString();
			Thread.sleep(700);
			
			String Declinereasons=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr/td[1]/table/tbody/tr[5]/td[2]")).getText().toString();
			Thread.sleep(700);
			System.out.println(Driver.getData("Declinedecisionreason1"));
			
			if(Decisionreasons.contains(Driver.getData("Decisionreasons")) && Declinereasons.contains(Driver.getData("Declinedecisionreason1")))
			{
				String Declinereason=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr/td[1]/table/tbody/tr[5]/td[2]")).getText().toString();
				Thread.sleep(700);
				if(Declinereason.contains(Driver.getData("Declinedecisionreason1")))
				{
				Startline.ExtentPassReport(methodname, "Decline Decision reason is displayed as expceted as"+Declinereason, Declinereason, datetimestart);
				}
			}
			
			else
			{
				String Decisionreason=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr/td[1]/table/tbody/tr[4]/td[2]")).getText().toString();
				Thread.sleep(700);
				if(Decisionreason.contains(Driver.getData("Declinedecisionreason2")))
				{
				Startline.ExtentPassReport(methodname, "Decline Decision reason is displayed as expceted as"+Decisionreason, Decisionreason, datetimestart);
				}
			}
			
		}
		   
			catch (Exception e) 
			{   
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
		   	}
				
}

}		
    

public static void AutoRejected() throws  Exception
    
    {    	
   
		{ 
			
			System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
			String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
			
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date sdate = new Date();
			String datetimestart=dateFormat.format(sdate);		
			
			try{
				
				//Refresh
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);
				
			    String Status = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + Status, null, datetimestart);
				Thread.sleep(700);
				
				String Plan = Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				Startline.ExtentPassReport(methodname, "Status is " + Plan, null, datetimestart);
				
				 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 
				 if(Status.contains(Driver.getData("AccStatus"))&& Plan.contains(Driver.getData("AccplannameE")))
				 {
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentPassReport(methodname, "Status is " + Status, Status, datetimestart);
					 Startline.ExtentPassReport(methodname, "Plan is " + Plan, Plan, datetimestart);
					 Thread.sleep(700); 
				 }
				 
				 else
				 {
					 
					 
					 
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					 Startline.ExtentFailReport(methodname, "Status is NOT displayed as" + Status, Status, datetimestart);
					 Startline.ExtentFailReport(methodname, "Plan is  not displayed as" + Plan, Plan, datetimestart);
					 Thread.sleep(700);
				 }
				 
				//Events
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(750);
				
				
				 Refevent1=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				
				 Refevent2=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				
				 
				 Refevent3=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
				 
				 Refevent4=Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/table[1]/tbody/tr[5]/td[3]")).getText().toString();				 
				 Thread.sleep(850);
			
				 
				 if(Refevent1.contains(Driver.getData("Rejeceve1")) && Refevent2.contains(Driver.getData("Rejeceve2")) && Refevent3.contains(Driver.getData("Rejeceve3")) && Refevent4.contains(Driver.getData("Rejeceve4")))
				{
					
					    
					 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					    Startline.ExtentPassReport(methodname, "Rejected letter Event verified sucessfully and the event is " + Refevent1, null, datetimestart);
					    Startline.ExtentPassReport(methodname, "Call Validate Search Required Event verified sucessfully and the event is " + Refevent2, null, datetimestart);
					    Startline.ExtentPassReport(methodname, "Decision Made Event verified sucessfully and the event is " + Refevent3, null, datetimestart);
					    Startline.ExtentPassReport(methodname, "Automatically Rejected Event verified sucessfully and the event is " + Refevent4, null, datetimestart);
					    Thread.sleep(700);
					    
					 
				}
				
				 else
				 {
					 	
					 Startline.ExtentFailReport(methodname, "Rejected letter Event NOT generated ", null, datetimestart);
					    Startline.ExtentFailReport(methodname, "Call Validate Search Required Event NOT generated", null, datetimestart);
					    Startline.ExtentFailReport(methodname, "Decision Made Event NOT generated", null, datetimestart);
					    Startline.ExtentFailReport(methodname, "Automatically Rejected Event NOT generated", null, datetimestart);
				 }
				 
				
				
				 Common_Property.driver.findElement(By.xpath("//div[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click(); 				 
				 Thread.sleep(850);
				 
				 
				 if(Refevent1.contains(Driver.getData("Rejeceve1"))) 
                 {
					 
					 Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[3]")).click(); 				 
					 Thread.sleep(850);
					 
					 String Document=Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]")).getText().toString();			 
					 Thread.sleep(850);
				
					 if(Document.contains(Driver.getData("Docname")))
					 {
						 
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentPassReport(methodname, "Document"+ Document +" is generated and it has been validated successfully" , Document, datetimestart);
						   Thread.sleep(700);
					}
					
					 else
					 {
						  
						   
						 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						   Startline.ExtentFailReport(methodname, "Document" + Document + "is NOT generated" , Document, datetimestart);
						   Thread.sleep(700);
						 
						 
					 }
					 
					 Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[3]/tbody/tr/td[1]/a")).click(); 
					 Thread.sleep(850);  
					 
					 
					 Checkdecision.Agr_checkdecision();
						String a=Checkdecision.AgreementPDIstatus;
						
						if(a.contains(Status))
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "Checkdecision_PDI_Motorfrontend_are equal as expected"+Status, Status, datetimestart);
							Thread.sleep(700);
						}
						else
						{
							Startline.ExtentFailReport(methodname, "Checkdecision_PDI_Motorfrontend_are not equal"+ Status, Status, datetimestart);
							Thread.sleep(700);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						}
						
	}
			}
			
    		  
			
    			catch (Exception e) 

			{   
    				System.out.println("The exception was "+e);
    				System.out.println("Abnormal Termination due to "+e);
    				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
    				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
    				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
    						   	      
    		   	}
    				
    }

    }


//backoffice
	
  public static void BO_Status_check() throws IOException, InterruptedException //AXC-REGR-190
  {	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
			Common_Property.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
	 
	
	//NAVIGATION
 Thread.sleep(6000);
 Driver.getTDFiloconnection();
 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
 Thread.sleep(5000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
 Thread.sleep(5000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]")).click();
 Thread.sleep(5000);	


//MAINTAIN CUSTOMER AGREEMENT
//6 or 7
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
 Thread.sleep(3000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
 Thread.sleep(3000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
 Thread.sleep(6000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
 Thread.sleep(5000);   
 String ver =Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[2]/div[1]/div/div/div[9]/div/div/div[3]/div/div[2]/input")).getAttribute("value");
 Thread.sleep(3000);
 System.out.println(ver);

Thread.sleep(2000);

  if(ver.equalsIgnoreCase(Driver.getData("BoStatus")))
  {
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is "+Driver.getData("BoStatus");
	Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
	 
  }
	else
	{
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is not "+Driver.getData("BoStatus")+" Failed";
	Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
	}
 
  //view schedules
  Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[3]")).click();
  Thread.sleep(2000); 
  
  Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[13]")).click();
  Thread.sleep(2000);

	String insamt =Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div/div[1]/div[2]")).getText().toString();
    Thread.sleep(550);
  
	
	if(insamt.equalsIgnoreCase(installment))
	  {
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Backoffice Instalamt verified"+insamt;
		Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
		 
	  }
		else 
		{
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Backoffice Installment amt is incorrect";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
		}
	Thread.sleep(2000);
	 //view schedule close
	 Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();
	 Thread.sleep(2000);
	
	 //agreement level
	  Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[1]/div/div/div/div/div[2]")).click();
		Thread.sleep(2000);
	
	//select an agreement  
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]")).click();
		Thread.sleep(2000);
     //click ok
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
    // maintain
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[4]/div[1]")).click();
		Thread.sleep(2000);
	//additional attributes
	    Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div")).click();
		Thread.sleep(1050);
	//scrolldown	
		int i;
		for(i=0;i<=55;i++){
		
			Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div")).click();
			
		}
	// trace score
		
		 	Thread.sleep(750);
		 
		 	
		 	String Tracescore= Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[2]/div[1]/div/div[13]/div[4]")).getText().toString();
		 	Thread.sleep(750);
		 	
		 	int t = Integer.parseInt(Tracescore);
		 	int s=50;
		   
			if(t>s)
			{
				
				
				   
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				   Startline.ExtentPassReport(methodname, "Trace score of an agreement is greater than 50", Tracescore, datetimestart);
				   Thread.sleep(700);
				 
			}
			
			else
			{

				   
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				   Startline.ExtentPassReport(methodname, "Trace score of an agreement is less than 50", Tracescore, datetimestart);
				   Thread.sleep(700);
				
			}
			
		
			Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[1]")).click();
			Thread.sleep(950);
			
			Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[4]/div")).click();
			Thread.sleep(950);
			
			Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[5]/div")).click();
			Thread.sleep(950);
			
		
		
		
}
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
}
  
  public static void BO_PCPCAL_Securedtask() throws Exception, Exception  
	
	{
		
	    
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
  	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
  	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	    Date sdate = new Date();
	    String datetimestart=dateFormat.format(sdate);	
	

		try
		{
		
			Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
			 
			
			//NAVIGATION
		Thread.sleep(1000);	
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(2000);	
		Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[12]")).click();
		Thread.sleep(2000);
		Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[1]")).click();//5 or 6
		Thread.sleep(2000);
		
		for(int i=0;i<=9;i++)
		{
		Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div/div/div/div/div[1]/div[3]/div[3]/div")).click();  //7 or 6 follow for  below codes
		Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		String role=Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div[3]/div[2]")).getText().toString();
		Thread.sleep(3000);
	if(role.equalsIgnoreCase("System"))
	{
		//SYSTEM
		Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div[3]/div[1]")).click();
		Thread.sleep(2000);
		//task
		Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		
		
		for(int i=0;i<=17;i++)
		{
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[3]/div[3]/div")).click(); //11 or 12
		Thread.sleep(700);
		}
		
		String Dealer=Driver.getData("Dealercode1");
	if(Dealer.equalsIgnoreCase("DEL0058"))
	{
		String Excess=Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div[4]/div[1]")).getText().toString();
		Thread.sleep(750);
		
		if(Excess.equalsIgnoreCase("Allow Update of Excess Mileage Charge"))
		{
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div[4]")).click(); //7 or 11
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div/div[2]/div[2]")).click();
		Thread.sleep(750);
		
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div[5]")).click();
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div/div[2]/div[2]")).click();
		Thread.sleep(750);
		
		//Save
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[1]")).click();
		Thread.sleep(750);
		//mainsave
		Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[1]")).click();
		Thread.sleep(2000);
		}
		else
		{
			Startline.ExtentFailReport(methodname, "secured task excess milleage is enabled"+Excess, Excess, datetimestart);
		}
	}	
	
	else
	{
		Startline.ExtentFailReport(methodname, "secured task setup is not set correctly"+Dealer, Dealer, datetimestart);
	}
	if(Dealer.equalsIgnoreCase("DEL0933"))
	{
		String Excess=Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div[3]/div[1]")).getText().toString();
		Thread.sleep(750);
		
		if(Excess.equalsIgnoreCase("Allow Update of Excess Mileage Charge"))
		{
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div[3]")).click();
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div[4]")).click();
		Thread.sleep(750);
		
		//Save
		Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div[3]/div[1]")).click();
		Thread.sleep(750);
		//mainsave
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[1]")).click();
		Thread.sleep(2000);
		}
		else
		{
			Startline.ExtentFailReport(methodname, "secured task excess milleage is Disabled"+Excess, Excess, datetimestart);
		}
	}
	
	else
	{
		Startline.ExtentFailReport(methodname, "secured task setup is not set correctly for the dealer"+Dealer, Dealer, datetimestart);
	}
 }
	
}
		
	catch (Exception e) 	
	{  
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				   	      
   	}
		
}	


  
  public static void BO_PCPCAL_Setup() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
  {	
	
	  
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
			Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    
	 
	
			//NAVIGATION
		Thread.sleep(1000);	
		Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
		Thread.sleep(2000);	
		Common_Property.driver.findElement(By.xpath("//html/body/div[4]/div/div[11]")).click();
		Thread.sleep(2000);
		Common_Property.driver.findElement(By.xpath("//html/body/div[5]/div/div[17]")).click();  
		Thread.sleep(2000);
		Common_Property.driver.findElement(By.xpath("//html/body/div[6]/div/div[9]")).click();
		Thread.sleep(2000);
		

		//MAINTAIN PRODUCTS
		
		String Dealer=Driver.getData("Dealercode1");
	if (Dealer.contains("DEL0933"))
	{
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/div/div/div/div/div[3]/div[3]/div")).click();
		//PCP product
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div[6]")).click();
		Thread.sleep(700);
		//details
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/div[3]")).click();
		Thread.sleep(700);
		//introducer
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[9]")).click();
		Thread.sleep(700); 
		
		for(int i=0;i<=329;i++)
		{
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[3]/div[3]/div")).click();
		}
		
				
		String dealername=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[2]/div[1]")).getText().toString();
		Thread.sleep(750);
		
		if (dealername.contains("The Car People - Ashton"))
		{
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[2]/div[1]")).click();
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[4]/div")).click();
		Thread.sleep(1000);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[2]/input")).clear();
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[2]/input")).sendKeys(Driver.getData("Delballoonminval"));
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[4]/input")).clear();
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[4]/input")).sendKeys(Driver.getData("Delballoonmaxval"));
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[6]/div[2]/div")).click();
		Thread.sleep(750);
		//YES
		Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div/div[3]/div")).click();
		Thread.sleep(750);
		//OK
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[1]")).click();
		Thread.sleep(750);
		}
	//Introducer scenario	
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[3]/div[3]/div")).click();
		Thread.sleep(750);
		
		String introducername=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[6]/div[1]")).getText().toString();
		Thread.sleep(750);
		
		if (introducername.contains("The Car People Limited"))
		{
		
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[6]")).click();
		Thread.sleep(750);
		
		//detail
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[4]/div")).click();
		Thread.sleep(1000);
		
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[2]/input")).clear();
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[2]/input")).sendKeys(Driver.getData("Intballoonminval"));
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[4]/input")).clear();
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[4]/input")).sendKeys(Driver.getData("Intballoonmaxval"));
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div/div[3]/div[6]/div[2]/div")).click();
		Thread.sleep(750);
		//YES
		Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div/div[3]/div")).click();
		Thread.sleep(750);
		//OK
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[1]")).click();
		Thread.sleep(750);
		
		//close
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[1]/div[1]/div[4]/div")).click();
		Thread.sleep(750);
		
		//poup Yes
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[4]/div[1]")).click();
		Thread.sleep(750);
		
		//save
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[1]")).click();
		Thread.sleep(750);
		
		}
		
	}
	//---------- for dealer "DEL0058"
	if (Dealer.contains("DEL0058"))
	{ 
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/div/div/div/div/div[3]/div[3]/div")).click(); //possibility of xpath either 7 if fails 8
		//PCP product
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div[6]")).click(); //possibility of xpath either 7 if fails 8
		Thread.sleep(700);
		//details
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/div[3]")).click();//possibility of xpath either 7 if fails 8
		Thread.sleep(700);
		//introducer
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[9]")).click();//possibility of xpath either 8 if fails 9
		Thread.sleep(1000); 
		
		for(int i=0;i<=13;i++)
		{
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[3]/div[3]/div")).click(); //possibility of xpath either 8 if fails 9
		}
		
				
		String dealername=Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[3]/div[1]")).getText().toString(); //possibility of xpath either 8 if fails 9
		Thread.sleep(750);
		
		if (dealername.equalsIgnoreCase("Evans Halshaw Burnley"))
		{
				
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[3]")).click();
		Thread.sleep(750);
		
				
		
		Common_Property.driver.findElement(By.xpath("//html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[4]/div")).click();
		Thread.sleep(1000);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[2]/input")).clear();//possibility of xpath either 9 if fails 10
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[4]/input")).clear();
		Thread.sleep(750);
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[6]/div[2]/div")).click(); //possibility of xpath either 9 if fails 10
		Thread.sleep(750);
		//None
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div/div[1]/div/div[1]/div")).click(); //possibility of xpath either 11 if fails 10
		Thread.sleep(750);
		//OK
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();//possibility of xpath either 9 if fails 10
		Thread.sleep(750);
		}
	//Introducer scenario	
		for(int i=0;i<=260;i++)
		{
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[3]/div[3]/div")).click(); //possibility of xpath either 8 if fails 9
		}
		
		String introducername=Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[4]/div[1]")).getText().toString();
		Thread.sleep(850);
		
		if (introducername.equalsIgnoreCase("Pendragon Finance and Insurance Services"))
		{
		
		//introducer
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[3]/div[1]/div/div[4]")).click();
		Thread.sleep(750);
		
		//detail
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div/div/div[20]/div/div/div[3]/div[4]/div")).click();
		Thread.sleep(1000);
		
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[2]/input")).clear();
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[2]/input")).sendKeys(Driver.getData("Intballoonminval"));
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[4]/input")).clear();
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[4]/input")).sendKeys(Driver.getData("Intballoonmaxval"));
		Thread.sleep(750);
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[3]/div[6]/div[2]/div")).click();
		Thread.sleep(750);
		//YES
		Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div/div[1]/div/div[3]/div")).click();
		Thread.sleep(750);
		//OK
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();
		Thread.sleep(750);
		
		//close
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[1]/div[4]/div")).click();
		Thread.sleep(750);
		
		//poup Yes
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[4]/div[1]")).click();
		Thread.sleep(950);
		
		//save
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[1]")).click();
		Thread.sleep(850);
		
		}
		else 
		{
			System.out.println("introducer name doen's match");
		}
		
	}
	
	
}
catch (Exception e)  
{
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
}
  public static void BO_Addtionalatt_check() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
  {	
	
		
	  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    
	 
	
	//NAVIGATION
 Thread.sleep(1000);	
 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
 Thread.sleep(1000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
 Thread.sleep(1000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div")).click();



//MAINTAIN CUSTOMER AGREEMENT
 Thread.sleep(1000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
 Thread.sleep(1000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
 Thread.sleep(700);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
 Thread.sleep(6000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
 Thread.sleep(3000);  
 String ver =Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[2]/div[1]/div/div/div[9]/div/div/div[3]/div/div[2]/input")).getAttribute("value");
 Thread.sleep(1750); 
 System.out.println(ver);


Thread.sleep(2000);

  if(ver.equalsIgnoreCase(Driver.getData("BoStatus")))
  {
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is "+Driver.getData("BoStatus");
	Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
	 
  }
	else
	{
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is not "+Driver.getData("BoStatus")+" Failed";
	Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
	}
 
	
	 //agreement level
	  Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[1]/div/div/div/div/div[2]")).click();
		Thread.sleep(1000);
	
	//select an agreement  
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]")).click();
		Thread.sleep(950);
     //click ok 
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[1]/div")).click();
		Thread.sleep(950);
    // maintain
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[4]/div[1]")).click();
		Thread.sleep(1050);
	//additional attributes
	    Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[1]")).click();
		Thread.sleep(1050);
		
		String Dealer= Driver.getData("Dealercode1");
		
	if(Dealer.contains("DEL0933")||Dealer.contains("DEL0996")) 
	{
		
		//baloon value fixed name
			String balfixvaluename=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]")).getText().toString();
		 Thread.sleep(950);
		 
		 
		 if(balfixvaluename.contains("Balloon value fixed"))
		 {
			//baloon value /html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]
			 String balfixvalue=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[3]")).getText().toString();
			 Thread.sleep(950);
			 
			 if(balfixvalue.isEmpty())
			 {
				 Startline.ExtentPassReport(methodname, "Balloon value fixed is displayed as empty", balfixvalue, datetimestart);
			 }
			 
			 else
			 {
				 Startline.ExtentFailReport(methodname, "Balloon value fixed is not displayed as empty", balfixvalue, datetimestart);
			 }
		 }
		 else
		 {
			 Startline.ExtentFailReport(methodname, "Filed is not displayed as Balloon value fixed ", balfixvaluename, datetimestart);
		 }
		
	//scrolldown	
		int i;
		for(i=0;i<=20;i++)
		{
			
			Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div")).click();
			
		}
		
		//excess value fixed name
		 String Excessvaluefixed=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[11]/div[2]")).getText().toString();
		 Thread.sleep(950);
		 if(Excessvaluefixed.contains("Excess Mileage Charge fixed"))
		 {
			 //excess value
			 String Excessfixvalue=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[12]/div[3]")).getText().toString();
			 Thread.sleep(950);
			 
			 
			 if(Excessfixvalue.isEmpty())
			 {
				 Startline.ExtentPassReport(methodname, "Excess milleage charge fixed is displayed as empty", Excessfixvalue, datetimestart);
			 }
			 
			 else
			 {
				 Startline.ExtentFailReport(methodname, "Excess milleage charge fixed is not displayed as empty", Excessfixvalue, datetimestart);
			 }
		 }
		 else
		 {
			 Startline.ExtentFailReport(methodname, "Field is not displayed as Excess milleage charge fixed", balfixvaluename, datetimestart);
		 }
		 
		
	}	
			Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();
			Thread.sleep(750);
	  //attributeclose
			Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[4]/div")).click();
			Thread.sleep(750);
		// agrdetails close
			Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[5]/div")).click();
			Thread.sleep(750);
		
		
		
		
}
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
		
		
		
	}
  
  public static void BO_Events_check() throws IOException, InterruptedException //AXC-REGR-190
  {	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
			Common_Property.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
	 
	
	//NAVIGATION
 Thread.sleep(6000);
 Driver.getDataFiloconnection();
 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
 Thread.sleep(5000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
 Thread.sleep(5000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]")).click();
 Thread.sleep(5000);	


//MAINTAIN CUSTOMER AGREEMENT
//6 or 7
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
 Thread.sleep(3000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
 Thread.sleep(3000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
 Thread.sleep(6000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
 Thread.sleep(5000);   
 

		
		
}
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
}
  public static void BO_TieredPricingEventsCheck() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
  {	
	
		
	  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    
	 
	
	//NAVIGATION
 Thread.sleep(1000);	
 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
 Thread.sleep(1000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
 Thread.sleep(1000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div")).click();



//MAINTAIN CUSTOMER AGREEMENT
 Thread.sleep(1000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
 Thread.sleep(1000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
 Thread.sleep(700);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
 Thread.sleep(6000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
 Thread.sleep(3000);  
 String ver =Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[2]/div[1]/div/div/div[9]/div/div/div[3]/div/div[2]/input")).getAttribute("value");
 Thread.sleep(1750); 
 System.out.println(ver);
 


Thread.sleep(2000);

  if(ver.equalsIgnoreCase(Driver.getData("BoStatus")))
  {
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is "+Driver.getData("BoStatus");
	Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
	 
  }
	else
	{
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is not "+Driver.getData("BoStatus")+" Failed";
	Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
	}
 
	
	 //agreement level
	  Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[1]/div/div/div/div/div[2]")).click();
		Thread.sleep(1000);
	
	//select an agreement  
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]")).click();
		Thread.sleep(950);
     //click ok 
		Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[1]/div")).click();
		Thread.sleep(950);
    // maintain
		Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[4]/div[1]")).click();
		Thread.sleep(1050);
	//additional attributes
	    Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[1]")).click();
		Thread.sleep(1050);
		
		String Dealer= Driver.getData("Dealercode1");
		
	if(Dealer.contains("DEL0933")||Dealer.contains("DEL0996")) 
	{
		
		//baloon value fixed name
			String balfixvaluename=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]")).getText().toString();
		 Thread.sleep(950);
		 
		 
		 if(balfixvaluename.contains("Balloon value fixed"))
		 {
			//baloon value /html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]
			 String balfixvalue=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[5]/div[3]")).getText().toString();
			 Thread.sleep(950);
			 
			 if(balfixvalue.isEmpty())
			 {
				 Startline.ExtentPassReport(methodname, "Balloon value fixed is displayed as empty", balfixvalue, datetimestart);
			 }
			 
			 else
			 {
				 Startline.ExtentFailReport(methodname, "Balloon value fixed is not displayed as empty", balfixvalue, datetimestart);
			 }
		 }
		 else
		 {
			 Startline.ExtentFailReport(methodname, "Filed is not displayed as Balloon value fixed ", balfixvaluename, datetimestart);
		 }
		
	//scrolldown	
		int i;
		for(i=0;i<=20;i++)
		{
			
			Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div")).click();
			
		}
		
		//excess value fixed name
		 String Excessvaluefixed=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[11]/div[2]")).getText().toString();
		 Thread.sleep(950);
		 if(Excessvaluefixed.contains("Excess Mileage Charge fixed"))
		 {
			 //excess value
			 String Excessfixvalue=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]/div/div[12]/div[3]")).getText().toString();
			 Thread.sleep(950);
			 
			 
			 if(Excessfixvalue.isEmpty())
			 {
				 Startline.ExtentPassReport(methodname, "Excess milleage charge fixed is displayed as empty", Excessfixvalue, datetimestart);
			 }
			 
			 else
			 {
				 Startline.ExtentFailReport(methodname, "Excess milleage charge fixed is not displayed as empty", Excessfixvalue, datetimestart);
			 }
		 }
		 else
		 {
			 Startline.ExtentFailReport(methodname, "Field is not displayed as Excess milleage charge fixed", balfixvaluename, datetimestart);
		 }
		 
		
	}	
			Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();
			Thread.sleep(750);
	  //attributeclose
			Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[4]/div")).click();
			Thread.sleep(750);
		// agrdetails close
			Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[5]/div")).click();
			Thread.sleep(750);
		
		
		
		
}
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
		
		
		
	}
  public static void Bo_Startline_setup() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
  {	
	
		
	  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    
	 
	
	//NAVIGATION
	Thread.sleep(1000);	
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(1000);	

	Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[11]")).click();
	Thread.sleep(1000);
	Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[19]")).click();
	Thread.sleep(1000);

	Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div/div[5]")).click();
	Thread.sleep(1000);

	Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[1]/div/div[1]/div/div[2]/input")).sendKeys(Driver.getData("Commission"));
	Thread.sleep(1000);
	
	Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[1]/div/div[1]/div/div[3]")).click();
	Thread.sleep(1000);
	
	

    Robot robot = new Robot();
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_F11);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_F11);
    Thread.sleep(3000);
    
	Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[1]/div/div[4]/div[6]/div")).click();
	Thread.sleep(3000);
	
	
	 robot.keyPress(KeyEvent.VK_F11);
	 Thread.sleep(1000);
	 robot.keyRelease(KeyEvent.VK_F11);
	 Thread.sleep(3000);
	
	Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div/div/div/div[4]")).click();
	Thread.sleep(1000);
	
	Common_Property.driver.findElement(By.xpath("html/body/div[9]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div/div[1]/div[4]")).click();
	Thread.sleep(1000);
	
	String value=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[4]")).getText().toString();
	Thread.sleep(1000);
	
	System.out.println(value);
	
	
	if(value.contains(Driver.getData("Range1")))
	
	{
		Startline.ExtentPassReport(methodname,"Band range is displayed as expected"+value,null,datetimestart);
	}
	
	else
	{
		Startline.ExtentFailReport(methodname,"Band range is not displayed as expected"+value,null,datetimestart);
	}
	
	Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div/div[2]/div[4]")).click();
	Thread.sleep(1000);
	
	
	String value1=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[4]")).getText().toString();
	Thread.sleep(1000);
	System.out.println(value1);
	if(value1.contains(Driver.getData("Range2")))
	
	{
		Startline.ExtentPassReport(methodname,"Band range is displayed as expected"+value1,null,datetimestart);
	}
	
	else
	{
		Startline.ExtentFailReport(methodname,"Band range is not displayed as expected"+value1,null,datetimestart);
	}
	
	Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div/div[3]/div[4]")).click();
	Thread.sleep(1000);

	String value2=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[4]")).getText().toString();
	Thread.sleep(1000);
	
	if(value2.contains(Driver.getData("Range3")))
	
	{
		Startline.ExtentPassReport(methodname,"Band range is displayed as expected"+value2,null,datetimestart);
	}
	
	else
	{
		Startline.ExtentFailReport(methodname,"Band range is not displayed as expected"+value2,null,datetimestart);
	}
	Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div/div[4]/div[4]")).click();
	Thread.sleep(1000);

	String value3=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[4]")).getText().toString();
	Thread.sleep(1000);
	
	if(value3.contains(Driver.getData("Range4")))
	
	{
		Startline.ExtentPassReport(methodname,"Band range is displayed as expected"+value3,null,datetimestart);
	}
	
	else
	{
		Startline.ExtentFailReport(methodname,"Band range is not displayed as expected"+value3,null,datetimestart);
	}
	
	Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div/div[5]/div[4]")).click();
	Thread.sleep(5000);
	
	String value4=Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[4]")).getText().toString();
	Thread.sleep(2000);
	
	
	if(value4.contains(Driver.getData("Range5")))
	
	{
		Startline.ExtentPassReport(methodname,"Band range is displayed as expected"+value4,null,datetimestart);
	}
	
	else
	{
		Startline.ExtentFailReport(methodname,"Band range is not displayed as expected"+value4,null,datetimestart);
	}
	
	
	
	

	//close
	Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();
	Thread.sleep(1000);
	//close
	Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[1]")).click();
	Thread.sleep(1000);
	
	Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[4]/div")).click();
	Thread.sleep(1000);
	

}
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
	
	}
  
  public static void BO_RejStatus_check() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
  {	
	
		
	  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
			Common_Property.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
			 
			
			Thread.sleep(6000);	
			 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
			 Thread.sleep(2000);	
			 Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
			 Thread.sleep(2000);	
			 Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]")).click();
			 Thread.sleep(2000);	
			 

			//MAINTAIN CUSTOMER AGREEMENT
			//6 or 7
			 Thread.sleep(5000);	
			 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
			 Thread.sleep(2000);	
			 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
			 Thread.sleep(2000);	
			 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
			 Thread.sleep(6000);
			 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
			 Thread.sleep(5000);   
			 String ver =Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[2]/div[1]/div/div/div[9]/div/div/div[3]/div/div[2]/input")).getAttribute("value");
			 Thread.sleep(2000);
			 System.out.println(ver);
			 
			Thread.sleep(2000);

			  if(ver.equalsIgnoreCase(Driver.getData("BoStatus")))
			  {
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Backoffice Status is "+Driver.getData("BoStatus");
				Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
				 
			  }
				else
				{
				
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Backoffice Status is not "+Driver.getData("BoStatus")+" Failed";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				}
		 
		Thread.sleep(2000);

		  if(ver.equalsIgnoreCase(Driver.getData("BoStatus")))
		  {
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Backoffice Status is "+Driver.getData("BoStatus");
			Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
			 
		  }
			else
			{
			
			Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			String Desc="Backoffice Status is not "+Driver.getData("BoStatus")+" Failed";
			Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
			}
		  
	
}
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
		
		
		
	}
  
  public static void BO_Esigneventspass_check() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
  {	
	
		
	  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	 
	
		//NAVIGATION
	Thread.sleep(1000);	
	Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
	Thread.sleep(1000);	
	Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
	Thread.sleep(1000);
	Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div")).click();



	//MAINTAIN CUSTOMER AGREEMENT
 
	Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
	Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
	Thread.sleep(1000);
	Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
	Thread.sleep(6000);
	Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
	Thread.sleep(1700);    

  
  //view 
  Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[3]")).click();
  Thread.sleep(1700);
  
  //events
  Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[8]")).click();
  Thread.sleep(1700); 
  //filter
  Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[1]")).click();
  Thread.sleep(1700); 
  //activity
  Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[4]/div[1]/input")).sendKeys(Driver.getData("Userid"));
  Thread.sleep(1700); 
  
  
  Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[8]")).click();
  Thread.sleep(1700); 
  
  Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[8]")).click();
  Thread.sleep(1700); 
  
  
  

  
	
   
 }
catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
		
		
		
	}
  
  
  
  

  
  public static void BO_Balloon_verification() throws IOException, InterruptedException //AXC-REGR-190
  {	
	
		
	  
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
	Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	 
	//NAVIGATION
 Thread.sleep(6000);
 Driver.getDataFiloconnection();
 Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
 Thread.sleep(5000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]")).click();
 Thread.sleep(5000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[2]")).click();
 Thread.sleep(5000);	


//MAINTAIN CUSTOMER AGREEMENT
//6 or 7
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
 Thread.sleep(3000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
 Thread.sleep(3000);	
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
 Thread.sleep(6000);
 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/div/div/div[3]/div[2]")).click();
 Thread.sleep(5000);   
 String ver =Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/div[2]/div[1]/div/div/div[9]/div/div/div[3]/div/div[2]/input")).getAttribute("value");
 Thread.sleep(3000);
 System.out.println(ver);

Thread.sleep(2000);
	
  if(ver.equalsIgnoreCase(Driver.getData("BoStatus")))
  {
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is "+Driver.getData("BoStatus");
	Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
	 
  }
	else
	{
	
	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
	String Desc="Backoffice Status is not "+Driver.getData("BoStatus")+" Failed";
	Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
	}
  
  //view
    Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[3]")).click();
    Thread.sleep(1700); 
  //schedules
    
    Common_Property.driver.findElement(By.xpath("/html/body/div[8]/div/div[13]")).click();
    Thread.sleep(1700);

	String insamt =Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div/div[1]/div[2]")).getText().toString();
    Thread.sleep(250);
    
    
	if(insamt.equalsIgnoreCase(installment))
	  {
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Backoffice Instalamt verified"+insamt;
		Startline.ExtentPassReport(methodname,Desc,insamt,datetimestart);
		 
	  }
		else
		{
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Backoffice Installment amt is incorrect";
		Startline.ExtentFailReport(methodname,Desc,insamt,datetimestart);
		}
	
	int i;
	for(i=0;i<=30;i++){
		
		Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div[3]/div")).click();
	}
	
	
	Thread.sleep(250); 
	String balloonamt = Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div/div[6]/div[2]")).getText().toString(); 
	System.out.println("ballon amount is"+balloonamt);
	Thread.sleep(250);
	
	
	if(balloonamt.equalsIgnoreCase(Driver.getData("Baloon")))//
	  {
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Backoffice balloon amt verified : "+balloonamt;
		Startline.ExtentPassReport(methodname,Desc,balloonamt,datetimestart);
		 
	  }
		else
		{
		
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Backoffice balloon amt is incorrect";
		Startline.ExtentFailReport(methodname,Desc,balloonamt,datetimestart);
		}
	
	
	//view schedule close
		 Common_Property.driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]")).click();
		 Thread.sleep(750);
		 
		 Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[4]/div")).click();
		 Thread.sleep(750);
		 
		 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[5]/div")).click();
		 Thread.sleep(750);

		


 }catch (Exception e)  {
	
 
 System.out.println("The exception was "+e);
 System.out.println("Abnormal Termination due to "+e);
 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
 String Desc="Test Run of"+methodname+"was not completed Sucessfully";
 Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
 
}
	
}

 
public static void BoCallvalidateresponse() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
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
	 Common_Property.driver.findElement(By.xpath("//html/body/div[4]/div/div[1]/div[1]")).click();
	 Thread.sleep(750);
	 Common_Property.driver.findElement(By.xpath("//div[text()='Maintain Customer Agreements']")).click();
	 Thread.sleep(750);                          

	
	//MAINTAIN CUSTOMER AGREEMENT
	
	 Common_Property.driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).clear();
	 Thread.sleep(1000);
	 Common_Property.driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).click();
	 Thread.sleep(1000);
	 Common_Property.driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input")).sendKeys(Driver.getData("Agreement_Number"));
	 Thread.sleep(1000);
	 Common_Property.driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div")).click();
	 Thread.sleep(6000);
	 //customer details
	 Common_Property.driver.findElement(By.xpath("//html/body/div[6]/div[2]/div/div/div[2]/div/div/div[3]/div[2]")).click();
	 Thread.sleep(1900);
	 //view
	 Common_Property.driver.findElement(By.xpath("//html/body/div[7]/div[2]/div[3]")).click();
	 Thread.sleep(1700);
	 //credit ref
	 Common_Property.driver.findElement(By.xpath("//html/body/div[8]/div/div[2]")).click();
	 Thread.sleep(1700);
	 //filter 
	 Common_Property.driver.findElement(By.xpath("//div[text()='Filter']")).click();
	 Thread.sleep(1700);
	 
	//agreement number
		 Common_Property.driver.findElement(By.xpath("//html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[1]/input")).sendKeys(Driver.getData("Agreement_Number"));
		 Thread.sleep(1700);
		 
	//DDL button 
		 Common_Property.driver.findElement(By.xpath("//html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[8]/div[2]")).click();
		 Thread.sleep(1700);
		 
	//select option-Call report BSB quotation 
		 Common_Property.driver.findElement(By.xpath("//html/body/div[11]/div/div[1]/div/div[2]/div")).click();
		 Thread.sleep(1700);
		 
		//applyfilter 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Apply Filter']")).click();
		 Thread.sleep(1700);
		 
		 //Response 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Response']")).click();
		 Thread.sleep(1700);
		 
		 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		 Startline.ExtentPassReport(methodname,"CallCredit Affordability check response is generated",null,datetimestart);
		 // responseclose
		 Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[1]")).click();
		 Thread.sleep(1700);
		 
		//filter 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Filter']")).click();
		 Thread.sleep(1700);
		
		 Common_Property.driver.findElement(By.xpath("//html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[1]/input")).sendKeys(Driver.getData("Agreement_Number"));
		 Thread.sleep(1700);
		 
		//DDL button
		 Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[8]/div[2]")).click();
		 Thread.sleep(1700);
		//select option-Call reportaffortability check
		 Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div/div[4]/div")).click();
		 Thread.sleep(1700);
		
		//applyfilter 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Apply Filter']")).click();
		 Thread.sleep(1700);
		 
		 //Response 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Response']")).click();
		 Thread.sleep(1700);
		
		 //Response close
		 Common_Property.driver.findElement(By.xpath("//html/body/div[10]/div[3]/div[1]")).click();
		 Thread.sleep(1700);
		 
		 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		 Startline.ExtentPassReport(methodname,"CallCredit Affordability check response is generated",null,datetimestart);
		
		 
		 
		 //filter
		//filter 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Filter']")).click();
		 Thread.sleep(1700);
		
		 Common_Property.driver.findElement(By.xpath("//html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[1]/input")).sendKeys(Driver.getData("Agreement_Number"));
		 Thread.sleep(1700);
		 
		//DDL button
		 Common_Property.driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div[1]/div/div/div/div/div[8]/div[2]")).click();
		 Thread.sleep(1700);
		 
		 
		 for(int i=0;i<=13;i++) 
		 {
		 Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div/div[3]/div[3]/div")).click();
		 Thread.sleep(1700);
		 }
		
		 
		//select option-Dealflo identity check
		 Common_Property.driver.findElement(By.xpath("/html/body/div[11]/div/div[1]/div/div[5]/div")).click();
		 Thread.sleep(1700);
		
		 
		//applyfilter 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Apply Filter']")).click();
		 Thread.sleep(1700);
		 
		 //Response 
		 Common_Property.driver.findElement(By.xpath("//div[text()='Response']")).click();
		 Thread.sleep(1700);
		 
		 Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		 Startline.ExtentPassReport(methodname,"Dealflo VHub ID And Bank parsed response is generated",null,datetimestart);
		 
		 //Response close
		 Common_Property.driver.findElement(By.xpath("//html/body/div[10]/div[3]/div[1]")).click();
		 Thread.sleep(1700);
		 
		 //Close
		  Common_Property.driver.findElement(By.xpath("//html/body/div[9]/div[1]/div[1]/div[4]/div")).click();
		 Thread.sleep(1700);
		 
		 //close
		 Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[4]/div")).click();
		 Thread.sleep(1700);
		
		 //Close
		 Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[5]/div")).click();
		 Thread.sleep(1700);
		 
		 
		
		 
		
}
		
catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}
	
}

public static void SQLEsignEvn() throws Exception
{
// SQL Connection establish
 try 
    {	
	 	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);	
	 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
		Common_Property.st = Common_Property.SQLcon.createStatement();
		
		String Agreementno = "'" + Driver.getData("Agreement_Number") +  "'" ;
		System.out.println(Agreementno);
		String Query1 = "select AGR_SERIAL from agreements Where AGR_AGREEMENT_NUMBER="+Agreementno+" ";
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
		Common_Property.rs = Common_Property.st.executeQuery(Query1);
		Common_Property.rs.next();
			 
		String AgrSerial =  "'" + Common_Property.rs.getString("AGR_SERIAL")+ "'";
		System.out.println(AgrSerial);
			
			 
		ArrayList<String> activitys = new ArrayList<String>();
		ArrayList<String> eventtitle = new ArrayList<String>();
		ArrayList<String> eventvalue = new ArrayList<String>();
		
		//Activities ArrayList
		//activitys.add(0,"E-sig required set");
		activitys.add(0,"Additional Attribute Added");
		activitys.add(1,"E-Signature Status Changed");
		activitys.add(2,"Additional Attribute Changed");
		activitys.add(3,"E-Signature Status Changed");
		activitys.add(4,"Additional Attribute Changed");
		activitys.add(5,"E-Signature Obtained");
		activitys.add(6,"Additional Attribute Changed");
		activitys.add(7,"Agreement Status Changed");
		activitys.add(8,"E-Signature Status Changed");
		activitys.add(9,"Additional Attribute Added");
		
		//activitys.add(12,"Quality+ and PCP Exceptions");
		
		
			
		
		
		
		for(int index = 0; index <=activitys.size()-1; index ++)
		{
		String ActivityN = "'" + activitys.get(index) + "'";
		Query1= "Select A.ACT_DESCRIPTION,A.ACT_EVENT_VALUE_TITLE,B.EVE_VALUE from Activities A, Events B Where (A.Act_serial = B.Eve_activity) and B.eve_agreement = "+AgrSerial+" and A.Act_Description = " + ActivityN + "";
		Common_Property.rs1 = Common_Property.st.executeQuery(Query1);
		//Common_Property.rs1.first();
		//Common_Property.rs1.moveToCurrentRow();
		Common_Property.rs1.next();
		//	while(Common_Property.rs1.next())
			//{
				//if  (!Common_Property.rs1.wasNull())
				//{
				//	String immediatecheck1 = Common_Property.rs1.getString("ACT_DESCRIPTION") + Common_Property.rs1.getString("ACT_EVENT_VALUE_TITLE")+ Common_Property.rs1.getString("EVE_VALUE");
				//	System.out.println(immediatecheck1);
					Startline.ExtentPassReport(Common_Property.rs1.getString("ACT_DESCRIPTION") ,"Event generated sucessfully",Common_Property.rs1.getString("ACT_EVENT_VALUE_TITLE")+ ":" + Common_Property.rs1.getString("EVE_VALUE"),datetimestart);
		
		}
		Common_Property.rs2.close();
		Common_Property.rs1.close();
		Common_Property.rs.close();
		Common_Property.st.close();
		Common_Property.SQLcon.close();
		
    }
 
 	
	

	catch (Exception ex) 
	{
	    System.err.print("Exception: ");
	    System.err.println(ex.getMessage());
	}
}    		




public static void PDIAgr_Login() throws  Exception
{    	

	{ 
		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
		
		try{
			
		
		/*	Thread.sleep(1000);
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=(Driver.getData("Agreement_Number"));
			
			Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
		   //view
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
			Thread.sleep(1000);
			
			 //scroll down
			 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
			 jse.executeScript("window.scrollBy(0,6000)");
			
			//close
			Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
		
			
				Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
				Thread.sleep(700);*/
				
			
			
			/*// Switch the driver context to the alert
			Alert alertDialog = Common_Property.driver.switchTo().alert();

			// Get the alert text
			String alertText = alertDialog.getText();

			// Click the OK button on the alert.
			alertDialog.accept();
			
			*/
			
			
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
			if (pagename.contains("Financials"))
			{
				
				
				    Adminfee=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/input[1]")).getAttribute("value");
					Thread.sleep(350);
					System.out.println("admin fee is"+Adminfee);
			
					
					Balloon=Driver.getData("Baloon");			
					Thread.sleep(350);
					System.out.println(Balloon);
					
					installment=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[3]/td[2]/input")).getAttribute("Value");
					Thread.sleep(350);
					
					String Delaerdepo=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[3]/td[5]/input")).getAttribute("Value");
					Thread.sleep(350);
					
					String	Partex=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[4]/td[6]/input")).getAttribute("Value");
					 Thread.sleep(350);
					 
					 Advance=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[2]/td[2]")).getText().toString();
					 Thread.sleep(350);
					 System.out.println(Advance);
					 float Adv=Float.parseFloat(Advance);
					  String goodscost=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[1]/tbody/tr[7]/td[3]")).getText().toString();
					 Thread.sleep(350);
					 
					
					   float Delaerdepo1=Float.parseFloat(Delaerdepo);
					   float Partex1=Float.parseFloat(Partex);
					   float totalamnt=Delaerdepo1+Partex1;
					   float goodscost1=Float.parseFloat(goodscost);
					   float Advance1=goodscost1-totalamnt;
					
					
				
					   if(Advance1==Adv)
						{
							
											
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String Desc="Advance amount verified is"+Advance;		 
					        Startline.ExtentPassReport(methodname,Desc,null,datetimestart);
						}
						else
						{	 
				 		    Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				 		    String Desc="Advance amount is updated incorrectly";
				 	    	Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						}
				  
					   //continue
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				 
			}
			else
			{
				 //navigation to financial tab
			 		
					pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
					Thread.sleep(700);
									
					if(pagename.contains("Decision"))
						{
							Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[7]/a[1]")).click();
							Thread.sleep(700);
							PDIAgr_Login();
						}
				
				
			}
		
		
	}
		   
			catch (Exception e) 
			{   
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
		   	}
				
}

}

public static void PCP_CALCULATION_CP1() throws  Exception
{    	

		
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);		
		
		try{
			
			
		    
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=Driver.getData("Agreement_Number");
			
			Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
		   //view
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
			Thread.sleep(1000);
			
			 //scroll down
			 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
			 jse.executeScript("window.scrollBy(0,6000)");
			
			//close
			Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
			Thread.sleep(700);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
			
			if (pagename.contains("Financials"))
			{
				Common_Property.driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(700);
			}
			
			else
			{
				Common_Property.driver.findElement(By.linkText("Refresh")).click();
				Thread.sleep(700);
			}
			
			
			String residualvalue=Common_Property.driver.findElement(By.name("residualValue")).getAttribute("value");
			Thread.sleep(700);
			
			String dealsec=Driver.getData("Dealersecuredtask");
			String Introsec=Driver.getData("Introducersecured task");
			String Delaer=Driver.getData("Dealercode1");
			String finalinstalment=Driver.getData("Baloon");
			Float finalballoon=Float.parseFloat(finalinstalment);
			String brandname=Driver.getData("Brnd");
			//createproposal1
			//if(dealsec.equalsIgnoreCase("Yes")&&Introsec.equalsIgnoreCase("Yes")&&Delaer.equalsIgnoreCase("DEL0933")&& finalinstalment.equalsIgnoreCase("4000.00")&&brandname.equalsIgnoreCase("PCP Brand"))
			
			if(dealsec.equalsIgnoreCase("Yes")&&Introsec.equalsIgnoreCase("Yes")&&Delaer.equalsIgnoreCase("DEL0933")&&(finalballoon>=4000.00)&&brandname.equalsIgnoreCase("PCP Brand"))
			{   
				
				//Go to Securitytab
				  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
				  Thread.sleep(700);
				  
				  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
				  Thread.sleep(700);
				  if(Excessmileage.equalsIgnoreCase(Driver.getData("Recalexcessamnt")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Excessmileage charge"  +Driver.getData("Exmileagechrge")+  " is recalculated to the value"+Excessmileage, Excessmileage, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmileage charge is NOT recalculated to the value", Excessmileage, datetimestart);
				  }
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();
				  
				  Common_Property.driver.findElement(By.name("secFixValue")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String exerrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/p")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				  if (exerrormsg.contains(Driver.getData("Excesserrormsg")))
				  {
					  Startline.ExtentPassReport(methodname, "Excessmilleage charge errormsg is dispalyed as expecetd"+exerrormsg, exerrormsg, datetimestart);
				  }
				  else
				  {
					  Startline.ExtentFailReport(methodname, "Excessmilleage charge errormsg is NOT dispalyed", exerrormsg, datetimestart);
				  }
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Exmileagechrge"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("secFixValue")).click();
				  Thread.sleep(700);
				  
				 Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				 
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				 String errormsg=Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[1]/tbody/tr[2]/td")).getText().toString();
				  Thread.sleep(700);
				  
				  if(errormsg.contains(Driver.getData("Excesserrormsg1")))
				  {
					  Startline.ExtentPassReport(methodname, "Excessmilleage charge errormsg is dispalyed as expecetd"+errormsg, errormsg, datetimestart);
				  }
				  else
				  {
					  Startline.ExtentFailReport(methodname, "Excessmilleage charge errormsg is NOT dispalyed", errormsg, datetimestart);
				  }
				  //error back
				  Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("secFixValue")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(700);
				
				  String eveactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String eveprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String evesecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  String eve2activity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String eve2Primaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String eve2secondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[2]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  
			
				  
				  
				  if(eveactivtity.contains(Driver.getData("Excessevent1")) && eveprimaryvalue.contains(Driver.getData("Excessevent2")) && evesecondaryvalue.contains(Driver.getData("Excessevent3"))&& eve2activity.contains(Driver.getData("Excessevent4"))&& eve2Primaryvalue.contains(Driver.getData("Excessevent5"))&& eve2secondaryvalue.contains(Driver.getData("Excessevent6")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmileagecharge value fixed event generated" + eveprimaryvalue + "and set to "+evesecondaryvalue, evesecondaryvalue, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excess milleage event is not generated",null, datetimestart);
				  }
				  
				  //events back
				  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				  //financial page
				  
				  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
				  Thread.sleep(700);
				  double value = Double.valueOf(Balloon);
				  
				  float RSV=Float.parseFloat(residualvalue);
				  System.out.println(Driver.getData("Balloonmaxval"));
				  String minmax=Driver.getData("Balloonmaxval");
				  float maxval=Float.parseFloat(minmax);
				  float Balon=RSV*maxval;
				  String Originalballoon = Float.toString(Balon);
				  double balvalue = Math.round(Balon*100.0)/100.0;
				  
				  String value1=Double.toString(value);
				  String balvalue1=Double.toString(balvalue);

						
				 
				  if(value1.equalsIgnoreCase(balvalue1))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value"+ value1+" is same as the recalculated amount as expected"+balvalue1,value1, datetimestart);
				  }
				  
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Ballon value is not recalculated",null, datetimestart);
				  }
				  
				  //Financial //balloon
				  Common_Property.driver.findElement(By.name("balloon")).click();
				  Thread.sleep(250);
				  Common_Property.driver.findElement(By.name("balloon")).clear();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Amendbaloon"));
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				  //popup yes
				  Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[6]/div[3]/div/button[1]/span")).click();
				  Thread.sleep(250);
				  
				  String balloonerrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[1]/tbody/tr[2]/td")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				  if(balloonerrormsg.contains(Driver.getData("Balerrormsg")))
				  {
					  Startline.ExtentPassReport(methodname, "Balloon error message is dispalyed as expecetd"+balloonerrormsg, balloonerrormsg, datetimestart);
				  }
				  else
				  {
					  Startline.ExtentFailReport(methodname, "Balloon errormsg is NOT dispalyed", balloonerrormsg, datetimestart);
				  }
				 //back
				  Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.name("finFixValue")).click();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.name("balloon")).click();
				  Thread.sleep(250);
				  Common_Property.driver.findElement(By.name("balloon")).clear();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				  String finalinterrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/p")).getText().toString();
				  Thread.sleep(700);
				  
				  if (finalinterrormsg.contains(Driver.getData("Balerrormsg1")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Final instalment  errormsg is dispalyed as expecetd"+finalinterrormsg, finalinterrormsg, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Final instalment errormsg is NOT dispalyed in financial page", finalinterrormsg, datetimestart);
				  }
				  
				  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Amendbaloon"));
				  Thread.sleep(750);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				  //popup yes
				  Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[6]/div[3]/div/button[1]/span")).click();
				  Thread.sleep(250);
				  
				  //balloonevents
				  
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(700);
				
				  String Balactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[3]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String Balprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[3]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String Balsecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[3]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  if(Balactivtity.contains(Driver.getData("Balevent1")) && Balprimaryvalue.contains(Driver.getData("Balevent2")) && Balsecondaryvalue.contains(Driver.getData("Balevent3")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value fixed" + Balprimaryvalue + "and set to "+Balsecondaryvalue, Balsecondaryvalue, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Balloon event is not generated",null, datetimestart);
				  }
				  
				  //balloonevents back
				  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  //continue
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String Status=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  Startline.ExtentPassReport(methodname, "Status is displayed as"+Status, Status, datetimestart);
				  
				  String Plan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Plan is displayed as"+Plan, Plan, datetimestart);
				  
				  //Securitytab
				  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
				  Thread.sleep(700); 
				  
				  Common_Property.driver.findElement(By.name("annualMileage")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("annualMileage")).clear();
				  Common_Property.driver.findElement(By.name("annualMileage")).sendKeys(Driver.getData("Amendanualmlge"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("mileage")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("mileage")).clear();
				  Common_Property.driver.findElement(By.name("mileage")).sendKeys(Driver.getData("Amendmilge"));
				  Thread.sleep(700);
				  //search
				  Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/a")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(750);
				  
				  Common_Property.driver.findElement(By.name("numberOfPayments")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("numberOfPayments")).clear();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("numberOfPayments")).sendKeys(Driver.getData("Amendinstallment"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
				  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			
			}
			else
			{
				
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "createproposal 1 criteria is not met", null, datetimestart);
			}
			
			
			//createproposal5
			if(dealsec.equalsIgnoreCase("Yes")&&Introsec.equalsIgnoreCase("Yes")&&Delaer.equalsIgnoreCase("DEL0933")&& finalinstalment.equalsIgnoreCase("4000.00")&&brandname.equalsIgnoreCase("Quality+ Brand"))
				
			{ 
				//Go to Securitytab
				  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
				  Thread.sleep(700);
				  
				  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
				  Thread.sleep(700);
				  
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(!Excessmileage.equalsIgnoreCase(Driver.getData("Recalexcessamnt")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmileage charge"  +Driver.getData("Exmileagechrge")+  " is not recalculated for Quality+ brand as expected"+Excessmileage, Excessmileage, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmileage charge is recalculated for Quality+ brand ", null, datetimestart);
				  }
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Amendexmileagechrge"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String errormsg=Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[1]/tbody/tr[2]/td")).getText().toString();
				  Thread.sleep(700);
				  
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(errormsg.contains(Driver.getData("Excesserrormsg1")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmilleage charge errormsg is dispalyed as expecetd"+errormsg, errormsg, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmilleage charge errormsg is NOT dispalyed", errormsg, datetimestart);
				  }
				  //error back
				  Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("secFixValue")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();
				
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				  String exerrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/p")).getText().toString();
				  Thread.sleep(700);
				  
				  if (exerrormsg.contains(Driver.getData("Excesserrormsg")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmilleage charge errormsg is dispalyed as expecetd"+exerrormsg, exerrormsg, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmilleage charge errormsg is NOT dispalyed", exerrormsg, datetimestart);
				  }
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Amendexmileagechrge"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				 
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(700);
				
				  String eveactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String eveprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String evesecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  if(eveactivtity.contains(Driver.getData("Excessevent1"))&& eveprimaryvalue.contains(Driver.getData("Excessevent2"))&& evesecondaryvalue.contains(Driver.getData("Excessevent3")))
				  {
					  Startline.ExtentPassReport(methodname, "Excessmileagecharge value fixed event generated" + eveprimaryvalue + "and set to "+evesecondaryvalue, evesecondaryvalue, datetimestart);
				  }
				  else
				  {
					  Startline.ExtentFailReport(methodname, "Excess milleage event is not generated",null, datetimestart);
				  }
				  
				  //events back
				  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				  //financial page
				  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
				  Thread.sleep(700);
				  double value = Double.valueOf(Balloon);
				  
				  float RSV=Float.parseFloat(residualvalue);
				  System.out.println(Driver.getData("Balloonmaxval"));
				  String minmax=Driver.getData("Balloonmaxval");
				  float maxval=Float.parseFloat(minmax);
				  float Balon=RSV*maxval;
				  String Originalballoon = Float.toString(Balon);
				  double balvalue = Math.round(Balon*100.0)/100.0;
					System.out.println("kilobytes (Math.round) : " + balvalue);
					  String value1=Double.toString(value);
					  String balvalue1=Double.toString(balvalue);

							
				  
				  if(value1!=balvalue1)
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value"+ value1+" is not same as the recalculated amount as expected for the Quality+ brand"+ balvalue1,value1, datetimestart);
				  }
				  
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Ballon value is recalculated for Quality+ brand",null, datetimestart);
				  }
				  
				  //Financial //balloon
				  Common_Property.driver.findElement(By.name("balloon")).click();
				  Thread.sleep(250);
				  
				  String Qbalval=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
				  Thread.sleep(250);
				  
				   if(Qbalval.equalsIgnoreCase(Driver.getData("Baloon")))
				   {
					   
						  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					   Startline.ExtentPassReport(methodname, "Balloon value"+ Qbalval+" is same as the rvalue passed via PDI"+Driver.getData("Baloon"),Qbalval, datetimestart);
				   }
				   else
				   {
					   
						  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					   Startline.ExtentFailReport(methodname, "Balloon value dispalyed is not same as passed via PDI"+Qbalval,Qbalval, datetimestart);
					   
				   }
				  
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				
				  Common_Property.driver.findElement(By.name("finFixValue")).click();
				  Thread.sleep(250);
				  
				  
				  Common_Property.driver.findElement(By.name("balloon")).clear();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				  String finalinterrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/p")).getText().toString();
				  Thread.sleep(700);
				  
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if (finalinterrormsg.contains(Driver.getData("Balerrormsg1")))
				  {
					  Startline.ExtentPassReport(methodname, "Final instalment  errormsg is dispalyed as expecetd"+finalinterrormsg, finalinterrormsg, datetimestart);
				  }
				  else
				  {
					  Startline.ExtentFailReport(methodname, "Final instalment errormsg is NOT dispalyed in financial page", finalinterrormsg, datetimestart);
				  }
				  
				 
				  
				  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Baloon"));
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				  
				  //balloonevents
				  
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(700);
				
				  String Balactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String Balprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String Balsecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  if(Balactivtity.contains(Driver.getData("Balevent1"))&& Balprimaryvalue.contains(Driver.getData("Balevent2"))&& Balsecondaryvalue.contains(Driver.getData("Balevent3")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value fixed" + Balprimaryvalue + "and set to "+Balsecondaryvalue+"for Quality+ Brand ", Balsecondaryvalue, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Balloon event is not generated",null, datetimestart);
				  }
				  
				  //balloonevents back
				  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  //continue
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String Status=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  Startline.ExtentPassReport(methodname, "Status is displayed as"+Status, Status, datetimestart);
				  
				  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			
			}
			else
			{
				
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "createproposal 5 criteria is not met", null, datetimestart);
			}
			
			//createproposal2
			if(dealsec.equalsIgnoreCase("Yes")&&Introsec.equalsIgnoreCase("Yes")&&Delaer.equalsIgnoreCase("DEL0069")&& finalinstalment.equalsIgnoreCase("1500.00")&&brandname.equalsIgnoreCase("PCP Brand"))
				
			{ 
				 
				//Go to Securitytab
				  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
				  Thread.sleep(700);
				  
				  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(Excessmileage.equalsIgnoreCase(Driver.getData("Exmileagechrge")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmileage charge"  +Driver.getData("Exmileagechrge")+  " is not recalculated as expected"+Excessmileage, Excessmileage, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmileage charge is recalculated ", null, datetimestart);
				  }
				  
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				 
				  //financial page
				  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
				  Thread.sleep(700);
				  double value = Double.valueOf(Balloon);
				  
				  float RSV=Float.parseFloat(residualvalue);
				  System.out.println(Driver.getData("Balloonmaxval"));
				  String minmax=Driver.getData("Balloonmaxval");
				  float maxval=Float.parseFloat(minmax);
				  float Balon=RSV*maxval;
				  String Originalballoon = Float.toString(Balon);
				  double balvalue = Math.round(Balon*100.0)/100.0;
					System.out.println("kilobytes (Math.round) : " + balvalue);
					  String value1=Double.toString(value);
					  String balvalue1=Double.toString(balvalue);
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				  if(value1!=balvalue1)
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value"+ value1+" is not same as the recalculated amount as expected"+balvalue1 , value1, datetimestart);
				  }
				  
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Ballon value is recalculated",null, datetimestart);
				  }
				  
				
				  //continue
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
				  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
				
				
			}
			else
			{
				
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "createproposal 2 criteria is not met", null, datetimestart);
			}
			
			
			//createproposal4
			if(dealsec.equalsIgnoreCase("No")&&Introsec.equalsIgnoreCase("No")&&Delaer.equalsIgnoreCase("DEL0996")&& finalinstalment.equalsIgnoreCase("400.00")&&brandname.equalsIgnoreCase("PCP Brand"))
				
			{ 

				//Go to Securitytab
				  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
				  Thread.sleep(700);
				  
				  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(!Excessmileage.equalsIgnoreCase(Driver.getData("Recalexcessamnt")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmileage charge"+Excessmileage+" is not recalculated to the value"+Driver.getData("Recalexcessamnt"), Excessmileage, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmileage charge is NOT recalculated to the value", Excessmileage, datetimestart);
				  }
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Amendexmileagechrge"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String errormsg=Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[1]/tbody/tr[2]/td")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				  if(errormsg.contains(Driver.getData("Excesserrormsg1")))
				  {
					  Startline.ExtentPassReport(methodname, "Excessmilleage charge errormsg is dispalyed as expecetd"+errormsg, errormsg, datetimestart);
				  }
				  else
				  {
					  Startline.ExtentFailReport(methodname, "Excessmilleage charge errormsg is NOT dispalyed", errormsg, datetimestart);
				  }
				  //error back
				  Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("secFixValue")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).click();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();
				  Thread.sleep(700);
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  
				  String exerrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/p")).getText().toString();
				  Thread.sleep(700);
				  
				  if (exerrormsg.contains(Driver.getData("Excesserrormsg")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmilleage charge errormsg is dispalyed as expecetd"+exerrormsg, exerrormsg, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excessmilleage charge errormsg is NOT dispalyed", exerrormsg, datetimestart);
				  }
				  
				  
				  Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Amendexmileagechrge"));
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(700);
				
				  String eveactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String eveprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String evesecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  if(eveactivtity.contains(Driver.getData("Excessevent1"))&& eveprimaryvalue.contains(Driver.getData("Excessevent2")) && evesecondaryvalue.contains(Driver.getData("Excessevent3")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Excessmileagecharge value fixed event generated" + eveprimaryvalue + "and set to "+evesecondaryvalue, evesecondaryvalue, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Excess milleage event is not generated",null, datetimestart);
				  }
				  
				//excessevents back
				  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				//financial page
				  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
				  Thread.sleep(700);
				  double value = Double.valueOf(Balloon);
				  
				  float RSV=Float.parseFloat(residualvalue);
				  System.out.println(Driver.getData("Balloonmaxval"));
				  String minmax=Driver.getData("Balloonmaxval");
				  float maxval=Float.parseFloat(minmax);
				  float Balon=RSV*maxval;
				  String Originalballoon = Float.toString(Balon);
				  double balvalue = Math.round(Balon*100.0)/100.0;
					System.out.println("kilobytes (Math.round) : " + balvalue);
					  String value1=Double.toString(value);
					  String balvalue1=Double.toString(balvalue);
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(value1!=balvalue1)
				  {
				  
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value"+ value1+" is not same as the recalculated amount as expected"+balvalue1, value1, datetimestart);
				  }
				  
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Ballon value is recalculated",null, datetimestart);
				  }
				  
				  //Financial //balloon
				  Common_Property.driver.findElement(By.name("balloon")).click();
				  Thread.sleep(250);
				  Common_Property.driver.findElement(By.name("balloon")).clear();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Amendbaloon"));
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				 
				  String balloonerrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[1]/tbody/tr[2]/td")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(balloonerrormsg.contains(Driver.getData("Balerrormsg")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon  errormsg is dispalyed as expecetd"+balloonerrormsg, balloonerrormsg, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Balloon errormsg is NOT dispalyed", balloonerrormsg, datetimestart);
				  }
				 //errorback
				  Common_Property.driver.findElement(By.xpath("//*[@id='errorBody']/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.name("finFixValue")).click();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.name("balloon")).click();
				  Thread.sleep(250);
				  Common_Property.driver.findElement(By.name("balloon")).clear();
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				  
				  String finalinterrormsg=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/p")).getText().toString();
				  Thread.sleep(700);
				  
				  if (finalinterrormsg.contains(Driver.getData("Balerrormsg1")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Final instalment  errormsg is dispalyed as expecetd"+finalinterrormsg, finalinterrormsg, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Final instalment errormsg is NOT dispalyed in financial page", finalinterrormsg, datetimestart);
				  }
				  
				  
				  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Amendbaloon"));
				  Thread.sleep(250);
				  
				  Common_Property.driver.findElement(By.linkText("Calculate")).click();
				  Thread.sleep(250);
				 
				  
				  //balloonevents
				  
				  Common_Property.driver.findElement(By.linkText("events")).click();
				  Thread.sleep(700);
			
				  String Balactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[3]")).getText().toString();
				  Thread.sleep(700);
				  
				  String Balprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[5]")).getText().toString();
				  Thread.sleep(700);
				  
				  String Balsecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[4]/td[6]")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  if(Balactivtity.contains(Driver.getData("Balevent1"))&& Balprimaryvalue.contains(Driver.getData("Balevent2"))&& Balsecondaryvalue.contains(Driver.getData("Balevent3")))
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentPassReport(methodname, "Balloon value fixed" + Balprimaryvalue + "and set to "+Balsecondaryvalue, Balsecondaryvalue, datetimestart);
				  }
				  else
				  {
					  
					  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
					  Startline.ExtentFailReport(methodname, "Baloon event is not generated",null, datetimestart);
				  }
				  
				  //balloonevents back
				  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
				  Thread.sleep(700);
				  
				  //continue
				  Common_Property.driver.findElement(By.linkText("Continue")).click();
				  Thread.sleep(700);
				  
				  String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
				  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
				  Thread.sleep(700);
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  
				  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			}
			else
			{
				
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				Startline.ExtentPassReport(methodname, "createproposal 4 criteria is not met", null, datetimestart);
			}
			
			
			
	}
		   
			catch (Exception e) 
			{   
				System.out.println("The exception was "+e);
				System.out.println("Abnormal Termination due to "+e);
				Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				String Desc="Test Run of"+methodname+"was not completed Sucessfully";
				Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
						   	      
		   	}
				
 }

public static void PCP_UpdateV2_CP1() throws Exception, Exception  

{ 
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
    Date sdate = new Date();
    String datetimestart=dateFormat.format(sdate);	


	try
	{
	
		Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		agreementno=Driver.getData("Agreement_Number");
		
		  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
		
		Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
		Thread.sleep(700);
	   //view
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
		Thread.sleep(1000);
		
		 //scroll down
		 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
		 jse.executeScript("window.scrollBy(0,6000)");
		
		//close
		Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
		Thread.sleep(700);
		
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(700);
		
		pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
		Thread.sleep(700);
		
		
		if (pagename.contains("Financials"))
		{
			Common_Property.driver.findElement(By.linkText("Continue")).click();
			Thread.sleep(700);
		}
		
		else
		{
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			Thread.sleep(700);
		}
		
		
		String residualvalue=Common_Property.driver.findElement(By.name("residualValue")).getAttribute("value");
		Thread.sleep(700);
		
		String dealsec=Driver.getData("Dealersecuredtask");
		String Introsec=Driver.getData("Introducersecured task");
		String Delaer=Driver.getData("Dealercode1");
		String finalinstalment=Driver.getData("Baloon");
		String brandname=Driver.getData("Brnd");
		//Updateproposal1
		if(dealsec.equalsIgnoreCase("Yes")&&Introsec.equalsIgnoreCase("Yes")&&Delaer.equalsIgnoreCase("DEL0933")&& finalinstalment.equalsIgnoreCase("4000.00")&&brandname.equalsIgnoreCase("PCP Brand"))
		
		{   
			
			//Go to Securitytab
			  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
			  Thread.sleep(700);
			  
			  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
			  Thread.sleep(700);
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  if(Excessmileage.equalsIgnoreCase(Driver.getData("Recalexcessamnt")))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Excessmileage charge"  +Driver.getData("Exmileagechrge")+  " is recalculated to the value"+Excessmileage, Excessmileage, datetimestart);
			  }
			  else
			  {	
				  
			  	Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Excessmileage charge is NOT recalculated to the value", Excessmileage, datetimestart);
			  }
			  
			  Common_Property.driver.findElement(By.name("excessMileageCharge")).click();
			  Thread.sleep(700);
			  Common_Property.driver.findElement(By.name("excessMileageCharge")).clear();
			  
			  Common_Property.driver.findElement(By.name("secFixValue")).click();
			  Thread.sleep(700);
			  
			  Common_Property.driver.findElement(By.name("excessMileageCharge")).sendKeys(Driver.getData("Exmileagechrge"));
			  Thread.sleep(700);
			  
			  Common_Property.driver.findElement(By.linkText("Continue")).click();
			  Thread.sleep(700);
			  
			   //financial page
			  
			  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
			  Thread.sleep(700);
			  double value = Double.valueOf(Balloon);
			  
			  float RSV=Float.parseFloat(residualvalue);
			  System.out.println(Driver.getData("Balloonmaxval"));
			  String minmax=Driver.getData("Balloonmaxval");
			  float maxval=Float.parseFloat(minmax);
			  float Balon=RSV*maxval;
			  String Originalballoon = Float.toString(Balon);
			  double balvalue = Math.round(Balon*100.0)/100.0;
			  
			  String value1=Double.toString(value);
			  String balvalue1=Double.toString(balvalue);

			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);	
			 
			  if(value1.equalsIgnoreCase(balvalue1))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Balloon value"+ value1+" is same as the recalculated amount as expected"+balvalue1,value1, datetimestart);
			  }
			  
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Ballon value is not recalculated",null, datetimestart);
			  }
			  
			  //Financial //balloon
			  Common_Property.driver.findElement(By.name("balloon")).click();
			  Thread.sleep(250);
			  Common_Property.driver.findElement(By.name("balloon")).clear();
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Amendbaloon"));
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.name("finFixValue")).click();
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.linkText("Calculate")).click();
			  Thread.sleep(250);
			  
			  //popup yes
			  Common_Property.driver.findElement(By.xpath("//*[@id='sitebody']/div[6]/div[3]/div/button[1]/span")).click();
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.linkText("Calculate")).click();
			  Thread.sleep(250);
			  
			 
			  Common_Property.driver.findElement(By.linkText("Continue")).click();
			  Thread.sleep(250);
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  
			  String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			  
			  //Events
			  Common_Property.driver.findElement(By.linkText("events")).click();
			  Thread.sleep(700);
			  
			
			  
			  String Balactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[6]/td[3]")).getText().toString();
			  Thread.sleep(700);
			
			  String Balprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[6]/td[5]")).getText().toString();
			  Thread.sleep(700);
			  
			  String Balsecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[6]/td[6]")).getText().toString();
			  Thread.sleep(700);
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  
			  if(Balactivtity.contains(Driver.getData("Balevent1"))&& Balprimaryvalue.contains(Driver.getData("Balevent2"))&& Balsecondaryvalue.contains(Driver.getData("Balevent3")))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Balloon value fixed" + Balprimaryvalue + "and set to "+Balsecondaryvalue, Balsecondaryvalue, datetimestart);
			  }
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Baloon event is not generated",null, datetimestart);
			  }
		
			  String eveactivtity=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[11]/td[3]")).getText().toString();
			  Thread.sleep(700);
			  
			  String eveprimaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[11]/td[5]")).getText().toString();
			  Thread.sleep(700);
			  
			  String evesecondaryvalue=Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/table[1]/tbody/tr[11]/td[6]")).getText().toString();
			  Thread.sleep(700);
			  
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  if(eveactivtity.contains(Driver.getData("Excessevent1")) && eveprimaryvalue.contains(Driver.getData("Excessevent2"))&& evesecondaryvalue.contains(Driver.getData("Excessevent3")))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Excessmileagecharge value fixed event generated" + eveprimaryvalue + "and set to "+evesecondaryvalue, evesecondaryvalue, datetimestart);
			  }
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Excess milleage event is not generated",null, datetimestart);
			  }
			  //events back
			  Common_Property.driver.findElement(By.xpath("//*[@id='eventsBody']/form/table[2]/tbody/tr/td[1]/div/a")).click();
			  Thread.sleep(700);
			  
		}
		
		else
		{
			
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentPassReport(methodname, "Updateproposal 1 criteria is not met", null, datetimestart);
		}
		
	
	}
	
	catch (Exception e) 	
	{  
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				   	      
   	}
}	

	

public static void PCP_UpdateV2_CP4validation1() throws Exception, Exception  

{	
	
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
    Date sdate = new Date();
    String datetimestart=dateFormat.format(sdate);	


	try
	{
	
		Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		agreementno=Driver.getData("Agreement_Number");
		
		
		  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
		
		Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
		Thread.sleep(700);
	   //view
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
		Thread.sleep(1000);
		
		 //scroll down
		 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
		 jse.executeScript("window.scrollBy(0,6000)");
		
		//close
		Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
		Thread.sleep(700);
		
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(700);
		
		pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
		Thread.sleep(700);
		
		
		if (pagename.contains("Financials"))
		{
			Common_Property.driver.findElement(By.linkText("Continue")).click();
			Thread.sleep(700);
		}
		
		else
		{
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			Thread.sleep(700);
		}
		
		
		String residualvalue=Common_Property.driver.findElement(By.name("residualValue")).getAttribute("value");
		Thread.sleep(700);
		
		String dealsec=Driver.getData("Dealersecuredtask");
		String Introsec=Driver.getData("Introducersecured task");
		String Delaer=Driver.getData("Dealercode1");
		String finalinstalment=Driver.getData("Baloon");
		String brandname=Driver.getData("Brnd");
		//Updateproposal3
		if(dealsec.equalsIgnoreCase("No")&&Introsec.equalsIgnoreCase("No")&&Delaer.equalsIgnoreCase("DEL0996")&& finalinstalment.equalsIgnoreCase("400.00")&&brandname.equalsIgnoreCase("PCP Brand"))
			
		
		{   
			
			//Go to Securitytab
			  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
			  Thread.sleep(700);
			  
			  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
			  Thread.sleep(700);
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  if(Excessmileage.equalsIgnoreCase(Driver.getData("Uexcessmileage")))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Excess mileage charge field updated to the value as passed via PDI"+Excessmileage, Excessmileage, datetimestart);
			  }
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Excess mileage charge field is recalculated and not as the vlaue passed via PDI", Excessmileage, datetimestart);
			  }
			  
			 
			  Common_Property.driver.findElement(By.linkText("Continue")).click();
			  Thread.sleep(700);
			   //financial page
		  
			  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
			  Thread.sleep(700);
			  
			  if(Balloon.equalsIgnoreCase(Driver.getData("Uballoon")))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Balloon field updated to the value as passed via PDI"+Balloon,Balloon, datetimestart);
			  }
			  
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Ballon value is recalculated and not as passed via PDI",Balloon, datetimestart);
			  }
			  
			  //Financial //balloon
			  Common_Property.driver.findElement(By.name("balloon")).click();
			  Thread.sleep(250);
			  Common_Property.driver.findElement(By.name("balloon")).clear();
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.name("balloon")).sendKeys(Driver.getData("Uamendbaloon"));
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.name("finFixValue")).click();
			  Thread.sleep(250);
			  
			  Common_Property.driver.findElement(By.linkText("Calculate")).click();
			  Thread.sleep(250);
			  
	
			  Common_Property.driver.findElement(By.linkText("Continue")).click();
			  Thread.sleep(250);
			  
			  String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  
			  
			  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			  
			
		}
		
		else
		{
			 
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			Startline.ExtentPassReport(methodname, "Updateproposal 3 criteria is not met", null, datetimestart);
		}
		
	
	}
	
	catch (Exception e) 	
	{  
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				   	      
   	}
}	

public static void PCP_UpdateV2_CP4validation2() throws Exception, Exception  

{
	
	System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
    Date sdate = new Date();
    String datetimestart=dateFormat.format(sdate);	


	try
	{
	
		Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
		Thread.sleep(700);
		agreementno=Driver.getData("Agreement_Number");
		
		Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
		
		Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
		Thread.sleep(700);
	   //view
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
		Thread.sleep(1000);
		
		 //scroll down
		 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
		 jse.executeScript("window.scrollBy(0,6000)");
		
		//close
		Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
		Thread.sleep(700);
		
		Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(700);
		
		pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
		Thread.sleep(700);
		
		
		if (pagename.contains("Financials"))
		{
			Common_Property.driver.findElement(By.linkText("Continue")).click();
			Thread.sleep(700);
		}
		
		else
		{
			Common_Property.driver.findElement(By.linkText("Refresh")).click();
			Thread.sleep(700);
		}
		
		
	
		//Updateproposal2//second update validation

		//Go to Securitytab
		  Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[6]/a[1]")).click();
		  Thread.sleep(700);
		  
		
		  String mileage=Common_Property.driver.findElement(By.name("mileage")).getAttribute("value");
		  Thread.sleep(700);
		  
		  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		  
		  if (mileage.equalsIgnoreCase(Driver.getData("Upadatemileage")))
		  {
			 
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  Startline.ExtentPassReport(methodname, "Mileage is updated to the value as passed via PDI and the value is"+mileage, mileage, datetimestart);
		  }
		  else
		  {
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  Startline.ExtentFailReport(methodname, "Mileage is not updated", mileage, datetimestart);
			  
		  }
			  
			 
		  String Excessmileage=Common_Property.driver.findElement(By.name("excessMileageCharge")).getAttribute("value");
		  Thread.sleep(700);
		  
			  if(Excessmileage.equalsIgnoreCase(Driver.getData("Uexcessmileage")))
			  {
				  
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Updated (null via pdi)excess mileage charge field is remain set to the previous value"+Excessmileage, Excessmileage, datetimestart);
			  }
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Updated excess mileage charge field is recalculated", Excessmileage, datetimestart);
			  }
			  
			 
			  Common_Property.driver.findElement(By.linkText("Continue")).click();
			  Thread.sleep(700);
			 
			 
			 
			   //financial page
			  String Balloon=Common_Property.driver.findElement(By.name("balloon")).getAttribute("value");
			  Thread.sleep(700);
			 
			  if(Balloon.equalsIgnoreCase(Driver.getData("Uamendbaloon")))
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentPassReport(methodname, "Updated null value for Balloon field passed via PDI is remain set to the previous value "+Balloon,Balloon, datetimestart);
			  }
			  
			  else
			  {
				  
				  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
				  Startline.ExtentFailReport(methodname, "Updated null value for Balloon field passed via PDI is not equal to previous value"+Balloon,Balloon, datetimestart);
			  }
			  
			  Common_Property.driver.findElement(By.linkText("Continue")).click();
			  Thread.sleep(250);
			  
			  String FinalStatus=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  Startline.ExtentPassReport(methodname, "Status is displayed as"+FinalStatus, FinalStatus, datetimestart);
			  String FinalPlan=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[2]/td[2]")).getText().toString();
			  Thread.sleep(700);
			  
			  Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
			  Startline.ExtentPassReport(methodname, "Plan is displayed as"+FinalPlan, FinalPlan, datetimestart);
			  
			  
			
	}
	
	catch (Exception e) 	
	{  
		
		System.out.println("The exception was "+e);
		System.out.println("Abnormal Termination due to "+e);
		Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
		String Desc="Test Run of"+methodname+"was not completed Sucessfully";
		Startline.ExtentFailReport(methodname,Desc,null,datetimestart);
				   	      
   	}
}	
   


public static void BO_TieredPricing_Batchrun() throws IOException, InterruptedException //AXC-REGR-190
{	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	
			Driver.getDataFiloconnection();
			Common_Property.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  
	 
	
			//NAVIGATION
			Thread.sleep(4000);	
			Common_Property.driver.findElement(By.xpath("//div[text()='Open']")).click();
				Thread.sleep(3000);
				//Batches
				Common_Property.driver.findElement(By.xpath("/html/body/div[4]/div/div[4]")).click();
				Thread.sleep(2000);	
				//Display job queues
				Common_Property.driver.findElement(By.xpath("/html/body/div[5]/div/div[1]")).click();
				Thread.sleep(2000);	


				//To enter the batch data's
				//6 or 7
				//submit
				Thread.sleep(3000);	
				Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div/div/div[1]/div[4]/div[1]")).click();
				Thread.sleep(2000);	
				//Job
				Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div/div/div/div[2]/div[1]/input")).sendKeys(Driver.getData("TP_Batchname"));
				Thread.sleep(2000);	
				
				//Click now
				Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div/div/div/div[6]/div[2]")).click();
				Thread.sleep(2000);

				//Click Save
				Common_Property.driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[1]")).click();
				Thread.sleep(3000);

				//Automatic refresh click
				Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div/div/div[4]/div[2]/div[1]")).click();
				Thread.sleep(2000);
				//to wait for the batch run completion
				Thread.sleep(100000);
				
				//Click Close
				Common_Property.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[1]")).click();
				Thread.sleep(2000);
				 
				Common_Property.driver.close();
				
}
catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}
	
}


public static void SMF_Tieredpricing() throws IOException, InterruptedException //AXC-REGR-190
, FilloException
{	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
			
			Thread.sleep(1000);
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
			
	
			if (pagename.contains("Financials"))
			{
				
				
				String Createdtype=Driver.getData("Createdtype");
				String a1=Driver.getData("Createrate");
				
				
				
				//Quality+ rates
				String a=TIP_MIN_RATE;
				String C=TIP_MAX_RATE;
				String D=TIP_DEFAULT_RATE;
				String D1=Driver.getData("Flat_Minrate");
				String E1=Driver.getData("Flat_Maxrate");
				String F1=Driver.getData("Yield_Minrate");
				String G1=Driver.getData("Yield_Maxrate");
				Brandname=TIP_PRODUCT_NAME;
				
				
				Float Createrate=Float.parseFloat(a1);//created rate
				Float TPminrate=Float.parseFloat(a); //Tp min rate float
				Float TIP_MAX_RATE=Float.parseFloat(C); //Tp max rate float
				Float Defaultrate=Float.parseFloat(D);
				Float Flatminrate=Float.parseFloat(D1);
				Float Flatmaxrate=Float.parseFloat(E1);
				Float Yieldminrate=Float.parseFloat(F1);
				Float Yieldmaxrate=Float.parseFloat(G1);
			
				
				
				Thread.sleep(1000);
				//Calculate
				Common_Property.driver.findElement(By.linkText("Calculate")).click();
				Thread.sleep(700);
				
				
				//Continue
				Common_Property.driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(20000);
			
		       //Refresh
				
				WebElement element=Common_Property.driver.findElement(By.linkText("Refresh"));
				JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver; 
				jse.executeScript("arguments[0].click();", element);

				
			
				if(Createdtype.contains("APR"))
				{	
					if((Createrate<TPminrate||Createrate>TIP_MAX_RATE))
					{
						
						String DecisionAPR1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
						 System.out.println(DecisionAPR1);
						 String APR1=DecisionAPR1.substring(17, 22);//18 ,22 or 17,22
						 Float DecisionAPR=Float.parseFloat(APR1);
						 
						if(DecisionAPR.equals(Defaultrate))
						{
							
							String APRRATE2=Float.toString(DecisionAPR);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "APR rate is recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
						}
						else
						{
							String APRRATE2=Float.toString(DecisionAPR);
							
							Startline.ExtentFailReport(methodname, "APR rate is Not recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
						}
					
					}
					
					else if((Createrate>=TPminrate&&Createrate<=TIP_MAX_RATE))
					{
						
						
						String DecisionAPR1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
						 System.out.println(DecisionAPR1);
						 String APR1=DecisionAPR1.substring(17, 21);//18 ,22
						 Float DecisionAPR=Float.parseFloat(APR1);
						 
						if(Createrate.equals(DecisionAPR))
							
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentFailReport(methodname, "APR rate Not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
					}
					
				}
				else if (Createdtype.contains("Flat")) 
				{
					
					if((Createrate>=Flatminrate&&Createrate<=Flatmaxrate))
					{
						
						String DecisionAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
						 System.out.println(DecisionAPR2);
						 String APR3=DecisionAPR2.substring(17, 22);//18 ,22
						 Float DecisionAPR3=Float.parseFloat(APR3);	
						 
						 
						//navigate to Financial
				    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				    	 Thread.sleep(700);
								
							String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
							System.out.println(AERAPR2);
							String APR2=AERAPR2.substring(8, 12);
							Float Createrate1=Float.parseFloat(APR2);
						
							//navigate to Decision
					    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
					    	 Thread.sleep(700);
					    	 
							
						if(Createrate1.equals(DecisionAPR3))
						{
						String APRRATE2=Float.toString(DecisionAPR3);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR (Flat) rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String APRRATE2=Float.toString(DecisionAPR3);
							Startline.ExtentFailReport(methodname, "APR (Flat) rate is not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						
					}
					else if((Createrate<Flatminrate||Createrate>Flatmaxrate))
					{
						String DecisionAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
						 System.out.println(DecisionAPR2);
						 String APR3=DecisionAPR2.substring(17, 22);//18 ,22
						 Float DecisionAPR3=Float.parseFloat(APR3);
						
						if(DecisionAPR3.equals(Defaultrate))
						{
						String APRRATE2=Float.toString(DecisionAPR3);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR(Flat) rate calculated to the Tierepricing Default rate as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "APR(Flat) rate Not calculated to the Tierepricing Default rate", null, datetimestart);
						}
					}
					
						
				
				}
				
				else if (Createdtype.contains("Yield")) 
				{
					
					if((Createrate>=Yieldminrate&&Createrate<=Yieldmaxrate))
					{
						
						String DecisionAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
						 System.out.println(DecisionAPR2);
						 String APR3=DecisionAPR2.substring(17, 21);//18 ,22
						 Float DecisionAPR3=Float.parseFloat(APR3);
						 
						 
						//navigate to Financial
				    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				    	 Thread.sleep(700);
								
							String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
							System.out.println(AERAPR2);
							String APR2=AERAPR2.substring(8, 12);
							Float Createrate1=Float.parseFloat(APR2);
						
						//navigate to Decision
					    Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
					    Thread.sleep(700);
					
						if(Createrate1.equals(DecisionAPR3))
						{
						String APRRATE2=Float.toString(DecisionAPR3);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR (Yield) rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String APRRATE2=Float.toString(DecisionAPR3);
							Startline.ExtentFailReport(methodname, "APR (Yield) rate is not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
					}
					else if((Createrate<Yieldminrate||Createrate>Yieldmaxrate))
					{
						
						String DecisionAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
						 System.out.println(DecisionAPR2);
						 String APR3=DecisionAPR2.substring(17, 21);//18 ,22
						 Float DecisionAPR3=Float.parseFloat(APR3);
						if(DecisionAPR3.equals(Defaultrate))
						{
						String APRRATE2=Float.toString(DecisionAPR3);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR(Yield) rate calculated to the Tierepricing Default rate as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String APRRATE2=Float.toString(DecisionAPR3);
							Startline.ExtentFailReport(methodname, "APR(Yield) rate Not calculated to the Tierepricing Default rate", APRRATE2, datetimestart);
						}
					}
				
				}
				
			}
					
			else
			{ //navigation to financial tab
						 		
				pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
				Thread.sleep(700);
								
				if(pagename.contains("Decision"))
					{
						Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[7]/a[1]")).click();
						Thread.sleep(700);
						SMF_Tieredpricing();
					}
			}
	
		
		}


catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}
	
}

public static void SMF_TieredpricingUpdate() throws IOException, InterruptedException //AXC-REGR-190
{	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	

		 pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
		 Thread.sleep(700);
		 if (pagename.contains("Financials"))
			{
				
				
				
				String Uratetype=Driver.getData("Uratetype");
			
								
				
				//Quality+ rates
				String a=TIP_MIN_RATE;
				String C=TIP_MAX_RATE;
				String D=TIP_DEFAULT_RATE;
	
			
				
				String D1=Driver.getData("Flat_Minrate");
				String E1=Driver.getData("Flat_Maxrate");
				String F1=Driver.getData("Yield_Minrate");
				String G1=Driver.getData("Yield_Maxrate");
				Float TPminrate=Float.parseFloat(a); //Tp min rate float
				Float TIP_MAX_RATE=Float.parseFloat(C); //Tp max rate float
				Float Defaultrate=Float.parseFloat(D);
				Float Flatminrate=Float.parseFloat(D1);
				Float Flatmaxrate=Float.parseFloat(E1);
				Float Yieldminrate=Float.parseFloat(F1);
				Float Yieldmaxrate=Float.parseFloat(G1);
				
			
				//Update
				String b1=Driver.getData("UProposalrate");
				Float UProposalrate=Float.parseFloat(b1);
				
				Thread.sleep(1000);
				//Calculate
				Common_Property.driver.findElement(By.linkText("Calculate")).click();
				Thread.sleep(700);
				
				
				//Continue
				Common_Property.driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(700);
			
		        //Refresh
				Common_Property.driver.findElement(By.linkText("Refresh")).click();
				Thread.sleep(700);
				

				String DecisionAPR1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
				 System.out.println(DecisionAPR1);
				 String APR1=DecisionAPR1.substring(17, 21);//18 ,22
				 Float DecisionAPR=Float.parseFloat(APR1);
			
				 
				if(Uratetype.contains("APR"))
				{	
					if((UProposalrate<TPminrate||UProposalrate>TIP_MAX_RATE))
					{
						if(DecisionAPR.equals(Defaultrate))
						{
							
							String APRRATE2=Float.toString(DecisionAPR);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "APR rate is recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
						}
						else
						{
							String APRRATE2=Float.toString(DecisionAPR);
							
							Startline.ExtentFailReport(methodname, "APR rate is Not recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
						}
					
					}
					
					else if((UProposalrate>=TPminrate&&UProposalrate<=TIP_MAX_RATE))
					{
						
						if(UProposalrate.equals(DecisionAPR))
							
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentFailReport(methodname, "APR rate Not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
					}
					
				}
				else if(Uratetype.contains("Flat")) 
				{
					
					if((UProposalrate>=Flatminrate&&UProposalrate<=Flatmaxrate))
					{
						
						//navigate to Financial
				    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				    	 Thread.sleep(700);
								
							String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
							System.out.println(AERAPR2);
							String APR2=AERAPR2.substring(8, 12);
							Float UProposalrate1=Float.parseFloat(APR2);
						
							//navigate to Decision
					    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
					    	 Thread.sleep(700);
					
						if(UProposalrate1.equals(DecisionAPR))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR (Flat) rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "APR (Flat) rate is not calculated within the Tierepricing Min max rates as expected", null, datetimestart);
						}
				}
					else if((UProposalrate<Flatminrate||UProposalrate>Flatmaxrate))
					{
						if(DecisionAPR.equals(Defaultrate))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR(Flat) rate calculated to the Tierepricing Default rate as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							String APRRATE2=Float.toString(DecisionAPR);
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "APR(Flat) rate Not calculated to the Tierepricing Default rate", APRRATE2, datetimestart);
						}
					}
					
						
				
				}
				
				else if (Uratetype.contains("Yield")) 
				{
					
					if((UProposalrate>=Yieldminrate&&UProposalrate<=Yieldmaxrate))
					{
						//navigate to Financial
				    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				    	 Thread.sleep(700);
								
							String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
							System.out.println(AERAPR2);
							String APR2=AERAPR2.substring(8, 12);
							Float UProposalrate1=Float.parseFloat(APR2);
						
							//navigate to Decision
					    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
					    	 Thread.sleep(700);
					
						if(UProposalrate1.equals(DecisionAPR))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR (Yield) rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							String APRRATE2=Float.toString(DecisionAPR);
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "APR (Yield) rate is not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
					}
					else if((UProposalrate<Yieldminrate||UProposalrate>Yieldmaxrate))
					{
						if(DecisionAPR.equals(Defaultrate))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR(Yield) rate calculated to the Tierepricing Default rate as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "APR(Yield) rate Not calculated to the Tierepricing Default rate", null, datetimestart);
						}
					}
				
				}
				
			}			else
						{
				

				 pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
				 Thread.sleep(700);
					
				
				 	if(pagename.contains("Decision"))
				 	{
				 		Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[7]/a[1]")).click();
				 		Thread.sleep(700);
				 		SMF_TieredpricingUpdate();
				 	}
						}		
		
			
		
		}
catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}

		
}
public static void SMF_TP_Finishline() throws IOException, InterruptedException //AXC-REGR-190
{	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	

			
		
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
		  
					String Urate=Driver.getData("Uproposalrate");
				
					String E=FTIP_DEFAULT_RATE;
					String F=FTIP_MIN_RATE;
					String G=FTIP_MAX_RATE;
					
					//Finishline Tiered pricing rates
					Float Finishlinedefaultrate=Float.parseFloat(E);
					Float Finishlineminrate=Float.parseFloat(F);
					Float Finishlinemaxrate=Float.parseFloat(G);
				
					
					
			        Float Finishlineupdaterate=Float.parseFloat(Urate);
			        
					Common_Property.driver.findElement(By.linkText("Refresh")).click(); 
					Thread.sleep(950);
					
					String DecisionAPR1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
					 System.out.println(DecisionAPR1);
					 String APR1=DecisionAPR1.substring(17, 22);//18 ,22
					 System.out.println(APR1);
					 Float DeciAPR=Float.parseFloat(APR1);
					 System.out.println(DeciAPR);
					 
					 //finihsline cretaerate
					   Float Finishlinecreaterate=DeciAPR;
					   
					   
					Select select = new Select (Common_Property.driver.findElement(By.name("changeBrandID")));
			    	select.selectByValue("102724");
			    	Thread.sleep(1000);
			    	
			    	//Financial
			    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
			    	 Thread.sleep(700);
							
						String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
						System.out.println(AERAPR2);
						String APR2=AERAPR2.substring(8, 12);
						System.out.println(APR2);
						Float DecisionAPR=Float.parseFloat(APR2);
						System.out.println(DecisionAPR);
					
							
							if((Finishlinecreaterate<Finishlineminrate||Finishlinecreaterate>Finishlinemaxrate)||(Finishlineupdaterate<Finishlineminrate||Finishlineupdaterate>Finishlinemaxrate))
							{
								if(DecisionAPR.equals(Finishlinedefaultrate))
								{
									
									String APRRATE2=Float.toString(DecisionAPR);
									
									Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
									Startline.ExtentPassReport(methodname, "APR rate is recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
								}
								else
								{
									String APRRATE2=Float.toString(DecisionAPR);
									
									Startline.ExtentFailReport(methodname, "APR rate is Not recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
								}
							
							}
							
						
						else if((DecisionAPR>=Finishlineminrate&&DecisionAPR<=Finishlinemaxrate)||(Finishlineupdaterate>=Finishlineminrate&&Finishlineupdaterate<=Finishlinemaxrate))
						{
								
								if(DecisionAPR.equals(Finishlinecreaterate))
									
								{
								String APRRATE2=Float.toString(DecisionAPR);
								
								Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
								Startline.ExtentPassReport(methodname, "APR rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
								}
								
								else
								{
								String APRRATE2=Float.toString(DecisionAPR);
								
								Startline.ExtentFailReport(methodname, "APR rate Not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
								}
						}
				
					
					
			else
			{
				Common_Property.driver.findElement(By.linkText("Refresh")).click();
				String rate=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
				String Actualrate=	rate.substring(23, 26);
				Startline.ExtentPassReport(methodname, "APR rate in decision page is displayed as"+Actualrate, Actualrate, datetimestart);
			}
		



		}

catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}
	
}

public static void TieredpricingSQL() throws Exception

{
	
	 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	 Date sdate = new Date();
	 String datetimestart=dateFormat.format(sdate);	

 try 
    {	
	 
	 	Driver.getDataFiloconnection();
	 	String Brandname1=Driver.getData("TIP_PRODUCT_NAME");
		String Brandname2=Driver.getData("TIP_PRODUCT_NAME1");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
	
				
		if(Brandname1.contains("Quality+"))
		{
			
		String Introducer="'" + Driver.getData("Introducercode") + "'" ;
		String Lowerlimit="'" + Driver.getData("TIP_LOWER_LIMIT") + "'" ;
		String Upperlimit="'" + Driver.getData("TIP_UPPER_LIMIT") + "'" ;
		String Productname="'" + Driver.getData("TIP_PRODUCT_NAME") + "'" ;
		String Query1 = "select * from PAN.TIERED_PRICING_RATES Where TIP_THIRD_PARTY_NAME="+Introducer+" and TIP_LOWER_LIMIT="+Lowerlimit+" and TIP_UPPER_LIMIT="+Upperlimit+" and TIP_PRODUCT_NAME="+Productname+" ";
		Common_Property.st = Common_Property.SQLcon.createStatement();
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
		Common_Property.rs = Common_Property.st.executeQuery(Query1);
		Common_Property.rs.next();
		
		TIP_THIRD_PARTY_NAME=Common_Property.rs.getString(9);
		System.out.println(TIP_THIRD_PARTY_NAME);
		
		TIP_PRODUCT_NAME=Common_Property.rs.getString(7);
		System.out.println(TIP_PRODUCT_NAME);
		
		TIP_TIER_NAME=Common_Property.rs.getString(11);
		System.out.println(TIP_TIER_NAME);
		
		TIP_LOWER_LIMIT=Common_Property.rs.getString(3);
		System.out.println(TIP_LOWER_LIMIT);
		
		TIP_UPPER_LIMIT=Common_Property.rs.getString(12);
		System.out.println(TIP_UPPER_LIMIT);
		
		TIP_DEFAULT_RATE=Common_Property.rs.getString(1);
		System.out.println(TIP_DEFAULT_RATE);
		
		TIP_MIN_RATE=Common_Property.rs.getString(5);
		System.out.println(TIP_MIN_RATE);
		
		TIP_MAX_RATE=Common_Property.rs.getString(4);
		System.out.println(TIP_MAX_RATE);
		
		}
		if(Brandname1.contains("Quality+")&&Brandname2.contains("Finishline"))
		{
			String Introducer="'" + Driver.getData("Introducercode") + "'" ;
			String Lowerlimit="'" + Driver.getData("TIP_LOWER_LIMIT") + "'" ;
			String Upperlimit="'" + Driver.getData("TIP_UPPER_LIMIT") + "'" ;
			String Productname="'" + Driver.getData("TIP_PRODUCT_NAME1") + "'" ;
			String Query1 = "select * from PAN.TIERED_PRICING_RATES Where TIP_THIRD_PARTY_NAME="+Introducer+" and TIP_LOWER_LIMIT="+Lowerlimit+" and TIP_UPPER_LIMIT="+Upperlimit+" and TIP_PRODUCT_NAME="+Productname+" ";
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
			Common_Property.rs = Common_Property.st.executeQuery(Query1);
			Common_Property.rs.next();
			
			FTIP_THIRD_PARTY_NAME=Common_Property.rs.getString(9);
			System.out.println(FTIP_THIRD_PARTY_NAME);
			
			FTIP_PRODUCT_NAME=Common_Property.rs.getString(7);
			System.out.println(FTIP_PRODUCT_NAME);
			
			FTIP_TIER_NAME=Common_Property.rs.getString(11);
			System.out.println(FTIP_TIER_NAME);
			
			FTIP_LOWER_LIMIT=Common_Property.rs.getString(3);
			System.out.println(FTIP_LOWER_LIMIT);
			
			FTIP_UPPER_LIMIT=Common_Property.rs.getString(12);
			System.out.println(FTIP_UPPER_LIMIT);
			
			FTIP_DEFAULT_RATE=Common_Property.rs.getString(1);
			System.out.println(FTIP_DEFAULT_RATE);
			
			FTIP_MIN_RATE=Common_Property.rs.getString(5);
			System.out.println(FTIP_MIN_RATE);
			
			FTIP_MAX_RATE=Common_Property.rs.getString(4);
			System.out.println(FTIP_MAX_RATE);
		}
		
		
		Common_Property.rs.close();
		Common_Property.st.close();
		Common_Property.SQLcon.close();
		
    } 
 
 catch (Exception ex) 
	{
	    System.err.print("Exception: ");
	    System.err.println(ex.getMessage());
	}


}
public static void SMF_Without_TP() throws IOException, InterruptedException //AXC-REGR-190
{	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
			
			Thread.sleep(1000);
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
			
	
			if (pagename.contains("Financials"))
			{
				
				
				String Createdtype=Driver.getData("Createdtype");
				String a1=Driver.getData("Createrate");
				
				
				
				//Quality+ rates
				String a=Driver.getData("TIP_MIN_RATE");
				String C=Driver.getData("TIP_MAX_RATE");
				String D=Driver.getData("TIP_DEFAULT_RATE");
				String D1=Driver.getData("Flat_Minrate");
				String E1=Driver.getData("Flat_Maxrate");
				String F1=Driver.getData("Yield_Minrate");
				String G1=Driver.getData("Yield_Maxrate");
				Brandname=TIP_PRODUCT_NAME;
				
				
				Float Createrate=Float.parseFloat(a1);//created rate
				Float TPminrate=Float.parseFloat(a); //Tp min rate float
				Float TIP_MAX_RATE=Float.parseFloat(C); //Tp max rate float
				Float Defaultrate=Float.parseFloat(D);
				Float Flatminrate=Float.parseFloat(D1);
				Float Flatmaxrate=Float.parseFloat(E1);
				Float Yieldminrate=Float.parseFloat(F1);
				Float Yieldmaxrate=Float.parseFloat(G1);
			
				
				
				Thread.sleep(1000);
				//Calculate
				Common_Property.driver.findElement(By.linkText("Calculate")).click();
				Thread.sleep(700);
				
				
				//Continue
				Common_Property.driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(700);
			
		        //Refresh
				Common_Property.driver.findElement(By.linkText("Refresh")).click();
				Thread.sleep(700);
				

				String DecisionAPR1=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[9]/td[4]")).getText().toString();
				 System.out.println(DecisionAPR1);
				 String APR1=DecisionAPR1.substring(17, 21);//18 ,22
				 Float DecisionAPR=Float.parseFloat(APR1);
			
				if(Createdtype.contains("APR"))
				{	
					if((Createrate<TPminrate||Createrate>TIP_MAX_RATE))
					{
						if(!DecisionAPR.equals(Defaultrate))
						{
							
							String APRRATE2=Float.toString(DecisionAPR);
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentPassReport(methodname, "APR rate is not recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
						}
						else
						{
							String APRRATE2=Float.toString(DecisionAPR);
							
							Startline.ExtentFailReport(methodname, "APR rate is recalculated to the Tiered Pricing  Default rate as Expected", APRRATE2, datetimestart);
						}
					
					}
					
					else if((Createrate>=TPminrate&&Createrate<=TIP_MAX_RATE))
					{
						
						if(!Createrate.equals(DecisionAPR))
							
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR rate not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentFailReport(methodname, "APR rate  calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
					}
					
				}
				else if (Createdtype.contains("Flat")) 
				{
					
					if((Createrate>=Flatminrate&&Createrate<=Flatmaxrate))
					{
						
						//navigate to Financial
				    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				    	 Thread.sleep(700);
								
							String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
							System.out.println(AERAPR2);
							String APR2=AERAPR2.substring(8, 12);
							Float Createrate1=Float.parseFloat(APR2);
						
							//navigate to Decision
					    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
					    	 Thread.sleep(700);
					    	 
							
						if(Createrate1.equals(DecisionAPR))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR (Flat) rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String APRRATE2=Float.toString(DecisionAPR);
							Startline.ExtentFailReport(methodname, "APR (Flat) rate is not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						
					}
					else if((Createrate<Flatminrate||Createrate>Flatmaxrate))
					{
						if(!DecisionAPR.equals(Defaultrate))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR(Flat) rate not calculated to the Tierepricing Default rate as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							Startline.ExtentFailReport(methodname, "APR(Flat) rate  calculated to the Tierepricing Default rate", null, datetimestart);
						}
					}
					
						
				
				}
				
				else if (Createdtype.contains("Yield")) 
				{
					
					if((Createrate>=Yieldminrate&&Createrate<=Yieldmaxrate))
					{
						//navigate to Financial
				    	 Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[7]/a[1]")).click();
				    	 Thread.sleep(700);
								
							String AERAPR2=Common_Property.driver.findElement(By.xpath("//*[@id='aprData']")).getText().toString();
							System.out.println(AERAPR2);
							String APR2=AERAPR2.substring(8, 12);
							Float Createrate1=Float.parseFloat(APR2);
						
						//navigate to Decision
					    Common_Property.driver.findElement(By.xpath("//div[@id='navStrip']/p[9]/a[1]")).click();
					    Thread.sleep(700);
					
						if(Createrate1.equals(DecisionAPR))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR (Yield) rate calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String APRRATE2=Float.toString(DecisionAPR);
							Startline.ExtentFailReport(methodname, "APR (Yield) rate is not calculated within the Tierepricing Min max rates as expected", APRRATE2, datetimestart);
						}
					}
					else if((Createrate<Yieldminrate||Createrate>Yieldmaxrate))
					{
						if(DecisionAPR.equals(Defaultrate))
						{
						String APRRATE2=Float.toString(DecisionAPR);
						
						Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
						Startline.ExtentPassReport(methodname, "APR(Yield) rate calculated to the Tierepricing Default rate as expected", APRRATE2, datetimestart);
						}
						
						else
						{
							
							
							Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
							String APRRATE2=Float.toString(DecisionAPR);
							Startline.ExtentFailReport(methodname, "APR(Yield) rate Not calculated to the Tierepricing Default rate", APRRATE2, datetimestart);
						}
					}
				
				}
				
			}
					
			else
			{ //navigation to financial tab
						 		
				pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
				Thread.sleep(700);
								
				if(pagename.contains("Decision"))
					{
						Common_Property.driver.findElement(By.xpath("//*[@id='navStrip']/p[7]/a[1]")).click();
						Thread.sleep(700);
						SMF_Tieredpricing();
					}
			}
	
		
		}


catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}
	
}
public static void WithoutTPSQL() throws Exception

{
	
	 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	 Date sdate = new Date();
	 String datetimestart=dateFormat.format(sdate);	

 try 
    {	
	 
	 	Driver.getDataFiloconnection();
	 	String Brandname1=Driver.getData("TIP_PRODUCT_NAME");
		String Brandname2=Driver.getData("TIP_PRODUCT_NAME1");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
	
				
		if(Brandname1.contains("Quality+"))
		{
			
		String Introducer="'" + Driver.getData("Introducercode") + "'" ;
		String Lowerlimit="'" + Driver.getData("TIP_LOWER_LIMIT") + "'" ;
		String Upperlimit="'" + Driver.getData("TIP_UPPER_LIMIT") + "'" ;
		String Productname="'" + Driver.getData("TIP_PRODUCT_NAME") + "'" ;
		String Query1 = "select * from PAN.TIERED_PRICING_RATES Where TIP_THIRD_PARTY_NAME="+Introducer+" and TIP_LOWER_LIMIT="+Lowerlimit+" and TIP_UPPER_LIMIT="+Upperlimit+" and TIP_PRODUCT_NAME="+Productname+" ";
		Common_Property.st = Common_Property.SQLcon.createStatement();
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
		Common_Property.rs = Common_Property.st.executeQuery(Query1);
		Common_Property.rs.next();
		
		TIP_THIRD_PARTY_NAME=Common_Property.rs.getString(9);
		System.out.println(TIP_THIRD_PARTY_NAME);
		
		TIP_PRODUCT_NAME=Common_Property.rs.getString(7);
		System.out.println(TIP_PRODUCT_NAME);
		
		TIP_TIER_NAME=Common_Property.rs.getString(11);
		System.out.println(TIP_TIER_NAME);
		
		TIP_LOWER_LIMIT=Common_Property.rs.getString(3);
		System.out.println(TIP_LOWER_LIMIT);
		
		TIP_UPPER_LIMIT=Common_Property.rs.getString(12);
		System.out.println(TIP_UPPER_LIMIT);
		
		TIP_DEFAULT_RATE=Common_Property.rs.getString(1);
		System.out.println(TIP_DEFAULT_RATE);
		
		TIP_MIN_RATE=Common_Property.rs.getString(5);
		System.out.println(TIP_MIN_RATE);
		
		TIP_MAX_RATE=Common_Property.rs.getString(4);
		System.out.println(TIP_MAX_RATE);
		
		}
		if(Brandname1.contains("Quality+")&&Brandname2.contains("Finishline"))
		{
			String Introducer="'" + Driver.getData("Introducercode") + "'" ;
			String Lowerlimit="'" + Driver.getData("TIP_LOWER_LIMIT") + "'" ;
			String Upperlimit="'" + Driver.getData("TIP_UPPER_LIMIT") + "'" ;
			String Productname="'" + Driver.getData("TIP_PRODUCT_NAME1") + "'" ;
			String Query1 = "select * from PAN.TIERED_PRICING_RATES Where TIP_THIRD_PARTY_NAME="+Introducer+" and TIP_LOWER_LIMIT="+Lowerlimit+" and TIP_UPPER_LIMIT="+Upperlimit+" and TIP_PRODUCT_NAME="+Productname+" ";
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query1);
			Common_Property.rs = Common_Property.st.executeQuery(Query1);
			Common_Property.rs.next();
			
			FTIP_THIRD_PARTY_NAME=Common_Property.rs.getString(9);
			System.out.println(FTIP_THIRD_PARTY_NAME);
			
			FTIP_PRODUCT_NAME=Common_Property.rs.getString(7);
			System.out.println(FTIP_PRODUCT_NAME);
			
			FTIP_TIER_NAME=Common_Property.rs.getString(11);
			System.out.println(FTIP_TIER_NAME);
			
			FTIP_LOWER_LIMIT=Common_Property.rs.getString(3);
			System.out.println(FTIP_LOWER_LIMIT);
			
			FTIP_UPPER_LIMIT=Common_Property.rs.getString(12);
			System.out.println(FTIP_UPPER_LIMIT);
			
			FTIP_DEFAULT_RATE=Common_Property.rs.getString(1);
			System.out.println(FTIP_DEFAULT_RATE);
			
			FTIP_MIN_RATE=Common_Property.rs.getString(5);
			System.out.println(FTIP_MIN_RATE);
			
			FTIP_MAX_RATE=Common_Property.rs.getString(4);
			System.out.println(FTIP_MAX_RATE);
		}
		
		
		/*TP_Rate_Sheet=Testdata.Testdatasheet.get(2);
		
		String a="'" +Common_Property.rs.getString(9) + "'";//TIP_THIRD_PARTY_NAME
		String b="'" +Common_Property.rs.getString(7) + "'";//TIP_PRODUCT_NAME
		String c="'" +Common_Property.rs.getString(11) + "'";//TIP_TIER_NAME
		String d="'" +Common_Property.rs.getString(3) + "'";//TIP_LOWER_LIMIT
		String e="'" +Common_Property.rs.getString(12) + "'";//TIP_UPPER_LIMIT
		String f="'" +Common_Property.rs.getString(1) + "'";//TIP_DEFAULT_RATE
		String g="'" +Common_Property.rs.getString(5) + "'";//TIP_MIN_RATE
		String h="'" +Common_Property.rs.getString(4) + "'";//TIP_MAX_RATE
		

		String Query2 =" Update " +TP_Rate_Sheet+ " Set TIP_THIRD_PARTY_NAME="+a+",TIP_PRODUCT_NAME="+b+",TIP_TIER_NAME="+c+",TIP_LOWER_LIMIT="+d+",TIP_UPPER_LIMIT="+e+",TIP_DEFAULT_RATE="+f+",TIP_MIN_RATE="+g+",TIP_MAX_RATE="+h+" where TESTCASES="+Testdata.TCDatabinding1+" ";
		Common_Property.Fillo_Connection2.executeUpdate(Query2);  
		*/
		Common_Property.rs.close();
		Common_Property.st.close();
		Common_Property.SQLcon.close();
		
    } 
 
 catch (Exception ex) 
	{
	    System.err.print("Exception: ");
	    System.err.println(ex.getMessage());
	}


}
public static void Smf_Negativeequity() throws IOException, InterruptedException , FilloException
{	
	
		
	
		System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
		String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
		
		try{
	

			Thread.sleep(1000);
			Common_Property.driver.findElement(By.name("agreementNumber")).sendKeys(Driver.getData("Agreement_Number"));
			Thread.sleep(700);
			agreementno=(Driver.getData("Agreement_Number"));
			
			Startline.ExtentPassReport(methodname, "Agreement created through  is " +agreementno, agreementno, datetimestart);
			
			Common_Property.driver.findElement(By.xpath("//div[@id='agrSearchBody']/form/table[2]/tbody/tr/td/div/a")).click();
			Thread.sleep(700);
		   //view
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[6]/a")).click();
			Thread.sleep(1000);
			
			 //scroll down
			 JavascriptExecutor jse = (JavascriptExecutor)Common_Property.driver;
			 jse.executeScript("window.scrollBy(0,6000)");
			
			//close
			Common_Property.driver.findElement(By.xpath("//div[@id='viewXmlBody']/form/table/tbody/tr/td/div/a[1]")).click();
			Thread.sleep(700);
			//Agreementlink
			Common_Property.driver.findElement(By.xpath("//div[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a")).click();
			Thread.sleep(700);
			
			
			
			Brandnname=Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[2]/tbody/tr[1]/td[2]")).getText().toString();
			Thread.sleep(700);
		
			pagename=Common_Property.driver.findElement(By.xpath("//*[@id='panelArea']/h1")).getText().toString();
			Thread.sleep(700);
			
			if (pagename.contains("Financials"))
			{
				
				
				    Adminfee=Common_Property.driver.findElement(By.xpath("//*[@id='panelBody']/form/table[2]/tbody/tr[4]/td[2]/input[1]")).getAttribute("value");
					Thread.sleep(350);
					System.out.println("admin fee is"+Adminfee);
			
					Common_Property.driver.findElement(By.xpath("//div[@id='panelBody']/form/table[4]/tbody/tr/td[1]/div/a[2]")).click();
					Thread.sleep(700);
			}
			else
			{
				Common_Property.driver.findElement(By.linkText("Refresh")).click();
				
			}
		
		
}
catch (Exception e)  {
	

System.out.println("The exception was "+e);
System.out.println("Abnormal Termination due to "+e);
Startline.ExtentPassReport(methodname, methodname+"execiuted successfully", methodname, datetimestart);
String Desc="Test Run of"+methodname+"was not completed Sucessfully";
Startline.ExtentFailReport(methodname,Desc,null,datetimestart);

}
	
}



public static void Negativeequity_SQL() throws Exception

{
	
	 DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	 Date sdate = new Date();
	 String datetimestart=dateFormat.format(sdate);	

 try 
    {	
	 
	 	//Driver.getDataFiloconnection();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Common_Property.SQLcon=DriverManager.getConnection("jdbc:oracle:thin:@linux03:1524:SMFSYS", "forte", "forte");
		Common_Property.st = Common_Property.SQLcon.createStatement();
		
		String Agreementno = "'" + Driver.getData("Agreement_Number") +  "'" ;
		
			
		String Query2 = "select agr_indirect_deposit,agr_serial,agr_contra_amount from agreements Where AGR_AGREEMENT_NUMBER="+Agreementno+" ";
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query2);
		Common_Property.rs = Common_Property.st.executeQuery(Query2);
		Common_Property.rs.next();
		String AgrContraamnt = Common_Property.rs.getString("agr_contra_amount");
		String Agrdeposit = Common_Property.rs.getString("AGR_INDIRECT_DEPOSIT");
		String AgrSerial =  "'" + Common_Property.rs.getString("AGR_SERIAL")+ "'";
		System.out.println(AgrContraamnt);
		
		if(AgrContraamnt.equals("2000")&&Agrdeposit.equals("500"))
		{
			
			Startline.ExtentPassReport("Negativeequity Scenarios", "Agreement contra amount is displayed as expected", AgrContraamnt, datetimestart);
		}
		else
		{
			
		
			Startline.ExtentFailReport("Negativeequity Scenarios", "Agreement contra amount is Not displayed as expected", AgrContraamnt, datetimestart);
		}
		Common_Property.rs.close();
		
		
		
		String Query8 = "select Count(*) from TABLE_ADDITIONAL_ATTRIBUTES where TAA_ADDITIONAL_ATTRIBUTE in  ('100241','100242') and TAA_FOREIGN_SERIAL="+AgrSerial+" "; 
		
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query8);
		Common_Property.rs1 = Common_Property.st.executeQuery(Query8);
		Common_Property.rs1.next();
		int Count =Common_Property.rs1.getInt(1);
		Common_Property.rs1.close();
		
		if (Count==0)
		{
			
			Startline.ExtentPassReport("Negativeequity Scenarios", "Agreement addtional attributes(Contra settlement value/reference)is not created as expected", null, datetimestart);
		}
		
		else{
		
			String Query3 = "select * from TABLE_ADDITIONAL_ATTRIBUTES where TAA_ADDITIONAL_ATTRIBUTE ='100241'and TAA_FOREIGN_SERIAL="+AgrSerial+" "; 
			String Query4 = "select * from TABLE_ADDITIONAL_ATTRIBUTES where TAA_ADDITIONAL_ATTRIBUTE ='100242'and TAA_FOREIGN_SERIAL="+AgrSerial+" "; 
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query3);
			Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query4);
			Common_Property.rs1 = Common_Property.st.executeQuery(Query3);
			Common_Property.rs1.next();
			String Additionalattr =Common_Property.rs1.getString(4);
			Common_Property.rs1.close();
			Common_Property.rs6 = Common_Property.st.executeQuery(Query4);
			Common_Property.rs6.next();
			String Additionalattr1 =Common_Property.rs6.getString(4);
			Common_Property.rs6.close();
		if(Additionalattr==null && Additionalattr1==null)
		{
			
			Startline.ExtentPassReport("Negativeequity Scenarios", "Agreement addtional attributes(Contra settlement value/reference)is null as expected", null, datetimestart);
		}
		else
		{
			
			
			Startline.ExtentFailReport("Negativeequity Scenarios", "Agreement addtional attributes(Contra settlement value/reference)is created", null, datetimestart);
		}
		}
		
		String Query5 = "Select * from AGREEMENT_EXTERNAL_CONTRAS where  AXC_AGREEMENT="+AgrSerial+" "; 
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query5);
		Common_Property.rs3 = Common_Property.st.executeQuery(Query5);
		Common_Property.rs3.next();
		String Outstandingsetamnt = Common_Property.rs3.getString("AXC_AMOUNT");
		String Exsettlement = Common_Property.rs3.getString("AXC_REFERENCE");
	
		if(Outstandingsetamnt.equals("2000")&&Exsettlement.equals("External settlement"))
		{
			
			Startline.ExtentPassReport("Negativeequity Scenarios", "Agreement Outstanding settlement amount and it's reference is dispplayed as expected", "Outstandingamount:"+Outstandingsetamnt+"  Reference:"   +Exsettlement, datetimestart);
		}
		else
		{
		
			Startline.ExtentFailReport("Negativeequity Scenarios", "Agreement outstanding settlement amount/reference is not displayed as expecxted",  "Outstandingamount:"+Outstandingsetamnt+  " Reference: "+Exsettlement,  datetimestart);
		}
		
		
		
		Common_Property.rs3.close();
		String Query6 = "Select  SMF_CONTRA_SETTLEMENT_VALUE,SMF_CONTRA_SETTLEMENT_REF,SMF_NEGATIVE_EQUITY  from V_SMF_PROPS_GENERAL where PROP_NUMBER= " +Agreementno+"";
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query6);
		Common_Property.rs4 = Common_Property.st.executeQuery(Query6);
		Common_Property.rs4.next();
		String Contraamnt = Common_Property.rs4.getString("SMF_CONTRA_SETTLEMENT_VALUE");
		String Contraref = Common_Property.rs4.getString("SMF_CONTRA_SETTLEMENT_REF");
		String Negativeequity = Common_Property.rs4.getString("SMF_NEGATIVE_EQUITY");
	
		if(Contraamnt.equals("2000")&&Contraref.equals("External settlement")&&Negativeequity.equals("750"))
		{
			
			Startline.ExtentPassReport("Negativeequity Scenarios", "Contra amount,Reference,Negative equity  is displayed as expected", "Contraamnt:"+Contraamnt+ "  Contraref:"+Contraref+  "  Negativeequity:  "+Negativeequity, datetimestart);
		}
		else
		{
			
			
			Startline.ExtentFailReport("Negativeequity Scenarios", "Contra amount,Reference,Negative equity  is Not displayed as expected", "Contraamnt:"+Contraamnt+ "  Contraref:"+Contraref+ "  Negativeequity:  "+Negativeequity, datetimestart);
		}
		Common_Property.rs4.close();
		String Query7 = "select SMF_NEGATIVE_EQUITY,SMF_DEPOSIT_PLUS_EQUITY from V_SMF_OUTSTANDING_SETTLEMENT where  agr_serial="+AgrSerial+" "; 
		Common_Property.Pst = Common_Property.SQLcon.prepareStatement(Query7);
		Common_Property.rs5 = Common_Property.st.executeQuery(Query7);
		Common_Property.rs5.next();
		String Deposit = Common_Property.rs5.getString("SMF_DEPOSIT_PLUS_EQUITY");
		String Negativeequityvalue = Common_Property.rs5.getString("SMF_NEGATIVE_EQUITY");
		
		if(Deposit.equals("500")&&Negativeequityvalue.equals("750"))
		{
			Startline.ExtentPassReport("Negativeequity Scenarios", "Contra amount,Reference,Negative equity  is displayed as expected", "Contraamnt:"  +Contraamnt+  "Contraref:"+Contraref+  " Negativeequity: "+Negativeequity, datetimestart);
		}
		else
		{
			
			
			Startline.ExtentFailReport("Negativeequity Scenarios", "Contra amount,Reference,Negative equity  is Not displayed as expected", "Contraamnt:"  +Contraamnt+  "Contraref: "+Contraref+ " Negativeequity:" +Negativeequity, datetimestart);
		}
		Common_Property.rs5.close();
		
		
		Common_Property.st.close();
		
		Common_Property.SQLcon.close();
		
    } 
 
 catch (Exception ex) 
	{
	    System.err.print("Exception: ");
	    System.err.println(ex.getMessage());
	}


}

}