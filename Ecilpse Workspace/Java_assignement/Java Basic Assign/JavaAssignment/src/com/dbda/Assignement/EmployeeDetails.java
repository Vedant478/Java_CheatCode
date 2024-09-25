package com.dbda.Assignement;

import java.util.Scanner;

/*6.Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, 
 * and methods to calculate and update salary.*/
class Employee {
	String Name;
	String Job_title;
	int Salary;
	
	static int totalSalary = 0;
	
	public Employee(String name, String job_title, int salary,int total_salary) {
		super();
		Name = name;
		Job_title = job_title;
		Salary = salary;
	}
	
	Employee(){
		
	}
	void AcceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name.");
        Name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Job Title.");
        Job_title = sc.nextLine();
        System.out.println("Enter Salary");
        Salary = sc.nextInt();
        
    }
	void PrintRecord() {
        System.out.println("Name :" + Name + " Job Title : " + Job_title + " Salary : " + Salary);
    }
	void Update_Salary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter updated Salary: ");
    }

		
}
public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e.AcceptRecord();
		e.PrintRecord();
		e1.AcceptRecord();
		e1.PrintRecord();
		e2.AcceptRecord();
		e2.PrintRecord();
		

		//e.Update_Salary();
		//e.PrintRecord();
	}	
}
