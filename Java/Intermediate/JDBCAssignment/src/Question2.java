import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Question2 {

	public Question2() {
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
			while(ch!=5)
			{
				rs.next();
				System.out.println("Employee ID :: "+rs.getInt(1));
				System.out.println("Employee Name :: "+rs.getString(2));
				System.out.println("JOB :: "+rs.getString(3));
				System.out.println("MGR :: "+rs.getInt(4));
				System.out.println("Hire Date :: "+rs.getDate(5));
				System.out.println("Salary :: "+rs.getInt(6));
				System.out.println("Commision :: "+rs.getInt(7));
				System.out.println("Dept No :: "+rs.getInt(8));
				ch++;
			}	
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
