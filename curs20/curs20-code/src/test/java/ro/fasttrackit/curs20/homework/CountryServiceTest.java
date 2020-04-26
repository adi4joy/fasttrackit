package ro.fasttrackit.curs20.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CountryServiceTest {
    CountryService service;

    @BeforeEach
    public void setup() {
        service = new CountryService(List.of(
                new Country("Romania", "Bucharest", 19_861_408, 238_391, "Europe", List.of("BGR", "HUN", "MDA", "SRB", "UKR")),
                new Country("Moldova", "Chisinau", 3_553_100, 33_846, "Europe", List.of("ROU", "UKR")),
                new Country("Hungary", "Budapest", 9_823_000, 93_028, "Europe", List.of("AUT", "HRV", "ROU", "SRB", "SVK", "SVN", "UKR"))

        ));
    }

    @Test
    @DisplayName("the country names are displayed correctly")
    void getCountriesName() {
        List<String> result = service.getCountriesName();
        assertThat(result)
                .containsExactly("Romania", "Moldova", "Hungary");
    }

    @Test
    @DisplayName("the capital is displayed correctly")
    void getCapital() {
        Optional<String> result = service.getCapital("Romania");
        assertThat(result)
                .contains("Bucharest");
    }

    @Test
    @DisplayName("the population is displayed correctly")
    void getPopulation() {
        Optional<Long> result = service.getPopulation("Romania");
        assertThat(result)
                .hasValue(19_861_408L);
    }

    @Test
    @DisplayName("the countries from the selected continent are displayed correctly")
    void getCountriesInContinent() {
        List<String> result = service.getCountriesInContinent("Europe");
        assertThat(result)
                .containsExactly("Romania", "Moldova", "Hungary");
    }

    @Test
    @DisplayName("the country neighbors are displayed correctly")
    void getCountryNeighbors() {
        List<String> result = service.getCountryNeighbors("Moldova");
        assertThat(result)
                .containsExactly("ROU", "UKR");
    }

    @Test
    @DisplayName("the countries from the selected continent with larger-than population are displayed correctly")
    void getCountriesInContinentWithPopulationLargerThan() {
        List<String> result = service.getCountriesInContinentWithPopulationLargerThan("Europe", 5_000_000);
        assertThat(result)
                .containsExactly("Romania", "Hungary");
    }

    @Test
    @DisplayName("the country that neighbors X but not Y is displayed correctly")
    void getCountryThatNeighborsXButNotY() {
        List<String> result = service.getCountryThatNeighborsXButNotY("ROU", "MDA");
        assertThat(result)
                .containsExactly("Moldova", "Hungary");
    }

    @Test
    @DisplayName("the countries in the specified continent are sorted correctly by population")
    void getCountriesInContinentSortedByPopulation() {
        List<String> result = service.getCountriesInContinentSortedByPopulation("Europe");
        assertThat(result)
                .containsExactly("Moldova", "Hungary", "Romania");
    }

    @Test
    @DisplayName("the countries in the specified continent are sorted correctly by area")
    void getCountriesInContinentSortedByArea() {
        List<String> result = service.getCountriesInContinentSortedByArea("Europe");
        assertThat(result)
                .containsExactly("Moldova", "Hungary", "Romania");
    }

    @Test
    @DisplayName("the countries are mapped correctly to population")
    void mapCountryToPopulation() {
        // NU STIU CUM SE FACE TESTING LA MAPS
    }

    @Test
    @DisplayName("the continents are mapped correctly to countries")
    void mapContinentToCountries() {
        // NU STIU CUM SE FACE TESTING LA MAPS
    }

    @Test
    @DisplayName("the continents are mapped correctly to countries and sorted correctly by population")
    void mapContinentToCountriesSorted() {
        // NU STIU CUM SE FACE TESTING LA MAPS
    }
}