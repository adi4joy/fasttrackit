package org.fasttrackit.curs3;

public class fanuUnaryOperators {
    public static void main(String[] args) {
        unaryPlusMinus();
        unaryIncrement();
        unaryDecrement();
        unaryNot();
    }

    public static void unaryNot() {
        boolean condition = true;
        boolean notCondition = !condition;
        System.out.println(condition);
        System.out.println(notCondition);
    }

    private static void unaryDecrement() {
        System.out.println("------------- decrement");
        int a = 1;
        int b = a--;
        int c = --a;
        System.out.println(b);
        System.out.println(c);
        a -= 7;
        System.out.println(a);
    }

    public static void unaryIncrement() {
        System.out.println("------------- increment");
        int a = 1;
        int b = a++;
        int c = ++a;
        System.out.println(b);
        System.out.println(c);

        System.out.println(a);
        a = a + 1;
        System.out.println(++a);

        a /= 3;
        a = a + 3;
        System.out.println(a);
    }

    public static void unaryPlusMinus() {
        int a = 3;
        int b = -a;
        int c = -b;
        int d = -a + b;
        int e = +a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
