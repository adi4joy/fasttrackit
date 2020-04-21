package ro.fasttrackit.curs20.country;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class CountryServiceTest {
    CountryService service;

    @BeforeEach
    public void setup() {
        service = new CountryService(List.of(
                new Country("Romania", "Bucharest", 19_000_000, 250_000, "Europe", List.of()),
                new Country("Moldova", "Bucharest", 19_000_000, 250_000, "Europe", List.of())
        ));
    }

    @Test
    @DisplayName("The countries names are displayed correctly")
    void countryNames() {

    }
}