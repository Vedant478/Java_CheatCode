package com.cdac.string;

public class StringDemo {
	
	public static void main(String[] args) {
		String str = new String("Malkeet");
		String str1 = new String("Malkeet");
		if (str==str1)   
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
	}
	
	public static void main2(String[] args) {
		String str ="Malkeet";
		String str1 = "Malkeet";
		// == operators compares their addresses
		// equals compare the value in the string 
		if (str==str1)   
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
		
	}
	
	public static void main1(String[] args) {
		String str ="Malkeet";
		String str1 = new String ("Malkeet");
		// == operators compares their addresses
		// equals compare the value in the string 
		if (str.equals(str1))   
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
	}
}
