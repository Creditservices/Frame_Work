package Common_Funtions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration 
{
	public static String Browser;
	public static String Project;
	public static String Datapath;
	public static String Driverpath;
	public static String Macropath;
	public static String ProvAPI;
	public static String Configpath=System.getProperty("user.dir");
	
	public static void getProperty() throws Exception
	{
		try
		{
		Properties prop=new Properties();
		FileInputStream C= new FileInputStream(Configpath+"/Config.properties");
		prop.load(C);
		Browser=prop.getProperty("Browser");
		Project=prop.getProperty("Project");
		Datapath=prop.getProperty("Datapath");
		Driverpath=prop.getProperty("Driverpath");
		Macropath=prop.getProperty("MacroPath");
		ProvAPI=prop.getProperty("Prov_Api_url");
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		
	}

}
