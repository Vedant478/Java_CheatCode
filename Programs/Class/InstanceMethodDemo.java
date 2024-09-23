
/*
 * 1) Student class
 * 2) Display 
 * 3) Test class
 * 
 * 
 * Whenever there is an creation of instance 
 * 
 * Different Types of constructor
 * 1) default constructor
 * Takes default value in the constructor
 * 
 * 2)Parameterized Constructor
 * Only those parameters those are intialized
 * 
 * 3)Copy Constructor 
 * If a user has defined parameterized constructor then we cannot create and count call default constructor
 * If a class has one or more constructor is called as constructor overloading
 */
import java.util.Scanner;

class Student1 {
    int RollNo;
    String Name;
    float Fees;
    int Age;

    Student1(int rn, String nm, float fs, int ag) {
        RollNo = rn;
        Name = nm;
        Fees = fs;
        Age = ag;
    }

    Student1() {

    }

    void AcceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo.");
        RollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name.");
        Name = sc.nextLine();
        System.out.println("Enter Fees");
        Fees = sc.nextFloat();
        System.out.println("Enter Age");
        Age = sc.nextInt();
    }

    void PrintRecord() {
        System.out.println("Roll No :" + RollNo + " Name : " + Name + " Fees : " + Fees + " Age : " + Age);
    }

    void Update_Age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current age : ");
        Age = sc.nextInt();
    }
}

class StudentTest {
    public static void main(String[] args) {
        // Student1 s1 = new Student1(101, "Anup", 100.0f, 20);
        Student1 s1 = new Student1();

        Student1 s2 = new Student1(102, "Anu", 10.0f, 21);

        // s1.AcceptRecord();

        System.out.println("S1 before copy");
        s1.PrintRecord();

        s1 = s2;
        System.out.println("S1 after copy");
        // s1.Update_Age();
        // s1.PrintRecord();

    }
}
