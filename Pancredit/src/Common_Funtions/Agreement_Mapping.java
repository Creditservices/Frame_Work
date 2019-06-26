//Test1
package Common_Funtions;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import Provident.Provident;

public class Agreement_Mapping 

{
	
public static ArrayList<String> Updatesheet1 = new ArrayList<String>( );
	
	/*public static void main(String agrs[]) throws FilloException
	{
		Mapping();
		
	}*/
	public static void Mapping(String whichProject,String Varied,Recordset Record2) throws FilloException
	

	{
		try
		{
		
		Fillo fillo=new Fillo();
		Driver.connection=fillo.getConnection(Configuration.Datapath+whichProject+".xlsx");
		String strquery=Common_Property.Mappingquery("Sheet2");
		Recordset recordset=Driver.connection.executeQuery(strquery);
		
		 while(recordset.next())
		    {
		  
		    String update=recordset.getField("Refno");
		    String str = Record2.getField("Put_ag_no");
		    if(update.equalsIgnoreCase(str))
		    {
			String Str_refno=recordset.getField("Refno");
			Str_refno="'"+Str_refno+"'";
			String Str_Agr=recordset.getField("Agreement_Number");
			Str_Agr="'"+Str_Agr+"'";
			//String strupdate="Update Sheet1 set Agreement_Number="+Str_Agr+",Misc="+Varied+" where put_ag_no ="+Str_refno;
			Updatesheet1.add(0,Str_Agr);
			Updatesheet1.add(1, Str_refno);
			Updatesheet1.add(2, Varied);
			String strupdate=Common_Property.Updatesheet1("Sheet1",Updatesheet1);
			Driver.connection.executeUpdate(strupdate);
			str=update;
		    }
		    }
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
		
	
}
