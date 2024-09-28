package com.cdac.collectionss;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int Eid;
	String EmpName;
	float Salary;
	
	public Employee(int eid, String empName, float salary) {
		super();
		Eid = eid;
		EmpName = empName;
		Salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", EmpName=" + EmpName + ", Salary=" + Salary + "]";
	}
	
	
}

public class UserDefinedClassDemo {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee e1 = new Employee();
		
		Employee e2 = new Employee(101,"Malkeet", 456789.90f);
		
		emplist.add(e1);
		emplist.add(e2);
		
		emplist.add(new Employee(102,"Sandeep",34567.80f));
				
		System.out.println(emplist);
		
		for (Employee e:emplist)
		{
			if(e.Eid==101) {
				System.out.println("ID: "+e.Eid+" Name : "+e.EmpName);	
			}
		}
		Iterator<Employee> it  = emplist.iterator();
		while (it.hasNext())
		{
			System.out.println("Salary: "+it.next().Salary);
		}
	}

}
