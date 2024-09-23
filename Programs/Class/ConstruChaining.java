class MyClass {
    int Num1;
    int Num2;

    MyClass() {

    }

    MyClass(int Num1) {
        this();
        System.out.println("1 arguements");
    }

    MyClass(int Num1, int Num2) {
        this(Num1);
        System.out.println("2 arguements");
    }
}

class TestCode {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(100, 200);
        System.out.println("end of main");
    }
}
