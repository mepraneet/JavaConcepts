package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		
		//Step 1: load and Register Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load Succesfully !");
		
		//Step 2:  Create Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Admin#123");
		System.out.println("DB Connection Succesfully established !");
		
		//Step 3:Execute Statement (Delete Query)
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter E-Mail:");
		String email=sobj.nextLine();
		
		PreparedStatement ps=connection.prepareStatement("delete from register where email=?");
		ps.setString(1, email);
		
		int iNo=ps.executeUpdate();
		if(iNo>0)
		{
			System.out.println("Delete Successfully !");
		}
		else
		{
			System.out.println("Delete Failed !");
		}

	}

}												
