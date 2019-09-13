package credit_services;

import org.apache.commons.lang3.text.WordUtils;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.restassured.path.xml.XmlPath;

public class MNFSYS extends BaseClass{
		
	public static void agrGenerator(String strXmlData, int intCount, String strUrl) throws FilloException{
		
		for (int i = 1; i <= intCount; i++) {
			
			String xmlData=strXmlData, responseData="", updateQuery="", agrNum="";
			Recordset MS_recordSet;
			
			//***replace variables with values in parameterised XML**
			MS_recordSet = connection.executeQuery("Select * from MNFSYS Where SI_NO='"+i+"'");
			MS_recordSet.next();
			for (int j = 0; j < MS_recordSet.getFieldNames().size(); j++) {
				String variable = WordUtils.capitalize(MS_recordSet.getField(j).name().toLowerCase());
				if (xmlData.contains(variable)) {
					String value =(MS_recordSet.getField(j).value());
					//System.out.println(variable+": "+value);
					xmlData =  xmlData.replace(variable, value);
				}
			}
			//System.out.println(xmlData);
			
			responseData = execute("application/xml; charset=US-ASCII", xmlData, strUrl);
			//System.out.println(responseData);
			//Parse the response with XmlPath 			
			XmlPath xml = new XmlPath(responseData).setRoot("Envelope.Body.CreateProposalV2ResponseParameter.AgreementList.Agreement");
			//Get the value by giving the node name in the xml
			agrNum = xml.getString("AgreementNumber");
			
		    if (!agrNum.equalsIgnoreCase("")) {			    
		    	updateQuery = "Update MNFSYS Set AGREEMENT_NUMBER ='"+agrNum+"' Where SI_NO='"+i+"'";
			}
		    else{
		    	updateQuery = "Update MNFSYS Set AGREEMENT_NUMBER ='error!' Where SI_NO='"+i+"'";
		    }
		    connection.executeUpdate(updateQuery); 
		}
	}
}
