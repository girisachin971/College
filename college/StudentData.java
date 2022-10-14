package com.college;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentData {
	
	Connnection1 con = new Connnection1();
	
	public ResultSet getStudentData() {
		Statement stm;
		try {
			stm = con.getConnection().createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM student_info");
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
	}

}
