import java.sql.*;

public class InsertMethod {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","naren@root");
		
		// For Insert the value from java
		//PreparedStatement ps = conn.prepareStatement("insert into studetails values(105, 981234)");
		
		// For Update the value from java
		//PreparedStatement ps = conn.prepareStatement("update studetails set phone = 9812349 where id = 105");
		
		// For Delete the value from java
		PreparedStatement ps = conn.prepareStatement("delete from studetails where id = 106");
		
		ps.executeUpdate();
		
		conn.close();
	}

}
