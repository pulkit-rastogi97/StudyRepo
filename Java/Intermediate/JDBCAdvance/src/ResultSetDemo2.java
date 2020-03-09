import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ResultSetDemo2 {

	public ResultSetDemo2() {
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
		  // con.setAutoCommit(false);
		   String sql = "SELECT * FROM Sample";
		   Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		   
		   ResultSet rs = stmt.executeQuery(sql);
		   rs.next();
		   System.out.println("first row id "+rs.getInt(1)+" first row name = "+rs.getString(2));
		   
		   
		   
		   rs.last();
		   System.out.println("last row id "+rs.getInt(1)+" last row name = "+rs.getString(2));
		   
		   rs.previous();
		   System.out.println("second last row id "+rs.getInt(1)+" second last row name = "+rs.getString(2));
		   
		   rs.moveToInsertRow();
		   rs.updateInt(1,163);
		   rs.updateString(2, "ll6l");
		  // System.out.println("above id  = "+rs.getInt(1)+" name = "+rs.getString(2));
		   //rs.updateRow();
		  // System.out.println("id  = "+rs.getInt(1)+" name = "+rs.getString(2));
		   rs.insertRow();
		 
		}catch(SQLException | ClassNotFoundException e )
		{
			System.out.println(e.getMessage());
		}
	}
}
