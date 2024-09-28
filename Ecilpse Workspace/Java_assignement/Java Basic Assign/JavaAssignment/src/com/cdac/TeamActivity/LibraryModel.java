package com.cdac.TeamActivity;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
	int BookId;
	String BookName;

	
	public Book(int bookId, String bookName) {
		super();
		BookId = bookId;
		BookName = bookName;
		
		
		
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "BookId=" + BookId + ", BookName=" + BookName;
	}
	
	
	public void borrow_books(int BookId) {
		this.BookId =BookId;
		
		
		
	}
	
	
	
}


// Inheritance
class Student extends Book{
	int StudentId;
	String StudentName;
	public Student(int bookId, String bookName, int studentId, String studentName) {
		super(bookId, bookName);
		StudentId = studentId;
		StudentName = studentName;
	}
	public Student(int bookId, String bookName) {
		super(bookId, bookName);
	}
	
}

class Teacher extends Book{
	int TeacherId;
	String TeacherName;
	public Teacher(int bookId, String bookName, int teacherId, String teacherName) {
		super(bookId, bookName);
		TeacherId = teacherId;
		TeacherName = teacherName;
	}
	public Teacher(int bookId, String bookName) {
		super(bookId, bookName);
	}
}

public class LibraryModel {
	public static void main(String[] args) {
		ArrayList<Book> arr = new ArrayList<Book>();
		Book b1 = new Book(1,"Atomic Habits");
		Book b2 = new Book(2,"Secrets");
		Book b3 = new Book(3,"Harry Potter");
		Book b4 = new Book(4,"Iron Man");
		Book b5 = new Book(5,"Captain America");
		Book b6 = new Book(6,"Hulk");
		Book b7 = new Book(7,"Batman");
		Book b8 = new Book(8,"Vedic");
		Book b9 = new Book(9,"Wings of Fire");
		Book b10 = new Book(10,"Lord of Rings");

		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		arr.add(b4);
		arr.add(b5);
		arr.add(b6);
		arr.add(b7);
		arr.add(b8);
		arr.add(b9);
		arr.add(b10);
		
		for(Book i : arr)
		{
			System.out.println(i);
		}
		
		Book[] stu=new Book[10];
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("Press 1 to For student");
		System.out.println("Press 2 to For Teacher");
		System.out.println("Press 3 to Exit");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
				for (int i=0; i<=5; i++) {
					if (i!=null) {
						
						System.out.println("Since you are a teacher so you can borrow 5 books");
						System.out.println("Enter the   books id");
						stu[i].BookId= sc.nextInt();
						
						stu.remove(stu[i].BookId);
						
						
					}
				}
				
				
		break;
		case 2:
			break;
		case 3:
*			break;
		default:
			System.out.println("Invalid Input");
			break;
        }
	}
}
