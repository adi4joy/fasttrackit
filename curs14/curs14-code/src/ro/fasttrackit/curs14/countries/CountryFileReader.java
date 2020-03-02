package ro.fasttrackit.curs14.countries;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryFileReader {
    public List<Country> readCountries() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("countries.txt"));
        List<Country> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Country country = readCountry(scanner.nextLine());
            result.add(country);
        }
        return result;
    }

    private Country readCountry(String line) {
        String[] tokens = line.split("[|]");
        return new Country(tokens[0], tokens[1], Long.parseLong(tokens[2]), Long.parseLong(tokens[3]));
    }
}
