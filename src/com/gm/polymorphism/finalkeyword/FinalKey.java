package com.gm.polymorphism.finalkeyword;

public class FinalKey {

    final String PAN_NUMBER;

    //If you make any class as final, you cannot extend it.

    //Q) Is final method inherited?
    //Ans) Yes, final method is inherited but you cannot override it. For Example:


    final void fun(){
        System.out.println("Final method is invoked ");
    }

    //Que) Can we initialize blank final variable?
    //Yes, but only in constructor. For example:

    //Can we declare a constructor final?
    //No, because constructor is never inherited.

    FinalKey(){

        PAN_NUMBER = "CZMOPDDIE^@";
        System.out.println(PAN_NUMBER);

    }
}
