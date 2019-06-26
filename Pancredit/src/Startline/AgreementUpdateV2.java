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





public class AgreementUpdateV2 {


public static class StartlineSoap
{
String AgreementNumber = "";
String Status = "";

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
		    String wsURL = "https://smfsys.pancredit.com/pdi-saas-web-services/UpdateProposalV2?wsdl";
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
		    String SOAPAction = "https://smfsys.pancredit.com/pdi-saas-web-services/UpdateProposalV2";
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


	    
	    if("Agreement".equalsIgnoreCase(status))
	    {
	    	
	    
	    	Thread.sleep(3000);
	    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date sdate = new Date();
		String datetimestart=dateFormat.format(sdate);
	    	
	    Thread.sleep(3000);
	    String formattedSOAPResponse = this.formatXML(outputString);
	    Thread.sleep(2000);
	    System.out.println("Result is"+formattedSOAPResponse);
	    Thread.sleep(2000);
	    Utilities.passresult("PDI_AgreementUpdate","Agreement Updated Successfully through PDI V2",null,datetimestart);
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
public static void Agr_UpdateV2() throws Exception
{
// TODO Auto-generated method stub
StartlineSoap objWebServiceCall = new StartlineSoap();
    try
    {
    Testdata.GetTDFiloconnection();	
	String status="Agreement";
	String xml =Testdata.getsheet1.getField("UpdateXMLData");
	String xml1=xml.replace("Uagrnum", Testdata.getStoreTD("Agreement_Number"));
    System.out.println("created xml"+xml1);
   	for (int i=71; i<=105; i++)	//testadata sheet field(columns from 9 t0 51)
    	{
    	 	
       	
      	 String CurrFieldname = WordUtils.capitalize(Testdata.getsheet1.getField(i).name().toLowerCase());
      	 String CurrFieldValue = Testdata.getsheet1.getField(i).value();
      	xml1 =  xml1.replace(WordUtils.capitalize(CurrFieldname), CurrFieldValue); 	   
      	}
    
    System.out.println("\n Find Value XML\n "+xml1);
    Thread.sleep(4000);

    objWebServiceCall.getLoginToken(xml1,status);
    
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
public static void PCPCAL_PDIAgrUpdate_2() throws Exception
{
// TODO Auto-generated method stub
StartlineSoap objWebServiceCall = new StartlineSoap();
    try
    {
    
    Testdata.GetTDFiloconnection();	
	String status="Agreement";
	String xml =Testdata.getsheet1.getField("UpdateXMLData1");
	String xml1=xml.replace("Uagrnum", Testdata.getStoreTD("Agreement_Number"));
    System.out.println("created xml"+xml1);
    
    
   	
   for (int i=75; i<=101; i++)	//testadata sheet field(columns from 9 t0 51)
    	{
    	 
	   		String CurrFieldname = WordUtils.capitalize(Testdata.getsheet1.getField(i).name().toLowerCase());
      	 String CurrFieldValue = Testdata.getsheet1.getField(i).value();
      	 xml1 =  xml1.replace(WordUtils.capitalize(CurrFieldname), CurrFieldValue); 	   
      	}
    
    System.out.println("\n Find Value XML\n "+xml1);
    Thread.sleep(1000);
    objWebServiceCall.getLoginToken(xml1,status);
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





