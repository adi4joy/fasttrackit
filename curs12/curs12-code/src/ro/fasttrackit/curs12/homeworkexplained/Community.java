package ro.fasttrackit.curs12.homeworkexplained;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Community {
    private final List<Person> persons;

    public Community(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> getNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> nameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public Map<String, List<String>> hairToNames() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> list = result.get(person.getHair());
            if (list == null) {
                list = new ArrayList<>();
                result.put(person.getHair(), list);
            }
            list.add(person.getName());
        }
        return result;
    }
}
