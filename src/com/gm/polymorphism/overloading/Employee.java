package com.gm.polymorphism.overloading;

public class Employee {

    public int add(int a, int b){
        System.out.println("Int method");
        return a+b;
    }
    public double add(double a, int b){
        System.out.println("Double mmethod");
        return a+b;
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        int result   = employee.add(20, 30, 40);
        int result2 = employee.add(1000, 20);
        System.out.println(result);
        System.out.println(result2);
    }

    //Method Overloadings
    private int add(int a, int b, int c) {
        return a+b+c;
    }
}
