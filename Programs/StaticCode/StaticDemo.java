
/*
 * Yours static method can access non static method
 */
class StaticDemo {
    static int count;
    int Num1;

    StaticDemo() {
        count = 0;
        count++;
    }

    void show() // Non static method
    {
        // System.out.println("The value of count" + this.count); // Static variable
        // should be accessed
        System.out.println("The value of count" + count); // Acessing Static Variable
        System.out.println("Value of Num1: " + this.Num1);
    }

    static void Method1() {
        System.out.println("Value of count: " + count);
        // System.out.println("Value of Num1: " + Num1); static method cant access
        // non-static
    }

    public static void main(String[] args) {
        StaticDemo t1 = new StaticDemo();
        StaticDemo t2 = new StaticDemo();

        System.out.println("Value of count" + count);
        t2.show();
        StaticDemo.Method1();
    }
}
