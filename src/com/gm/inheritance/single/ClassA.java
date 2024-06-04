package com.gm.inheritance.single;

public class ClassA {

     int id;
     int salary;
     String company;

    public void add(int num1, int num2){
        int num3 = num1+num2;
        System.out.println("The Addition :" + num3);
    }

    public ClassA(int id, int salary, String company) {
        this.id = id;
        this.salary = salary;
        this.company = company;
    }

    public ClassA() {
    }


}
