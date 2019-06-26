/* *********************************************************************************************************************************
 * Project:Core Framework
 * Program Name : Agreement_StoreDate
 * Program Description : Part of Framework which fetch agreement number and related fields from the test data sheet.
 * Written by : Sheik Umar Ali L
 * Written Date: 26/02/2019
 * Last Update on : 27/02/2019
 * Last Updated block : 2702/2019- At line 40 -- OU implementation 
 * 
 ***************************************************************************************************************************************/
package Common_Funtions;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import OpenUniversity.OU_RestAssured;
import Provident.Provident;
import Provident.ProvidentAPI;

public class Agreement_Store {
	
	public String AgreementNo;
	public static int flag,i=1;
	public static String Str_Fetch_Agr,StrUpdateQuery,StrInsertQuery,LocalAgrInit="",record1;
    public static ArrayList<String> Insertarr = new ArrayList<String>( );
	public static ArrayList<String> Updatearr = new ArrayList<String>( );
	public static Connection connection;
	public static Recordset SheetRecordSet;
	
	@SuppressWarnings("unused")
	public static void Store_Data(String StrWhichProject, String AgreementNo,String Varied,Recordset Record2) throws Exception
	{
	try 
	{
		       
        Fillo fillo=new Fillo();
		connection=fillo.getConnection(Configuration.Datapath+Driver.Project+".xlsx");	
		Str_Fetch_Agr=Record2.getField("Put_ag_no");
        String StrAgrQuery;
        StrAgrQuery= Common_Property.Storequery1("Sheet2");
        SheetRecordSet = connection.executeQuery(StrAgrQuery);
        System.out.println(SheetRecordSet.getCount());
    
		while (SheetRecordSet.next())
	        {
	        	
	        	if (SheetRecordSet.getField("Refno").equalsIgnoreCase(Str_Fetch_Agr))
	        	{
	        		flag=1;
	         		break;
	        	}
	        }

	        
		if(flag==1)
		{
			LocalAgrInit="'"+Str_Fetch_Agr+"'";
			AgreementNo="'"+AgreementNo+"'";
			Updatearr.add(0,LocalAgrInit);
			Updatearr.add(1, AgreementNo);
			Updatearr.add(2, Varied);
			
	        		
    		if (Varied==null)
    		{
    			// StrUpdateQuery = "Update Sheet2 Set Agreement_Number ="+AgreementNo+" where Refno ="+LocalAgrInit;
    		    i=0;
    			StrUpdateQuery=Common_Property.StrUpdateQuery("Sheet2",Updatearr);
    			i=1;
    			
    		}
	        		else
	        		{
	        			
	        			//StrUpdateQuery ="Update Sheet2 Set Agreement_Number ="+AgreementNo+",Misc ="+Varied+" where Refno ="+LocalAgrInit;
	        			StrUpdateQuery=Common_Property.StrUpdateQuery("Sheet2", Updatearr);
	        			
	        		
	        		}
	        		
	        		connection.executeUpdate(StrUpdateQuery);
	        		flag=0;
	        		
	        	}
	        	else 
	        	{
	        		LocalAgrInit="'"+Str_Fetch_Agr+"'";
	        		Insertarr.add(0,LocalAgrInit);
        			Insertarr.add(1,AgreementNo);
        			Insertarr.add(2, Varied);
        			
	        		if (Varied==null)
	        		{
	        			i=0;
	        			StrInsertQuery = Common_Property.InsertQuery("Sheet2", Insertarr);
	        			i=1;
	        		}
	        		else
	        		{
	        			StrInsertQuery = Common_Property.InsertQuery("Sheet2", Insertarr);
	        		}
	        		connection.executeUpdate(StrInsertQuery);
	        		
			    }
	       
	   
			if (Varied==null)
			{
				Agreement_Mapping.Mapping(StrWhichProject,null,Record2);
			}
			else
			{
				Agreement_Mapping.Mapping(StrWhichProject,Varied,Record2);
			}
	}
	
	catch (Exception ex) 
	{
       System.out.println(ex);
    }
}

}
