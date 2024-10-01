package com.cdac.main;
// Here attribute name is encapsulated in class person with private access modifier and can only 
//be accessed by using getter and setter method

public class Encapsulation {
	public class Person {
	    private String name;  // private variable

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}

//-----------------------------------------------------------/
//Abstraction using abstract method
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
}

class Dog extends Animal {
    // Implementation of abstract method
    public void sound() {
        System.out.println("Woof");
    }
}
// the Animal class is abstract, meaning it cannot be instantiated. 
//The Dog class provides an implementation of the abstract sound() method.

//-----------------------------------------------------------------------//
//Inheritance
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car is honking");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Inherited method from Vehicle
        car.honk();
    }
}
//Car inherits the start() method from the Vehicle class.

//--------------------------------------------------------------------------//
//Polymorphism
// (Method overriding)
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();  // Polymorphism
        myAnimal.sound();  // Calls the Cat's sound method
    }
}

//(Method overloading)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));        // Calls two-parameter method
        System.out.println(calc.add(5, 3, 2));     // Calls three-parameter method
    }
}

//--------------------------------------------------------------------------------