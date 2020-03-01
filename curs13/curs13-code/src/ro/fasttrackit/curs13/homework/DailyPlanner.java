package ro.fasttrackit.curs13.homework;

import java.util.ArrayList;

public class DailyPlanner extends DaySchedule {
    public DailyPlanner(DaysOfTheWeek day, ActivityList activityList) {
        super(day, activityList);

        ActivityList activityList1 = new ActivityList(new ArrayList<>());
        activityList1.addActivity("running");
        activityList1.addActivity("eating");
        activityList1.addActivity("swimming lesson");
        activityList1.addActivity("jogging");
        activityList1.removeActivity("jogging");
        System.out.println(activityList1);

        ActivityList activityList2 = new ActivityList(new ArrayList<>());
        activityList2.addActivity("eating");
        activityList2.addActivity("piano lesson");
        activityList2.addActivity("reading");
        System.out.println(activityList2);

        DaySchedule monday = new DaySchedule(DaysOfTheWeek.MONDAY, activityList1);
        DaySchedule tuesday = new DaySchedule(DaysOfTheWeek.TUESDAY, activityList2);
        DaySchedule wednesday = new DaySchedule(DaysOfTheWeek.WEDNESDAY, activityList1);
        DaySchedule thursday = new DaySchedule(DaysOfTheWeek.THURSDAY, activityList2);
        System.out.println(monday);
        System.out.println(thursday);
    }

    public static void main(String[] args) {
        // nothing here
    }

    public void addActivityOnPlanner(DaysOfTheWeek day, String activity) throws NoActivityException {
        if (super.getDay().equals(day) && activity != null) {
            super.getActivityList().addActivity(activity);
        } else {
            throw new NoActivityException();
        }
    }

    public void removeActivityFromPlanner(DaysOfTheWeek day, String activity) throws NoActivityException {
        if (super.getDay().equals(day) && super.getActivityList().toString().contentEquals(activity)) {
            super.getActivityList().removeActivity(activity);
        } else {
            throw new NoActivityException();
        }
    }
}
