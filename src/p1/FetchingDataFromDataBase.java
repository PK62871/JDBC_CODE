package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchingDataFromDataBase {

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
		
		
		//Query To Fetch The Data From DAtabase.............................
		String FETCH_QUERY = "SELECT * FROM STUDENT";
		
		
		// Creating the Statement.................................
		Statement statement = con.createStatement();
		
		System.out.println("Statement Created..........................");
		
		// Execute The Query........................
		
		ResultSet set = statement.executeQuery(FETCH_QUERY);
		
		// Iterate The Object To get The value......................................
		
		while(set.next()) {
			System.out.println(set.getString(1) + " " + set.getString(2) + " "+ set.getString(3) + " "+ set.getString(4));
		}
	}
}
