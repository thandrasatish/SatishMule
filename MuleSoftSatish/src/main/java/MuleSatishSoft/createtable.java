package MuleSatishSoft;

import java.sql.Connection;
import java.sql.DriverManager;

public class createtable 
{
	public static void main(String args[]) 
	{
				    try 
				    {
				    	
				    Connection con = null;
				    Class.forName("oracle.jdbc.driver.OracleDriver");
				    System.out.println("Driver class loaded");
				     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				     System.out.println("connected");
				     
				     java.sql.Statement stmt = con.createStatement();
			            String qry ="create table MoviesSatish(id int primary key,name varchar(30) not null,age int)";
			            stmt.executeUpdate(qry);
			            System.out.println("table has created");
				      
				    }
				    catch(Exception e)
				    {
				    	
				    	
				      System.out.println(e);
				      
				      
				    }
				    
				  
				  }
}
