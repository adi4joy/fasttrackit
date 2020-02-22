package ro.fasttrackit.curs11.homework;

import java.util.HashSet;
import java.util.Set;

public class Company {
    private final Set<Person> employees;

    public Company(Person manager) {
        this.employees = new HashSet<>();
        employ(new Person(manager.getName(), manager.getAge(), "manager"));
    }

    public void employ(Person person) {
        employees.add(person);
    }

    public Person getManager() {
        for (Person person : employees) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    // Am pus Set in loc de List, am zis sa fac diferit de data trecuta
    public Set<Person> getEmployees(String position) {
        Set<Person> result = new HashSet<>();
        for (Person person : employees) {
            if (person.getPosition().equals(position)) {
                result.add(person);
            }
        }
        return result;
    }

    public Set<Person> getOlder(int age) {
        Set<Person> result = new HashSet<>();
        for (Person person : employees) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public Set<Person> getEmployeesByName(String name) {
        Set<Person> result = new HashSet<>();
        for (Person person : employees) {
            if (person.getPosition().contains(name)) {
                result.add(person);
            }
        }
        return result;
    }
}
