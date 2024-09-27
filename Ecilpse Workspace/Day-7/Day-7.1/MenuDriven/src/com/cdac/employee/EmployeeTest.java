package com.cdac.employee;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		int choice ;
		Scanner sc = new Scanner(System.in);
		EmployeeManager em = new EmployeeManager();
	
		do
		{
			System.out.println("************ Employee operations ************************");
			System.out.println("Press 1 to Add a Employee");
			System.out.println("Press 2 to Print All Records");
			System.out.println("Press 3 to Edit a Employee");
			System.out.println("Press 4 to Delete a Employee");
			System.out.println("Press 5 to Exit");
			System.out.println("************************************************************");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice)
			{
			case 1: 
				em.AddEmployee();
				break;
			case 2: 
				em.PrintAllEmployee();
				break;
			case 3:
				//TODO
				break;
			case 4:
				//TODO
				break;
			case 5:
				System.out.println("Program Exiting");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while(choice!=5);
	}
}
