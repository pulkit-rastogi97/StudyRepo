import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ResultSetDemo {

	public ResultSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// JDBC driver name and database URL
		   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   final String DB_URL = "jdbc:mysql://localhost:3306/test";

		   //  Database credentials
		   final String USER = "root";
		   final String PASS = "root";
		try{   	   
		   Class.forName(JDBC_DRIVER);
		   Connection con = DriverManager.getConnection(DB_URL,USER,PASS);	  
		   con.setAutoCommit(false);
		   String sql = "SELECT * FROM Trainee";
		   Statement stmt = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE);
		   
		   ResultSet rs = stmt.executeQuery(sql);
		   
		   rs.next();
		   System.out.println("first row id "+rs.getInt(1)+" first row name = "+rs.getString(2));
		   
		   
		   rs.last();
		   System.out.println("last row id "+rs.getInt(1)+" last row name = "+rs.getString(2));
		   
		   rs.previous();
		   System.out.println("second last row id "+rs.getInt(1)+" second last row name = "+rs.getString(2));
		   
		}catch(SQLException | ClassNotFoundException e )
		{
			System.out.println(e.getMessage());
		}
	}
}
