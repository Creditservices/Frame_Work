package Provident;

import java.util.Arrays;
import java.util.List;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import Common_Funtions.Common_Property;
import Common_Funtions.Driver;
import Common_Funtions.Utilities;
import Common_Funtions.*;


public class Provident
{
	
	public static Recordset Prov_recordset1, Prov_recordset2;
	public static Connection connection;
	public static Fillo fillo;
	public static String strQuery,str,getref;
	public static List<String> KeywordList = Arrays.asList();
	public static int i,flag;
	public static boolean Testchange;
	
	public static void main(String args[])throws Exception
	{
		
		Driver.Project_Fillo("Provident");
		
	}
	
		
     public static void ProvidentInitiated(String getKeyword) throws NullPointerException, Exception
		
		{
    	 String methodname=null;
			try
			{
					Driver.ChooseKeywordSheet(Prov_recordset1);
					
					while(Driver.recordset1.next())
					{
						Utilities.reportinitiated(Driver.recordset1);
						Driver.ChooseKeywordsheetvalue(Driver.recordset1);
						Driver.updateKeywordSheet(Prov_recordset2);
						
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
											case "Launch_API_Url":
												ProvidentAPI.Launch_API_Url();
												break;
											case "APILogin":
												ProvidentAPI.APILogin();
												break;
												
											case "BO_Login":
												Common_Property.BO_Login();
												break;
												
											case "Get_XML_Source_Url":	
												ProvidentAPI.Get_XML_Source_Url();
												break;
												
											case "Application_Known":	
												ProvidentAPI.Application_Known();
												break;
												
											case "Application":	
												ProvidentAPI.Application();
												break;
												
											case "Launch_ApplicationBank":	
												ProvidentAPI.Launch_ApplicationBank();
												break;
												
											case "Launch_ApplicationCard":	
												ProvidentAPI.Launch_ApplicationCard();
												break;
												
											case "Launch_Esignature":	
												ProvidentAPI.Launch_Esignature();
												break;
												
											case "Launch_updatestatus":	
												ProvidentAPI.Launch_updatestatus();
												break;
												
											case "Launch_updatestatus_Batch":	
												ProvidentAPI.Launch_updatestatus_Batch();
												break;
												
											case "Bank_Status":	
												ProvidentAPI.Bank_Status();
												break;
												
											case "AppCard_Status":	
												ProvidentAPI.AppCard_Status();
												break;
												
											case "E_Signature_Status":	
												ProvidentAPI.E_Signature_Status();
												break;
												
											case "UpdateAgreement_Status":	
												ProvidentAPI.UpdateAgreement_Status();
												break;
												
											case "BO_Status_check":	
												ProvidentAPI.BO_Status_check();
												break;
												
											case "Launch_Backoffice_Url":	
												Common_Property.Launch_Backoffice_Url();
												break;
												
											case "Launch_FrontOffice_URL":    
												Common_Property.Launch_FrontOffice_URL();
											    break;
											    
											case "FO_Login":    
												Common_Property.FO_Login();
											    break;
											    
											case "Paymentdate_FO":
												 Frontoffice.Paymentdate_FO();
												 break;
												 
											case "Paymentdate_BO":
												 Backoffice.Paymentdate_BO();
												 break;
												 
											case "documentverifcation_BO":		  
												Backoffice.documentverifcation_BO();		  
											      break;
											      
											case "letter_FO":
											      Frontoffice.letter_FO();
												  break;
												  
											case "DocumentVerification":
												 Backoffice.BO_DocumentVerification();			
												 break;
											
											case "letterMODN_FO":
												Frontoffice.letterMODN_FO();			
												 break;
												 
											case "letterMONA_FO":
												Frontoffice.letterMONA_FO();			
												 break;
												 
											case "Temporary_Arrangement":
												Backoffice.Temporary_Arrangement();			
												 break;
												 
											case "BO_Address":
												Backoffice.BO_Address();			
												 break;
												 
											case "BO_DocumentVerification_WelcomePack":
												Backoffice.BO_DocumentVerification_WelcomePack();
												break;
												
											case "FO_NewAtAddress":
												Frontoffice.FO_NewAtAddress();			
												 break;
												 
											case "FO_BankDetails":
												Frontoffice.FO_BankDetails();			
												 break;
												 
											case "FO_PersonalDetail":
												Frontoffice.FO_PersonalDetail();			
												 break;
												 
											case "BO_Settlement_Quote":
												Backoffice.BO_Settlement_Quote();
												break;
												
											case "BO_cashposting":
												Backoffice.BO_cashposting();
												break;
												
											case "BO_StopCategory":
												Backoffice.BO_StopCategory();
												break;
												
											case "FO_PaymentMethod":
												Frontoffice.FO_PaymentMethod();
												break;
												
											case "FO_withdrawnotification":
												Frontoffice.FO_withdrawnotification();
												break;
												
											case "BO_Reshedule":
												Backoffice.BO_Reshedule();
												break;
													
											case "BO_Refund":
												Backoffice.BO_Refund();
												break;
												
											case "CPA_Creation":
												Frontoffice.CPA_Creation();
												break;
												
											case "BO_GetFinalDate":
												Backoffice.BO_GetFinalDate();
												break;
												
											case "BO_CheckWriteoff":
												Backoffice.BO_CheckWriteoff();
												break;
											
											case "FO_temporary_arrangement":
												Frontoffice.FO_temporary_arrangement();
												break;
												
											case "FO_POSTPAYMENT":
												Frontoffice.FO_POSTPAYMENT();
												break;
												
											case "BO_DateMatch":
												Backoffice.BO_DateMatch();
												break;
												
											case "FO_highamount_temparg":
												Frontoffice.FO_highamount_temparg();
												break;
												
											case "FO_Oneoff_Payment":
												Frontoffice.FO_Oneoff_Payment();
												break;
												
											case "FO_PAYMENT":
												Frontoffice.FO_PAYMENT();
												break;
												
												
												
												
												
												
												
												
												
												
												
												 
												
												
												 
												 
										 }	
		                                Driver.updateKeywordSheet(Prov_recordset2);
						        }
					    
		                    }
				       
						}
					methodname=Driver.KeywordList.get(i).toString();
				   }
			
			      catch(Exception e)
					{
			    	  Utilities.ExtentFailReport(methodname,e);	  
					}
			
			 }

}
		