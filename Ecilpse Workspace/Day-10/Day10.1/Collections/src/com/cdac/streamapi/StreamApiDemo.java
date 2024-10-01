package com.cdac.streamapi;

import java.util.ArrayList;

import com.cdac.studentmanagement.Student;

public class StreamApiDemo {
	
	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		//Student s = new Student{RollNo=101,Name="Malkeet",Age=34,Fees=345}
		slist.add(new Student(101, "Malkeet",34,2345.89f));
		slist.add(new Student(101, "Sandy",21,2345.89f));
		slist.add(new Student(101, "Rakya",45,3345.89f));
		slist.add(new Student(101, "Ram",67,45.89f));
		slist.add(new Student(101, "Sham",70,5.89f));
		
		slist.stream().filter(s->s.);

	}
	
	
	public static void main1(String[] args) {
		ArrayList<Integer> in = new ArrayList<Integer>();
		
		in.add(101);
		in.add(110);
		in.add(1010);
		in.add(101234);
		in.add(1056);
		
		System.out.println(in.stream().count());
		//in.stream().filter((n)->n>101).forEach((n)->System.out.println(n));
		in.stream().filter(n->n>101).sorted().forEach(n->System.out.println(n));;
		
		System.out.println("Limit");
		in.stream().limit(3).forEach(n->System.out.println(n));
		
	}
}
