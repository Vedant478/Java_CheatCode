package com.cdac.studentmanagement;

public class Student implements Comparable<Student>{
	int RollNo;
	String Name;
	int Age;
	float Fee;
	
	public Student(int rollNo, String name, int age, float fee) {
		super();
		RollNo = rollNo;
		Name = name;
		Age = age;
		Fee = fee;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + ", Fee=" + Fee + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.Name.compareTo(o.Name);
	}

//	@Override
//	public int compareTo(Student o) {
//		
//		if(this.RollNo>o.RollNo)
//		{
//			return 1;
//		}
//		if(this.RollNo<o.RollNo)
//		{
//			return -1;
//		}
//		
//		return 0;
//	}
	
	
	
}
