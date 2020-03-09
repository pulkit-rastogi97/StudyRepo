import java.sql.Connection;
import java.sql.*;


public class BatchUpdatedemo {

	public BatchUpdatedemo() {
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
		   
		   String sql = "Insert into Trainee VALUES(?,?)";
		   java.sql.PreparedStatement pstmt = con.prepareStatement(sql);
		   pstmt.setInt(1, 1212);
		   pstmt.setString(2, "Shradkglhdham hj,.hjb,lhj ");
		   pstmt.addBatch();
		   
		   pstmt.setInt(1, 1221);
		   pstmt.setString(2, "Amnḥbj,kgvi");
		   pstmt.addBatch();
		   
		   pstmt.setInt(1, 1331);
		   pstmt.setString(2, "Murbhj.lhli");
		   pstmt.addBatch();
		   
		   pstmt.setInt(1, 1331);
		   pstmt.setString(2, "Roh,hh.lan");
		   pstmt.addBatch();
		   
		   int[] updates = pstmt.executeBatch();
		   if(updates.length==4)
		   {
			   System.out.println("all rows inserted");
		   }
		   con.commit();

		   	}catch(SQLException | ClassNotFoundException e)
		   	{
		   		System.out.println(e.getMessage());
		   	}
	}
}
