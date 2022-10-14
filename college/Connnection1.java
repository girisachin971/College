package com.college;
import java.sql.*;


public class Connnection1 {
	
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","Sachin@321");
//			"jdbc:mysql://localhost:3306/College","root","Sachin@321"
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
