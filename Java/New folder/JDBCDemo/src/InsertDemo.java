import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			
			String sql = "INSERT INTO Trainee VALUES(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println("Enter id :: ");
			int id = sc.nextInt();
			System.out.println("Enter name :: ");
			String name=sc.next();
			
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			
			int row = pstmt.executeUpdate();
			if(row>0)
			{
				System.out.println("successful insertion");
			}
		}
			catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
