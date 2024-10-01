package com.cdac.studentmanagement;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		StudentManager sm = new StudentManager();
		do
		{
			System.out.println("****************** Student operation ************************88");
			System.out.println("Press 1 to view all Student");
			System.out.println("Press 2 to add all Student");
			System.out.println("Press 3 to update all Student");
			System.out.println("Press 4 to delete all Student");
			System.out.println("Press 5 to Print Student sorted by rollno");
			System.out.println("Press 6 to Print Student sorted by Fees");
			System.out.println("Press 7 to Print Student sorted by Age");
			System.out.println("Press 8 to Exit");
			System.out.println("******************************************");
			
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				sm.GetAllStudent();
				break;
			case 2:
				sm.AddStudent();
				break;
			case 3:
				sm.updateStudent();
				break;
			case 4:
				sm.DeleteStudent();
				break;
			case 5:
				sm.SortByRollNo();
				//sm.SortByName();
				break;
			case 6:
				sm.SortByFees();
				break;
			case 7:
				sm.SortByAge();
				break;
			case 8: 
				
				System.out.println("Program Exited");
				break;
			 
			default:
				System.out.println("Invaid Input");
				break;
			}


		}
		while (choice!=8);
	}
}
