package com.gm.inheritance.aggregation;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Bangalore" ,"Karnataka","India" );

        Address address2 = new Address("Mettur" ,"TN","India" );
        Employee employee1 = new Employee(1,"Gowtham", address1);
        Employee employee2 = new Employee(2,"Gm", address2);


        System.out.println(employee1.toString());

        System.out.println(employee2.toString());
    }
}
