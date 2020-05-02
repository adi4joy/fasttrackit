package ro.fasttrackit.curs21.homework;

import java.util.List;
import java.util.Objects;

public class Country {
    private static int COUNT = 1;
    private final int id;
    private final String name;
    private final String capital;
    private final long population;
    private final long area;
    private final String continent;
    private final List<String> neighbors;

    public Country(String name, String capital, long population, long area, String continent, List<String> neighbors) {
        this.id = COUNT++;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbors = neighbors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public long getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }

    public List<String> getNeighbors() {
        return neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id == country.id &&
                population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(continent, country.continent) &&
                Objects.equals(neighbors, country.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capital, population, area, continent, neighbors);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", continent='" + continent + '\'' +
                ", neighbors=" + neighbors +
                '}';
    }
}
