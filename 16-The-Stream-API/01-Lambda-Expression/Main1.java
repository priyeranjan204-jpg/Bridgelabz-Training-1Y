package LambdaExpression;

import java.util.*;

class Product {
    String name;
    int price;
    int rating;

    Product(String n, int p, int r) {
        name = n;
        price = p;
        rating = r;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 20000, 4));
        list.add(new Product("Laptop", 50000, 5));
        list.add(new Product("Watch", 3000, 3));

        list.sort((a, b) -> a.price - b.price);

        for (Product p : list) {
            System.out.println(p.name + " " + p.price);
        }
    }
}