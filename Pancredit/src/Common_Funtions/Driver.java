package Common_Funtions;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.exec.ExecuteException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


import Provident.Provident;
import Provident.ProvidentAPI;
import OpenUniversity.*;
import java.lang.reflect.*;

public class Driver {
	public static String Projects,Project,Testcase,getkeyword,str,getdata,strQuery,Agreement_Name,getref,TestCase,record1,put_ag_no;
	public static ArrayList<String> Project1=new ArrayList<String>();
	public static Connection connection;
	public static Recordset recordset,recordset1,recordset2;
	public static List<String> KeywordList = Arrays.asList();
	public static boolean Testresult,sheetflag;
	public static Fillo fillo;
	
	public static void Project_Fillo(String Project) throws NullPointerException,Exception 
	{
		try
		{
		Configuration.getProperty();
		fillo=new Fillo();
		Driver.Project=Project;
		Projects="'"+Project+"'";
		connection=fillo.getConnection(Configuration.Driverpath);
		strQuery=Common_Property.SelectQuery("Sheet1",Projects);
		recordset=connection.executeQuery(strQuery);
		
			while(recordset.next()) 
			{
			System.out.println(recordset.getField("MotorfrontEnd"));
			String hClassName=recordset.getField("Package")+"."+recordset.getField("Projects");
			String ProjInit = recordset.getField("Key_Function");
			Class<?> hClass = Class.forName(hClassName);
            Object test = hClass.newInstance();
            Method setNameMethod = test.getClass().getMethod(ProjInit, String.class);
            setNameMethod.invoke(test, "MethodInitiated");
            
           
			}
			
	
		}
		catch(NullPointerException e)
		{
			System.out.println("Please check the driversheet,No records found" );	
		}
				
		catch(Exception e)
		{
			System.out.println(e);
			if(e.getMessage().contains("No records found"))
			{
			System.out.println("Please check the driversheet,No records found" );
			}		
		}
        recordset.close();
		Driver.connection.close();
	}
	
	public static String getData(String TestData) throws FilloException
	{
		String GetValue = null;
		try
		{
		if(sheetflag==true)
		{
		 GetValue = recordset.getField(TestData);
		 sheetflag=false;
		}
		else
		{
         GetValue = recordset2.getField(TestData);
		}
		}
		catch(Exception e)
		{
		 System.out.println(e);
		}
		return GetValue;
	}
	
	public static void updateKeywordSheet(Recordset record2) throws FilloException
	{
		try
		{
		 fillo=new Fillo();
	     connection=fillo.getConnection(Configuration.Datapath+Driver.Project+".xlsx");
		 strQuery=Common_Property.SelectQ1("Sheet1",Driver.Projects);
		 record2=connection.executeQuery(strQuery);
		 recordset2=record2;
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void ChooseKeywordSheet(Recordset record1) throws FilloException
	{
		try
		{
	     fillo=new Fillo();
	     connection=fillo.getConnection(Configuration.Datapath+Driver.Project+".xlsx");
		 strQuery=Common_Property.SelectQ1("Sheet1",Driver.Projects);
		 record1=connection.executeQuery(strQuery);
		 recordset1=record1;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void ChooseKeywordsheetvalue(Recordset record1) throws FilloException
	{    
		try 
		{
         str =recordset1.getField("Keyword");
		 getref=recordset1.getField("put_ag_no");
		 KeywordList = Arrays.asList(str.split(","));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
