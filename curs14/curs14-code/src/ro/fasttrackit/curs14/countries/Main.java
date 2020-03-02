package ro.fasttrackit.curs14.countries;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CountryFileReader countryFileReader = new CountryFileReader();
        List<Country> countries = countryFileReader.readCountries();
        System.out.println(countries);
        System.out.println();

        CountryStatistics countryStatistics = new CountryStatistics(countries);
        List<Country> icaCountries = countryStatistics.findByName("ica");
        System.out.println(icaCountries);
    }
}
