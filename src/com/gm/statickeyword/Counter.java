package com.gm.statickeyword;

public class Counter {

    static int count;
    Counter(){
        count++;
        System.out.println(count);
    }

    static void greetings(){
        System.out.println("Hello ");
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter.greetings();

    }
}
