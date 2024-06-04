package com.gm.interfaces;

public class Main {
    public static void main(String[] args) {
        Showable paper = new Paper();
        paper.print();
        paper.show();

        System.out.println(paper instanceof Printable);

        paper.msg();
        int result = Printable.add(109, 1232);
        System.out.println(result);
    }
}
