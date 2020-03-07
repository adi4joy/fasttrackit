package ro.fasttrackit.curs14.homework;

public class AdvancedCountry extends Country {
    private final String technology;

    public AdvancedCountry(String name, String capital, long population, long area, String technology) {
        super(name, capital, population, area);
        this.technology = technology;
    }

    public String getTechnology() {
        return technology;
    }
}
