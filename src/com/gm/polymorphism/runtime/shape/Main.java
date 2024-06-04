package com.gm.polymorphism.runtime.shape;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        rectangle.draw();
        System.out.println((rectangle.speedlimit));//will be the parent class value can invoked - hemce there is no runtime polimorphysm for data menbers
        circle.draw();
        triangle.draw();
    }
}
