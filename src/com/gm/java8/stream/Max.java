package com.gm.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Max {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        Double totalPrice = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.price));

        System.out.println(totalPrice);

        //Max price of object

       Product product =  productsList.stream()
                .max((p1,p2)->p1.price> p2.price?1:-1).get();

        System.out.println(product);

        //Min price of the product

        Product product1 = productsList.stream()
                .min((p1,p2)->p1.price>p2.price?1:-1).get();

        System.out.println(product1);
    }

}
