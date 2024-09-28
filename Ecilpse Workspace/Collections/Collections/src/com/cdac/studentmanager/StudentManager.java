package com.cdac.studentmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManager {
	ArrayList<Student1> slist = new ArrayList<Student1>();
	
	void AddStudent()
	{
		Scanner sc = new Scanner(System.in);
		Student1 s = new Student1();
		
		System.out.println("Enter RollNo: ");
		s.RollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		s.Name=sc.nextLine();
		System.out.println("Enter Age : ");
		s.Age=sc.nextInt();
		System.out.println("Enter Fees: ");
		s.Fees=sc.nextFloat();
		
		slist.add(s);
		
		System.out.println("Record Address successfully");
	}

	void GetAllStudent() 
	{
		for(Student1 s:slist)
		{
			System.out.println(s);
		}
	}
	void UpdateStudent() {
		
		Scanner sc = new Scanner(System.in);
		int rn ;
		System.out.println("Enter a RollNo: ");
		rn=sc.nextInt();
		
//		Iterator<Student1> it = slist.iterator();
//		while (it.hasNext())
//		{
//			Student1 s = it.next();
//			if(s.RollNo==rn)
//			{
//				System.out.println("Enter Name: ");
//				sc.nextLine();
//				s.Name=sc.nextLine();
//				System.out.println("Enter Age : ");
//				s.Age=sc.nextInt();
//				System.out.println("Enter Fees: ");
//				s.Fees=sc.nextFloat();
//				break;
//			}
//		}
		for(Student1 s : slist)
		{
			if(s.RollNo==rn)
			{
				System.out.println("Enter Name: ");
				sc.nextLine();
				s.Name=sc.nextLine();
				System.out.println("Enter Age : ");
				s.Age=sc.nextInt();
				System.out.println("Enter Fees: ");
				s.Fees=sc.nextFloat();
				break;
			}
		}
	}
	
	void DeleteStudent() {
		Scanner sc = new Scanner(System.in);		
		String nm;
		System.out.println("Enter a name: ");
		nm=sc.nextLine();
		Iterator<Student1> it = slist.iterator();
	    while (it.hasNext()) {
	        Student1 s = it.next();
	        if (s.Name.equals(nm)) {
	            it.remove();  
	            System.out.println("Student " + nm + " has been removed.");
	            break;  
	        }
	    }
	
	}
}
