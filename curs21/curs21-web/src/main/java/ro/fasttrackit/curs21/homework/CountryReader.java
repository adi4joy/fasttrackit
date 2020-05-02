package ro.fasttrackit.curs21.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class CountryReader {
    public List<Country> readCountries(String filename) throws FileNotFoundException {
        final Scanner scanner = new Scanner(new FileReader(filename));
        List<Country> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            result.add(readCountry(scanner.nextLine()));
        }
        return result;
    }

    public List<Country> readCountriesStream(String filename) throws FileNotFoundException {
        return new BufferedReader(new FileReader(filename))
                .lines()
                .map(this::readCountry)
                .collect(toList());
    }

    private Country readCountry(String line) {
        String[] tokens = line.split("[|]");
        return new Country(
                tokens[0],
                tokens[1],
                Long.parseLong(tokens[2]),
                Long.parseLong(tokens[3]),
                tokens[4],
                tokens.length > 5 ? parseNeighbors(tokens[5]) : emptyList()
        );
    }

    private List<String> parseNeighbors(String neighbors) {
        Scanner nScanner = new Scanner(neighbors);
        nScanner.useDelimiter("~");
        List<String> result = new ArrayList<>();
        while (nScanner.hasNext()) {
            result.add(nScanner.next());
        }
        return result;
    }
}

