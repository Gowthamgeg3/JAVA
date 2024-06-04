package com.gm.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterates {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("Gowtham");
        list1.add("Peter");
        list1.add("Parker");
        list1.add("Alen");
        list1.add("Parker");

        // Traversing list through List Iterator:

        System.out.println("Traversing list through List Iterator:");
        ListIterator<String> listIterator = list1.listIterator(list1.size());

        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.println(str);
        }

        //For Loop
        System.out.println("Traversing list through ForLoop:");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        //for-each()
        System.out.println("Traversing list through foreach():");

        list1.forEach(System.out::println);


        //foreachRemaining()
        System.out.println("Traversing list through forEachRemaining() method:");

        Iterator iterator = list1.iterator();
        iterator.forEachRemaining(a-> System.out.println(a));


    }
}
