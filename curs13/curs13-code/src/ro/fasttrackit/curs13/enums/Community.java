package ro.fasttrackit.curs13.enums;

import ro.fasttrackit.curs13.exceptions.AgeNotFoundException;
import ro.fasttrackit.curs13.exceptions.PersonNotFoundException;

import java.util.List;

public class Community {
    private final List<Person> persons;

    public Community(List<Person> persons) {
        this.persons = persons;
    }

    public Person find(String name) throws PersonNotFoundException {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        throw new PersonNotFoundException(name);
    }

    public Person findByAge(int age) throws AgeNotFoundException {
        for (Person person : persons) {
            if (person.getAge() == (age)) {
                return person;
            }
        }
        throw new AgeNotFoundException(age);
    }
}
