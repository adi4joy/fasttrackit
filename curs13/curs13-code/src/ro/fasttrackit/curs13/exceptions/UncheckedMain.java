package ro.fasttrackit.curs13.exceptions;

public class UncheckedMain {
    public static void main(String[] args) {
        try {
            System.out.println(div(10, 0));
        } catch (Exception ex) {
            System.err.println("Div by zero!");
        }
        System.out.println("Altceva");
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
