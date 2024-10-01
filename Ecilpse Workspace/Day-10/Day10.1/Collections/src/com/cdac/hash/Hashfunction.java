 package com.cdac.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashfunction {
	public static void main(String[] args) {
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		TreeMap<Integer, String> hm  = new TreeMap<Integer, String>();
		
		hm.put(101, "Malkeet");
		hm.put(102, "Sandeep");
		hm.put(103, "Ram");
		hm.put(104, "Sham");
		hm.put(105, "Seeta");

		for(Map.Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey());
		}
		
		ArrayList<String> svalue =(ArrayList<String>) hm.values();
		
		for (String s:svalue)
		{
			System.out.println(s);
		}
	}
}
