package com.gm.abstraction.shape;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Circle();
        Shape shape1 = new Rectangle();
        Shape shape2 = new Triangle();

        shape1.draw();
        shape.draw();
        shape2.draw();
    }
}
