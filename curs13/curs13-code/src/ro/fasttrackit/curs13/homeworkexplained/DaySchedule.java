package ro.fasttrackit.curs13.homeworkexplained;

import java.util.*;

public class DaySchedule {
    private final Days days;
    private final List<String> activities;

    public DaySchedule(Days day) {
        this.days = day;
        this.activities = new ArrayList<>();
    }

    public Days getDay() {
        return days;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    public List<String> getActivities() {
//        return new ArrayList<>(activities);
        return Collections.unmodifiableList(activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "days=" + days +
                ", activities=" + activities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return days == that.days &&
                Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, activities);
    }
}
