/*Static Block 
 * A block declared using static 
*/
class MyClass {
    static int Num1;

    MyClass() {
        System.out.println("am cons with zero arguments");
    }

    static {
        Num1 = 2;
        System.out.println("Am a static block");
    }

    static void Method1() {
        System.out.println("Am i main method");
    }
}

class TestCode {
    public static void main(String[] args) {
        MyClass.Method1();
        MyClass m1 = new MyClass();
        System.out.println("Value of Num1:" + MyClass.Num1);
    }
}