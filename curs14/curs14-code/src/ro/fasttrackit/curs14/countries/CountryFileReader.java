package ro.fasttrackit.curs14.countries;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountryFileReader {
    public void readCountries() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("countries.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
