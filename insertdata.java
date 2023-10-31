package javajdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertdata {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int id;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student information\n-------------------------------------------------");
		System.out.println("Entee the id");
		id = sc.nextInt();
		
		System.out.println("Enter the name");
		name = sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TYBCA","root","root");
			
			PreparedStatement pstm = conn.prepareStatement("insert into stu1 values(?,?)");
			pstm.setInt(1, id);
			pstm.setString(2, name);
			
			int check = pstm.executeUpdate();
			
			if(check == 1) {
				System.out.println("data inserted succesfully...................");
			}
			else {
				System.out.println("data not Inserted.................");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

