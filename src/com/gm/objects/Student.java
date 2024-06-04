package com.gm.objects;
/*
3 Ways to initialize object
There are 3 ways to initialize object in Java.

By reference variable
By method
By constructor*/
public class Student {

    int rno;
    String name;

    public Student(int rno, String name) {
        this.rno=rno;
        this.name=name;
    }

    public Student() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                '}';
    }

    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void display() {
        System.out.println("rno = " +rno+" name "+ name);
    }
}
