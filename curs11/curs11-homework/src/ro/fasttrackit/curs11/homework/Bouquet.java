package ro.fasttrackit.curs11.homework;

import java.util.HashSet;
import java.util.Set;

public class Bouquet {
    private Set<String> flowers;

    public Bouquet(Set<String> flowers) {
        this.flowers = flowers;
    }

    public Set<String> getFlowers() {
        return flowers;
    }

    public void removeFlower(String flower) {
        flowers.remove(flower);
    }

    public void addFlower(String flower) {
        Set<String> result = new HashSet<>();
//        for (String flowers : flowers) {
            result.add(flower);
//        }
        System.out.println(result);
    }
}
