package com.gm.polymorphism.superkeyword;

public class Animal {

    //super is used to refer immediate parent class instance variable

    String color = "white";
    String type;
    String name;

    public Animal(String color, String type, String name) {
        this.color = color;
        this.type = type;
        this.name = name;
    }

    public void sound(){
        System.out.println("Parent Class method invoked: ");
    }


}
