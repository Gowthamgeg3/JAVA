package com.gm.polymorphism.instanceInitializer;


/*
* Rules for instance initializer block :
There are mainly three rules for the instance initializer block. They are as follows:
The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.
*
*
*
*       parent class constructor invoked
       instance initializer block is invoked
       child class constructor invoked
       parent class constructor invoked
       instance initializer block is invoked
       child class constructor invoked 10
*
* */
public class Bike {

    int speed;

    public Bike(){
        System.out.println("The Speed of the bike is: " + speed);
        System.out.println("Construcktor invoked ");
    }

    {
        speed = 100;
        System.out.println("Inistamnce Initialier Block");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike bike2 = new Bike();

    }
}
