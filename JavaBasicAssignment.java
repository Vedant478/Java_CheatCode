//////////////////////////////// Java Assignment
//////////////////////////////// /////////////////////////////////////////////////

// 1. Write a Java program to create a class called "Person" with a name and age
// attribute. Create two instances of the "Person" class, set their attributes
// using the constructor, and print their name and age.

import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Person {
    String Name;
    int Age;

    Person(String nm, int ag) {
        Name = nm;
        Age = ag;
    }

    void AcceptPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        Name = sc.nextLine();
        System.out.println("Enter Age");
        Age = sc.nextInt();

    }

    void PrintRecord() {
        System.out.println("Name : " + Name + " Age : " + Age);
    }
}

class PersonTest {
    public static void main1(String[] args) {
        Person p = new Person(null, 0);
        p.AcceptPerson();
        p.PrintRecord();
    }
}

// 2. Write a Java program to create a class called "Dog"
// with a name and breed attribute. Create two instances of the
// "Dog" class, set their attributes using the constructor and modify the a
// attributes using the setter methods and print the updated values.

class Dog {
    private String Name;
    private String breed;

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void Setbreed(String breed) {
        this.breed = breed;
    }

    public String GetName() {
        return this.Name;
    }

    public String GetBreed() {
        return this.breed;
    }

    void PrintRecord() {
        System.out.println("Name : " + Name + " Breed : " + breed);
    }
}

class DogShit {
    public static void main2(String[] args) {
        Dog d = new Dog();
        d.PrintRecord();
        d.SetName("Anup");
        d.Setbreed("bull");
        d.PrintRecord();
        String SName = d.GetName();
        String SBreed = d.GetBreed();
        System.out.println("The name is " + SName + " Breed Name " + SBreed);
    }
}

// 3. Write a Java program to create a class called "Rectangle" with width and
// height attributes.
// Calculate the area and perimeter of the rectangle.

class Rectangle {
    double width;
    double height;

    Rectangle(double wd, double hg) {
        wd = width;
        hg = height;
    }

    void TakeHeightnWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height");
        height = sc.nextDouble();
        System.out.println("Enter Width");
        width = sc.nextDouble();

    }

    double CalculateArea() {
        return width * height;
    }

    double CalculatePeri() {
        return 2 * (width * height);
    }

    void display() {
        System.out.println("Height : " + height + " Width : " + width);
        System.out.println("Area : " + CalculateArea());
        System.out.println("Perimeter : " + CalculatePeri());
    }
}

class Rect {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0, 0);
        rect.TakeHeightnWidth();
        rect.display();
    }
}