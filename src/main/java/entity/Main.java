package entity;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        int id = 1;
        String productName = "koszula";
        BigDecimal price =new BigDecimal(4.99);
        double weigth = 0.22;
        String color = "czerwony";
        int productCount = 1;

        Product product = new Product(id,productName,price,weigth,color,productCount);

        System.out.println(product);
    }
}