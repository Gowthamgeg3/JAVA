package com.gm.statickeyword;

public class StaticClass {

    static {
        System.out.println("Hello from static");
        //This block will execute before main block executes
    }
    public static void main(String[] args) {
        System.out.println("Hello from Main");
    }
}
