/* */

import java.util.Scanner;

class Student { // Model Class
    int RollNo;
    String Name;
    float fees;
    int Age;
    static String CourseName = "DBDA";
}

class StudentManager { // Student Manager Class or Implementation Class
    static void PrintStudentRecord(Student s) {
        System.out.println("RollNo : " + s.RollNo + "Name : " + s.Name + "Fees : " + s.fees + "Age : " + s.Age
                + "CourseName : " + s.CourseName);
    }

    static void AcceptStudentRecord(Student s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo: ");
        s.RollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        s.Name = sc.nextLine();
        System.out.println("Enter Fees: ");
        s.fees = sc.nextFloat();
        System.out.println("Enter Age: ");
        s.Age = sc.nextInt();

    }

}

class TetCode { // Interface Class
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Record before inserting values");
        StudentManager.PrintStudentRecord(s1);
        StudentManager.AcceptStudentRecord(s1);

        System.out.println("Record after inserting values");
        StudentManager.PrintStudentRecord(s1);
    }
}
