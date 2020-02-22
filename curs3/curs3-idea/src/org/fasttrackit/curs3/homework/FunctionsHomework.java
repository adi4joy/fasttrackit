package org.fasttrackit.curs3.homework;
import java.util.Scanner;
public class FunctionsHomework {
    public static void main(String[] args) {

        byte a = 77;
        byteParameter(a);

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        monthParameter(month);

        System.out.println("Number " + greaterParameter(5, 16) + " is greater.");

        System.out.println("Number " + greatestParameter(35, 26, 17) + " is the greatest.");
    }

    public static void byteParameter(byte input) {
        if (input > 10) {
            System.out.println(input);
        }
    }

    public static void monthParameter(int month) {
        if(month==1) {
            System.out.println("Month is January");
        } else if(month==2) {
            System.out.println("Month is February");
        }else if(month==3) {
            System.out.println("Month is March");
        }else if(month==4) {
            System.out.println("Month is April");
        }else if(month==5) {
            System.out.println("Month is May");
        }else if(month==6) {
            System.out.println("Month is June");
        }else if(month==7) {
            System.out.println("Month is July");
        }else if(month==8) {
            System.out.println("Month is August");
        }else if(month==9) {
            System.out.println("Month is September");
        }else if(month==10) {
            System.out.println("Month is October");
        }else if(month==11) {
            System.out.println("Month is November");
        }else if(month==12) {
            System.out.println("Month is December");
        } else {
            System.out.println("Really?");
        };
    }

    public static int greaterParameter(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int greatestParameter(int a, int b, int c) {
        if (a > b && b > c) {
            return a;
        } else if (a < b && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
