package ro.fasttrackit.curs13.enums;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maria", 30, HairColor.BLACK);
        System.out.println(person);

        doSomethingWithHair(person);
    }

    private static void doSomethingWithHair(Person person) {
        switch (person.getHair()) {
            case BLACK:
                System.out.println("it's black");
                break;
            case RED:
                System.out.println("it's red");
                break;
            case BLONDE:
                System.out.println("it's blonde");
            default:
                System.out.println("You broke Java!");
        }
    }
}
