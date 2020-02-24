package ro.fasttrackit.curs13.exceptions;

public class PersonNotFoundException extends Exception {
    private final String name;

    public PersonNotFoundException(String name) {
        super("Could not find person with name " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
