package com.gm.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Hashmap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("Day1" , "Monday");
        map.put("Day2" , "Tuesday");
        map.put("Day3" , "Wednesday");
        map.put("Day4" , "Thursday");

        map.size();
        System.out.println(map);


    }

}
