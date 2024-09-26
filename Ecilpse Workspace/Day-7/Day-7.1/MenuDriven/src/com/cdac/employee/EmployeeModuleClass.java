package com.cdac.employee;

public class EmployeeModuleClass 
{
	int EmpId;
	String Name;
	int Salary;
	String Job;
	
	public EmployeeModuleClass(int empId, String name, int salary, String job) {
		super();
		EmpId = empId;
		Name = name;
		Salary = salary;
		Job = job;
	}

	public EmployeeModuleClass() {
		super();
	}

	@Override
	public String toString() {
		return "EmpId=" + EmpId + ", Name=" + Name + ", Salary=" + Salary + ", Job=" + Job ;
	}
	
	
	
	
}
