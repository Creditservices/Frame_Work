package credit_services;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class BaseClass {
	
	public static Fillo fillo;
	public static Connection connection;
	public static Recordset recordSet;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	
	public static void initialization() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/config.properties"));
			prop.load(fis);
			
			fillo  = new Fillo();
			connection = fillo.getConnection(System.getProperty("user.dir")+prop.getProperty("dataFilePath"));
			recordSet = connection.executeQuery("Select * from SUMMARY Where RUN_FLAG='YES'");
			while (recordSet.next()) {
				
				String application = recordSet.getField("APPLICATION");
				
				if (application.equalsIgnoreCase("OPENUNIVERSITY")) 
					{
						String url = recordSet.getField("URL");
						String xmlData = recordSet.getField("REQUEST_DATA");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						
						System.out.println("Execution started for "+application);
						OpenUniversity.agrGenerator(xmlData, count, url);
						System.out.println("Execution finished for "+application);
					} 
				else if(application.equalsIgnoreCase("ELL")) 
					{
						String url = recordSet.getField("URL");
						String jsonData = recordSet.getField("REQUEST_DATA");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						String usrName = recordSet.getField("USERNAME");
						String passWord = recordSet.getField("PASSWORD");
						
						System.out.println("Execution started for "+application);
						ELL.agrGenerator(jsonData, count, url, usrName, passWord);
						System.out.println("Execution finished for "+application);
					}
				else if(application.equalsIgnoreCase("NEWDAY")) 
					{
						String url = recordSet.getField("URL");
						String xmlData1 = recordSet.getField("REQUEST_DATA");
						String xmlData2 = recordSet.getField("REQUEST_DATA2");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						System.out.println("Execution started for "+application);
						NewDay.agrGenerator(xmlData1, xmlData2, count, url);
						System.out.println("Execution finished for "+application);
					}
				else if(application.equalsIgnoreCase("STARTLINE")) 
					{
						String url = recordSet.getField("URL");
						String xmlData = recordSet.getField("REQUEST_DATA");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						
						System.out.println("Execution started for "+application);
						Startline.agrGenerator(xmlData, count, url);
						System.out.println("Execution finished for "+application);
					}
				else if(application.equalsIgnoreCase("MNFSYS")) 
					{
						String url = recordSet.getField("URL");
						String xmlData = recordSet.getField("REQUEST_DATA");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						System.out.println("Execution started for "+application);
						MNFSYS.agrGenerator(xmlData, count, url);
						System.out.println("Execution finished for "+application);
					}
				else if(application.equalsIgnoreCase("PROVIDENT")) 
					{
						String url = recordSet.getField("URL");
						String xmlData1 = recordSet.getField("REQUEST_DATA");
						String xmlData2 = recordSet.getField("REQUEST_DATA2");
						String xmlData3 = recordSet.getField("REQUEST_DATA3");
						String xmlData4 = recordSet.getField("REQUEST_DATA4");
						String xmlData5 = recordSet.getField("REQUEST_DATA5");
						String xmlData6 = recordSet.getField("REQUEST_DATA6");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						String usrName = recordSet.getField("USERNAME");
						String passWord = recordSet.getField("PASSWORD");
						System.out.println("Execution started for "+application);
						Provident.agrGenerator(xmlData1, xmlData2, xmlData3, xmlData4, xmlData5, xmlData6, count, url, usrName, passWord);
						System.out.println("Execution finished for "+application);
					}
				else if(application.equalsIgnoreCase("TELEFONICA")) 
					{
						String url = recordSet.getField("URL");
						String jsonData1 = recordSet.getField("REQUEST_DATA");
						String jsonData2 = recordSet.getField("REQUEST_DATA2");
						String jsonData3 = recordSet.getField("REQUEST_DATA3");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						String usrName = recordSet.getField("USERNAME");
						String passWord = recordSet.getField("PASSWORD");
						System.out.println("Execution started for "+application);
						if (driver != null) {
							driver.close();
						}
						Telefonica.agrGenerator(jsonData1, jsonData2, jsonData3, count, url, usrName, passWord);
						System.out.println("Execution finished for "+application);
					}
				else if(application.equalsIgnoreCase("IKANO")) 
					{
						String url = recordSet.getField("URL");
						String xmlData1 = recordSet.getField("REQUEST_DATA");
						String xmlData2 = recordSet.getField("REQUEST_DATA2");
						String xmlData3 = recordSet.getField("REQUEST_DATA3");
						int count = Integer.parseInt(recordSet.getField("COUNT"));
						String usrName = recordSet.getField("USERNAME");
						String passWord = recordSet.getField("PASSWORD");
						
						System.out.println("Execution started for "+application);
						Ikano.agrGenerator(xmlData1, xmlData2, xmlData3, count, url, usrName, passWord);
						System.out.println("Execution finished for "+application);
					}
				else 
					{
						System.out.println("Nothing implemented for "+application);
					}
			}
		} catch (Exception e) {
			System.out.println("The exception was "+e);	
		}
		finally {
			if (driver != null) {
				driver.quit();
			}
		}
		
	}
	
	//***Main method
	public static void main(String[] args) throws Exception {
		initialization();
		connection=null;
		recordSet.close();	
	}
	
	//*##Re usable methods start##*//
	//***rest assured execution with out body -- Provident, Ikano
	public static String execute(String strContentType, String str_url){
		ValidatableResponse response = given()
				.contentType(strContentType)
		        .when()
		        .post(str_url)
		        .then();
		
		return response.extract().body().asString();	
	}
	
	//***rest assured execution with body -- OpenUniversity, MNFSYS, NewDay, Startline
	public static String execute(String strContentType, String xml_data, String str_url){
		ValidatableResponse response = RestAssured.given()
				.contentType(strContentType)
		        .body(xml_data)
		        .when()
		        .post(str_url)
		        .then();
		
		return response.extract().body().asString();
	}
	
	//***rest assured execution with headers -- Telefonica
	public static String execute(String uniquekey, String strUsrName, String strPassWord, String str_url){
		ValidatableResponse response = RestAssured.given()
				.auth()
				.preemptive()
				.basic(strUsrName, strPassWord)
				//.contentType(strContentType)
				.header("SOATransactionID", uniquekey)
				.header("SOAConsumerTransactionID", uniquekey)
		        .when()
		        .post(str_url)
		        .then();
		
		return response.extract().body().asString();
	}
	
	//***rest assured execution with out headers for -- ELL
	public static ValidatableResponse execute(String strContentType, String strUsrName, String strPassWord, String str_url, String strJsonBody){
		ValidatableResponse response = RestAssured.given()
				.auth()
				.preemptive()
				.basic(strUsrName, strPassWord)
				.contentType(strContentType)
				.body(strJsonBody)
		        .when()
		        .post(str_url)
		        .then();
		
		return response;
	}
	
	//***To extract values from response XML
	public static String splitValues(String source, String start, String end){
		String[] parse = source.split(start);
		String stringparse = parse[1];
		
		String[] newparse = stringparse.split(end);
		String value = newparse[0];
		
		return value;
	}

	//***loading webdriver settings***
	public static void initializeWebDriver(){	
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+prop.getProperty("chromeDriverPath"));
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 60);
		}	
	}
	
	//***loading webdriver settings for Telefonica since we need to launch fresh browser for each agreement***
	public static void initializeWebDriverTF(){	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+prop.getProperty("chromeDriverPath"));
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);	
	}
	//***front office login
	public static void frontofficeLogin(String url, String userName, String password){
		driver.get(url);
		driver.findElement(POM_Repository.UsernameFO).sendKeys(userName);
		driver.findElement(POM_Repository.PasswordFO).sendKeys(password);
		driver.findElement(POM_Repository.SubmitFO).click();	
	}
}
