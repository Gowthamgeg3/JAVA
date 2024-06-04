package com.gm.inheritance.hierarchical;

public class ClassB  extends ClassA {

    int bonus;

    void method(){
        System.out.println("Method from classB");
    }

    public ClassB(int id, int salary, String company, int bonus) {
        super(id, salary, company);
        this.bonus = bonus;
    }

    public ClassB() {
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();

        classB.method();
    }

}
