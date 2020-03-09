import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Question6 {

	public Question6() {
		// TODO Auto-generated constructor stub
	}
	public static void update(int empNo)
	{
		   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   final String DB_URL = "jdbc:mysql://localhost:3306/test";
		   //  Database credentials
		   final String USER = "root";
		   final String PASS = "root";
		   try {
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			
			
			String sql = "SELECT * FROM EMP";
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);
			int ch = 0;
			System.out.println("connection done");
			while(rs.next())
			{
				if(rs.getInt(1)==empNo)
				{
				
					System.out.println("found");
					
					System.out.println("Salary :: "+rs.getInt(6));
					System.out.println("enter the salary to be modified :: ");
					@SuppressWarnings("resource")
					int salary = new Scanner(System.in).nextInt();
					rs.updateInt(6, salary);
					rs.updateRow();
					System.out.println("Updated");
					ch  = 1;
					break;
				}
					
			}
			if(ch!=1)
			{
				System.out.println("Employee doesn't exist");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Enter the empNo :: ");
		@SuppressWarnings("resource")
		int empNo = new Scanner(System.in).nextInt();
		update(empNo);
	}
}
