package OpenUniversity;

import java.util.Arrays;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import Common_Funtions.Common_Property;
import Common_Funtions.Configuration;
import Common_Funtions.Driver;
import Common_Funtions.Utilities;




public class OpenUniversity {
	
	public static Recordset OU_recordset1, OU_recordset2;
	public static Connection connection;
	public static Fillo fillo;
	public static String strQuery,str,getref;
	public static List<String> KeywordList = Arrays.asList();
	public static int i,flag;
	
	public static void main(String args[])throws Exception
	{
		
		Driver.Project_Fillo("OpenUniversity");
		
	}
	
		
     public static void OpenUniversityInitiated(String getKeyword) throws NullPointerException, Exception
		
		{
			try
			{
					Driver.ChooseKeywordSheet(OU_recordset1);
					
					while(Driver.recordset1.next())
					{
						Utilities.reportinitiated(Driver.recordset1);
						Driver.ChooseKeywordsheetvalue(Driver.recordset1);
						Driver.updateKeywordSheet(OU_recordset2);
						
						    for(i=0;i<=Driver.KeywordList.size()-1;i++)
						    {
							    	while(Driver.recordset2.next())
									{	
							    		 if(Driver.recordset2.getField("DATABINDING").equalsIgnoreCase(Driver.recordset1.getField("DATABINDING")))
										      {
											     flag=1;
											     break;
										      }
									}
								    	
									if(flag==1)	
									{
					
					                    switch(Driver.KeywordList.get(i))
									    {
								   
						   
											case "InitiateChromeDriver":
												Common_Property.IntiateBrowser();
												break;
									
											case "CreateAgreement":    
												OU_RestAssured.CreateAgreement();  
												break; 
					
							           }	
		                                Driver.updateKeywordSheet(OU_recordset2);
						        }
					    
		                    }
				       
						}
				
				   }
			      catch(Exception e)
					{
					   System.out.println(e); 	  
					}
			
			 }

}
		



