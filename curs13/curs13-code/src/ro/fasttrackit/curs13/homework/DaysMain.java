package ro.fasttrackit.curs13.homework;

import static ro.fasttrackit.curs13.homework.DaysOfTheWeek.WEDNESDAY;

public class DaysMain {
    public static void main(String[] args) {
        getDaysOfTheWeek(WEDNESDAY);
    }

    public static void getDaysOfTheWeek(DaysOfTheWeek daysOfTheWeek) {
        switch (daysOfTheWeek) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
        }
    }
}
