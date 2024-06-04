package com.gm.objectClass;

public class WrapperClass {



    public static void main(String[] args) {
        int x =100;

        Integer i = Integer.valueOf(x); //AutoBoxing (primoitive to Object)
        Integer j = x;

        System.out.println(i + " " + j +" " +x);

        //Unboxing (Object to primitive

        Integer a = new Integer(3);
        int primitive = a.intValue();
    }
}
