package com.gm.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(12, "Laptop", 30000f));
        productList.add(new Product(13, "Desktop", 16000f));
        productList.add(new Product(14, "Mobile", 10000f));
        productList.add(new Product(15, "Telivision", 26000f));
        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenevo Laptop",28000f));
        productList.add(new Product(4,"Sony Laptop",28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));

        List<Product> productList1 = productList.stream()
                .filter(a -> a.price > 25000)
                .map(a->a)
                .collect(Collectors.toList());

        productList.stream()
                        .filter(p->p.price == 30000f)
                         .forEach(p-> System.out.println(p.name));


        System.out.println("Reduce Method");

        Float p = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);

        System.out.println(p);

        //Count
        long  productList2 = productList.stream()
                .filter(a -> a.price > 25000)
                .count();

        System.out.println(productList2);




    }
}
