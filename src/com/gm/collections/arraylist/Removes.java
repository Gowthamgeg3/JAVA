package com.gm.collections.arraylist;

import java.util.ArrayList;

public class Removes {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ravi");
        arrayList.add("Vijay");
        arrayList.add("Ajay");
        arrayList.add("Anuj");
        arrayList.add("Gaurav");
        System.out.println("An initial list of elements: " + arrayList);
        //Removing specific element from arraylist
        arrayList.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + arrayList);
        //Removing element on the basis of specific position
        arrayList.remove(0);
        System.out.println("After invoking remove(index) method: " + arrayList);

        //Creating another arraylist
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        //Adding new elements to arraylist
        arrayList.addAll(al2);
        System.out.println("Updated list : " + arrayList);
        //Removing all the new elements from arraylist
        arrayList.removeAll(al2);
        System.out.println("After invoking removeAll() method: " + arrayList);
        //Removing elements on the basis of specified condition
        arrayList.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: " + arrayList);
        //Removing all the elements available in the list
        arrayList.clear();
        System.out.println("After invoking clear() method: " + arrayList);


    }
}
