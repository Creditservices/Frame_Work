package credit_services;

import org.apache.commons.lang3.text.WordUtils;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public class Provident extends BaseClass{
		
	public static void agrGenerator(String strXmlData1, String strXmlData2, String strXmlData3, String strXmlData4, String strXmlData5, 
			 String strXmlData6, int intCount, String StrUrl, String strUsrName, String strPassWord) throws FilloException{
				
		for (int i = 1; i <= intCount; i++) {
			
			String xmlData1=strXmlData1, xmlData2=strXmlData2, xmlData3=strXmlData3, xmlData4=strXmlData4, xmlData5=strXmlData5, xmlData6=strXmlData6;
			String responseData="",applicationKnownvalue="",applicationValue="",applicationBankValue="", applicationCardValue="";
			String applicationESignatureValue="",updateAgreementValue="", contentType = "text/xml";
			Recordset PR_recordSet;
						
			boolean flag = true;
			String personId = "",agrNum = "",appDecisionCode1 = "", appDecisionCode2 = "", eSignStatus = "";
			String primaryStatus ="", secondaryStatus = "",updateQuery = "";
						
			//***replace variables with values in parameterised XML
			PR_recordSet = connection.executeQuery("Select * from PROVIDENT Where SI_NO='"+i+"'");
			PR_recordSet.next();
			
			for (int j = 0; j < PR_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(PR_recordSet.getField(j).name().toLowerCase());
				if (xmlData1.contains(variable)) {
					String value =PR_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
		       	 	xmlData1 =  xmlData1.replace(variable, value);
		       	 	
				}
				else if (xmlData2.contains(variable)) {
					String value =PR_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
		       	 	xmlData2 =  xmlData2.replace(variable, value);
		       	 	
				}
				else if (xmlData3.contains(variable)) {
					String value =PR_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
					xmlData3 =  xmlData3.replace(variable, value);
		       	 	
				}
				else if (xmlData4.contains(variable)) {
					String value =PR_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
					xmlData4 =  xmlData4.replace(variable, value);
		       	 	
				}
				else if (xmlData5.contains(variable)) {
					String value =PR_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
					xmlData5 =  xmlData5.replace(variable, value);
		       	 	
				}
				else if (xmlData6.contains(variable)) {
					String value =PR_recordSet.getField(j).value();
					//System.out.println(variable+": "+value);
					xmlData6 =  xmlData6.replace(variable, value);
		       	 	
				}
			}
			
			responseData = execute(contentType, StrUrl+"/providentSatsumaApi/token/?username="+strUsrName+"&password="+strPassWord);
			
			//***applicationKnownvalue
	        if (responseData.contains("<ApplicantKnown>")) {
	        	
				//Extract token values from responseData
				applicationKnownvalue= splitValues(responseData, "<ApplicantKnown>","</ApplicantKnown>");
				applicationValue= splitValues(responseData, "<Application>","</Application>");	
			    applicationBankValue= splitValues(responseData, "<ApplicationBank>","</ApplicationBank>");
			    applicationCardValue= splitValues(responseData, "<ApplicationCard>","</ApplicationCard>");
			    applicationESignatureValue= splitValues(responseData, "<ApplicationESignature>","</ApplicationESignature>");
		        updateAgreementValue= splitValues(responseData, "<UpdateAgreementDecision>","</UpdateAgreementDecision>");
		        		        
		        responseData = execute(contentType, StrUrl+applicationKnownvalue+"?xml="+xmlData1);
		        //Extract person Id from response data
		        if (responseData.contains("<PersonID>")) {
		        	personId = splitValues(responseData, "<PersonID>","</PersonID>");
				}
		        
		        
			}else {
				flag = false;
				updateQuery = "Update PROVIDENT Set AGREEMENT_NUMBER ='error in getting token!' Where SI_NO='"+i+"'";	
			}
	        
	        //***applicationValue
	        if (!personId.equalsIgnoreCase("") && flag) {
	        	applicationValue = applicationValue.replace("PERSONID", personId);
		        
		        responseData = execute(contentType, StrUrl+applicationValue+"?xml="+xmlData2);
		        //Extract agreement number from response data
		        if (responseData.contains("<AgreementNumber>")) {
		        	agrNum = splitValues(responseData, "<AgreementNumber>","</AgreementNumber>");
				}
		        
			}else {
				flag = false;
				updateQuery = "Update PROVIDENT Set AGREEMENT_NUMBER ='error in generating person Id!' Where SI_NO='"+i+"'";	
			}
	        
	        //***applicationBankValue
	        if (!agrNum.equalsIgnoreCase("") && flag) {
	        	applicationBankValue = applicationBankValue.replace("AGREEMENTNUMBER", agrNum);
		        responseData = execute(contentType, StrUrl+applicationBankValue+"?xml="+xmlData3);
		        //Extract application decision code from response data by splitting
		        if (responseData.contains("<ApplicationDecisionCode>")) {
		        	appDecisionCode1 = splitValues(responseData, "<ApplicationDecisionCode>","</ApplicationDecisionCode>");
				}
		        
			}else {
				flag = false;
				updateQuery = "Update PROVIDENT Set AGREEMENT_NUMBER ='error in generating Agreement number!' Where SI_NO='"+i+"'";	
			}
	        
	        //***applicationCardValue
	        if (appDecisionCode1.equalsIgnoreCase("C") && flag) {
	        	applicationCardValue = applicationCardValue.replace("AGREEMENTNUMBER", agrNum);
		        responseData = execute(contentType, StrUrl+applicationCardValue+"?xml="+xmlData4);
		        //Extract application decision code from response data
		        if (responseData.contains("<ApplicationDecisionCode>")) {
		        	appDecisionCode2 = splitValues(responseData, "<ApplicationDecisionCode>","</ApplicationDecisionCode>");
				}
		        
			}else {
				flag = false;
				updateQuery = "Update PROVIDENT Set AGREEMENT_NUMBER ='error in passing application bank value step!' Where SI_NO='"+i+"'";	
			}
	        
	        //***applicationESignatureValue
	        if (appDecisionCode2.equalsIgnoreCase("C") && flag) {
	        	applicationESignatureValue = applicationESignatureValue.replace("AGREEMENTNUMBER", agrNum);
		        responseData = execute(contentType, StrUrl+applicationESignatureValue+"?xml="+xmlData5);
		        //Extract ESignatureRecorded from response data
		        if (responseData.contains("<ESignatureRecorded>")) {
		        	eSignStatus = splitValues(responseData, "<ESignatureRecorded>","</ESignatureRecorded>");
				}
		        
			}else {
				flag = false;
				updateQuery = "Update PROVIDENT Set AGREEMENT_NUMBER ='error in passing application card value step!' Where SI_NO='"+i+"'";	
			}
	        
	        //***updateAgreementValue
	        if (eSignStatus.equalsIgnoreCase("TRUE") && flag) {
	        	updateAgreementValue = updateAgreementValue.replace("AGREEMENTNUMBER", agrNum);
		        responseData = execute(contentType, StrUrl+updateAgreementValue+"?xml="+xmlData6);
		        
		        //System.out.println(agrNum);
		        //Extract primary and secondary status from response data
		        if (responseData.contains("<PrimaryStatusDescription>")) {
		        	primaryStatus = splitValues(responseData, "<PrimaryStatusDescription>","</PrimaryStatusDescription>");
			        secondaryStatus = splitValues(responseData, "<SecondaryStatusDescription>","</SecondaryStatusDescription>");
				}
		        
			}else {
				flag = false;
				updateQuery = "Update PROVIDENT Set AGREEMENT_NUMBER ='error in passing ESignature step!' Where SI_NO='"+i+"'";	
			}
	        
	        if (primaryStatus.equalsIgnoreCase("Proposal") && secondaryStatus.equalsIgnoreCase("Underwritten") && flag) {
	        	updateQuery = "Update PROVIDENT Set APPLICATIONKNOWNVALUE='"+applicationKnownvalue+"',AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";
			} else {
				updateQuery = "Update PROVIDENT Set APPLICATIONKNOWNVALUE='"+applicationKnownvalue+"',AGREEMENT_NUMBER ='error in agreement decisioning!' Where SI_NO='"+i+"'";	
			}
	        
	        connection.executeUpdate(updateQuery);
		}
		       	
	}
	
}
	
	
	
