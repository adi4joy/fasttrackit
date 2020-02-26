package ro.fasttrackit.curs13.homework;

import java.util.Objects;

public class DaySchedule {
    private final DaysOfTheWeek day;
    private final ActivityList activityList;

    public DaySchedule(DaysOfTheWeek day, ActivityList activityList) {
        this.day = day;
        this.activityList = activityList;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public ActivityList getActivityList() {
        return activityList;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activityList=" + activityList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day &&
                Objects.equals(activityList, that.activityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activityList);
    }


}
