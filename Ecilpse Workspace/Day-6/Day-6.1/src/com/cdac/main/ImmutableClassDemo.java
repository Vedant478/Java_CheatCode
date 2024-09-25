package com.cdac.main;
// If the class has all fields as a final that class is known as immutable class
// Final classes cannot be inherited
// All wrapper classes are final
final class MyClass{
	final int ROI;
	MyClass(){
		ROI = 8;
	}
	
	public int GetROI() {
		return ROI;
	}
//	public void SetROI(int ROI)
//	{
//		this.ROI=ROI;
//	}
}
public class ImmutableClassDemo {
	public static void main(String[] args) {
		MyClass m1= new MyClass();
		System.out.println("ROI: "+m1.GetROI());
		
		//m1.SetROI();
		
		MyClass m2 = new MyClass();
		System.out.println("ROI: "+m2.GetROI());

	}
}
