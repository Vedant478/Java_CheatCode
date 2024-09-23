/*
 * Polymorphism : Have some name of entity having many forms 
 * Compile time polymorphism 
 * 
 */
class MethodOverloading {
    public static void Add() {
        int Num1 = 100;
        int Num2 = 200;
        int Res = Num1 + Num2;
        System.out.println("Sum is: " + Res);
    }

    public static void Add(int Num1, int Num2) {
        int Res = Num1 + Num2;
    }
}

class TestCode {
    public static void main(String[] args) {
        MethodOverloading.Add();
    }
}
