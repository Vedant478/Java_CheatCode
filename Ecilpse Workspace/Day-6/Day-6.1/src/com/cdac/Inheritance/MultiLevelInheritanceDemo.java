package com.cdac.Inheritance;

class A {
	void Method1() {
		System.out.println("Am Method1 of A");
	}
}
class B extends A{
	void Method2() {
		System.out.println("Am Method of B");
		
	}
}

class C extends B{
	void Method3() {
		System.out.println("Am method of C");
	}
}
class D extends B {
	void Method4() {
		System.out.println("Am method of D");
	}
}
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		D d1 = new D();
		d1.Method4();
	}

}
