package api_RestAssured;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class BaseClass {
	public static String DataFilePath = System.getProperty("user.dir")+"/API_Auto.xlsx";
	public static Fillo fillo;
	public static Connection connection;
	public static Recordset recordSet;
	
	public static void Initialization() throws FilloException{
		//Initialize fillo
		fillo  = new Fillo();
		connection = fillo.getConnection(DataFilePath);
		recordSet = connection.executeQuery("Select * from SUMMARY Where RUN_FLAG='YES'");
		while (recordSet.next()) {
			
			String application = recordSet.getField("NAME");
			
			if (application.equalsIgnoreCase("MAIN_JOINT")) 
				{
					String userName = recordSet.getField("USERNAME");
					String password = recordSet.getField("PASSWORD");
					String url = recordSet.getField("URL");
					MAIN_JOINT.getDetails(userName, password, url);
				} 
			else if(application.equalsIgnoreCase("MAIN_GUARANTOR")) 
				{
					String userName = recordSet.getField("USERNAME");
					String password = recordSet.getField("PASSWORD");
					String url = recordSet.getField("URL");
					MAIN_GUARANTOR.getDetails(userName, password, url);
				}
			else if(application.equalsIgnoreCase("DDUPLICATES")) 
				{
					System.out.println("Not implemented yet");
				}
			else 
				{
					System.out.println("Nothing is implemented for this "+application);
				}
		}
	}
	
	public static void main(String[] args) throws FilloException {
		Initialization();
		connection=null;
		recordSet.close();
		
	}
}
