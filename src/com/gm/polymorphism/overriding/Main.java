package com.gm.polymorphism.overriding;

public class Main {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        SBI sbi = new SBI();

        System.out.println(icici.rateOfInterest());
        System.out.println(sbi.rateOfInterest());
    }
}
