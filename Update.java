package javajdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Update {

	public static void main(String[] args) {
		
		int id=1;
		String name = "Amol_data";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TYBCA","root","root");
		
		if(conn != null) {
			System.out.println("Connected........................");
		}
		else {
			System.out.println("not connected........................");
		}
			
			PreparedStatement pstm =   conn.prepareStatement("update stu1 set name=? where id=?;");
			pstm.setInt(2, id);
			pstm.setString(1, name);
			
			
			int a = pstm.executeUpdate();
			if(a == 1) {
				System.out.println("updated succesfully........................");
			}
			else {
				System.out.println("unsuccefull.....................................");
			}
			//System.out.println("1");
		
		}catch(Exception e) {
			System.out.println("Exception occure "+e);
		}

	}

}
