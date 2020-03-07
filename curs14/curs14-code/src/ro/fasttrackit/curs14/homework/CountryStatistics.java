package ro.fasttrackit.curs14.homework;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = new ArrayList<>(countries == null ? new ArrayList<>() : countries);
    }

    public List<Country> getAllCountries() {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            result.add(country);
        }
        return result;
    }

    public Country getCountriesStartingWithLetter(String letter) {
        for (Country country : countries) {
            if (country.getName().startsWith(letter)) {
                return country;
            }
        }
        return null;
    }

    public String getCountryCapital(String countryName) {
        for (Country country : countries) {
            if (country.getName().equalsIgnoreCase(countryName)) {
                return country.getCapital();
            }
        }
        return null;
    }

    public long getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getName().equalsIgnoreCase(countryName)) {
                return country.getPopulation();
            }
        }
        return -1;
    }

    public long getArea(String countryName) {
        for (Country country : countries) {
            if (country.getName().equalsIgnoreCase(countryName)) {
                return country.getArea();
            }
        }
        return -1;
    }

    public Country getLargestCountry() {
        long max = -1;
        for (Country country : countries) {
            long i = country.getArea();
            if (i > max) {
                max = i;
            }
        }
        for (Country country : countries) {
            if (country.getArea() == max) {
                return country;
            }
        }
        return null;
    }

    public Country getMostPeopleCountry() {
        long max = -1;
        for (Country country : countries) {
            long i = country.getPopulation();
            if (i > max) {
                max = i;
            }
        }
        for (Country country : countries) {
            if (country.getPopulation() == max) {
                return country;
            }
        }
        return null;
    }

    public Country getMostDenseCountry() {
        long max = -1;
        for (Country country : countries) {
            long i = country.getCountryDensity();
            if (i > max) {
                max = i;
            }
        }
        for (Country country : countries) {
            if (country.getCountryDensity() == max) {
                return country;
            }
        }
        return null;
    }

    public List<Country> getCountriesForDensity(Density density) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getDensity().equals(density)) {
                result.add(country);
            }
        }
        return result;
    }

    // TOO HARD FOR ME
    public void makeAdvanced(String name, String technology) {
        for (Country country : countries) {
            if (country.getName().equalsIgnoreCase(name) && country instanceof AdvancedCountry) {
                AdvancedCountry advanced = (AdvancedCountry) country;
                advanced.getTechnology();
                System.out.println(advanced);
            }
        }
    }

    // JUST AS HARD
    public void printWithTechnology() {
        for (Country country : countries) {
            if (country instanceof AdvancedCountry) {
                AdvancedCountry adv = (AdvancedCountry) country;
                adv.getTechnology();
                System.out.println(adv);
            }
        }
    }
}