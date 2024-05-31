package connection;

import java.sql.*;

public class Conn {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/banking_system";
		String uname = "root";
		String pass = "arvikk@mysql";
		String query = "select * from login";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery(query);
		
		//we can do this for individual record
		/*
		rs.next();
		int anumber = rs.getInt("acc_number");
		String name = rs.getString("uname");
		System.out.println(anumber + " "+ name);
		*/
		
		//we can do this for all records
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		
		st.close();
		con.close();
	}
}
