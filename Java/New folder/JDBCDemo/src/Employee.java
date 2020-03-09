import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			boolean ch = true;
			String sql="";
			PreparedStatement pstmt = null;
			System.out.println("****************WELCOME TO EMPLOYEE MANAGEMENT SYSTEM****************");
			do{
			System.out.println("What would you like to do ? ");
			System.out.println("1. Insert ");
			System.out.println("2. Update ");
			System.out.println("3. Delete ");
			System.out.println("4. Display ");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			int id;
			String name;
			float salary;
			switch(choice)
			{
			case 1 : System.out.println("Enter the Id :: ");
					 id = sc.nextInt();
					 System.out.println("Enter the name :: ");
					 name = sc.next();
					 System.out.println("Enter the salary :: ");
					 salary=sc.nextFloat();
					 sql="INSERT INTO Employee VALUES(?,?,?)";
					 pstmt= con.prepareStatement(sql);
					 pstmt.setInt(1, id);
					 pstmt.setString(2, name);
					 pstmt.setFloat(3, salary);
					 int row = pstmt.executeUpdate();
					 if(row>0)
						 System.out.println("Insertion Successful");
					 break;
			case 2 : System.out.println("Enter the Id :: ");
			 id = sc.nextInt();
			 System.out.println("Enter the name :: ");
			 name = sc.next();
			 System.out.println("Enter the salary :: ");
			 salary=sc.nextFloat();
			 sql="INSERT INTO Employee VALUES(?,?,?)";
			 pstmt= con.prepareStatement(sql);
			 pstmt.setInt(1, id);
			 pstmt.setString(2, name);
			 pstmt.setFloat(3, salary);
			 int row = pstmt.executeUpdate();
			 if(row>0)
				 System.out.println("Insertion Successful");
			 break;
			case 3 :	
					 
			
			}
			}while(ch)
			{
				
			}
			sc.close();
		}
			catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	// fetch the data
	// store it into collection as employee object
	//
}
