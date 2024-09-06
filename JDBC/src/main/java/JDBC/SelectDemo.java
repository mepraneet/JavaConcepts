package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectDemo {

	public static void main(String[] args) throws Exception {
		//Step 1: load and Register Driver
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver load Succesfully !");
				
				//Step 2:  Create Connection
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Admin#123");
				System.out.println("DB Connection Succesfully established !");
				
				//Step 3:Execute Statement (Select Query)
				
				PreparedStatement ps=connection.prepareStatement("select * from register");
				ResultSet result=ps.executeQuery();
				
				while(result.next())
				{
					System.out.println("Name: "+result.getString("name"));
					System.out.println("E-Mail: "+result.getString("email"));
					System.out.println("Password: "+result.getString("password"));
					System.out.println("Gender: "+result.getString("gender"));
					System.out.println("City: "+result.getString("city"));
					System.out.println("");
				}
	}

}
