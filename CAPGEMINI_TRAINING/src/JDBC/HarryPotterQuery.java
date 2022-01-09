package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HarryPotterQuery {
	
	public static void main(String[] args) throws Exception {

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");

		Connection cc = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Harry_Potter_Character","postgres", "postgre7");
		System.out.println("Connection Established");
		
		Statement st = cc.createStatement();
		System.out.println("Satatement Created");
		
		ResultSet set = st.executeQuery("select name from HarryPotter where house = 'gryffindor'");
			
		//pt.executeUpdate();
		
		while(set.next())
     	{
			System.out.println(set.getString("name")+ "  " +set.getString("house")+ " " +set.getString("role")+ " " +set.getString("status")+ "    " +set.getString("dies"));
		}
		cc.close();
	}

}
