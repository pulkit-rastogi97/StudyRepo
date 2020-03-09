
import java.sql.*;
public class JDBCTransaction {

	public JDBCTransaction() {
		// TODO Auto-generated constructor stub
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
			   
			   String sql1 = "INSERT INTO Trainee VALUES(?,?)";
			   PreparedStatement pstmt = con.prepareStatement(sql1);
			   pstmt.setInt(1, 122);
			   pstmt.setString(2, "Anay");
			   int row = pstmt.executeUpdate();
			   if(row>0)
			   {
				   System.out.println("Inserted");
			   }
			   con.setSavepoint();
			   
			   String sql2 = "INSERT INTO Trainee VALUES(?,?)";
			   PreparedStatement pstmt2 = con.prepareStatement(sql2);
			   pstmt2.setInt(1, 123);
			   pstmt2.setString(2, "Shilpa");
			   int row2 = pstmt2.executeUpdate();
			   if(row2>0)
			   {
				   System.out.println("Inserted");
			   }
			   con.setSavepoint();
			   
			   String sql3 = "INSERT INTO Trainee VALUES(?,?)";
			   PreparedStatement pstmt3 = con.prepareStatement(sql3);
			   pstmt3.setInt(1, 124);
			   pstmt3.setString(2, "Kavita");
			   int row3 = pstmt3.executeUpdate();
			   if(row3>0)
			   {
				   System.out.println("Inserted");
			   }
			   Savepoint C = con.setSavepoint();
			   
			   con.rollback(C);
			   con.commit();

		}catch(SQLException | ClassNotFoundException e )
		{
			System.out.println(e.getMessage());
		}
	}
}
