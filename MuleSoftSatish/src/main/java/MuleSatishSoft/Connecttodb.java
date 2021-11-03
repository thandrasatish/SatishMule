package MuleSatishSoft;
import java.sql.Connection;
import java.sql.DriverManager;
public class Connecttodb 
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
			      
			    }
			    catch(Exception e)
			    {
			    	
			    	
			      System.out.println(e);
			      
			      
			    }
			    
			  
			  }
	
	
}
