package com.gm.constructors;

public class ConstructorOverloading {

    int rollNo;
    String name;
    float marks;
    String CollegeName;

    public ConstructorOverloading(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public ConstructorOverloading(int rollNo, String name, float marks, String collegeName) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        CollegeName = collegeName;
    }

    public ConstructorOverloading(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstructorOverloading{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", CollegeName='" + CollegeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(10, "Gowtham");
        ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(11, "Peter",101.f);
        ConstructorOverloading constructorOverloading3 = new ConstructorOverloading(23, "Parker", 154.8f, "SSM");

        System.out.println(constructorOverloading2.toString());

    }
}
