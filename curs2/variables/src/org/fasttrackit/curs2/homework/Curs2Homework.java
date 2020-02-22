package org.fasttrackit.curs2.homework;

public class Curs2Homework {
    public static void main(String[] args) {
        sumVariables();
    }

    public static void sumVariables() {
        int a = 1;
        double doubleVar = 1.2345D;
        short shortVar = 100;
        long longVar = 3_000_000L;
        double sum = (a + doubleVar + shortVar + longVar);
        System.out.println("Suma variabilelor este: "+sum);
    }
}
