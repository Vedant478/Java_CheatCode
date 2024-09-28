package com.cdac.calls;
// All the primitive datatypes are callby value
public class CallByValue {
	
	static void showData(int Num1, int Num2) {
		System.out.println("Num1 "+Num1 + "Num2 "+Num2);
		Num1 = 100;
	}
	static void printArray(int [] arr) {
		System.out.println("Array is: "+arr[0] +" "+arr[1] );
		arr[0] =900; 
	}

	public static void main(String[] args) {
		int[] num = {100,200};
		CallByValue.printArray(num);
		System.out.println("Array after passing to print array method");
		System.out.println("Array is  "+num[0]+" "+num[1]);
	}

}
