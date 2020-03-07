package ro.fasttrackit.curs14.homework;

import java.io.FileNotFoundException;
import java.util.List;

import static ro.fasttrackit.curs14.homework.Density.HIGH;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CountryFileReader countryFileReader = new CountryFileReader();
        List<Country> countries = countryFileReader.readCountries();
        System.out.println(countries);
        System.out.println();

        CountryStatistics countryStatistics = new CountryStatistics(countries);
        List<Country> allCountries = countryStatistics.getAllCountries();
        System.out.println(allCountries);
        System.out.println();

        System.out.println(countryStatistics.getCountriesStartingWithLetter("E"));
        System.out.println("Capital is " + countryStatistics.getCountryCapital("Romania"));
        System.out.println("Population is " + countryStatistics.getPopulation("Romania"));
        System.out.println("Area is " + countryStatistics.getArea("Romania"));
        System.out.println("Largest country is " + countryStatistics.getLargestCountry());
        System.out.println("Country with most people is " + countryStatistics.getMostPeopleCountry());
        System.out.println("Most dense country is " + countryStatistics.getMostDenseCountry());
        System.out.println("Countries by density: " + countryStatistics.getCountriesForDensity(HIGH));

        System.out.println();
        countryStatistics.makeAdvanced("Israel", "irrigation");

//        countryStatistics.printWithTechnology();

    }
}
