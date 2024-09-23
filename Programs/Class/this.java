/*
 * If the name of instance variable and name of the method variable are the same then the 
 * preference will be given to the method variable
 * 
 * This method is called as shadowing
*/

import javax.print.attribute.standard.MediaSize.NA;

class Student {
    int Rollno;
    String Name;

    Student() {

    }

    Student(int Rollno, String Name) {
        this.Rollno = Rollno;
        this.Name = Name;
    }

    void PrintRecord() {
        int RollNo = 1000;
        String Name = "Sandeep";

        System.out.println("Roll No :" + this.Rollno + " Name : " + this.Name);
    }
}

class StudTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vedant");
        s1.PrintRecord();
    }
}
