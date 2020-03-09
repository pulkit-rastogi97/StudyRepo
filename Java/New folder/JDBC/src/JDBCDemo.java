import java.sql.*;
import java.util.ArrayList;
public class JDBCDemo 
{
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   	   
	   static Connection con ;	   
	   static PreparedStatement pstmt ;
	   static int row = 0;
	public static boolean insertEmployee(ArrayList<Employee> empList) throws ClassNotFoundException, SQLException
	{
		   Class.forName(JDBC_DRIVER);
		   
		   con = DriverManager.getConnection(DB_URL,USER,PASS);
		   
		   String sql = "INSERT INTO Employee VALUES(?,?,?)";
		   

		   System.out.println(empList.size());
		   for(int i = 0; i < empList.size(); i++)
		   {				 
			   pstmt = con.prepareStatement(sql);
			   
			   pstmt.setInt(1, empList.get(i).getEmpId());
			   pstmt.setString(2, empList.get(i).getEmpName());
			   pstmt.setFloat(3, empList.get(i).getEmpSal());
			   
			   row += pstmt.executeUpdate();			   
		   }
		   if(row==empList.size())
		   {
			   return true;
		   }
		return false;
	}
   
}
