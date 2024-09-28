package com.cdac.collections;

import java.util.ArrayList;

public class MovieManager {	
	public static void main(String[] args) {
		ArrayList<MovieAPP> arr = new ArrayList<MovieAPP>();
		MovieAPP m1 = new MovieAPP(1,"Iron Man");
		MovieAPP m2 = new MovieAPP(2,"Captain America");
		MovieAPP m3 = new MovieAPP(3,"Spider Man");
		MovieAPP m4 = new MovieAPP(4,"Hulk");
		MovieAPP m5 = new MovieAPP(5,"Batman");
		MovieAPP m6 = new MovieAPP(6,"Dr Strange");

		arr.add(m1);
		arr.add(m2);
		arr.add(m3);
		arr.add(m4);
		arr.add(m5);
		arr.add(m6);
		
		for (MovieAPP m : arr)
		{
			System.out.println(m);
		}
		//System.out.println(arr);

		
	
	}
}
