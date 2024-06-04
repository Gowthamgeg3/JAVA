package com.gm.thispackage;

public class CurrentClassmethod {

    /*

     3) this() : to invoke current class constructor
    The this() constructor call can be used to invoke the current class constructor.
    It is used to reuse the constructor. In other words, it is used for constructor chaining.
    */

    public CurrentClassmethod() {
        System.out.println("Current Class Constructoer");
    }

    public CurrentClassmethod(int x) {
        this();
        System.out.println("Parameterized constructor will be called");
    }

    /*
        2) this: to invoke current class method
    You may invoke the method of the current class by using the this keyword.
     If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
    */
    void m() {
        System.out.println("M is called ");
    }

    void n() {

        System.out.println("N is called ");
        m(); // also can be this.m();

    }

    public static void main(String[] args) {
        CurrentClassmethod currentClassmethod = new CurrentClassmethod();
        CurrentClassmethod currentClassmethod1 = new CurrentClassmethod(2);


        currentClassmethod1.n();
    }
}
