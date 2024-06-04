package com.gm.inheritance.hierarchical;

public class ClassA {

     int id;
     int salary;
     String company;

    public ClassA(int id, int salary, String company) {
        this.id = id;
        this.salary = salary;
        this.company = company;
    }

    public ClassA() {
    }

    void method(){
        System.out.println("Method from ClassA");
    }


}
