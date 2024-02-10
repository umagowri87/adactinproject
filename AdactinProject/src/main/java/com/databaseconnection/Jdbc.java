package com.databaseconnection;
import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/";
		String query="SELECT * FROM makemytrip";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
		String userId=rs.getString("ID");
		String un=rs.getString("From");
		String up=rs.getString("To");
		System.out.println(userId);
		System.out.println(un);
		System.out.println(up);
		}
		con.close();
	}

}
