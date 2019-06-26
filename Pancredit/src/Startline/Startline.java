package Startline;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import Common_Funtions.Common_Property;
import Common_Funtions.Configuration;
import Common_Funtions.Driver;
import Common_Funtions.Utilities;
import Provident.Provident;






public class Startline {
	
	public static Recordset SMF_recordset1, SMF_recordset2;
	public static Connection connection;
	public static Fillo fillo;
	public static String strQuery,str,getref;
	public static List<String> KeywordList = Arrays.asList();
	public static int flag,i;
	
	public static void main(String args[])throws Exception
	{
		try
		{
		Driver.Project_Fillo("Startline");
		}
		catch(Exception e)
		{
			 System.out.println(e);
		}
		
	}
	
	public static void ExtentPassReport(String TestName,String Desc,String ActualResult,String datetimestart) throws IOException, InterruptedException, FilloException
	{
	try
	{
		    Utilities.test_step="Pass";
		    Utilities.test.log(Status.INFO, TestName+" Initiated");
		    //test.log(Status.PASS, TestName+" Executed Successfully");
	    if(Common_Property.driver==null)
	    {
	    	Utilities.test.pass(TestName +" has been executed successfully ");
	    	
	    }
	    else
	    {
	    	Utilities.test.pass(TestName +" has been executed successfully ", MediaEntityBuilder.createScreenCaptureFromPath(Utilities.Capture_Screenshot(TestName)).build());
		    
	    }
	        Utilities.extent.flush();
		}
		catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	

	}

	public static void ExtentFailReport(String TestName,String Desc,String ActualResult,String datetimestart) throws IOException, FilloException, InterruptedException
	{
		
    try
    {
			Utilities.test_step="Fail";
			Utilities.test.log(Status.INFO, TestName+ " Initiated");
		if(Common_Property.driver==null)
	    {
			Utilities.test.fail(TestName +" has been executed successfully ");
	    	
	    }
		else
		{
		
			//test.log(Status.FAIL, TestName+" execution has Failed");
			Utilities.test.fail(TestName +" has been failed find the below Screenshot ",MediaEntityBuilder.createScreenCaptureFromPath(Utilities.Capture_Screenshot(TestName)).build());
		}
		    Utilities.extent.flush();
     }
    catch(Exception e)
    {
    		System.out.println(e);
    }
	
	}
	



	public static void StartlineInitiated(String getKeyword) throws NullPointerException, Exception
		
		{
			try
			{
					Driver.ChooseKeywordSheet(SMF_recordset1);
					
					while(Driver.recordset1.next())
					{
						Utilities.reportinitiated(Driver.recordset1);
						Driver.ChooseKeywordsheetvalue(Driver.recordset1);
						Driver.updateKeywordSheet(SMF_recordset2);
						
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
												SMF_RestAssured.CreateAgreement();  
												break; 
											
											case "CheckDecision":
												SMF_RestAssured.CheckDecision();
												break;
												
											case "UpdateAgreemnet":	
												SMF_RestAssured.UpdateAgreemnet();
												break;
											case "Launch_smf_Url":
											      Common_Property.Launch_smf_Url();
											      break;
											case "Launch_Backoffice_Url":    
												Common_Property.Launch_Backoffice_Url();
											 break;
											 
											 
											
											 
											case "Launch_FrontOffice_URL":    
												Common_Property.Launch_FrontOffice_URL();
											 break;
											
											 
										
											 //Motonova  LOGINS
											
											case "Startline_Login":    
												Common_Property.Startline_Login();
											 break;
											case "FO_Login":    
												Common_Property.FO_Login();
											 break;		
											case "BO_Login":    
												Common_Property.BO_Login();
											 break;
											 

										
											
											 // Motonova logout
											 
											case "Quit":
									       Common_Property.driver.quit();			
											break;
											 
											 //Motonova functions
											 
											case "PersonSearch":    
												smf.PersonSearch();
											 break;
											
											 
											case "Terms":    
												smf.Terms();
											 break; 
											 
											case "Termscontinue":    
												smf.Termscontinue();
											 break; 
											 
											 
											case "Personaldetails":    
												smf.Personaldetails();
											 break; 
											
											case "Affordabilitydetails":    
												smf.Affordabilitydetails();
											 break;
											 
											case "Employmentdetails":    
												smf.Employmentdetails();
											 break;
											 
											case "Guarantorsdetails":    
												smf.Guarantorsdetails();
											 break;
											 
											case "Securitydetails":    
												smf.Securitydetails();
											 break;
											 
											 
											case "Financials":    
												smf.Financials();
											 break;
											 
											case "Balloonfinancials":    
												smf.Balloonfinancials();
											 break;
											
											 
											case "CallvalBureaudatas":    
												smf.CallvalBureaudatas();
											 break;
											 
											case "PDIAgrReferred":    
												smf.PDIAgrReferred();
											 break;
											 
												
											case "PDI_Score_Validate":    
												smf.PDI_Score_Validate();
											 break;
											 
											case "GetEsignURL":    
												smf.GetEsignURL();
											 break; 
											
											case "Esignflow":    
												smf.Esignflow();
											 break;
											 
											case "Redoesignflow":    
												smf.Redoesignflow();
											 break;
											 
											case "Fileuploadesignflow":    
												smf.Fileuploadesignflow();
											 break;
										
											case "Reverttoesign":    
												smf.Reverttoesign();
											 break;
											
											case "Esignsessiontimeout":    
												smf.Esignsessiontimeout();
											 break;
											 
											case "Prevetmanualdecline":    
												smf.Prevetmanualdecline();
											 break;
											 
											
												
											case "Esigncancel":    
												smf.Esigncancel();
											 break;
											
											case "FLAutoRejection":    
												smf.FLAutoRejection();
											 break;
											 
											case "Esignsaveexit":    
												smf.Esignsaveexit();
											 break;
											case "Esigsecurityfail":    
												smf.Esigsecurityfail();
											 break;
											 
											case "Esigdrivefail":    
												smf.Esigdrivefail();
											 break;
											 
											 
											case "Esignpassevents":    
												smf.Esignpassevents();
											 break;
											 
											case "Esigneventpassgeneration":    
												smf.Esigneventpassgeneration();
											 break;
											 
											
											
											case "IOCSURL":    
												smf.IOCSURL();
											 break;
											 
											case "PutIOCSURL":    
												smf.PutIOCSURL();
											 break;
											 
											case "Managedocerror":    
												smf.Managedocerror();
											 break;
											 
											
											case "PDIPayoutandGolive":    
												smf.PDIPayoutandGolive();
											 break;
											 
												
											
										
											case "Mpayoutgolive":    
												smf.Mpayoutgolive();
											 break;
											 
											case "Agreementrigrredo":    
												smf.Agreementrigrredo();
											 break;
											 
											case "Agr_afteresign_redo":    
												smf.Agr_afteresign_redo();
											 break;
											
											 
											case "BO_Addtionalatt_check":    
												smf.BO_Addtionalatt_check();
											 break;
											 
											case "BO_TieredPricing_Batchrun":    
												smf.BO_TieredPricing_Batchrun();
											 break;
											 
											case "TieredpricingSQL":    
												smf.TieredpricingSQL();
											 break;
											
											case "SMF_Tieredpricing":    
												smf.SMF_Tieredpricing();
											 break;
											 
											case "SMF_Without_TP":    
												smf.SMF_Without_TP();
											 break;
											 
											case "SMF_TieredpricingUpdate":    
												smf.SMF_TieredpricingUpdate();
											 break;
											 
											case "WithoutTPSQL":    
												smf.WithoutTPSQL();
											 break;
											 
											case "WithGuarantors":    
												smf.WithGuarantors();
											 break; 
											
											case "Finishlinebrand":    
												smf.Finishlinebrand();
											 break;
											
											 
											case "Addresshistory":    
												smf.Addresshistory();
											 break;
											 
											case "PDIAddresshistory":    
												smf.PDIAddresshistory();
											 break;
											
											
											
											 
										
											case "PDIAgr_Login":    
												smf.PDIAgr_Login();
											 break;
											

											case "Docsreceived":    
												smf.Docsreceived();
											 break;
											 
										
											
											case "Update_compareV2":    
												smf.Update_compareV2();
											 break;
											 
											case "Update_compareV1":    
												smf.Update_compareV1();
											 break;
												
										
											case "PCP_UpdateV2_CP1":    
												smf.PCP_UpdateV2_CP1();
											 break;
											 
											
											 
											case "PCP_UpdateV2_CP4validation1":    
												smf.PCP_UpdateV2_CP4validation1();
											 break;
											 
											case "PCP_UpdateV2_CP4validation2":    
												smf.PCP_UpdateV2_CP4validation2();
											 break;
											 
										
											 
											case "PCPCAL_PDIAgrUpdate_2":    
											AgreementUpdateV2.PCPCAL_PDIAgrUpdate_2();
											 break;
											 
											 
											case "SQLrefjdbc":    
												smf.SQLrefjdbc();
											 break;
											 
											case "Agreementsearch":    
												smf.Agreementsearch();
											 break;
											 
											case "Motoagrsearch":    
												smf.Motoagrsearch();
											 break;
											 
											case "Newagrsearch":    
												smf.Newagrsearch();
											 break;
											 
										
											 
											case "SQLEsignEvn":    
												smf.SQLEsignEvn();
											 break;
											
											case "PCP_CALCULATION_CP1":    
												smf.PCP_CALCULATION_CP1();
											 break;
											 
										
											 
											
											case "Callmanualapproved":    
												smf.Callmanualapproved();
											 break;
											 
											case "Callcondionalapproved":    
												smf.Callcondionalapproved();
											 break;
											 
											case "Manualrejection":    
												smf.Manualrejection();
											 break;
											 
											case "Declinedecisionresaon":    
												smf.Declinedecisionresaon();
											 break;
											 
											 
											 
											case "AutoRejected":    
												smf.AutoRejected();
											 break;
											 
											case "Negativeequity_SQL":    
												smf.Negativeequity_SQL();
											 break;
											 
											case "Smf_Negativeequity":    
												smf.Smf_Negativeequity();
											 break;
											 
											case "SMF_TP_Finishline":    
												smf.SMF_TP_Finishline();
											 break;
											 
											case "DL_license_validation":    
												smf.DL_license_validation();
											 break;
											 
										
											
											
										case "Returntointroducer":    
												smf.Returntointroducer();
											 break; 
										
											case "BO_Status_check":    
												smf.BO_Status_check();
												 break; 
												 
											case "BO_Esigneventspass_check":    
												smf.BO_Esigneventspass_check();
												 break; 
										
												 
											case "BO_PCPCAL_Setup":    
												smf.BO_PCPCAL_Setup();
												break;
												
											case "BO_PCPCAL_Securedtask":    
												smf.BO_PCPCAL_Securedtask();
												break;
												
													
											case "Bo_Startline_setup":    
											smf.Bo_Startline_setup();
												break; 
												
												
												 
											case "BO_RejStatus_check":    
												smf.BO_RejStatus_check();
												 break; 
												
											case "BO_Balloon_verification":    
												smf.BO_Balloon_verification();			
												break; 
												
												case "BoCallvalidateresponse":    
												smf.BoCallvalidateresponse();			
												break; 
												
												case "BO_TieredPricingEventsCheck":    
													smf.BO_TieredPricingEventsCheck();			
													break; 
											
												
										
										 //soap-ui agreement creation
											 case "CreateAgreementV2":    
											 AgreementCreationV2.CreateAgreementV2();
											 break;
											 
											 case "TieredpricingV2":    
												 AgreementCreationV2.TieredpricingV2();
												 break;
											 
											
											 
											 case "CreateAgreementV1":    
												 AgreementCreationV1.CreateAgreementV1();
												 break;
											 
											 case "Getaddresshistory":    
												 AgreementCreationV2.Getaddresshistory();
												 break;
												 
											 case "Contra_checkdecision":    
												 Checkdecision.Contra_checkdecision();
												 break;
												
									
											 // soap-ui agreement Updation
											 	case "Agr_UpdateV2":    
												 AgreementUpdateV2.Agr_UpdateV2();
												 break; 
												 
											 	case "Agr_UpdateV1":    
													 AgreementUpdateV1.Agr_UpdateV1();
													 break; 
												
											 case "Agr_checkdecision":    
												 Checkdecision.Agr_checkdecision();
											 break; 
												
					
				                      }	
					                    Driver.updateKeywordSheet(SMF_recordset2);
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


