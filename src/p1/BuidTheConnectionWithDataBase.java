package p1;

import java.sql.Connection;
import java.sql.DriverManager;

public class BuidTheConnectionWithDataBase {
	public static void main(String[] args) throws Exception {
		
		  // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
		String DATABASE_USERNAME = "root";
		String DATABASE_PASSWORD = "test";
		
		Connection con = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
		
		System.out.println("Connection Build Successfully");
	}

}
