package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		
		
		//Step 1: Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load Succesfully !");
		
		//Step 2:Create Connection
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Admin#123");
		System.out.println("DB Connection Succesfully established !");
		
		//Step 3: Create Statement (Insert query added here)
		
		//way 1:
		//PreparedStatement ps= connection.prepareStatement("insert into register values('Pranit','pranitgawari@gmail.com','123','Male','Pune')");
		
		//way 2:
				//String name="Ishan";
				//String email="IshanB@gmail.com";
				//String password="1122";
				//String gender="male";
				//String city="Junnar";
		
		//PreparedStatement ps= connection.prepareStatement("insert into register values('"+name+"','"+email+"','"+password+"','"+gender+"','"+city+"')");
		
		//way 3: Positional parameters 
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name=sobj.nextLine();
		
		System.out.println("Enter E-Mail :");
		String email=sobj.nextLine();
		
		System.out.println("Enter Password :");
		String password=sobj.nextLine();
		
		System.out.println("Enter Gender :");
		String gender=sobj.nextLine();
		
		System.out.println("Enter City :");
		String city=sobj.nextLine();
		
		PreparedStatement ps= connection.prepareStatement("insert into register values(?,?,?,?,?)");
		
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city);
		
		int iNo=ps.executeUpdate();  // return type is integer, if it will stored data in DB then iNo always greater than 0
		if(iNo >0)  //
		{
			System.out.println("Succes !");
		}
		else
		{
			System.out.println("Fail !");
		}
	}

}







/*

SQL DB :

Username: root
Password: Admin#123

To Open Mysql : Open MySql CMD -> password
or by using CMD
go to : cd C:\Program Files\MySQL\MySQL Server 8.0\bin -> mysql -u root -p -> enter password

To Show databases: show databases;
To create database: create database database name
To use database: use database name

To create table in DB: 
create table table name (column name datatype, datasize, constraint)
create table register(name varchar(100), email varchar(100), password varchar(100),gender varchar(50), city varchar (100));

To describe table: desc table name

To see data from table: select* from table name

To delete Data from table: delete from table name  where column name ='data';
*/