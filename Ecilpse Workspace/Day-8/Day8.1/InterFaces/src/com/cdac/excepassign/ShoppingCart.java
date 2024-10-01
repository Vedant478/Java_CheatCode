package com.cdac.excepassign;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShoppingCart {
	ArrayList<CartItem> clist = new ArrayList<CartItem>();
	
//	public ShoppingCart() {
//		clist=new ArrayList<CartItem>();
//		clist.add(new CartItem("Apple", 1, 50));
//		clist.add(new CartItem("Bannana", 3, 20));
//		clist.add(new CartItem("Orange", 2, 100));
//	}
	 
	void addItem() throws NegatvePriceException 
	{
		Scanner sc = new Scanner(System.in);
		CartItem ci = new CartItem();
		System.out.println("Enter Item Name");
		ci.ItemName=sc.nextLine();	
		System.out.println("Enter Item Price");
		ci.ItemPrice=sc.nextInt();
		
		if(ci.ItemPrice<0)
		{
			throw new NegatvePriceException("Cannot add item '" + ci.ItemName + "' with negative price: " + ci.ItemPrice);
		}
		
		System.out.println("Enter Quantity");
		ci.quantity=sc.nextInt();
		
		clist.add(ci);
		System.out.println("Item added Succesfully");
		
	}
	void ViewCart()
	{
		for (CartItem ca:clist)
		{
			System.out.println(ca);
		}
	}
	
	void removeItem() throws ItemNotFound {
		Scanner sc = new Scanner(System.in);
		boolean flag= false;
		System.out.println("Enter a ItemName to remove the item");
		String in = sc.nextLine();
		
		Iterator<CartItem> iterator = clist.iterator();
	    
	    while (iterator.hasNext()) {
	        CartItem c = iterator.next();
	        if (c.ItemName.equals(in)) {
	            flag = true;
	            iterator.remove(); 
	            System.out.println("Item Removed Successfully");
	        }
	    }

	    if (!flag) {
	        throw new ItemNotFound("Item not found");
	    }
	}

	double calculateTotalPrice() {
		double total = 0;
		for (CartItem ci:clist)
		{
			total+=ci.ItemPrice*ci.quantity;	
		}
		System.out.println("Total Price of Cart: "+total);
		return total;
	}
}	



