import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Question3 {

	public Question3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// JDBC driver name and database URL
		   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   final String DB_URL = "jdbc:mysql://localhost:3306/test";
		   
		   //  Database credentials
		   final String USER = "root";
		   final String PASS = "root";
		   try {
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			
			
			String sql = "SELECT * FROM EMP";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			int ch = 0;
			while(rs.next())
			{
				ch++;
			}	
			System.out.println("No. of records in employee table :: "+ch);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}