package org.fasttrackit.curs2;

import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
//        learnVariables();
        learnArrays();
        learnMultipleVars();
    }

    public static void learnMultipleVars() {
        int a, b, c;
        a = 2;
        b = 3;
        c = 5;
        System.out.println(a);

        int d = 1, e = 3;
        System.out.println(d);

        int[] f = {1, 2}, g = new int[3];

        int h, i = 3;

    }

    // aici scriem comentarii
    public static void learnArrays() {
        int[] grades;
        grades = new int[]{10, 8, 9, 6};
//        System.out.println(Arrays.toString(grades));
        System.out.println(grades[1]);
        grades[3] = 8;
        System.out.println(Arrays.toString(grades));

        int[] a = new int[3];
        a[0] = 2;
        System.out.println(Arrays.toString(a));

        int[] b = {9, 5, 4};
        System.out.println(Arrays.toString(b));

        // incorrect
//        int[10] c = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//        int d
    }

    public static void learnVariables() {
        byte byteVar = 3;
        System.out.println(byteVar);
        short shortVar = 30000;
        System.out.println(shortVar);
        int intVar = 1234567890;
        System.out.println(intVar);
        long longVar = 1_000_000_000_000L;
        System.out.println(longVar);
        float floatVar = 3.14F;
        System.out.println(floatVar);
        double doubleVar = 1.23456789D;
        System.out.println(doubleVar);
        boolean booleanVar = true;
        System.out.println(booleanVar);
        char charVar = 'a';
        System.out.println(charVar);
        String name = "Adi Strete";
        System.out.println(name);
    }
}
