import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class DeleteDemo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			
			String sql = "DELETE FROM Trainee WHERE traineeId = ?";
			System.out.println("Enter the id to delete :: ");
			int id = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			
			int row = pstmt.executeUpdate();
			if(row>0)
			{
				System.out.println("deletion sucessful");
			}
		}
			catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
