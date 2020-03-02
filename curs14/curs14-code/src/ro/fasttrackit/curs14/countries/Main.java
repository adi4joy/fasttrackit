package ro.fasttrackit.curs14.countries;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CountryFileReader countryFileReader = new CountryFileReader();
        countryFileReader.readCountries();
    }
}
