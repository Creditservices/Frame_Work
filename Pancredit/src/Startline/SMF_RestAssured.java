package Startline;



	import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
	import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.text.WordUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.codoid.products.exception.FilloException;

	import Common_Funtions.Agreement_Store;
	import Common_Funtions.Configuration;
	import Common_Funtions.Driver;
import Common_Funtions.Utilities;
import io.restassured.response.ValidatableResponse;
	import io.restassured.RestAssured;



	public class SMF_RestAssured {
		   public static String XMLpath=Configuration.Datapath+Driver.Projects+".xlsx";
		   public static List<String> Agreement;
		   public static List<String> getUrl;
		   public static String Agreement_Number,AgreementNumber;
		   public static HashMap<String, String> Tag_value = new HashMap<String, String>();
		   public static boolean flag;
		   public static String Student_Url;
		   public static String XML;
		
		public static void CreateAgreement() throws FilloException, SAXException, IOException, ParserConfigurationException
		{
			try
			{
					String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());	
				    XML= Driver.recordset2.getField("XMLData");
			

					ValidatableResponse response=RestAssured.given()
			        .contentType("text/xml")
			        .body(XML)
			        .when()
			        .post("https://smfsys.pancredit.com/pdi-saas-web-services/CreateProposalV2?wsdl")
			        .then().assertThat()
			        .statusCode(200);
				    String agreement=response.extract().body().asString();
		    
				    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				    InputSource src = new InputSource();
				    src.setCharacterStream(new StringReader(agreement));
				    Document doc = builder.parse(src);
				    doc.getDocumentElement().normalize();
				    NodeList nList = doc.getElementsByTagName("tns:Agreement"); 
				    int t=nList.getLength();
		    
						    for (int temp = 0; temp < t; temp++) 
						    {
						    	Node nNode = nList.item(temp);
						    	System.out.println("\nCurrent Element :" + nNode.getNodeName());
							    	if (nNode.getNodeType() == Node.ELEMENT_NODE) 
							    	{
							    		Element eElement = (Element) nNode;
							    		Tag_value.put("tns:AgreementNumber", eElement.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent());
							    		System.out.println(Tag_value.get("tns:AgreementNumber"));
							    		
							    	}
						    }
						    if(Tag_value.get("tns:AgreementNumber")!=null)
						    {
//						   
							    flag=true;
							    Agreement_Number=Tag_value.get("tns:AgreementNumber").toString();
								Utilities.ExtentPassReport(methodname);
				                Agreement_Store.Store_Data(Driver.Project,Agreement_Number,Student_Url,Driver.recordset2);
						    }
						    else
						    {
						    	flag=true;
						    	Utilities.ExtentFailReport(methodname);	
						    	
						    }
							}
        catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Please change the datas in the data Sheet1");
		}
			
	}
	
		public static void CheckDecision() throws Exception
		{
			try
			{
					String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
					XML= Driver.recordset2.getField("CheckDxmldata");
					
					String Agrnumber=Driver.getData("Agreement_Number").toString();
			        XML =  XML.replace("Agrnumber",Agrnumber); 
			        	
			      
					ValidatableResponse response=RestAssured.given()
			        .contentType("text/xml")
			        .body(XML)
			        .when()
			        .post("https://smfsys.pancredit.com/pdi-saas-web-services/CheckDecisionV2?wsdl")
			        .then().assertThat()
			        .statusCode(200);
				    String agreement=response.extract().body().asString();
				   
				    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				    InputSource src = new InputSource();
				    src.setCharacterStream(new StringReader(agreement));
				    Document doc = builder.parse(src);
				    doc.getDocumentElement().normalize();
				    NodeList nList = doc.getElementsByTagName("tns:AgreementStatus"); 
				    int t=nList.getLength();
		    
						    for (int temp = 0; temp < t; temp++) 
						    {
						    	Node nNode = nList.item(temp);
						    	System.out.println("\nCurrent Element :" + nNode.getNodeName());
						    	if (nNode.getNodeType() == Node.ELEMENT_NODE) 
						    	{
						    		
						    		Element eElement = (Element) nNode;
						    		Tag_value.put("tns:Decision", eElement.getElementsByTagName("tns:Decision").item(0).getTextContent());
						    		System.out.println(Tag_value.get("tns:Decision"));
						    		
						    	}
						    		if(Tag_value.get("tns:Decision").toString().equalsIgnoreCase(Driver.getData("Verification")))
						    		{
						    			Utilities.ExtentPassReport(methodname);
						    		}
						    		
						    		else
						    		{
						    			Utilities.ExtentFailReport(methodname);
						    		}
						    	
							}
		
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
		
		public static void UpdateAgreemnet() throws Exception
		{
			try
			{
			
						String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				   	    XML= Driver.recordset2.getField("UpdateXMLData");
					    String Agrnumber=Driver.getData("Agreement_Number").toString();
				        XML =  XML.replace("Uagrnum",Agrnumber); 
					    	
					          for (int i=80; i<=99; i++)	
					          	{
					          	String CurrFieldname = WordUtils.capitalize(Driver.recordset2.getField(i).name().toLowerCase());
					          	String CurrFieldValue = Driver.recordset2.getField(i).value();
					          	XML =  XML.replace(WordUtils.capitalize(CurrFieldname), CurrFieldValue); 	   
					            }
				          
				          
				          
				        ValidatableResponse response=RestAssured.given()
				        .contentType("text/xml")
				        .body(XML)
				        .when()
				        .post("https://smfsys.pancredit.com/pdi-saas-web-services/UpdateProposal?wsdl")
				        .then().assertThat()
				        .statusCode(200);
					    String agreement=response.extract().body().asString();
					    
					    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
					    InputSource src = new InputSource();
					    src.setCharacterStream(new StringReader(agreement));
					    Document doc = builder.parse(src);
					    doc.getDocumentElement().normalize();
					    NodeList nList = doc.getElementsByTagName("SOAP:Body"); 
					    int t=nList.getLength();
					    
							    for (int temp = 0; temp < t; temp++) 
							    {
							    	Node nNode = nList.item(temp);
							    	System.out.println("\nCurrent Element :" + nNode.getNodeName());
							    	if (nNode.getNodeType() == Node.ELEMENT_NODE) 
							    	{
							    		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
										Date sdate = new Date();
										String datetimestart=dateFormat.format(sdate);
							    		Element eElement = (Element) nNode;
							    		Tag_value.put("tns:CompletedSuccessfully", eElement.getElementsByTagName("tns:CompletedSuccessfully").item(0).getTextContent());
							    		System.out.println(Tag_value.get("tns:CompletedSuccessfully"));
							    	
							    		if(Tag_value.get("tns:CompletedSuccessfully").toString().equalsIgnoreCase("true"))
							    		{
							    			Utilities.ExtentPassReport(methodname);
							    		}
							    		else
							    		{
							    			Utilities.ExtentFailReport(methodname);
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
