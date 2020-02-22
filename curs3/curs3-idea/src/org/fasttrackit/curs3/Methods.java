package org.fasttrackit.curs3;

public class Methods {
    public static void main(String[] args) {
        String greeting = sayHello();
        System.out.println(greeting);

        String productName = "Bueno";
        String result = formatPrice(productName, 2.14);
//        String result = formatPrice("Bueno", 2.14);
        System.out.println(result);
    }

    public static String sayHello() {
        return "Hello";
    }

    public static String formatPrice(String product, double price) {
        return product + " has price of " + price;
    }

}
