package com.gm.inheritance.aggregation;

public class Circle {

    double pi = 3.14;
    Operation operation;

    double area(int radius){
        operation = new Operation();
        int rsquare = operation.square(radius);
        return pi*rsquare;

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double result  = circle.area(20);
        System.out.println(result);
    }

}
