import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			
			String sql = "SELECT * FROM Trainee";
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt("traineeId")+" "+rs.getString("traineeName"));
			}
		}
			catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
