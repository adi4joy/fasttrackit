package ro.fasttrackit.curs13.enums;

import ro.fasttrackit.curs13.exceptions.AgeNotFoundException;
import ro.fasttrackit.curs13.exceptions.PersonNotFoundException;

import java.util.List;

public class CommunityMain {
    public static void main(String[] args) {
        Community community = new Community(List.of(
                new Person("Maria", 22, HairColor.BLACK),
                new Person("George", 33, HairColor.BLONDE),
                new Person("Gigel", 12, HairColor.BLACK)
        ));
        try {
            community.find("Dorel");
        } catch (PersonNotFoundException pnfe) {
            System.err.println(pnfe.getMessage());
            System.err.println(pnfe.getName());
        }
        try {
            community.findByAge(30);
        } catch (AgeNotFoundException anfe) {
            System.err.println(anfe.getMessage());
            System.err.println(anfe.getAge());
        }
    }
}
