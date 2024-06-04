package com.gm.thispackage;

public class ThisBasics {

    int rno;
    String name;
    String collegeName;
    String marks;



    //1) this: to refer current class instance variable


    public ThisBasics(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public ThisBasics(int rno, String name, String collegeName) {
        this.rno = rno;
        this.name = name;
        this.collegeName = collegeName;
    }

    public ThisBasics(int rno, String name, String collegeName, String marks) {
        this(rno,name,collegeName); //Rule: Call to this() must be the first statement in constructor.

        this.marks = marks;
    }


    //4) this: to pass as an argument in the method
    void p(){
        m(this);
    }

    private void m(ThisBasics thisBasics) {
    }
    //5) this: to pass as argument in the constructor call

    //    this.obj=obj;

    //6) this keyword can be used to return current class instance

    ThisBasics getA(){
        return this;
    }

}
