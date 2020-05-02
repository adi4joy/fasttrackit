package ro.fasttrackit.curs21.homework;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("countries")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    // list all countries: /countries
    // get countries that neighbor X but not neighbor Y: /countries?includeNeighbour=<includedNeighbourCode>&excludeNeighbour=<excludedNeighbourCode>
    @GetMapping
    public List<Country> getCountryThatNeighborsXButNotY(@RequestParam(required = false) String includeNeighbor, String excludeNeighbor) {
        if (includeNeighbor == null && excludeNeighbor == null) {
            return countryService.getAllCountries();
        } else {
            return countryService.getCountryThatNeighborsXButNotY(includeNeighbor, excludeNeighbor);
        }
    }

    // list all country names: /countries/names
    @GetMapping("names")
    public List<String> getCountriesNames() {
        return countryService.getCountriesNames();
    }

    //get capital of a country: /countries/<countryId>/capital
    @GetMapping("{id}/capital")
    public String getCapital(@PathVariable int id) {
        return countryService.getCapital(id)
                .orElseThrow(RuntimeException::new);
    }

    // get population of a country: /countries/<countryId>/population
    @GetMapping("{id}/population")
    public Long getPopulation(@PathVariable Integer id) {
        return countryService.getPopulation(id)
                .orElseThrow(RuntimeException::new);
    }

    // get country neighbours: /countries/<countryId>/neighbours
    @GetMapping("{id}/neighbors")
    public List<String> getCountryNeighbors(@PathVariable Integer id) {
        return countryService.getCountryNeighbors(id);
    }

    // get map from country to population : /countries/population
    @GetMapping("population")
    public Map<String, Long> getMapFromCountryToPopulation(@RequestParam(required = false) String includeNeighbor, String excludeNeighbor) {
        return countryService.mapCountryToPopulation();
    }

    // BONUS: get country with specific id: /countries/<id>
    @GetMapping("{id}")
    public Country getCountry(@PathVariable int id) {
        return countryService.getCountry(id)
                .orElseThrow(RuntimeException::new);
    }
}
