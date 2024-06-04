package com.gm.encapsulation.getterandsetter;

public class Employee {

    private int id;
    private String name;
    private String companyName;
    private String loaction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLoaction() {
        return loaction;
    }

    public void setLoaction(String loaction) {
        this.loaction = loaction;
    }


    public Employee() {
    }

    public Employee(int id, String name, String companyName, String loaction) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.loaction = loaction;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", loaction='" + loaction + '\'' +
                '}';
    }
}
