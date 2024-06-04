package com.gm.encapsulation.getterandsetter;

import com.gm.encapsulation.accessmodifiers.ClassA;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.getId();
        employee.setId(12);
        employee.setLoaction("Bangalorw");
        employee.setCompanyName("HCL");
        employee.setName("Gowtham");

        System.out.println(employee);

        Employee employee1 = new Employee(13, "Boopathi", "RSP", "Bhavani");

        System.out.println(employee1);

    }


}
