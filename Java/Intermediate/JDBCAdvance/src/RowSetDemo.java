import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;


public class RowSetDemo {

	public RowSetDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		try {
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			
			
			
			// JDBC driver name and database URL
			   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			   final String DB_URL = "jdbc:mysql://localhost:3306/test";

			   //  Database credentials
			   final String USER = "root";
			   final String PASS = "root";
			   	   
			   Class.forName(JDBC_DRIVER);
			   rowSet.setUrl(DB_URL);
			   rowSet.setUsername(USER);
			   rowSet.setPassword(PASS);
			   rowSet.setCommand("SELECT * FROM Trainee");
			   rowSet.execute();
			   rowSet.setConcurrency(JdbcRowSet.CONCUR_UPDATABLE);
			   
			  while(rowSet.next())
			  {
				  System.out.println(rowSet.getObject(1));
				  System.out.println(rowSet.getObject(2));
			  }
			   
			   
			   
			   
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
