package ro.fasttrackit.curs12.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> gradesAgain = new HashMap<>();
        gradesAgain.put("Jason", 5);
        gradesAgain.put("Maya", 7);
        gradesAgain.put("Rachel", 9);
        gradesAgain.put("Mike", 8);
        gradesAgain.put("Robert", 9);
        gradesAgain.put("Sarah", 10);
        gradesAgain.put("Tina", 6);

        System.out.println(gradesAgain);
        System.out.println(getMaxGrade(gradesAgain));
    }

    public static Map.Entry<String, Integer> getMaxGrade(Map<String, Integer> gradesAgain) {
        Map.Entry<String, Integer> maxGrade = null;
        Integer max = Collections.max(gradesAgain.values());

        for (Map.Entry<String, Integer> entry : gradesAgain.entrySet()) {
            Integer grade = entry.getValue();
            if (grade.equals(max)) {
                maxGrade = entry;
            }
        }
        return maxGrade;
    }
}
