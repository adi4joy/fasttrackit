package ro.fasttrackit.curs13.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedMain {
    public static void main(String[] args) {
        try {
            readFromFile();
        } catch (FileNotFoundException ex) {
            System.err.println("Fisierul nu exista");
        }
    }

    public static void readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("test.txt"));
    }
}
