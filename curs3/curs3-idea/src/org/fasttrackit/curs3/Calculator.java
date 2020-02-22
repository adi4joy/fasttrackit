package org.fasttrackit.curs3;

public class Calculator {
    public static void main(String[] args) {
        int sum = addValues(35, 78);
        System.out.println(sum);
        int subtract = subValues(687, 498);
        System.out.println(subtract);
        double division = divValues(46.46, 23.67);
        System.out.println(division);
        double modulo = modValues(67.5, 23.5);
        System.out.println(modulo);
        int multiplication = multValues(45, 19);
        System.out.println(multiplication);

        int var1 = 20, var2 = 3;
        int add = add(var1, var2);
        System.out.println(add);
        int sub = sub(var1, var2);
        System.out.println(sub);
        double div = div(var1, var2);
        System.out.println(div);
        int mod= mod(var1,var2);
        System.out.println(mod);
        int mult = mult(var1,var2);
        System.out.println(mult);

    }

    public static int addValues(int a, int b) {
        return a + b;
    }

    public static int subValues(int c, int d) {
        return c - d;
    }

    public static double divValues(double e, double f) {
        return e / f;
    }

    public static double modValues(double g, double h) {
        return g % h;
    }

    public static int multValues(int i, int j) {
        return i * j;
    }

    // NEW EXERCISE
    public static int add(int var1, int var2) {
        return var1 + var2;
    }

    public static int sub(int var1, int var2) {
        return var1 - var2;
    }

    public static double div(int var1, int var2) {
        return var1 / var2;
    }
    public static int mod(int var1, int var2){
        return var1 % var2;
    }
    public static int mult(int var1, int var2) {
        return var1 * var2;
    }
}
