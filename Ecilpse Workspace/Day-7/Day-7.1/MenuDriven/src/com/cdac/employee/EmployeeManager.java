package com.cdac.employee;
import java.util.Scanner;
public class EmployeeManager {
	EmployeeModuleClass[] e = new EmployeeModuleClass[5];
	
	void AddEmployee()
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		for (int i=0;i<e.length;i++)
		{
			if(e[i]==null)
			{
				flag=true;
				e[i]=new EmployeeModuleClass();
				System.out.println("Enter Emp Id: ");
				e[i].EmpId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name: ");
				e[i].Name=sc.nextLine();
				System.out.println("Enter Salary: ");
				e[i].Salary=sc.nextInt();
				System.out.println("Enter Job: ");
				sc.nextLine();
				e[i].Job=sc.nextLine();
				
				System.out.println("Employee Added Successfully");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Memory not available to");
		}
	}
	void PrintAllEmployee()
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!=null)
			{
				System.out.println(e[i]);
			}
		}
	}
}
