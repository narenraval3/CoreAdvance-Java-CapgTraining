package JDBC;

import java.sql.*;
import java.io.*;

public class ToRetriveInfo {

	public static void main(String[] args) throws Exception {

		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");

		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/capgemini_projects", "postgres",
				"postgre7");
		System.out.println("Connection Established");

		Statement stat = conn.createStatement();
		System.out.println("Satatement Created");

		ResultSet rset = stat.executeQuery("select * from students");
		System.out.println("Query Executing....");
		System.out.println();
		System.out.println("ID" + "  " + "NAME" + "  " + "ADDRS");
		System.out.println("--" + "  " + "----" + "  " + "-----");

		while (rset.next()) {
			System.out.println(rset.getInt("ID") + " " + rset.getString("name") + " " + rset.getString("address"));
		}
		conn.close();
	}
}
