package ro.fasttrackit.curs20.country;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CountryServiceTest {
    CountryService service;

    @BeforeEach
    public void setup() {
        service = new CountryService(List.of(
                new Country("Romania", "Bucharest", 19_000_000, 250_000, "Europe", List.of("BGR", "HUN", "MDA", "SRB", "UKR")),
                new Country("Moldova", "Chisinau", 5_000_000, 250_000, "Europe", List.of())
        ));
    }

    @Test
    @DisplayName("the contry names are displayed correctly")
    void countryNames() {
        List<String> result = service.getCountriesName();

        assertThat(result)
                .containsExactly("Romania", "Moldova");
    }
}
