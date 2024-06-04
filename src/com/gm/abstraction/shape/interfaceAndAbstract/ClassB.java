package com.gm.abstraction.shape.interfaceAndAbstract;

public abstract class ClassB implements InterfaceA {
    @Override
    public void a() {
        System.out.println("Invoking a method from abstact class A ," +
                " Here i can able to implement only one methiod from interface," +
                " other methods are not forced whemn im using aBSTRACT");
    }

}
