package com.cdac.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int [] arr ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of an array");
		int n = sc.nextInt();
		arr = new int[n];
		
		do
		{
		System.out.println("***************************** Array Operation ********************");
		System.out.println("Press 1 to enter Elements");
		System.out.println("Press 2 to Search the element");
		System.out.println("Press 3 to Replace the element");
		System.out.println("Press 4 to Sort the array");
		System.out.println("Press 5 to Delete the element");
		System.out.println("Press 6 to Print the array");
		System.out.println("Press 7 to exit");
		System.out.println("*************************************************");
		System.out.println("Enter your choice");
		choice =sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("*************************************************");
			for (int i= 0;i<n;i++ ) {
				
				System.out.println("Enter a Element");
				arr[i] = sc.nextInt();
			}
			break;
			case 6 :
				for (int i= 0;i<n;i++ ) {
					System.out.println(arr[i] + "  ");
				}
			break;
			case 2 :
				System.out.println("Enter a Element to be searched");
				int num = sc.nextInt();
				boolean b = false;
				for (int i=0;i<arr.length;i++) {
					if (arr[i]==num)
					{
						System.out.println("Element found at : "+i);
						b =true;
						break;
					}
				}
				if (b==false) {
					System.out.println("Element not found");
				}
				break;
			default:
				System.out.println("Invalid input");
				break;

	}
		}while (choice != 7);

}
}
