package ro.fasttrackit.curs20.homework;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class CountryService {
    private final List<Country> countries;

    public CountryService(List<Country> countries) {
        this.countries = Optional.ofNullable(countries)
                .map(ArrayList::new)
                .orElseGet(ArrayList::new);
    }

    public List<String> getCountriesName() {
        return countries.stream()
                .map(Country::getName)
                .collect(toList());
    }

    public Optional<String> getCapital(String country) {
        return countries.stream()
                .filter(c -> c.getName().equalsIgnoreCase(country))
                .findFirst()
                .map(Country::getCapital);
    }

    public Optional<Long> getPopulation(String country) {
        return countries.stream()
                .filter(c -> c.getName().equalsIgnoreCase(country))
                .findFirst()
                .map(Country::getPopulation);
    }

    public List<String> getCountriesInContinent(String continent) {
        return countries.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase(continent))
                .map(Country::getName)
                .collect(toList());
    }

    public List<String> getCountryNeighbors(String country) {
        return countries.stream()
                .filter(c -> c.getName().equalsIgnoreCase(country))
                .findFirst()
                .map(Country::getNeighbors)
                .orElse(emptyList());
    }

    public List<String> getCountriesInContinentWithPopulationLargerThan(String continent, long population) {
        return countries.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase(continent))
                .filter(c -> c.getPopulation() > population)
                .map(Country::getName)
                .collect(toList());
    }

    public List<String> getCountryThatNeighborsXButNotY(String x, String y) {
        return countries.stream()
                .filter(c -> c.getNeighbors().toString().contains(x))
                .filter(c -> !c.getNeighbors().toString().contains(y))
                .map(Country::getName)
                .collect(toList());
    }

    public List<String> getCountriesInContinentSortedByPopulation(String continent) {
        return countries.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase(continent))
                .sorted(Comparator.comparingLong(Country::getPopulation))
                .map(Country::getName)
                .collect(toList());
    }

    public List<String> getCountriesInContinentSortedByArea(String continent) {
        return countries.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase(continent))
                .sorted(Comparator.comparingLong(Country::getArea))
                .map(Country::getName)
                .collect(toList());
    }

    public Map<String, List<Long>> mapCountryToPopulation() {
        return countries.stream()
                .collect(
                        Collectors.groupingBy(
                                Country::getName,
                                mapping(Country::getPopulation,
                                        toList())));
    }

    public Map<String, List<String>> mapContinentToCountries() {
        return countries.stream()
                .collect(
                        Collectors.groupingBy(Country::getContinent,
                                mapping(Country::getName, toList())));
    }

    public Map<String, List<String>> mapContinentToCountriesSorted() {
        //CODUL MEU
        return countries.stream()
                .sorted(Comparator.comparing(Country::getPopulation))
                .collect(
                        Collectors.groupingBy(Country::getContinent,
                                mapping(Country::getName, toList())));
        //CODUL LUI FANU
/*
        return countries.stream()
                .collect(toMap(Country::getContinent,
                        c -> List.of(c.getName()),
                        (l1, l2) -> Stream.concat(l1.stream(), l2.stream())
                                .collect(toList())));
*/

    }
}
