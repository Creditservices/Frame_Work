

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

	import org.openqa.selenium.interactions.SendKeysAction;
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import org.w3c.dom.Node;
	import org.w3c.dom.NodeList;
	import org.xml.sax.InputSource;
	import org.xml.sax.SAXException;

	import com.sun.org.apache.xml.internal.serialize.OutputFormat;
	import com.sun.org.apache.xml.internal.serialize.XMLSerializer;


	public class AgreementCreationV1 {


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
			    String wsURL = "https://smfsys.pancredit.com/pdi-saas-web-services/CreateProposal?wsdl";
			    String userName = "chennai";
			    String password = "chennai2018";
			    URL url = new URL(wsURL);
			    URLConnection connection = url.openConnection();
			    HttpURLConnection httpConn = (HttpURLConnection) connection;
			    ByteArrayOutputStream bout = new ByteArrayOutputStream();
			    //String xmlInput1 ="<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"xmlns=\"http://ws.pancredit.com/wsdl\">\n" + "<SOAP-ENV:Header/>\n" + "<SOAP-ENV:Body>\n" + "<CreateProposalCallParameter>\n" + "<AgreementList>\n" + "<Agreement>\n" + "<AdminFee>0.00</AdminFee>\n" + "<OptionFee>10.00</OptionFee>\n" + "<AgreementNumber/>\n" + "<BankSortCode/>\n" + "<BankAccountNumber/>\n" + "<BranchName/>\n" + "<BrandName>Quality+ Brand</BrandName>\n" + "<ClassificationName>New Car</ClassificationName>\n" + "<ExceptionList/>\n" + "<ExternalReference/>\n" + "<FacilityList>\n" + "<Facility>\n" + "<ProductName>Gap Premium</ProductName>\n" + "<Premium>0.00</Premium>\n" + "</Facility>\n" + "<Facility>\n" + "<ProductName>Paint Protection Insurance</ProductName>\n" + "<Premium>0.00</Premium>\n" + "</Facility>\n" + "<Facility>\n" + "<ProductName>Tyre Insurance</ProductName>\n" + "<Premium>0.00</Premium>\n" + "</Facility>\n" + "<Facility>\n" + "<ProductName>Warranty</ProductName>\n" + "<Premium>0.00</Premium>\n" + "</Facility>\n" + "</FacilityList>\n" + "<GoodsCost>7500</GoodsCost>\n" + "<Instalment>259.90</Instalment>\n" + "<GuarantorList/>\n" + "<HolidayMonth/>\n" + "<IntroducerCode>DEL0238</IntroducerCode>\n" + "<IntroducerName/>\n" + "<NoteList>\n" + "<Note>\n" + "<NoteText>1</NoteText>\n" + "</Note>\n" + "<Note>\n" + "<NoteText>2</NoteText>\n" + "</Note>\n" + "</NoteList>\n" + "<NumberOfPayments>36</NumberOfPayments>\n" + "<PaymentMethod>Direct Debit</PaymentMethod>\n" + "<PersonalDetails>\n" + "<AddressDetailList>\n" + "<AddressDetail>\n" + "<Address>\n" + "<PropertyNumber>54</PropertyNumber>\n" + "<PropertyName/>\n" + "<StreetName>Top Gear Lane</StreetName>\n" + " <PostalTown>Test Town</PostalTown>\n" + "<PostCode>X9 9LF</PostCode>\n" + "<District/>\n" + "<County/>\n" + "<Country/>\n" + "</Address>\n" + "<Occupancy>\n" + "<TimeAtAddressYears>10</TimeAtAddressYears>\n" + "<TimeAtAddressMonths>4</TimeAtAddressMonths>\n" + "</Occupancy>\n" + "</AddressDetail>\n" + "</AddressDetailList>\n" + "<AffordabilityList>\n" + " <Affordability>\n" + "<Description>Gross Income</Description>\n" + "<FrequencyCode>M</FrequencyCode>\n" + "<Amount>2000</Amount>\n" + "</Affordability>\n" + "<Affordability>\n" + "<Description>Net Income</Description>\n" + "<FrequencyCode>M</FrequencyCode>\n" + "<Amount>1500</Amount>\n" + "</Affordability>\n" + "<Affordability>\n" + "<Description>Car Costs</Description>\n" + "<FrequencyCode>M</FrequencyCode>\n" + "<Amount>10.00</Amount>\n" + "</Affordability>\n" + "<Affordability>\n" + "<Description>Mortgage</Description>\n" + "<FrequencyCode>M</FrequencyCode>\n" + "<Amount>25.00</Amount>\n" + "</Affordability>\n" + "<Affordability>\n" + "<Description>Rent</Description>\n" + "<FrequencyCode>M</FrequencyCode>\n" + "<Amount>35.00</Amount>\n" + "</Affordability>  <Affordability>\n" + "<Description>Other Costs</Description>\n" + "<FrequencyCode>M</FrequencyCode>\n" + "<Amount>250.00</Amount>\n" + "</Affordability>\n" + "</AffordabilityList>\n" + "<BankSortCode>110001</BankSortCode>\n" + "<BankAccountNumber>29250976</BankAccountNumber>\n" + "<DataProtection>TRUE</DataProtection>\n" + "<DateOfBirth>1966-11-11</DateOfBirth>\n" + "<DrivingLicenceNumber/>\n" + "<DrivingLicenceType>Provisional</DrivingLicenceType>\n" + "<DrivingLicenceOrigin>UK</DrivingLicenceOrigin>\n" + "<EmailAddress>lindsay.hols@startlinemotorfinance.com</EmailAddress>\n" + "<EmployedOrSelfEmployed>Employed</EmployedOrSelfEmployed>\n" + "<EmploymentCategory>House Person</EmploymentCategory>\n" + "<EmploymentList>\n" + "<Employment>\n" + "<CompanyName>SMF</CompanyName>\n" + "<Current>True</Current>\n" + "<EmployersAddress>\n" + "<PropertyName>Skypark 1</PropertyName>\n" + "<StreetName>8 Elliot Place</StreetName>\n" + "<PostalTown>Glasgow</PostalTown>\n" + "<PostCode>G3 8EP</PostCode>\n" + "<District/>\n" + "<Country>United Kingdom</Country>\n" + "</EmployersAddress>\n" + "<Occupation>Test Analyst</Occupation>\n" + "<StartDate>2000-01-01</StartDate>\n" + "</Employment>\n" + "</EmploymentList>\n" + "<Title>Ms</Title>\n" + "<Forename>Lucy</Forename>\n" + "<Middlename/>\n" + "<Surname>Subaru</Surname>\n" + "<Gender>Female</Gender>\n" + "<TelephoneNumber>01442 200786</TelephoneNumber>\n" + "<MobileNumber>01234 567680</MobileNumber>\n" + "<MaritalStatus>Married</MaritalStatus>\n" + "<NumberOfDependants>4</NumberOfDependants>\n" + "<Nationality>GB</Nationality>\n" + "<FullOrPartTime>Full Time</FullOrPartTime>\n" + "<PermanentOrContract>Permanent</PermanentOrContract>\n" + "<Tenure>Tenant</Tenure>\n" + "</PersonalDetails>\n" + "<Rate>8.25</Rate>\n" + "<RateType>Flat</RateType>\n" + "<RepresentativeName/>\n" + "<SalesPersonName/>\n" + "<SecurityDetails>\n" + "<AnnualMileage>12000</AnnualMileage>\n" + "<CAPId>1</CAPId>\n" + "<CAPCode>B</CAPCode>\n" + "<ChassisNumber/>\n" + "<DateRegistered>2014-05-28</DateRegistered>\n" + "<Derivative/>\n" + "<DummyVehicle>False</DummyVehicle>\n" + "<ExcessMileageCharge>0.00</ExcessMileageCharge>\n" + "<GlassModelId>141161</GlassModelId>\n" + "<GlassQualifyModelId>002</GlassQualifyModelId>\n" + "<ManufacturerCode>MAN0011</ManufacturerCode>\n" + "<ManufacturerName/>\n" + "<Mileage>4500</Mileage>\n" + "<Model/>\n" + "<NewOrUsed>Used</NewOrUsed>\n" + "<RegistrationLetter>14</RegistrationLetter>\n" + "<RegistrationNumber>DN14KZR</RegistrationNumber>\n" + "<SupplierCode>DEL0238</SupplierCode>\n" + " <SupplierName/>\n" + "</SecurityDetails>\n" + "<SettlingExistingFinance>true</SettlingExistingFinance>\n" + "<SolveForType>I</SolveForType>\n" + "</Agreement>\n" + "</AgreementList>\n" + "<ApplicationType>POS</ApplicationType>\n" + "<UserName>chennai</UserName>\n" + "<Password>chennai2018</Password>\n" + "<Originator>Test</Originator>\n" + "</CreateProposalCallParameter>\n" + "</SOAP-ENV:Body>\n" + "</SOAP-ENV:Envelope>";
		       // System.out.println(xmlInput1);

			    byte[] buffer = new byte[xmlInput1.length()];
			    buffer = xmlInput1.getBytes();
			    bout.write(buffer);
			    byte[] b = bout.toByteArray();
			    String SOAPAction = "https://smfsys.pancredit.com/pdi-saas-web-services/CreateProposal";
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
	    String formattedSOAPResponse = this.formatXML(outputString);
	    System.out.println("Result is"+formattedSOAPResponse);
	    
	    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	    InputSource src = new InputSource();
	    src.setCharacterStream(new StringReader(formattedSOAPResponse));
	    
	    Document doc = builder.parse(src);
	    doc.getDocumentElement().normalize();
	    
	    //doc.getDocumentElement().normalize();

	    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	    NodeList nList = doc.getElementsByTagName("tns:Agreement"); 
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
	    		System.out.println("Data : " + eElement.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent());
	    		AgreementNumber=eElement.getElementsByTagName("tns:AgreementNumber").item(0).getTextContent();
	    		Driver.get_ag_no = AgreementNumber;
	    		Testdata.PutstoreTD(AgreementNumber, "Agreement_Number");
	    		Utilities.passresult("PDI_Agreement","Agreement Created Successfully through PDI V1",AgreementNumber,datetimestart);
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


	public static void CreateAgreementV1() throws Exception {
	// TODO Auto-generated method stub
	StartlineSoap objWebServiceCall = new StartlineSoap();
	    try
	    {
	    	Testdata.GetTDFiloconnection();
	    	String status="Agreement";
	    	Thread.sleep(750);
	    	String xml1 =Testdata.getsheet1.getField("XMLData");
	        Thread.sleep(750);
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

	public static void Getaddresshistory() throws Exception 
	{
		// TODO Auto-generated method stub
		StartlineSoap objWebServiceCall = new StartlineSoap();
		    try
		    {
		    	Testdata.GetTDFiloconnection();
		    	String status="Agreement";	
		    	String xml =Testdata.getsheet1.getField("XMLData");
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
	}



