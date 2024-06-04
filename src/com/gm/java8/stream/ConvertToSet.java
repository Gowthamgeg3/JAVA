package com.gm.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertToSet {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(12, "Laptop", 30000f));
        productList.add(new Product(13, "Desktop", 16000f));
        productList.add(new Product(14, "Mobile", 10000f));
        productList.add(new Product(15, "Telivision", 26000f));
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        //Converted form list to set
        Set<Float> convertedSet = productList.stream()
                .filter(product -> product.price > 30000)
                .map(product -> product.price)
                .collect(Collectors.toSet());

        System.out.println(convertedSet);

        //converted from listb to Map

        System.out.println("---------------------to Map -------------------");


        Map<Integer, String> hashMap = productList.stream()
                .collect(Collectors.toMap(p -> p.id, p -> p.name));

        System.out.println(hashMap);
    }
}
