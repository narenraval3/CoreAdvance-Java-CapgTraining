package JDBC;

import java.sql.*;
import java.io.*;

public class HarryPotterDataRetrive {

	public static void main(String[] args) throws Exception{
					
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
					
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Harry_Potter_Character","postgres","postgre7");
		System.out.println("Connection Established");
				
		Statement stat = conn.createStatement();
		System.out.println("Satatement Created");
				
		ResultSet rset = stat.executeQuery("select * from HarryPotter");
		System.out.println("Query Executing....");
		System.out.println();
		System.out.println("Name"+"           "+"House"+"     "+"Role"+"    "+"Status"+"  "+"Dies");
		System.out.println("---------------------------------------------");
		
		while(rset.next())
     	{
			System.out.println(rset.getString("name")+ "  " +rset.getString("house")+ " " +rset.getString("role")+ " " +rset.getString("status")+ "    " +rset.getString("dies"));
		}
		conn.close();
	}
}