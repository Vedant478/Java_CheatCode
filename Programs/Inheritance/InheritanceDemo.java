// parent class or super class (use the term super class during interview)
class Demo {
    int num1;

    Demo() {
        System.out.println("am cons of demo");
    }

    void Method1() {
        System.out.println("Am method1 of demo");
    }
}

// Child class or subclass or derived class (use the term subclass during
// interview)
class Demo1 extends Demo {
    int num2;

    Demo1() {
        System.out.println("am cons of demo1");
    }

}

class TestCode {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.num1 = 20;
        d1.num2 = 30;
    }
}