package com.gm.objectClass.clone;

public class Main {

    public static void main(String[] args) {


        Employee employee = null;
        Employee twin = null;
        try {
            employee = new Employee(10, "Gowtham");
             twin = (Employee) employee.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(employee);
        System.out.println(twin);
    }
}
