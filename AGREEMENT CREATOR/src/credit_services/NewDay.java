package credit_services;

import org.apache.commons.lang3.text.WordUtils;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.restassured.path.xml.XmlPath;

public class NewDay extends BaseClass{
	
	public static void agrGenerator(String strXmlData1, String strXmlData2, int intCount, String strUrl) throws FilloException{
		
		for (int i = 1; i <= intCount; i++) {
			
			String xmlData1=strXmlData1, xmlData2=strXmlData2, responseData1="", responseData2="",updateQuery="", agrNum="";
			Recordset ND_recordSet;
			
			//***replace variables with values in parameterised XML***
			ND_recordSet = connection.executeQuery("Select * from NEWDAY Where SI_NO='"+i+"'");
			ND_recordSet.next();
			
			for (int j = 0; j < ND_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(ND_recordSet.getField(j).name().toLowerCase());
				if (xmlData1.contains(variable)) {
					String value =ND_recordSet.getField(j).value();
					xmlData1 =  xmlData1.replace(variable, value);
		       	 	
				}
			}
			//System.out.println(xmlData1);
			responseData1 = execute("text/xml", xmlData1, strUrl);
			XmlPath xml1 = new XmlPath(responseData1).setRoot("Envelope.Body.UpdateLoanApplicationResponseParameter.Agreement");
			//Get the value by giving the node name in the xml
			agrNum = xml1.getString("AgreementNumber");
		    if (!agrNum.equalsIgnoreCase("")) {
		    	xmlData2 =  xmlData2.replace("AGREEMENT_NUMBER", agrNum);
		    	responseData2 = execute("text/xml", xmlData2, strUrl);	
			}
		    else{
		    	updateQuery = "Update NEWDAY Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
		    }
		    XmlPath xml2 = new XmlPath(responseData2).setRoot("Envelope.Body.SignAgreementResponseParameter.Agreement");
			//Get the value by giving the node name
			String status = xml2.getString("PrimaryStatusDescription");
		    if (status.equalsIgnoreCase("Active")) {
		    	updateQuery = "Update NEWDAY Set AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";  
		    }
		    else{
		    	updateQuery = "Update NEWDAY Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
		    }
		    connection.executeUpdate(updateQuery);
		}
	}
}
