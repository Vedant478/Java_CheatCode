package com.cdac.collectionss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class CollectionsSetFamily {
//	public static void main(String[] args) {
//		TreeSet<Student> tsstu= new TreeSet<Student>();
//		tsstu.add(new Student());
//		TreeSet<Integer> ts = new TreeSet<>();
//		
//		ts.add(300);
//		ts.add(9);
//		ts.add(56);
//		ts.add(1)
//	}
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(300);
		ts.add(9);
		ts.add(56);
		ts.add(1);
		ts.add(250);
		
		System.out.println(ts);
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1.add("Ram");
		ts1.add("Sham");
		ts1.add("Vedant");
		ts1.add("Gaurav");
		ts1.add("Anup");
		
		System.out.println(ts1);

	}
	
	public static void main2(String[] args) {
		ArrayList<Integer> hs = new ArrayList<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);
		
		System.out.println(hs);	
		
//		for(Integer in:hs)
//		{
//			System.out.print(in+" ");
//		}
//		
		Iterator<Integer> it =  hs.iterator();
		while (it.hasNext())
		
			{
				System.out.print(it.next()+"  ");
			}
		
		System.out.println();
		System.out.println("traversal of arraylist using list-iterator");
		ListIterator<Integer> lt = hs.listIterator();
		while (lt.hasNext())
		{
			System.out.print(lt.next()+" ");
		}
		
	}
	
	
	public static void main1(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);
		
		System.out.println(hs);
	}
}
