package com.college;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
	
	public void collegeApplication() {
		
		System.out.println("_______*** WELCOME TO SKNSITS COLLEGE***_______\n");
		System.out.println("Please sallect the option below");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter '1' for get the all student data");
		System.out.println("Please Enter '2' Enter New student data");
		
		
		int appNum = scan.nextInt();
		
		
		
		switch(appNum) {
		
		case 1:
			
			StudentData std = new StudentData();
			ResultSet res = std.getStudentData();
			
			try {
				
				System.out.println("  Roll No     First Name     Last Name      Phone Number");
				while(res.next()) {
					
					System.out.println("   " + res.getString(1) + "           " + res.getString(2) + "           " + res.getString(3) + "           " + res.getString(4));
				}
				break;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			
			
		
		case 2:
			
			InsertStudentData studentData = new InsertStudentData();
			
			studentData.newStudentData();
		
		
		}
		
		
		
		
	}

}
