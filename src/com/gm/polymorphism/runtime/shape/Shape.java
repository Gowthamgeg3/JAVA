package com.gm.polymorphism.runtime.shape;

public class Shape {


    int speedlimit = 90;
    public void draw(){
        System.out.println("Drawing from Shape");
    }

    //In the example given below, both the classes have a data member speedlimit.
    // We are accessing the data member by the reference variable of Parent class which refers to the subclass object.
    // Since we are accessing the data member which is not overridden, hence it will access the data member of the Parent class always


}
