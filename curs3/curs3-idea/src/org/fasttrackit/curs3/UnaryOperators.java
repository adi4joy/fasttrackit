package org.fasttrackit.curs3;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class UnaryOperators {
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

    public static void unaryDecrement() {
        System.out.println("----------decrement");
        int a = 1;
        int b = a--;
        int c = --a;
        System.out.println(b);
        System.out.println(c);
        a -= 7;
        System.out.println(a);
    }

    public static void unaryIncrement() {
        System.out.println("----------increment");
        int a = 1;
        int b = a++;
        int c = ++a;
        System.out.println(b);
        System.out.println(c);

        System.out.println(a++);
        System.out.println(++a);
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
        System.out.println(3);
    }

}
