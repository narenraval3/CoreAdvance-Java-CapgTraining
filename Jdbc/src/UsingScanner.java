// To Insert the Records from prompt

import java.sql.*;
import java.util.*;

public class UsingScanner {

	public static void main(String[] args) throws Exception {
				
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "naren@root");
		
		System.out.println("Enter ID: ");
		int x = sc.nextInt();
		
		System.out.println("Enter Phone: ");
		int y = sc.nextInt();
		
		PreparedStatement ps = conn.prepareStatement("insert into studetails values(?,?)");
		ps.setInt(1, x);
		ps.setInt(2, y);
		
		ps.executeUpdate();
		
		conn.close();
	}

}
 