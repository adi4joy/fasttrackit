package ro.fasttrackit.curs13.homework;

import java.util.List;
import java.util.Objects;

public class ActivityList {
    private final List<String> list;

    public ActivityList(List<String> list) {
        this.list = list;
    }

    public void addActivity(String activity) {
        list.add(activity);
    }

    public void removeActivity(String activity) {
        list.remove(activity);
    }

    @Override
    public String toString() {
        return "ActivityList{" +
                "activityList=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityList that = (ActivityList) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
