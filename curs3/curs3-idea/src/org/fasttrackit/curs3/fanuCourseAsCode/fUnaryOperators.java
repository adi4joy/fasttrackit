package org.fasttrackit.curs3;

/**
 * Unary operators are operators that apply to one variable
 */
public class fUnaryOperators {
    public static void main(String[] args) {
//        +  : transforms the number or variable into a positive number. It is implicit if you don't put it
        int positive = 10; // this implies the + unary operator
        positive = +10; // this is equivalent to positive=1-
        System.out.println("Positive value " + positive);
//        -  : transforms the number or variable into a negative number
        int negative = -positive;
        negative = -10;
        System.out.println("Negative value " + negative);
//        ++ : increments a variable : ++a or a++ is equivalent with a=a+1
        //prefixed : the value is incremented and then the value is read to be assigned
        int a = 1;
        int b = ++a;
        System.out.println("For PREFIXED ++, b=" + b + " and a=" + a);
        //postfixed: the value is read to be assigned, and then it is incremented
        a = 1;
        b = a++;
        System.out.println("For POSTFIXED ++, b=" + b + " and a=" + a);

//        -- : decrements a variable : --a or a-- is equivalent with a=a-1
        //prefixed : the value is decremented and then the value is read to be assigned
        a = 1;
        b = ++a;
        System.out.println("For PREFIXED ++, b=" + b + " and a=" + a);
        //postfixed: the value is read to be assigned, and then it is decremented
        a = 1;
        b = a++;
        System.out.println("For POSTFIXED ++, b=" + b + " and a=" + a);

//        !  : reverts a boolean value.
        System.out.println("!true is " + !true);
        boolean condition = false;
        System.out.println("switching condition: !condition=" + !condition);
        // this also applies to conditions
        a = 1;
        b = 1;
        System.out.println("Negating a==b condition : " + !(a == b));
    }
}
