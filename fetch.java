package javajdbc.com;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;




public class fetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");

	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TYBCA","root","root");
	      
	      if(conn != null) {
	    	  System.out.println("Done................");
	      }
	      else {
	    	  System.out.println("undone.................");
	      }
	      
	     Statement  stmt = conn.createStatement();
	      
	      ResultSet res = stmt.executeQuery("select * from stu1");
	
	      while(res.next())
	      {
	    	  System.out.print("Student ID "+res.getInt(1) + " ");
	    	  System.out.println("Student Name "+res.getString(2));
	      }
	      
	      
	}

}
