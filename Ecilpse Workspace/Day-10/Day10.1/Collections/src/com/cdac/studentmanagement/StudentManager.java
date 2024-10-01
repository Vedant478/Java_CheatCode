package com.cdac.studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
	ArrayList<Student> slist ;
	
	public StudentManager() {
		slist=new ArrayList<Student>();
		slist.add(new Student(101,"Ram",33 , 265.9f));
		slist.add(new Student(105,"Ankit",56 , 1265.9f));
		slist.add(new Student(102,"Zeenat",21 , 2265.9f));
		slist.add(new Student(104,"Harish",45 , 3265.9f));
		slist.add(new Student(103,"Suraj",27 , 4265.9f));

	}
	 
	void GetAllStudent()
	{
		for (Student s :slist)
		{
			System.out.println(s);
		}
	}
	
	void AddStudent()
	{
		Scanner sc =new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter RollNo: ");
		s.RollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		s.Name=sc.nextLine();
		System.out.println("Enter Age: ");
		s.Age=sc.nextInt();
		System.out.println("Enter Fees: ");
		s.Fee=sc.nextFloat();
		
		slist.add(s);
		System.out.println("Record added Successfully");
	}
	
	void updateStudent() {
		Scanner sc =new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter RollNo of the Student to be updated");
		int rn =sc.nextInt();
		
		sc.nextLine();
		
		for (Student s:slist)
		{
			if (s.RollNo==rn)
			{
				flag=true;
				System.out.println("Enter Name: ");
				s.Name=sc.nextLine();
				System.out.println("Enter Age: ");
				s.Age=sc.nextInt();
				System.out.println("Enter Fees: ");
				s.Fee=sc.nextFloat();
				System.out.println("Record updated Successfully");
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Update hogaya bhai");
		}
				
	}
	void DeleteStudent() {
		Scanner sc =new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter RollNo of the Student to be deleted");
		int rn =sc.nextInt();
		
		for(Student s: slist)
		{
			if(s.RollNo==rn)
			{
				flag=true;
				slist.remove(s);
				System.out.println("Deleted successfully");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Student not found");
		}
		
	}
	void SortByRollNo() {
		Comparator<Student> cr = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.RollNo>o2.RollNo)
				{
					return 1;
					
				}
				if(o1.RollNo<o2.RollNo)
				{
					return -1;
				}
				return 0;
			}
			
		};
		Collections.sort(slist,cr);
		for (Student s:slist) {
			System.out.println(s);
		}
	}
	
	void SortByName() {
		Collections.sort(slist);
		for (Student s:slist) {
			System.out.println(s);
		}
	}
	void SortByFees() {
		Comparator<Student> cf = new FeesComparator();
		Collections.sort(slist,cf);
		for (Student s: slist)
		{
			System.out.println(s);
		}
	}
	
	void SortByAge() {
		Comparator<Student> ca = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.Age>o2.Age) {
					return 1;
				}
				if(o1.Age<o2.Age) {
					return -1;
					
				}
				return 0;
			}
		};
		Collections.sort(slist,ca);
		for (Student s: slist)
		{
			System.out.println(s);
		}
		
	}
	void SortByNameUsingLambda() {
		Comparator<Student> cbn1 = (s1,s2)->s1.Name.compareTo(s2.Name);

	}
}
