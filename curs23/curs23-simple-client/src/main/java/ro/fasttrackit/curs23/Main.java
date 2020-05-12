package ro.fasttrackit.curs23;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestTemplate rest = new RestTemplate();
        var result = rest.getForObject("https://restcountries.eu/rest/v2/all", String.class);
        System.out.println(result);

        Country oneCountry = rest.getForObject("https://restcountries.eu/rest/v2/alpha/ro", Country.class);
        System.out.println(oneCountry);

        List<Country> allCountries = rest.exchange(
                "https://restcountries.eu/rest/v2/all",
                HttpMethod.GET,
                new HttpEntity<>(null),
                new ParameterizedTypeReference<List<Country>>() {
                })
                .getBody();

        allCountries.forEach(System.out::println);
    }
}

class Country {
    private String name;

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
