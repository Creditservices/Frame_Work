package Common_Funtions;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import Provident.ProvidentAPI;




public class Common_Property 
{
public static WebDriver driver;
public static String directory=System.getProperty("user.dir");
public static boolean sheetflag;
public static java.sql.Connection SQLcon;
public static Statement st;
public static PreparedStatement Pst;
public static ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6;

	
public static void IntiateBrowser() throws Exception

	{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
		try
		{
		
		
		if(driver==null)
		{
			Provident.Provident.Testchange=false;
			System.setProperty("webdriver.chrome.driver",  directory+"/Browsers/chromedriver.exe");
			driver =new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Utilities.ExtentPassReport(methodname);
		}
		else
		{
		System.out.println("Driver already open,Continue the Execution");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		}
		catch(Exception e)
		{
			
			Utilities.ExtentFailReport(methodname,e);
			
		}
		
	}

public static void Launch_smf_Url() throws Exception
{
	        Driver.sheetflag=true;
			driver.get(Driver.getData("MotorfrontEnd"))	 	;		
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(2000);
			
}


public static void Startline_Login() throws  Exception
{    	

	            Driver.sheetflag=true;
	            driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Driver.getData("API_Username"));
	            Driver.sheetflag=true;
				driver.findElement(By.xpath("//input[@name='passWord']")).sendKeys(Driver.getData("API_Password"));
				Thread.sleep(750);
		        driver.findElement(By.xpath("//div[@id='loginBody']/form/table[2]/tbody/tr/td[2]/a")).click();
}

public static void FO_Login() throws  Exception
{  
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try
       {

	            Driver.sheetflag=true;
	            driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Driver.getData("FO_Username"));
	            Driver.sheetflag=true;
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Driver.getData("FO_Password"));
				driver.findElement(By.xpath("//a[@id='PanLinkSubmit']")).click();
				Thread.sleep(2000);
        }
        catch(Exception e){
        	
        	Utilities.ExtentFailReport(methodname,e);
        }

				
				
}

public static void APILogin() throws Exception
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try{
	Driver.sheetflag=true;
	Common_Property.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Driver.getData("API_Username"));
	Driver.sheetflag=true;
	Common_Property.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Driver.getData("API_Password"));
	Common_Property.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
	}
	catch(Exception e){
		Utilities.ExtentFailReport(methodname,e);
		
	}
    
}
public static void Launch_Backoffice_Url() throws Exception
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try{
	        Driver.sheetflag=true;
			driver.get(Driver.getData("BackOffice_Url"));	 			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(5000);
	}
	catch(Exception e){
		Utilities.ExtentFailReport(methodname,e);
		
	}
}

public static void Launch_FrontOffice_URL() throws Exception
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try{
	        Driver.sheetflag=true;
			driver.get(Driver.getData("FrontOffice_URL"));	 			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(2000);
	}
			
			catch(Exception e){
				Utilities.ExtentFailReport(methodname,e);
				
			}
}

public static void Launch_API_Url() throws Exception
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try{
	        sheetflag=true;
			driver.get(Driver.getData("API_url"));	
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(2000);
	}
	catch(Exception e){
		Utilities.ExtentFailReport(methodname,e);
		
	}
}
		
public static void Launch_ApplicationURL() throws Exception
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try{
	        sheetflag=true;
			driver.get("https://provsys.pancredit.com/" + ProvidentAPI.ApplicationValue);	 			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(2000);
	}
			
			catch(Exception e){
				Utilities.ExtentFailReport(methodname,e);
				
			}
}

public static void BO_Login() throws Exception
	{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	try{
	
		
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		Driver.sheetflag=true;
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div[2]/div[2]/input")).sendKeys(Driver.getData("BO_Username"));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		Driver.sheetflag=true;
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div[2]/div[4]/input")).sendKeys(Driver.getData("BO_Password"));
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div[2]/div[2]/input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div[2]/div[4]/input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div[2]/div[2]/input")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div")).click();
		WebDriverWait wait = new WebDriverWait(driver,10000);
		WebElement file=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Open']")));
		boolean check=file.isDisplayed();
		
	   if(check==true )
	   {
		   System.out.println("Home is displayed");
	   }
	   else
	   {
		 System.out.println("Driver didnot enter into the Homepage");  
	   }
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
		
	}

public static String InsertQuery(String SheetName,ArrayList<String> Insertarr) throws IOException, FilloException, InterruptedException
	
	{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String InsQuery = null;
	try{
		
		if(Agreement_Store.i==0)
			
		{
			InsQuery = "INSERT INTO "+SheetName+ "(Refno,Agreement_Number)"+" VALUES ("+Insertarr.get(0)+","+Insertarr.get(1)+")";
		
		}
		else{
			
			InsQuery = "INSERT INTO "+SheetName+ "(Refno,Agreement_Number,Misc)"+" VALUES ("+Insertarr.get(0)+","+Insertarr.get(1)+","+Insertarr.get(2)+")";
		}
		
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	return InsQuery;
	
	}
		
public static String Updatesheet1(String SheetName,ArrayList<String> updatesheet1) throws IOException, FilloException, InterruptedException
	{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String strupdate=null;
	try{
		//String strupdate="Update " +SheetName+" set Agreement_Number="+updatesheet1.get(0)+",Misc="+updatesheet1.get(2)+" where put_ag_no ="+updatesheet1.get(1);
		strupdate="Update " +SheetName+" set Agreement_Number="+updatesheet1.get(0)+" where put_ag_no ="+updatesheet1.get(1);
		
	}
	catch (Exception e) {
			Utilities.ExtentFailReport(methodname,e);
		}
	
	return strupdate;
		
	}
	
public static String StrUpdateQuery(String SheetName,ArrayList<String> Updatearr) throws IOException, FilloException, InterruptedException
{
	   String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
       String UpdateQuery = null;
       try{
      System.out.println(Updatearr.size()); 
       if(Agreement_Store.i==0)
    	 
		{
    	   UpdateQuery = "Update Sheet2 Set Agreement_Number="+Updatearr.get(1)+" where Refno ="+Updatearr.get(0);
	       
		}
       else
       {
    	   UpdateQuery ="Update Sheet2 Set Agreement_Number="+Updatearr.get(1)+" ,Misc="+"'"+Updatearr.get(2)+"'"+" where Refno ="+Updatearr.get(0)+ "";
       }
      }
       
       catch (Exception e) {
			Utilities.ExtentFailReport(methodname,e);
		}

	   return UpdateQuery;
	
	
}

public static String SelectQuery(String Sheet,String Project) throws IOException, FilloException, InterruptedException
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String strQuery=null;
	try{
		strQuery="Select * from "+Sheet+ " where Projects="+Project+" and Run='Yes'";
	
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	
	return strQuery;
	
}
public static String SelectQ1(String Sheet,String Project) throws IOException, FilloException, InterruptedException

{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String strQuery=null;
	try{
	strQuery="Select * from "+Sheet+" where Run='Yes'";
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	
	return strQuery;
		
}

public static String Storequery(String Sheet ) throws IOException, FilloException, InterruptedException
{
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String storeqry=null;
	try{
	
	 storeqry="Select * from " +Sheet+ " where Run='Yes'";
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	
	return storeqry;
	
}
public static String Storequery1(String Sheet) throws IOException, FilloException, InterruptedException{
	
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String storeqry=null;
	try{
	storeqry="Select * from " +Sheet;
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	
	
	return storeqry;
	
}
public static String Mappingquery(String Sheet) throws IOException, FilloException, InterruptedException{
	
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String storeqry=null;
	try{
	storeqry="Select * from " +Sheet;
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	return storeqry;
	
}

public static String Updatesheet1(String Sheet) throws IOException, FilloException, InterruptedException{
	
	String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
	String storeqry=null;
	try{
	storeqry="Select * from " +Sheet;	
	}
	catch (Exception e) {
		Utilities.ExtentFailReport(methodname,e);
	}
	
	return storeqry;
	
}


}
