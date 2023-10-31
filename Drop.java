package javajdbc.com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Drop {
 public static void  main(String args[]) {
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TYBCA","root","root");
			
			if(conn != null) {
				System.out.println("Connected........................");
			}
			else {
				System.out.println("not connected........................");
			}
				
			Statement stmt = conn.createStatement();
			
			int a = stmt.executeUpdate("drop table stu;");
		
			System.out.println("done................");
			
			}catch(Exception e) {
				System.out.println("Exception occure "+ e);
			}
 }
}
