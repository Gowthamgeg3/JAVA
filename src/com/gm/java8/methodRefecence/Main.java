package com.gm.java8.methodRefecence;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer, Integer>  adder1 = Arithmetic::add;
        BiFunction<Float, Integer, Float> adder2 = Arithmetic::add;
        BiFunction<Float , Float, Float> adder3 = Arithmetic::add;

        int resul1 = adder1.apply(10,20);
        int result2 = adder1.apply(20,20);
        int result3 = adder1.apply(30,20);

        System.out.println(resul1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
