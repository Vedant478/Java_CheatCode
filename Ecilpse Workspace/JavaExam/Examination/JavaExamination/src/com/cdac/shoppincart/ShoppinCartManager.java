package com.cdac.shoppincart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.cdac.librarymanagement.Library;

public class ShoppinCartManager {
	ArrayList<Shopping> slist = new ArrayList<Shopping>();
	
	void addItem() throws NumberFormatException,ArrayIndexOutOfBoundsException  {
		
		Scanner sc = new Scanner(System.in);
		Shopping s =  new Shopping();
		
		System.out.println("Enter a Id of item");
		s.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name of item");
		s.Name=sc.nextLine();
		System.out.println("Enter a Price of item");
		s.price=sc.nextInt();
		System.out.println("Enter a quantity of item");
		s.quantity=sc.nextInt();
		if (s.quantity==0 || s.price==0) {
			throw new ArithmeticException("Cannot enter a negative value in price or quantity");
		}
		else {
			slist.add(s);
		}
		System.out.println("Item added successfully");
	}
	
	int CalulateTotalPrice() throws ArithmeticException {
		int total = 0;
		for (Shopping s:slist) {
			total += s.price*s.quantity;
			System.out.println("The Total Price of your cart is: "+ total);
			if (s.quantity==0 || s.price==0) {
				throw new ArithmeticException("Cannot enter a negative value in price or quantity");
			}
		}
		
		return total;
		
	}
	
	void displayItems() {
		for (Shopping s:slist) {
			System.out.println(s);
		}
	}


}
