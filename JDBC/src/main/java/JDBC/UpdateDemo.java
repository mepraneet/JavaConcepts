package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		
		
		//Step 1: load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load Succesfully !");
		
		//Step 2:Create Connection
		Connection connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Admin#123");
		System.out.println("DB Connection Succesfully established !");
		
		// Execute Statement: (Update query)
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter City which you want to update :");
		String city=sobj.nextLine();
		
		System.out.println("Enter E-Mail:");
		String email=sobj.nextLine();
		
		PreparedStatement ps= connection.prepareStatement("update register set city=? where email=? "); // write Update query inside prepared statement here
		ps.setString(1, city);
		ps.setString(2, email);
		
		int iNo=ps.executeUpdate();
		
		if(iNo> 0)
		{
			System.out.println("Update Succesfully ! ");
		}
		else
		{
			System.out.println("Update Failed ! ");
		}
	}

}
