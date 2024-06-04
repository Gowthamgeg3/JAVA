package com.gm.collections;

import java.util.*;

public class Main   {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Gowtham");
        list1.add("Peter");
        list1.add("Parker");
        list1.add("Alen");
        list1.add("Parker");



        System.out.println("Getting the Elements : " +list1.get(3));
        list1.set(3,"Vijay");

        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
