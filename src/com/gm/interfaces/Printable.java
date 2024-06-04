package com.gm.interfaces;

public interface Printable {

    //An interface in Java is a blueprint of a class.
//    It has static constants and abstract methods.
    //public, static and final by default

    void print();

    //Default method
    default void msg() {
        System.out.println("default method");
    }

    static int add(int num1, int num2){
        return num1+num2;
    }
}
