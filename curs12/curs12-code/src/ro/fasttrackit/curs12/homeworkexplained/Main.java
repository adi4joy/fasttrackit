package ro.fasttrackit.curs12.homeworkexplained;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person maria = new Person("Maria", 20, "NEGRU");
        Person aceeasimaria = new Person("Maria", 20, "NEGRU");
        Person nelu = new Person("Nelu", 20, "NEGRU");

        Set<Person> persons = new HashSet<>();
        persons.add(maria);
        persons.add(aceeasimaria);
        persons.add(nelu);
        System.out.println(persons);


    }
}
