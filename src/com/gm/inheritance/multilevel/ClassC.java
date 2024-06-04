package com.gm.inheritance.multilevel;

public class ClassC  extends ClassB{

    String award;

    public ClassC(int id, int salary, String company, int bonus, String award) {
        super(id, salary, company, bonus);
        this.award = award;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }




    @Override
    public String toString() {
        return "ClassC{" +
                "award='" + award + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", bonus="  + bonus +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ClassC classC = new ClassC(1, 1000, "Wipro", 200,"Good");

        System.out.println(classC.toString());
        classC.add(10,50);

    }
}
