import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCDemo {

	public JDBCDemo() {
		
	}
	public static void main(String[] args) {
		try
		{
			
			// JDBC driver name and database URL
			   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			   final String DB_URL = "jdbc:mysql://localhost:3306/test";

			   //  Database credentials
			   final String USER = "root";
			   final String PASS = "root";
			   	   
			   Class.forName(JDBC_DRIVER);
			   Connection con = DriverManager.getConnection(DB_URL,USER,PASS);	  
			   con.setAutoCommit(false);			   
			   String sql = "INSERT INTO Trainee VALUES(?,?)";  
			   PreparedStatement pstmt  = con.prepareStatement(sql);
			   pstmt.setInt(1, 120);
			   pstmt.setString(2, "Abhay");
			   
			   int row = 0;
			   row = pstmt.executeUpdate();
			   con.commit();
			   if(row>0)
			   {
				   System.out.println("Inserted");
			   }
			   else
				   System.out.println("Not ");
			
		}catch(SQLException | ClassNotFoundException e )
		{
			
		}
	}

}
