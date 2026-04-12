package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
        public static void main(String[] args) {
            System.out.println("ИНТЕРНЕТ-МАГАЗИН");
            System.out.println("================");

            Product apple=new Product("Яблоко",110);
            Product banana = new Product("Банан", 150);
            Product orange = new Product("Апельсин", 200);
            Product milk = new Product("Молоко", 300);
            Product bread = new Product("Хлеб", 50);
            Product cheese = new Product("Сыр", 400);
            Product meat = new Product("Мясо", 500);

            ProductBasket basket=new ProductBasket();


        }
    }

