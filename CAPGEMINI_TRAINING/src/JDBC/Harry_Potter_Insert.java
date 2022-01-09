package JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Harry_Potter_Insert {

	public static void main(String[] args) throws Exception {

		Scanner scann = new Scanner(System.in);

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");

		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Harry_Potter_Character","postgres", "postgre7");
		System.out.println("Connection Established");
		
		System.out.println("Enter Name: "); 
		String name = scann.nextLine();
		  
		System.out.println("Enter House: "); 
		String house = scann.nextLine();
		  
		System.out.println("Enter Role: "); 
		String role = scann.nextLine();
		  
		System.out.println("Enter Status: "); 
		String status = scann.nextLine();
		  
		System.out.println("Enter Dies: "); 
		String dies = scann.nextLine();
		
		PreparedStatement pst = c.prepareStatement("insert into HarryPotter values(?,?,?,?,?)");
		pst.setString(1, name);
		pst.setString(2, house);
		pst.setString(3, role);
		pst.setString(4, status);
		pst.setString(5, dies);

		pst.executeUpdate();

		c.close();
	}

}
