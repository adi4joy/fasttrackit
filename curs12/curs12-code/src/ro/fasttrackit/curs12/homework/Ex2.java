package ro.fasttrackit.curs12.homework;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mary", 22, "brown"));
        personList.add(new Person("John", 25, "black"));
        personList.add(new Person("Laura", 25, "yellow"));
        personList.add(new Person("Victor", 26, "brown"));
        personList.add(new Person("Paula", 23, "red"));

        // 2.1

        List<String> nameList = new ArrayList<>();
        for (Person person : personList) {
            nameList.add(person.getName());
        }
        System.out.println(nameList);

        // 2.2

        List<Integer> ageList = new ArrayList<>();
        for (Person person : personList) {
            ageList.add(person.getAge());
        }

        Map<String, Integer> ages = new HashMap<>();
        for (int i = 0; i < personList.size(); i++) {
            ages.put(nameList.get(i), ageList.get(i));
        }
        System.out.println(ages);

        // 2.3

        Set<String> olderThan = new HashSet<>();
        int age1 = 23;
        for (Person person : personList) {
            if (person.getAge() > age1) {
                olderThan.add(person.getName());
            }
        }
        System.out.println(olderThan);

        // 2.4

        Map<String, List<String>> hairColor = new HashMap<>();
        String color = "brown";
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            if (person.getHairColor().equals(color)) {
                names.add(person.getName());
            }
        }
        hairColor.put(color, names);
        System.out.println(hairColor);

        // 2.5

        Map<Integer, List<String>> agesMap = new HashMap<>();
        List<String> agesList = new ArrayList<>();
        int age2 = 25;
        for (Person person : personList) {
            if (person.getAge() == age2) {
                agesList.add(person.getName());
            }
        }
        agesMap.put(age2, agesList);
        System.out.println(agesMap);
    }
}
