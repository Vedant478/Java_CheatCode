package com.cdac.grade;

import java.util.Scanner;

import com.cdac.grade.Grades.ScoreException;

public class StudentTest {
	public static void main(String[] args) {
		Grades g = new Grades();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("******************************");
			System.out.println("1. Add Student");
            System.out.println("2. Calculate Average");
            System.out.println("3. Display All Students");
            System.out.println("4. Sort by name");
            System.out.println("5. Sort by name in reverse order");
            System.out.println("6. Exit");
            System.out.println("******************************");
            System.out.println("Enter a choice");
            choice = sc.nextInt();
            
            switch (choice) {
			case 1:
				g.addStudent();
				break;
			case 2:
				try {
					g.calculateAvg();
				} catch (ScoreException e) {
					// TODO: handle exception
					System.out.println("Error: "+e.getMessage());
				}
				
			case 3: 
				g.getStudent();
				break;
			case 4:
				g.SortByName();
				break;
			case 5:
				g.SortByNameReverse();
				break;
			default:
				break;
			}
			
		} while (choice!=6);
		
		
	}
}
