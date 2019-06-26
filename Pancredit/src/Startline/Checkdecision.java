package Startline1_package;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import Common_Funtions.Driver;
import Startline1_package.Checkdecision.StartlineSoap;

public class Checkdecision {
	public static String AgreementPDIstatus;
	
	public static class StartlineSoap
	{
	String AgreementNumber = "";
	String Status = "";
	String AgreementDecision = "";
	 

	  public String formatXML(String unformattedXml)
	  {
		  try
		    {
		      Document document = this.parseXmlFile(unformattedXml);
		      OutputFormat format = new OutputFormat(document);
		      format.setIndenting(true);
		      format.setIndent(3);
		      format.setOmitXMLDeclaration(true);
		      Writer out = new StringWriter();
		      XMLSerializer serializer = new XMLSerializer(out, format);
		      serializer.serialize(document);
		      return out.toString();
		    }
	    catch (IOException e)
	    {
	      throw new RuntimeException(e);
	    }
	  }

	  public String getLoginToken(String xmlInput1, String status) throws Exception
	  {
		  {

			    // Code to make a webservice HTTP request
			    String responseString = "";
			    String outputString = "";
			    String wsURL = "https://smfsys.pancredit.com/pdi-saas-web-services/CheckDecisionV2?wsdl";
			    String userName = "chennai";
			    String password = "chennai2018";
			    URL url = new URL(wsURL);
			    URLConnection connection = url.openConnection();
			    HttpURLConnection httpConn = (HttpURLConnection) connection;
			    ByteArrayOutputStream bout = new ByteArrayOutputStream();
			    byte[] buffer = new byte[xmlInput1.length()];
			    buffer = xmlInput1.getBytes();
			    bout.write(buffer);
			    byte[] b = bout.toByteArray();
			    String SOAPAction = "https://smfsys.pancredit.com/pdi-saas-web-services/CheckDecisionV2";
			    // Set the appropriate HTTP parameters.
			    httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
			    httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			    httpConn.setRequestProperty("SOAPAction", SOAPAction);
			    httpConn.setRequestMethod("POST");
			    httpConn.setDoOutput(true);
			    httpConn.setDoInput(true);
			    OutputStream out = httpConn.getOutputStream();
			    // Write the content of the request to the outputstream of the HTTP Connection.
			    out.write(b);
			    out.close();
			    // Ready with sending the request.

			    // Read the response.
			    InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
			    BufferedReader in = new BufferedReader(isr);

			    // Write the SOAP message response to a String.
			    while ((responseString = in.readLine()) != null)
			    {
			      outputString = outputString + responseString;
			    }


		    
		    
		    
		    if("Decision".equalsIgnoreCase(status))
		    {
		    String formattedSOAPResponse = this.formatXML(outputString);
		    System.out.println("Result is"+formattedSOAPResponse);
		    
		    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		    InputSource src = new InputSource();
		    src.setCharacterStream(new StringReader(formattedSOAPResponse));
		    
		    Document doc = builder.parse(src);
		    doc.getDocumentElement().normalize();
		    
		    //doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("tns:AgreementStatus"); 
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
		System.out.println("Data : " + eElement.getElementsByTagName("tns:Decision").item(0).getTextContent());
		AgreementPDIstatus=eElement.getElementsByTagName("tns:Decision").item(0).getTextContent();
		 Utilities.passresult("PDIAgr decision status","Agreement status in PDI is displayed as Data : "+AgreementPDIstatus,AgreementPDIstatus,datetimestart);
	
		}
		}
	}
		

		    if("ContraDecision".equalsIgnoreCase(status))
		    {
		    String formattedSOAPResponse = this.formatXML(outputString);
		    System.out.println("Result is"+formattedSOAPResponse);
		    
		    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		    InputSource src = new InputSource();
		    src.setCharacterStream(new StringReader(formattedSOAPResponse));
		    
		    Document doc = builder.parse(src);
		    doc.getDocumentElement().normalize();
		    
		    //doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("tns:AgreementStatus"); 
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
		System.out.println("Data : " + eElement.getElementsByTagName("tns:Decision").item(0).getTextContent());
		AgreementPDIstatus=eElement.getElementsByTagName("tns:Decision").item(0).getTextContent();
		System.out.println("Data : " + eElement.getElementsByTagName("tns:OutstandingSettlementAmount").item(0).getTextContent());
	//	if(("Data : " + eElement.getElementsByTagName("tns:Decision").item(0).getTextContent())).contains(Testdata.getTD(testdata))
		 Utilities.passresult("PDIAgr decision status","Agreement status in PDI is displayed as Data : " + eElement.getElementsByTagName("tns:Decision").item(0).getTextContent(),"Data : " + eElement.getElementsByTagName("tns:Decision").item(0).getTextContent(),datetimestart);
		 
			
		}
		}
	}
		
	
	  
		return Status;
		  }
		  }
	  
	  
	  

		  private Document parseXmlFile(String in)
		  {
		    try
		    {
		      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		      DocumentBuilder db = dbf.newDocumentBuilder();
		      InputSource is = new InputSource(new StringReader(in));
		      return db.parse(is);
		    }
		    catch (ParserConfigurationException e)
		    {
		      throw new RuntimeException(e);
		    }
		    catch (SAXException e)
		    {
		      throw new RuntimeException(e);
		    }
		    catch (IOException e)
		    {
		      throw new RuntimeException(e);
		    }
		  }
		} 

		//susmi
		public static void Agr_checkdecision() throws Exception 
		{
			{
				
				
				System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
				String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
				Date sdate = new Date();
				String datetimestart=dateFormat.format(sdate);		
				
				
				
			// TODO Auto-generated method stub
			StartlineSoap objWebServiceCall = new StartlineSoap();
			    try
			    {
			    	
			    	
			     String status="Decision";
				 Thread.sleep(750);
				 String xml=Driver.getData("CheckDxmldata");
				 String xmlInput =xml.replace("Agrnumber",Driver.getData("Agreement_Number"));
				 System.out.println("\n Check Decision XML\n "+xmlInput);
				 objWebServiceCall.getLoginToken(xmlInput,status);
				 // Utilities.Capture_Screenshot();
				 
			      }
			    catch (MalformedURLException e)
			    {
			      e.printStackTrace();
			    }
			    catch (IOException e)
			    {
			      e.printStackTrace();
			    }
			    
			    
		}

		
	}
		
		public static void Contra_checkdecision() throws Exception 
		{
			{
				
				
				System.out.println("Method Now Running: "+Thread.currentThread().getStackTrace()[1].getMethodName());
				String methodname =(Thread.currentThread().getStackTrace()[1].getMethodName());
				
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
				Date sdate = new Date();
				String datetimestart=dateFormat.format(sdate);		
				
				
				
			// TODO Auto-generated method stub
			StartlineSoap objWebServiceCall = new StartlineSoap();
			    try
			    {
			    	
			    	
			     String status="ContraDecision";
				 Thread.sleep(750);
				 String xml=Testdata.getTD("CheckDxmldata");
				 String xmlInput =xml.replace("Agrnumber",Testdata.getStoreTD("Agreement_Number")); 
				 System.out.println("\n Check Decision XML\n "+xmlInput);
				 objWebServiceCall.getLoginToken(xmlInput,status);
				  Utilities.Capture_Screenshot();
				 
			      }
			    catch (MalformedURLException e)
			    {
			      e.printStackTrace();
			    }
			    catch (IOException e)
			    {
			      e.printStackTrace();
			    }
			    
			    
		}

		
	}
}



