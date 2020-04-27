package ro.fasttrackit.curs21.web;

import ro.fasttrackit.curs21.web.domain.Person;

import java.util.List;

public class PersonReader {
    public List<Person> readPersons() {
        return List.of(
                new Person("Maria", 23),
                new Person("Darius", 32),
                new Person("Marius", 15));
    }
}
