package com.gm.collections.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Sorting {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("Gowtham");
        list1.add("Peter");
        list1.add("Parker");
        list1.add("Alen");
        list1.add("Parker");

        Collections.sort(list1);

        Iterator itr  = list1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
