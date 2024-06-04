package com.gm.polymorphism.binding;

public class Animal {

    //Static Binding (also known as Early Binding).
    //Dynamic Binding (also known as Late Binding).

    //When type of the object is determined at compiled time(by the compiler), it is known as static binding.
    //If there is any private, final or static method in a class, there is static binding.

    private void staticBinding(){
        System.out.println("Static binding is called");
    }

    public static void main(String[] args) {
        Animal A = new Animal();
        A.staticBinding(); //Type of object is determined at complie time is called Static binding
    }

}
