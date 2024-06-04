package com.gm.abstraction.shape;

public abstract class Shape {
    abstract void draw();
    int area;
    String curve;

    final int random = 100;

//    public Shape(int area, String curve, int random) {
//        this.area = area;
//        this.curve = curve;
//        this.random = random; //  or random =100;
//    }

    void nonAb(){
        System.out.println("Non Abstract method or normal method is invoked. ");
    }
}
