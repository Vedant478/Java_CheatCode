package com.cdac.Arrays;

import java.util.Scanner;

public class MultiDimensional {
	public static void main(String[] args)
	{
		
		int[][] arr = new int [3][3];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++) {
				System.out.println("Enter the Element : ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The array is : ");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
