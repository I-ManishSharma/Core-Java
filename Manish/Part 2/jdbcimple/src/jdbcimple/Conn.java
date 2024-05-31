package jdbcimple;
import java.sql.*;
public class Conn {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");	//for register the driver
		/*
		String url = "jdbc:mysql://localhost:3306/banking_system";
		String uname = "root";
		String pass = "arvikk@mysql";
		String query = "select * from login";
		Connection con = DriverManager.getConnection(url,uname,pass); //establish the connection
		*/
		//OR 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system","root","arvikk@mysql");	//establish the connection
		
		Statement st = con.createStatement();	//create the statement
		
		
		//this is for DQL
		String query = "select * from login";	
		ResultSet rs =  st.executeQuery(query);	//execute the query
		
		//we can do this for individual record
		/*		//this is 6th step processing the query
		rs.next();
		int anumber = rs.getInt("acc_number");
		String name = rs.getString("uname");
		System.out.println(anumber + " "+ name);
		*/
		
		//we can do this for all records
		
		while (rs.next()) {				//Processing the query
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		
		
		//this is for DML
		int anumber
		String query = "insert into login( + anumber + ",'"+ uname + "')";	
		ResultSet rs =  st.executeQuery(query);	//execute the query
		
		st.close();
		con.close();
	}
}
