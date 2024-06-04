package com.gm.polymorphism.runtime.downcasting;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(); //Upcasting (from parent to child)
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        rectangle.draw();
        System.out.println((rectangle.speedlimit));//will be the parent class value can invoked - hemce there is no runtime polimorphysm for data menbers
        circle.draw();
        triangle.draw();

        //Downcasting
//        When Subclass type refers to the object of Parent class, it is known as downcasting. I

        Circle circle1 = (Circle) new Shape();
        System.out.println(circle1.speedlimit);
        circle1.draw();

    }
}
