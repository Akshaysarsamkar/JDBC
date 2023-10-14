package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Information");
		int sid = sc.nextInt();
		String uname = sc.next();
	    String ucontact = sc.next();

	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	 
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tybca","root","root");
	     
	     PreparedStatement pst = con.prepareStatement("insert into user(uid,uname,ucontact) values(?,?,?)");
	     
	     pst.setInt(1, sid);
	     pst.setString(2, uname);
	     pst.setString(3, ucontact);
	     
	     int executeUpdate   = pst.executeUpdate();
	     
	     if (executeUpdate == 1)
	    	 System.out.println("Done...........");
	     else
	    	  System.out.println("something wrong");
	     
	     
	   
	}

}
