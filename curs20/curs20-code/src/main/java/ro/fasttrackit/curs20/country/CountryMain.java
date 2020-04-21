package ro.fasttrackit.curs20.country;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

public class CountryMain {
    public static void main(String[] args) throws FileNotFoundException {
        final List<Country> countries = new CountryReader().readCountries(
                "src/main/resources/countries2.txt");
        System.out.println(countries);

        final List<Country> countriess = new CountryReader().readCountriesStream(
                "src/main/resources/countries2.txt");
        System.out.println(countriess);

        Country country = countries.get(0);
        final String s = Optional.ofNullable(country)
                .filter(c -> c.getName().equals("Romania"))
                .map(Country::getName)
                .orElse("No Romania");

    }
}