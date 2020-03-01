package ro.fasttrackit.curs13.homework;

import java.util.Arrays;

import static ro.fasttrackit.curs13.homework.DaysOfTheWeek.WEDNESDAY;

public class DaysMain {
    public static void main(String[] args) {
        getDaysOfTheWeek(WEDNESDAY);
        getActivities("Monday");
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

    public static DaySchedule getActivities(String day) {
        for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
            if (day.equalsIgnoreCase(Arrays.toString(DaysOfTheWeek.values()))) {
                return null; //DEAD END... LOST HOPE;
            }
        }
        return null;
    }

}
