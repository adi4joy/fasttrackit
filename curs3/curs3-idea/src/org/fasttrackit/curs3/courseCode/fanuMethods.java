package org.fasttrackit.curs3;

public class fanuMethods {
    public static void main(String[] args) {
        String greeting = sayHello();
        System.out.println(greeting);

        String productName = "Bueno";
        String product = formatProduct(productName, 1.2);
        System.out.println(product);
    }

    public static String formatProduct(String product, double price) {
        return product + " has price of " + price;
    }

    public static String sayHello() {
        return "Hello";
    }
}
