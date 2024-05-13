package jdbc_connection;

import java.sql.*;
import java.sql.DriverManager;

public class Mysql_jdbc {

	public static void main(String[] args) {
	    try{
	    	
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barbie?characterEncoding=latin1","root" ,"dharan");
	    	
	    	Statement stmt =con.createStatement();
	    	ResultSet rs =stmt.executeQuery("select * from students");
	    	while(rs.next())
	    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    	con.close();	
	    }

	
	catch(Exception ae) {
		
		System.out.println(ae);
	}
  }
}
