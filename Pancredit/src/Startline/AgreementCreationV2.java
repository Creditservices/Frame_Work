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

import org.apache.commons.lang3.text.WordUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;





public class AgreementCreationV2 

{
	public static String status1=null;
	public static String agrdata;

public static class StartlineSoap
{
	String AgreementNumber = "";
	String Status = "";
	String Agreementdata="";


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
		    Thread.sleep(750);
		    String outputString = "";
		    Thread.sleep(750);
		    String wsURL = "https://smfsys.pancredit.com/pdi-saas-web-services/CreateProposalV2?wsdl";
		    Thread.sleep(750);
		    String userName = "chennai";
		    Thread.sleep(750);
		    String password = "chennai2018";
		    Thread.sleep(750);
		    URL url = new URL(wsURL);
		    Thread.sleep(750);
		    URLConnection connection = url.openConnection();
		    Thread.sleep(750);
		    HttpURLConnection httpConn = (HttpURLConnection) connection;
		    Thread.sleep(750);
		    ByteArrayOutputStream bout = new ByteArrayOutputStream();
		    Thread.sleep(750);
		    byte[] buffer = new byte[xmlInput1.length()];
		    Thread.sleep(750);
		    buffer = xmlInput1.getBytes();
		    Thread.sleep(750);
		    bout.write(buffer);
		    Thread.sleep(750);
		    byte[] b = bout.toByteArray();
		    Thread.sleep(750);
		    String SOAPAction = "https://smfsys.pancredit.com/pdi-saas-web-services/CreateProposalV2";
		    Thread.sleep(750);
		    
		    // Set the appropriate HTTP parameters.
		    httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
		    Thread.sleep(750);
		    httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		    Thread.sleep(750);
		    httpConn.setRequestProperty("SOAPAction", SOAPAction);
		    Thread.sleep(750);
		    httpConn.setRequestMethod("POST");
		    Thread.sleep(750);
		    httpConn.setDoOutput(true);
		    Thread.sleep(750);
		    httpConn.setDoInput(true);
		    Thread.sleep(750);
		    OutputStream out = httpConn.getOutputStream();
		    Thread.sleep(750);
		    
		    // Write the content of the request to the outputstream of the HTTP Connection.
		    out.write(b);
		    Thread.sleep(750);
		    out.close();
		    Thread.sleep(750);
		    
		    // Ready with sending the request.
		    // Read the response.
		    InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
		    Thread.sleep(750);
		    BufferedReader in = new BufferedReader(isr);
		    Thread.sleep(750);

		    // Write the SOAP message response to a String.
		    while ((responseString = in.readLine()) != null)
		    {
		      outputString = outputString + responseString;
		    }

    
		    if("Agreement".equalsIgnoreCase(status))
		    {
		    	Thread.sleep(750);
		    	String formattedSOAPResponse = this.formatXML(outputString);
		    	Thread.sleep(750);
		    	System.out.println("Result is"+formattedSOAPResponse);
		    	Thread.sleep(750);
    
		    	DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		    	Thread.sleep(750);
		    	InputSource src = new InputSource();
		    	Thread.sleep(750);
		    	src.setCharacterStream(new StringReader(formattedSOAPResponse));
		    	Thread.sleep(750);
    
		    	Document doc = builder.parse(src);
		    	Thread.sleep(750);
		    	doc.getDocumentElement().normalize();
		    	Thread.sleep(750);
    
		    	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		    	Thread.sleep(750);
		    	NodeList nList = doc.getElementsByTagName("tns:Agreement"); 
		    	Thread.sleep(750);
		    	int t=nList.getLength();
		    	Thread.sleep(750);

		    	for (int temp = 0; temp < t; temp++) 
		    	{
		    		Thread.sleep(750);
		    		Node nNode = nList.item(temp);
		    		Thread.sleep(750);
		    		System.out.println("\nCurrent Element :" + nNode.getNodeName());
		    		Thread.sleep(750);
		    		if (nNode.getNodeType() == Node.ELEMENT_NODE) 
		    		{
		    			DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		    			Date sdate = new Date();
		    			String datetimestart=dateFormat.format(sdate);
		    			Thread.sleep(750);
		    			Element eElement = (Element) nNode;
		    			Thread.sleep(750);
		    			System.out.println("Data : " + eElement.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent());
		    			Thread.sleep(750);
		    			AgreementNumber=eElement.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent();
		    			Thread.sleep(750);
		    			Driver.get_ag_no = AgreementNumber;
		    			Testdata.PutstoreTD(AgreementNumber, "Agreement_Number");
		    			Utilities.passresult("PDI_Agreement","Agreement Created Successfully through PDI V2",AgreementNumber,datetimestart);
		    		}
		    	}
             }
		    		if("GETPDIDATA".equalsIgnoreCase(status))
		    		{
		    			String formattedSOAPResponse = this.formatXML(outputString);
		    			System.out.println("Result is"+formattedSOAPResponse);
    
		    			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		    			InputSource src = new InputSource();
		    			src.setCharacterStream(new StringReader(formattedSOAPResponse));
    
		    			Document doc = builder.parse(src);
		    			doc.getDocumentElement().normalize();
    
   

		    			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		    			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		    			NodeList nList = doc.getElementsByTagName("tns:Occupancy"); 
		    			NodeList nList1 = doc.getElementsByTagName("tns:Agreement"); 
		    			
		    			
		    			int t=nList.getLength();
		    			int t1=nList1.getLength();

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
		    					System.out.println("Data : " + eElement.getElementsByTagName("tns:TimeAtAddressYears").item(0).getTextContent());
		    					Agreementdata=eElement.getElementsByTagName("tns:TimeAtAddressYears").item(0).getTextContent();
		    					agrdata=Agreementdata;
		    					Testdata.PutstoreTD(Agreementdata, "Agreementdata"); 
		    					Utilities.passresult("PDI_Agreement","Address history Successfully taken through PDI V2",Agreementdata,datetimestart);
		    				}
		    			}
    
		    			for (int temp = 0; temp < t1; temp++) 
		    			{
		    				Node nNode1 = nList1.item(temp);
		    				System.out.println("\nCurrent Element :" + nNode1.getNodeName());
		    				if (nNode1.getNodeType() == Node.ELEMENT_NODE) 
		    				{
		    					
		    					DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		    					Date sdate = new Date();
		    					String datetimestart=dateFormat.format(sdate);
	    					Element eElement1 = (Element) nNode1;
	    					System.out.println("Data : " + eElement1.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent());
	    					AgreementNumber=eElement1.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent();
	    					Driver.get_ag_no = AgreementNumber;
	    					Testdata.PutstoreTD(AgreementNumber, "Agreement_Number");
	    					Utilities.passresult("PDI_Agreement","Agreement Created Successfully through PDI V2",AgreementNumber,datetimestart);
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


public static void CreateAgreementV2() throws Exception

{
// TODO Auto-generated method stub
StartlineSoap objWebServiceCall = new StartlineSoap();
    try
    {
    	
    	Testdata.GetTDFiloconnection();
    	String status="Agreement";	
    	Thread.sleep(2000);
        String xml =Testdata.getsheet1.getField("XMLData");
        Thread.sleep(2000);
     	objWebServiceCall.getLoginToken(xml,status);
     	Thread.sleep(700);
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

public static void Getaddresshistory() throws Exception 

{
	// TODO Auto-generated method stub
	StartlineSoap objWebServiceCall = new StartlineSoap();
	    try
	    {
	    	Testdata.GetTDFiloconnection();
	    	String status="GETPDIDATA";
	    	status1="GETPDIDATA";
	    	Thread.sleep(850);
	    	 String xml =Testdata.getsheet1.getField("XMLData");
	    	Thread.sleep(750);
	        objWebServiceCall.getLoginToken(xml,status);
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

public static void TieredpricingV2() throws Exception 
{
	// TODO Auto-generated method stub
	StartlineSoap objWebServiceCall = new StartlineSoap();
	    try
	    {
	    	 	Testdata.GetTDFiloconnection();  	
		      	String status="Agreement";
		      	String xml1 =Testdata.getsheet1.getField("XMLData1");
		        String xml2=xml1.replace("Createrate",Testdata.getsheet1.getField("Createrate"));
		        String xml=xml2.replace("Createdtype",Testdata.getsheet1.getField("Createdtype"));
		        System.out.println("created xml"+xml);
		        //Testdata.getvalue1.next();
	        objWebServiceCall.getLoginToken(xml,status);
	        Thread.sleep(750);
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
