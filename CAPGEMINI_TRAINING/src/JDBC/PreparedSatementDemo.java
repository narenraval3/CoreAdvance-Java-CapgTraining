package JDBC;

import java.sql.*;
import java.io.*;

public class PreparedSatementDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
			
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/capgemini_projects","postgres","postgre7");
		System.out.println("Connection Established");
		
		PreparedStatement ps =  con.prepareStatement("insert into students values(?,?)");
		ps.setInt(1, 444);
		ps.setString(2, "Kishan");
		ps.setString(3, "Faribaad");
		ps.executeQuery();
		
		
//		PreparedStatement ps =  con.prepareStatement("select * from students where id=?");
//		ps.setInt(1, 111);
//		
//		ResultSet rset = ps.executeQuery();
//		rset.next();
//		System.out.println(rset.getString("name"));
		
		con.close();
	}
}