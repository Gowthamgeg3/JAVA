package com.gm.polymorphism.instanceOf;

public class BabyDog extends Dog {

    void eat() {
        System.out.println("BabyDog is drinking milk");
    }

    public static void main(String[] args) {
        BabyDog dog = new BabyDog(); //Dynamic Binding
        Dog dog1 = new Dog();
        dog.eat();// The type of the object is determined at runtime is called dynamic binding

        System.out.println(dog instanceof Dog);//true
        System.out.println(dog1 instanceof BabyDog);//false


        //instanceof in java with a variable that have null value
        /*
        *
        * If we apply instanceof operator with a variable that have null value,
        * it returns false. Let's see the example given below where we apply instanceof operator with the variable that have null value.
         * */
        Dog d2 = null;
        System.out.println(d2 instanceof Dog);



    }
}
