package com.college;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudentData {
	
	Connnection1 con = new Connnection1();
	Scanner scan = new Scanner(System.in);
	
	public void newStudentData() {
		
		try {
			
			
			System.out.println("Please Enter The number of new Student ");
			int num = scan.nextInt();
			for(int i =1; i<= num; i++) {
				PreparedStatement stm = con.getConnection().prepareStatement("INSERT INTO student_info VALUES (?,?,?,?)");
				System.out.println("Please Enter Student Roll Number ");
				stm.setInt(1, scan.nextInt());
				System.out.println("Please Enter Student First Name ");
				stm.setString(2, scan.next());
				System.out.println("Please Enter Student Last Name ");
				stm.setString(3, scan.next());
				System.out.println("Please Enter Student Phone Number ");
				stm.setLong(4, scan.nextLong());
				
				stm.addBatch();
				stm.executeBatch();
			}
			
			con.getConnection().close();
			System.out.println("Data Inserted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
