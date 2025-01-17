package api_RestAssured;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class MAIN_GUARANTOR {
	public static String JsonData;
	public static String TC_Name;
	public static int StatusCode;
	public static String responseData;
	public static String updateQuery;
	public static Recordset MG_recordSet;
	
	public static void getDetails(String userName, String password, String url) throws FilloException
		{
			MG_recordSet = BaseClass.connection.executeQuery("Select * from MAIN_GUARANTOR Where RUN_FLAG='Yes'");
			while (MG_recordSet.next()) 
				{
					
					//##Get the test case details
					String tc_name = MG_recordSet.getField("TC_NAME");
					String si_num = MG_recordSet.getField("S_NO");
					String jsonData = MG_recordSet.getField("JSON DATA");
					int expCode = Integer.parseInt(MG_recordSet.getField("EXPECTED STATUS CODE"));
					
					//To generate uniqueKey
					DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmSSS");
					Date date = new Date();
					String uniqueKey = df.format(date);
					
					//To generate unique surname
					jsonData = jsonData.replace("{{$timestamp}}", uniqueKey);
					jsonData = jsonData.replace("Campgncode", "DUOBRO");
					jsonData = jsonData.replace("Dob_guarantor", "1990-06-01");
					//System.out.println(jsonData);
					//##Run the data using REST ASSURED
					execute(jsonData, url, userName, password);
					
					//##To avoid fillo updateQuery error due to single quotes in response
					responseData = responseData.replace("'", " ");
					
					if (expCode==StatusCode) {
						updateQuery = "Update MAIN_GUARANTOR Set RESULT ='PASS', ACTUAL='"+StatusCode+"', RESPONSE='"+responseData+"' Where TC_NAME='"+tc_name+"' and S_NO='"+si_num+"'";
					} else {
						updateQuery = "Update MAIN_GUARANTOR Set RESULT ='FAIL', ACTUAL='"+StatusCode+"', RESPONSE='"+responseData+"' Where TC_NAME='"+tc_name+"' and S_NO='"+si_num+"'";
					}
					
					//##Write the results in data sheet
					BaseClass.connection.executeUpdate(updateQuery);
					
					//If you need agreement number
					/*if (StatusCode == 201) 
						{
							JsonPath jsonPath =  new JsonPath(responseData);
							int agrNum = jsonPath.getInt("agreementNumber");
							String applicationExceptionList = jsonPath.getString("applicationExceptionList");
							System.out.println(applicationExceptionList);
						}*/
				}
			//Close the record set
			MG_recordSet.close();
		}
	public static void execute(String jsonData, String Url, String userName, String password)
		{
			ValidatableResponse response = RestAssured.given()
					.auth()
					.preemptive()
					.basic(userName, password)
			        .contentType("application/json")
			        .body(jsonData)
			        .when()
			        .post(Url)
			        .then();
			
				    StatusCode = response.extract().statusCode();
				    responseData = response.extract().body().asString();	    
		}
	
}
