package com.college;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class College {
	
//	static Connnection1 con = new Connnection1();
//	
//	public static void getData() {
//		
//		try {
//			Statement stm = con.getConnection().createStatement();
//			ResultSet res = stm.executeQuery("SELECT * FROM student_info");
//			while(res.next()) {
//				
//				System.out.println(res.getString(2));
//			}
//			
//			stm.close();
//			con.getConnection().close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		StudentData std = new StudentData();
		ResultSet res = std.getStudentData();
		
		while(res.next()) {
			
			System.out.println(res.getString(2));
		}
		

	}

}
