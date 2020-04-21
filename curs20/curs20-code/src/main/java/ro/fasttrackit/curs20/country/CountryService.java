package ro.fasttrackit.curs20.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class CountryService {
    private final List<Country> countries;

    public CountryService(List<Country> countries) {
        this.countries = Optional.ofNullable(countries)
                .map(ArrayList::new)
                .orElseGet(ArrayList::new);
//        if (countries == null) {
//            this.countries = new ArrayList<>();
//        } else {
//            this.countries = new ArrayList<>(countries);
//        }
    }

    public List<String> getCountriesName() {
        return countries.stream()
                .map(Country::getName)
                .collect(toList());
    }
}
