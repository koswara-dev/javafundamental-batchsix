package com.juaracoding.dayfive;

// Java Code to show use of
// super keyword with constructor

// superclass Person
class Employee {
    Employee()
    {
        System.out.println("Person class Constructor");
    }
}

// subclass Student extending the Person class
class Manager extends Employee {
    Manager()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

public class KeywordSuperThree {
    public static void main(String[] args)
    {
        Manager s = new Manager();
    }
}
