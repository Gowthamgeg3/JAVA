package com.gm.objects;

public  class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student1 = new Student();
        //Initialize thru ref
        student1.rno = 10;
        student1.name ="Gowtham";

        System.out.println(student1.rno);
        System.out.println(student1.name);
//by method
        student1.add(1, 2);

        //by constructor

        Student student2 = new Student(10,"Boopathi");
        student2.display();


    }
}