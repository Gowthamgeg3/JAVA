package com.gm.java8.lambda;

import com.gm.interfaces.Printable;

import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        FInterface f= (a,b)-> System.out.println(a+b);
        f.add(10,15);

    }

}
