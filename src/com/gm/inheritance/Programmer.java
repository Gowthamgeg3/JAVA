package com.gm.inheritance;

public class Programmer extends  Employee {

    Float bonus;

    public Programmer(int id, float salary, Float bonus) {
        super(id, salary);
        this.bonus = bonus;
    }

    public Programmer() {

    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.id = 100;
        programmer.Salary = 13321f;
        programmer.bonus = 600f;

        System.out.println(programmer.toString());
    }
}
