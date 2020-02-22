package org.fasttrackit.curs3;

public class fArithmeticOperators {
    public static void main(String[] args) {
//        + : Addition operator (also used for String concatenation)
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Addition operator + : 1+7=" + (1 + 7));
        int a = 2, b = 3;
        int sum = a + b;
        System.out.println("Operator can be applied on variables also: if int a=2, b=3, then sum=a+b is " + sum);
//        - : Substraction operator
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Substraction operator - : 1-7=" + (1 - 7));
        a = 2;
        b = 3;
        int sub = a - b;
        System.out.println("Operator can be applied on variables also: if int a=2, b=3, then sub=a-b is " + sub);
//                * : Multiplication operator
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Multiplication operator * : 2*7=" + (2 * 7));
        int mult = a * b;
        System.out.println("Operator can be applied on variables also: if int a=2, b=3, then mult=a*b is " + mult);
        //this works with the unary - operator also:
        mult = a * -b;
        System.out.println("We can use the unary operator - on the second factor: if int a=2, b=3, then a*-b=" + mult);

//     / : division operator
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Division operator / : 8/4=" + (8 / 4));
        a = 12;
        b = 3;
        int div = a / b;
        System.out.println("Operator can be applied on variables also: if int a=12, b=3, then div=a/b is " + div);
        //this works with the unary - operator also:
        div = a / -b;
        System.out.println("We can use the unary operator - on the second factor: a/-b=" + div);
        // if the division has remainder the remainder will be ignored for integer factors
        a = 7;
        b = 3;
        System.out.println("7/3=" + a / b);

        //but, if the factors are of type double, you will get the real number
        double da = 7;
        double db = 2;
        System.out.println("with factors of double type, 7/2=" + (da / db));

//      % : remainder operator
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Remainder operator % : 7%3=" + 7 % 3);
        a = 7;
        b = 3;
        int rem = a % b;
        System.out.println("Operator can be applied on variables also: if int a=7, b=3, then div=a%b is " + rem);
        //this works with the unary - operator also:
        rem = a % -b;
        System.out.println("We can use the unary operator - on the second factor, but the result is always positive: a%-b=" + rem);

        //but, if the factors are of type double, you will get the remainder as a double
        da = 7;
        db = 2;
        System.out.println("with factors of double type, you get double type result, 7%2=" + (da % db));

    }
}
