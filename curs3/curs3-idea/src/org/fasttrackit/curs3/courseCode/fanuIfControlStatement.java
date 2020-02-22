package org.fasttrackit.curs3;

public class fanuIfControlStatement {
    public static void main(String[] args) {
        printIfCanVote(20);
        printIfGreaterThanFifty(10);
        printTax(3000);
    }

    /**
     * [0,1000] -> 0%
     * (1000, 5000]-> 20%
     * else -> 35%
     */
    public static void printTax(int income) {
        if (income <= 1000) {
            System.out.println("Your tax is 0%");
        } else if (income > 1000 && income <= 5000) {
            System.out.println("Your tax is 20%");
        } else {
            System.out.println("Your tax is 35%");
        }
    }

    public static void printIfGreaterThanFifty(int number) {
        if (number > 50) {
            System.out.println("Is greater than fifty");
        }
    }

    public static void printIfCanVote(int age) {
        if (age >= 18) {
            System.out.println("The dude/dudette can vote");
        } else {
            System.out.println("You can't vote!");
        }
    }
}
