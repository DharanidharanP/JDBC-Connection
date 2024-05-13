package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_connection1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dharan?characterEncoding=latin2","root","dharan");
			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery("select * from student");
			while(rs.next());
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(1));
			con.close();
			
			
		}
		catch(Exception ae) {
			
			System.out.println(ae);
	}
	}
}
