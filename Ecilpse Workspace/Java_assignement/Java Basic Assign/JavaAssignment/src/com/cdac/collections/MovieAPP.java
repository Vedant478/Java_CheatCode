package com.cdac.collections;

public class MovieAPP {
	int MovieID;
	String MovieName;
	public MovieAPP(int movieID, String movieName) {
		super();
		MovieID = movieID;
		MovieName = movieName;
	}
	public MovieAPP() {
		super();
	}
	@Override
	public String toString() {
		return "MovieID=" + MovieID + ", MovieName=" + MovieName;
	}


}
