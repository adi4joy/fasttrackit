package ro.fasttrackit.curs20.homework;

import java.io.FileNotFoundException;
import java.util.List;

public class CountryMain {
    public static void main(String[] args) throws FileNotFoundException {
        final List<Country> countries = new CountryReader().readCountries(
                "src/main/resources/countries2.txt");

        CountryService countryService = new CountryService(countries);

        System.out.println("Print all country names:");
        System.out.println(countryService.getCountriesName());
        System.out.println("Print capital:");
        System.out.println(countryService.getCapital("Romania"));
        System.out.println("Print population:");
        System.out.println(countryService.getPopulation("Romania"));
        System.out.println("Print countries in continent:");
        System.out.println(countryService.getCountriesInContinent("Asia"));
        System.out.println("Print country neighbors:");
        System.out.println(countryService.getCountryNeighbors("Romania"));
        System.out.println("Print countries in continent with population larger than:");
        System.out.println(countryService.getCountriesInContinentWithPopulationLargerThan("Europe", 30_000_000));
        System.out.println("Print countries that neighbor X but not Y:");
        System.out.println(countryService.getCountryThatNeighborsXButNotY("ROU", "HUN"));
        System.out.println("Print countries in continent sorted by population:");
        System.out.println(countryService.getCountriesInContinentSortedByPopulation("Asia"));
        System.out.println("Print countries in continent sorted by area:");
        System.out.println(countryService.getCountriesInContinentSortedByArea("Asia"));
        System.out.println("Map country to population:");
        System.out.println(countryService.mapCountryToPopulation());
        System.out.println("Map continent to countries:");
        System.out.println(countryService.mapContinentToCountries());
        System.out.println("Map continent to countries sorted by population:");
        System.out.println(countryService.mapContinentToCountriesSorted());
    }
}