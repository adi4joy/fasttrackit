package ro.fasttrackit.curs13.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsMain {
    public static void main(String[] args) {
        try {
            throwSomethingUnchecked();
        } catch (Exception e) {
            System.err.println("Catch unchecked " + e.getMessage());
            return;
        } finally {
            System.out.println("Multumim indiferent ce s-a intamplat");
        }

        try {
            throwSomethingChecked();
        } catch (IllegalAccessException ex) {
            System.err.println("Catch IllegalAccessException");
        } catch (FileNotFoundException fnfe) {
            System.err.println("Catch FileNotFoundException");
        }
    }

    private static void throwSomethingUnchecked() {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new NullPointerException("This is thrown by me!");
        } else {
            throw new ArithmeticException("This is illegal");
        }
    }

    public static void throwSomethingChecked() throws IllegalAccessException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new IllegalAccessException("Illegal access");
        } else {
            throw new FileNotFoundException("Illegal time");
        }
    }
}
