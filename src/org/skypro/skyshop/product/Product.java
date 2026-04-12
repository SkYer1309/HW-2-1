package org.skypro.skyshop.product;

 public class Product {
    private final String name;
    private final int cost;

     public String getName() {
         return name;
     }

     public int getCost() {
         return cost;
     }

     public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;


    }
}
