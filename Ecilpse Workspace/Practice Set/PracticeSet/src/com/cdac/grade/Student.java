package com.cdac.grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student> {
	String Name;
	int id;
	int[] testscores;
	
	public Student(String name, int id, int[] testscores) {
		super();
		Name = name;
		this.id = id;
		this.testscores = testscores;
	}
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Name=" + Name + ", id=" + id + ", testscores=" + Arrays.toString(testscores);
	}

	@Override
	public int compareTo(Student o) {
		return this.Name.compareTo(o.Name); 
	}
	
		
}

class Grades{
	ArrayList<Student> slist = new ArrayList<Student>();
	
	void getStudent() {
		for (Student s:slist)
		{
			System.out.println(s);
		}
	}
	void addStudent() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.println("Enter a Name");
		s.Name=sc.nextLine();
		System.out.println("Enter a ID");
		s.id=sc.nextInt();
//			if (id.matches("\\d{5}")) {  // ID must be 5 digits
//			 s.id=sc.nextInt();
//	        } else {
//	            throw new InvalidIDException("Invalid ID format. ID should be a 5-digit number.");
//	        }
		
		System.out.println("Enter the number of TestScores");
		int numscores=sc.nextInt();
		
		int[] testscores = new int[numscores];
		
		System.out.println("Enter a testscores: ");
		for (int i = 0; i < numscores; i++) {
            testscores[i] = sc.nextInt();
        }
		s.testscores = testscores; 
		slist.add(s);
		System.out.println("Record Added Successfully");
	}
	void calculateAvg() throws ScoreException{
		for (Student s : slist) {
            if ( s.testscores==null ||s.testscores.length == 0) {
                throw new ScoreException("No test scores available for student: " + s.Name);
            }
            
            double sum = 0;
            for (int score : s.testscores) {
                sum += score;
            }
            
            double average = sum / s.testscores.length;
            String grade = assignGrade(average);
            System.out.println("Student: " + s.Name + " | ID: " + s.id + " | Average Score: " + average + " | Grade: "+ grade);
        }
	}
	
	public String assignGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
	
	void SortByName() {
		Collections.sort(slist);
		for (Student s:slist) {
			System.out.println(s);
		}
	}
	void SortByNameReverse() {
		Collections.sort(slist,Collections.reverseOrder());
		for (Student s:slist) {
			System.out.println(s);
		}
	}
	public class ScoreException extends Exception { 
		public ScoreException() {
			System.out.println("Score cannot be greater than 100");
			
		}
		public ScoreException(String msg) {
			super(msg);
		}
	}
	
	class InvalidIDException extends Exception {
	    public InvalidIDException(String message) {
	    	super(message);
	    }
	}
}