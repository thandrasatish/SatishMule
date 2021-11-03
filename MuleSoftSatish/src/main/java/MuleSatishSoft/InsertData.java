package MuleSatishSoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData 
{

	public static void main(String args[]) 
	{
				    try 
				    {
				    	int n,i;
				    	String name = null;
				    	String actor = null;
				    	String actress = null;
				    	String director = null;
				    	int yearofrelease = 0;
				    	Scanner s = new Scanner(System.in);
				    	System.out.println("INSERT SIZE");
				    	n=s.nextInt();
				    	System.out.println("INSERT DATA");
				    	for(i=0;i<n;i++)
				    	{
				    	
				    	name=s.next();
				    	actor =s.next();
				    	actress=s.next();
				    	director =s.next();
				    	yearofrelease=s.nextInt();
				    	System.out.println(i+" "+"next data");
				    	}
;
				    	
				    Connection con = null;
				    Class.forName("oracle.jdbc.driver.OracleDriver");
				    System.out.println("Driver class loaded");
				     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				     System.out.println("connected");
				     
				     PreparedStatement pstmt = con.prepareStatement("insert into MoviesSatish values(?,?,?,?,?)");
			          pstmt.setString(1,name);
					pstmt.setString(2,actor);
			          pstmt.setString(3,actress);
			          pstmt.setString(4,director);
			          pstmt.setInt(5,yearofrelease);
			        
				      
				    }
				    catch(Exception e)
				    {
				    	
				    	
				      System.out.println(e);
				      
				      
				    }
				    
				  
				  }
}
