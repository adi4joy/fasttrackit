package ro.fasttrackit.curs13.enums;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final HairColor hair;

    public Person(String name, int age, HairColor hair) {
        this.name = name;
        this.age = age;
        this.hair = hair;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HairColor getHair() {
        return hair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                hair == person.hair;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hair);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hair=" + hair +
                '}';
    }
}
