package ro.fasttrackit.curs21.homework;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("continents")
public class ContinentController {
    private final CountryService countryService;

    public ContinentController(CountryService countryService) {
        this.countryService = countryService;
    }

    // get map from continent to list of countries: /continents/countries
    @GetMapping("countries")
    public Map<String, List<Country>> getMapFromContinentToCountries() {
        return countryService.mapContinentToCountries();
    }

    // get countries in continent: /continents/<continentName>/countries
    // get countries in continent with population larger than: /continents/<continentName>/countries?minPopulation=<minimum population>
    @GetMapping("{continentName}/countries")
    public List<Country> getCountriesInContinentWithPopulationLargerThan(@PathVariable String continentName, @RequestParam(required = false) Long minPopulation) {
        if (minPopulation == null) {
            return countryService.getCountriesInContinent(continentName);
        } else {
            return countryService.getCountriesInContinentWithPopulationLargerThan(continentName, minPopulation);
        }
    }
}
