package ro.fasttrackit.curs13.exceptions;

public class AgeNotFoundException extends RuntimeException {
    private final int age;

    public AgeNotFoundException(int age) {
        super("Could not find person with age " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
