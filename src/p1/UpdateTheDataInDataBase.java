package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTheDataInDataBase {

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
		
		// Creting SQL_Query Of Update.........................
		
		String UPDATE_QUERY = "UPDATE STUDENT SET SNAME = 'Rana Pratap' WHERE SID = 103";
		
		//Creating The Statement............................................
		
		Statement statement = con.createStatement();
		
		int update = statement.executeUpdate(UPDATE_QUERY);
		
		System.out.println("Upadated SuccessFully.........................");
		
		System.out.println(update);
		
	
	}
}
