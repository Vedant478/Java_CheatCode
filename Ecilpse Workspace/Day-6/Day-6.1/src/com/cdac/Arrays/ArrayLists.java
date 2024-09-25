package com.cdac.Arrays;

import java.util.Arrays;
import java.util.Scanner;
/// How to search the element in ARRAY
public class ArrayLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int  [5];
		for (int i=0;i<5;i++)
		{
			System.out.println("Enter Element");
			arr[i] = sc.nextInt();
		}
	

	int Num1 = 30;
	int Index ;
	int Value ;
	System.out.println("Before Array"+Arrays.toString(arr));
	System.out.println("Enter the index at which you want to insert the value");
	Index=sc.nextInt();
	
	for (int i=0;i<5;i++)
		{
			if(i==Index)
			{
				System.out.println("Enter a Value");
				Value = sc.nextInt();
				arr[i] = Value;
				break ;
			}
			
		}
		
		System.out.println("After Update"+Arrays.toString(arr));
		
		
	}
	
	///////////////////////////////////////////////////
	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int  [6];
		for (int i=0;i<5;i++)
		{
			System.out.println("Enter Element");
			arr[i] = sc.nextInt();
		}
		int Sum=0;
		System.out.println("Addition in progress");
		for (int i=0;i<5;i++) {
			Sum = Sum +arr[i];
		}
		System.out.println("After Addition : "+Sum);
//		int Num1 = 67;
//		for (int i=0;i<5;i++)
//		{
//			if(arr[i]==Num1)
//			{
//				System.out.println("Element found at : "+i);
//				break;
//			}
//			
//		}
//		
//		System.out.println();
	}
}
