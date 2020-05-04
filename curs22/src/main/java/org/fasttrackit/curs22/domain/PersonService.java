package org.fasttrackit.curs22.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PersonService {
    private final List<Person> persons = new ArrayList<>();


    public PersonService(PeopleReader reader) {
        reader.read()
                .forEach(this::add);
    }

    public List<Person> getAll() {
        return Collections.unmodifiableList(persons);
    }

    public Person add(Person person) {
        Person newPerson = new Person(persons.size() + 1, person.getName(), person.getCity(), person.getAge());
        persons.add(newPerson);
        return newPerson;
    }

    public Person replace(int id, Person person) {
        Person personToReplace = getOrThrow(id);

        persons.remove(personToReplace);
        var newPerson = new Person(id, person.getName(), person.getCity(), person.getAge());
        persons.add(id - 1, newPerson);
        return newPerson;
    }

    private Person getOrThrow(final int id) {
        return persons.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Could not find person with id: " + id));
    }

    public Person delete(int id) {
        Person personToDelete = getOrThrow(id);
        persons.remove(personToDelete);
        return personToDelete;
    }
}
