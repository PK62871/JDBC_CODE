package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTheDataInDataBase {

	public static void main(String[] args) throws Exception {
		
	// Loading The Driver..........
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver Loaded.............");
		
		//Defining Database URL, USerName, Password....
		
		String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
		String DATABASE_USERNAME = "root";
		String DATABASE_PASSWORD = "test";
		
		// Creating The Connection...............................................
		
		Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
		
		System.out.println("Connection Build..................");
		
		// Delete Query.......................
		
		String DELETE_QUERY = "DELETE FROM STUDENT WHERE SID = 101";
		
		// Creating The Statement..............................................
		
		Statement statement = con.createStatement();
		
		// Execute The Query..............................
		int update = statement.executeUpdate(DELETE_QUERY);
		
		System.out.println("Deleted Successfully");
		
		System.out.println(update);
	}
}
