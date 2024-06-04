package com.gm.interfaces.nested;

public class Xerox implements Printable.NestedInterfce {

//    @Override
//    public void print() {
//
//    }

    @Override
    public void run() {
        System.out.println("Nested Interface ERunning ");
    }
}
