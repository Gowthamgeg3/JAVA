package com.gm.polymorphism.superkeyword;

public class Dog extends Animal {

    String color;


    public Dog(String color, String type, String name, String color1) {
        super(color, type, name);
        this.color = color1;
    }
    


    public void printColor() {
        System.out.println("Child class instance variable  : "+ color);
        //super can be used to invoke parent instance variable
        System.out.println("Parent class instance variable  : " + super.color);
        //super can be used to invoke parent class method
        super.sound();
    }
}
