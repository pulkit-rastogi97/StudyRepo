import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UpdateJDBC {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			
			String sql = "UPDATE Trainee SET traineeName = ? WHERE traineeId = ?";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id to update : ");
			int id = sc.nextInt();
			System.out.println("Enter new name :: ");
			String name  = sc.next();
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2,id);
			
			int row = pstmt.executeUpdate();
			
			if(row>0)
				System.out.println("updation successful");
		}
			catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
