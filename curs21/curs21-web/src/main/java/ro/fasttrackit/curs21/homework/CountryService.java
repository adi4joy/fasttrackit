package ro.fasttrackit.curs21.homework;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

@Service
public class CountryService {
    private final List<Country> countries = new ArrayList<>();

    public CountryService() throws FileNotFoundException {
        countries.addAll(new CountryReader().readCountries("src/main/resources/countries2.txt"));
    }

    public Optional<Country> getCountry(int id) {
        return countries.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    public List<Country> getAllCountries() {
        return new ArrayList<>(countries);
    }

    public List<String> getCountriesNames() {
        return countries.stream()
                .map(Country::getName)
                .collect(toList());
    }

    public Optional<String> getCapital(int id) {
        return countries.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .map(Country::getCapital);
    }

    public Optional<Long> getPopulation(int id) {
        return countries.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .map(Country::getPopulation);
    }

    public List<String> getCountryNeighbors(int id) {
        return countries.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .map(Country::getNeighbors)
                .orElse(emptyList());
    }

    public List<Country> getCountriesInContinent(String continent) {
        return countries.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase(continent))
                .collect(toList());
    }

    public List<Country> getCountriesInContinentWithPopulationLargerThan(String continent, long population) {
        return countries.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase(continent))
                .filter(c -> c.getPopulation() > population)
                .collect(toList());
    }

    public List<Country> getCountryThatNeighborsXButNotY(String x, String y) {
        return countries.stream()
                .filter(c -> c.getNeighbors().toString().contains(x))
                .filter(c -> !c.getNeighbors().toString().contains(y))
                .collect(toList());
    }

    public Map<String, Long> mapCountryToPopulation() {
        return countries.stream()
                .collect(
                        Collectors.toMap(Country::getName, Country::getPopulation));
    }

    public Map<String, List<Country>> mapContinentToCountries() {
        return countries.stream()
                .collect(
                        Collectors.groupingBy(Country::getContinent));
    }
}
