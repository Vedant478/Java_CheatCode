package com.cdac.collectionss;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<Integer> in1 = new ArrayList<Integer>();
		ArrayList<Integer> in2 = new ArrayList<Integer>(100);
		
		in2.ensureCapacity(500);
		
		in2.add(567);
		in2.add(789);
		
		System.out.println(in2.get(1));
		
		
	}
	
	
	public static void main3(String[] args) {
		ArrayList<Integer> in1 = new ArrayList<Integer>();
		in1.add(100);
		in1.add(200);
		in1.add(300);
		in1.add(400);
		
		in1.add(2,600);
		
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		
		
		in2.add(567);
		in2.add(789);
		
		System.out.println(" in1: "+in1);
		Integer a1=200; // 200 is boxed as object in a1, auto-boxing
		in1.remove(a1);
		
		System.out.println(" in1: "+in1);
		System.out.println(in1.contains(a1));
	}
	public static void main2(String[] args) {
		ArrayList<Integer> inlist = new ArrayList<Integer>();
		inlist.add(100);
		inlist.add(200);
		inlist.add(300);
		inlist.add(400);
		
		inlist.add(2,600);
		
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		
		
		in2.add(567);
		in2.add(789);
		
		
		inlist.addAll(3,in2);
		
		inlist.addAll(in2); //It will add at last of inlist
		System.out.println("inlist direct Print: "+inlist);
		System.out.println("inlist direct Printn using for each loop: ");

		
		for (Integer in:inlist)
		{
			System.out.print(in+" ");
		}
	}
	
	public static void main1(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add("malkeet");
		 
		list.add(2,700);  // add (index , element)
		System.out.println(list);
	}
}
