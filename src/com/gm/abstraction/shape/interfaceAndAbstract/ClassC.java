package com.gm.abstraction.shape.interfaceAndAbstract;

public class ClassC extends ClassB {
    @Override
    public void b() {
        System.out.println("B Invoked");
    }

    @Override
    public void c() {
        System.out.println("C Invoked");

    }

    @Override
    public void d() {
        System.out.println("D Invoked");

    }

    @Override
    public void e() {
        System.out.println("E Invoked");

    }
 //Optional
//    @Override
//    public void a() {
//        System.out.println("A invoked from Class C");
//    }
}
