import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;


public class Question1 {

	public Question1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try
		{
			// JDBC driver name and database URL
			   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			   final String DB_URL = "jdbc:mysql://localhost:3306/test";
			   LocalDate dat =LocalDate.parse("2020-01-06");
			   Date date = Date.valueOf(dat);
			   //  Database credentials
			   final String USER = "root";
			   final String PASS = "root";
			   Class.forName(JDBC_DRIVER);
			   Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			   String sql = "INSERT INTO EMP VALUES (?,?,?,?,?,?,?,?)";
			   PreparedStatement pstmt = con.prepareStatement(sql);
			   pstmt.setInt(1, 1);
			   pstmt.setString(2, "Pulkit");
			   pstmt.setString(3,"Developer");
			   pstmt.setInt(4, 123);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 30000.00f);
			   pstmt.setFloat(7, 2000.00f);
			   pstmt.setInt(8,12);
			   pstmt.addBatch();
			   
			   
			   dat = LocalDate.parse("2019-03-19");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 2);
			   pstmt.setString(2, "Vaibhav");
			   pstmt.setString(3,"Designer");
			   pstmt.setInt(4, 133);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 30030.00f);
			   pstmt.setFloat(7, 2300.00f);
			   pstmt.setInt(8,11);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("2018-02-22");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 3);
			   pstmt.setString(2, "Jivtesh");
			   pstmt.setString(3,"Developer");
			   pstmt.setInt(4, 563);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 40030.00f);
			   pstmt.setFloat(7, 5300.00f);
			   pstmt.setInt(8,10);
			   pstmt.addBatch();

			   dat = LocalDate.parse("2000-04-15");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 4);
			   pstmt.setString(2, "Vijay");
			   pstmt.setString(3,"Engineer");
			   pstmt.setInt(4, 23);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 36030.00f);
			   pstmt.setFloat(7, 2700.00f);
			   pstmt.setInt(8,99);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("2013-12-22");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 5);
			   pstmt.setString(2, "Apurva");
			   pstmt.setString(3,"Executive");
			   pstmt.setInt(4, 34);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 6030.00f);
			   pstmt.setFloat(7, 1300.00f);
			   pstmt.setInt(8,23);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("2014-09-30");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 6);
			   pstmt.setString(2, "Pushpak");
			   pstmt.setString(3,"low level");
			   pstmt.setInt(4, 98);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 10030.00f);
			   pstmt.setFloat(7, 9000.00f);
			   pstmt.setInt(8,62);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("1997-03-29");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 7);
			   pstmt.setString(2, "Vaibhavi");
			   pstmt.setString(3,"Designers");
			   pstmt.setInt(4, 13);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 90030.00f);
			   pstmt.setFloat(7, 9300.00f);
			   pstmt.setInt(8,21);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("2001-03-19");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 8);
			   pstmt.setString(2, "Bharati");
			   pstmt.setString(3,"Trainer");
			   pstmt.setInt(4, 103);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 20030.00f);
			   pstmt.setFloat(7, 1600.00f);
			   pstmt.setInt(8,17);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("2011-07-29");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 9);
			   pstmt.setString(2, "Ritesh");
			   pstmt.setString(3,"Operations");
			   pstmt.setInt(4, 12);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 40030.00f);
			   pstmt.setFloat(7, 8300.00f);
			   pstmt.setInt(8,13);
			   pstmt.addBatch();
			   
			   dat = LocalDate.parse("2012-10-29");
			   date = Date.valueOf(dat);
			   pstmt.setInt(1, 10);
			   pstmt.setString(2, "Shivam");
			   pstmt.setString(3,"Driver");
			   pstmt.setInt(4, 23);
			   pstmt.setDate(5,date);
			   pstmt.setFloat(6, 3030.00f);
			   pstmt.setFloat(7, 2100.00f);
			   pstmt.setInt(8,91);
			   pstmt.addBatch();
			   
			   int[] updates = pstmt.executeBatch();
			   if(updates.length==10)
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
