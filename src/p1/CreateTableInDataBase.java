package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableInDataBase {

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
		
		String TABLE_QUERY = "CREATE TABLE STUDENT ("
							+ "SID INT ,"
							+ "SNAME VARCHAR(20),"
							+ "SECTION VARCHAR(20),"
							+ "MARKS INT ,"
							+ "PRIMARY KEY(SID,SECTION)"
							+ ")" ;
		
		statement.executeUpdate(TABLE_QUERY);
		
		System.out.println("Table is Created SuccessFully.........");
							
		
	}
}
