import java.sql.*;

public class StudentsDetails {

	public static void main(String[] args) throws Exception {
	
//		Connection conn = null;
//		Statement stat = null;
//		ResultSet rset = null;
//		OR,
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //to load the driver
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","naren@root");
		Statement stat = conn.createStatement();
		ResultSet rset = stat.executeQuery("select * from studetails");
		
		System.out.println("ID" + "    " + "Phone");
		System.out.println("-------------");
		
		while(rset.next())
		{
			System.out.print(rset.getInt(1) + "   ");
			System.out.print(rset.getInt(2));
			System.out.println("  ");
		}
		conn.close();
	}
}