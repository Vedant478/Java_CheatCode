/*
 * - A class a blueprint of an object 
 * - A class which represent attribute and behaviour of a real world entity known as object
 * - A class can contain:
 *      - Fields (Data)
 *             - Instance variable Non static data member is known as instance variable or 
 *               the variable which gets memory inside the object
 *             - Class variable : A static variable of the class is knowns as class level variable 
 *      - Methods (Functions/Operations)
 *      - A class (nested class)
 *      - Enum 
 */

import java.util.Scanner;

class student {
    int RollNo;
    String Name;
    float Fees;
    int Age;

    public static void main(String[] args) {
        student s1; // Variable of a class student , also known as Ref Variable
        new student(); // Instance of class Student, it is also a anon instance

        student s2 = new student();

        s2.RollNo = 101;
        s2.Name = "Vedant";
        s2.Fees = 1000;
        s2.Age = 23;

        System.out.println(s2.RollNo);
        System.out.println(s2.Name);
        System.out.println(s2.Fees);
        System.out.println(s2.Age);

    }
}

/*
 * Rules to design methods
 * 1) Method Declaration
 * 2) Method Defination
 * 3) Method Calling
 * ----------------------------------------------------------------------
 * Function or method without return type and function without arguement
 * Function without returntype and fucntion with arguements
 * Function with returntype and without arguements
 * Function with retunrtype and wiht arguementd
 */

class students1 {
    int RollNo;
    String Name;
    float Fees;
    int Age;

    public void SetStudent(int rn, String nm, float fs, int ag) {
        RollNo = rn;
        Name = nm;
        Fees = fs;
        Age = ag;

    }

    public void Display() {
        System.out.println(("RollNo: " + RollNo + " Name: " + Name + " Fees: " + Fees + " Age: " + Age));
    }

    public static void main1(String[] args) {
        students1 s1 = new students1();
        students1 s2 = new students1();
        s2.SetStudent(1001, "Vedant", 10000, 23);
        s1.SetStudent(1001, "Vedant", 10000, 23);
        s2.Display();
        s1.Display();
    }

    /// Scanner fucntion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        students1 s = new students1();

        System.out.println("Enter a Roll NO");
        s.RollNo = sc.nextInt();
        System.out.println("Enter a fees: ");
        s.Fees = sc.nextFloat();
        System.out.println("Enter a Age: ");
        s.Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a Name: ");
        s.Name = sc.nextLine();

        s.Display();
    }
}
