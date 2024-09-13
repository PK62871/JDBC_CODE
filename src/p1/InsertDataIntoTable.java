package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataIntoTable {

	public static void main(String[] args) throws Exception{
		

		  // Load the JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");
		
		String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
		String DATABASE_USERNAME = "root";
		String DATABASE_PASSWORD = "test";
		
		// Creating Connection...................................
		Connection con = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
		
		System.out.println("Connection Build Successfully");
		
		
		// Creating Statement..................................
				Statement statement = con.createStatement();
				
				
				//Query To Insert The Record..............................................
				
				String INSERT_QUERY_1 = "INSERT INTO STUDENT VALUES (101,'Amit','A',67)";
				String INSERT_QUERY_2 = "INSERT INTO STUDENT VALUES (102,'Prabhakar','C',607)";
				String INSERT_QUERY_3 = "INSERT INTO STUDENT VALUES (103,'Rohit','B',670)";
				
				
				// Inserting The Record........................................
				
				statement.executeUpdate(INSERT_QUERY_1);
				statement.executeUpdate(INSERT_QUERY_2);
				statement.executeUpdate(INSERT_QUERY_3);
				
				System.out.println("Data Inserted SuccessFully.....");
	}
}
