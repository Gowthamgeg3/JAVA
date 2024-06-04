package com.gm.inheritance.hierarchical;

public class ClassC  extends ClassA {

    String behaviour;

    public ClassC(int id, int salary, String company, String behaviour) {
        super(id, salary, company);
        this.behaviour = behaviour;
    }

    public ClassC(String behaviour) {
        this.behaviour = behaviour;
    }

    void method(){
        System.out.println("Method from classC");
    }


    @Override
    public String toString() {
        return "ClassC{" +
                "behaviour='" + behaviour + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ClassC classC = new ClassC(10,1000,"SSS", "Good");

        System.out.println(classC.toString());
        classC.method();


    }

}
