package ro.fasttrackit.curs14.countries;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = new ArrayList<>(countries == null ? new ArrayList<>() : countries);
    }

    public List<Country> findByName(String partialName) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getName().contains(partialName)) {
                result.add(country);
            }
        }
        return result;
    }

}
