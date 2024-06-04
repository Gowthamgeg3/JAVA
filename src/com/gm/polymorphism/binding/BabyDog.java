package com.gm.polymorphism.binding;

public class BabyDog extends Dog{

    void eat(){
        System.out.println("BabyDog is drinking milk");
    }

    public static void main(String[] args) {
        Dog dog = new BabyDog(); //Dynamic Binding
        dog.eat();// The type of the object is determined at runtime is called dynamic binding

    }
}
