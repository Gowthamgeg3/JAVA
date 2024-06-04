package com.gm.collections.arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(101, "Gotja,", 22);
        Student student1 = new Student(102, "Suman,", 32);
        Student student3 = new Student(103, "Hari,", 40);

        ArrayList<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student);
        list.add(student3);

        list.forEach(System.out::println);

    }
}
