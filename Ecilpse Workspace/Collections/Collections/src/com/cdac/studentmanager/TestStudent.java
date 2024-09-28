package com.cdac.studentmanager;

public class TestStudent {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.AddStudent();
		sm.AddStudent();
		sm.GetAllStudent();
		
		//sm.UpdateStudent();
		//sm.GetAllStudent();

		System.out.println("Delete the student: ");
		sm.DeleteStudent();
		sm.GetAllStudent();
	}

}
