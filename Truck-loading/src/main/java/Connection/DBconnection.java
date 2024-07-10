package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	public static Connection driverConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/truck-loading", "root", "");
			
			  System.out.println("Database connected successfully!");
		} 
		
		
		catch (Exception e) {
			e.getStackTrace();
		}
		return conn;
	}

}
