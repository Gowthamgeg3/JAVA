package com.gm.inheritance.multilevel;

public class ClassB  extends ClassA {
     int bonus;

    public ClassB(int id, int salary, String company, int bonus) {
        super(id, salary, company);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "bonus=" + bonus +
                ", id=" + id +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        ClassB classB = new ClassB();
//
//        classB.add(10,20);
//
//        classB.id = 100;
//        classB.salary = 12000;
//        classB.company = "HCL";
//        classB.bonus = 2000;
//        System.out.println(classB.toString());
//
//    }
}
