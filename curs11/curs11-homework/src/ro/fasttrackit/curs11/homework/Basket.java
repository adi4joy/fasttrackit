package ro.fasttrackit.curs11.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {
    private List<String> basket;

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    public void add(String toAdd) {
        basket.add(toAdd);
    }

    public boolean remove(String toRemove) {
        return basket.remove(toRemove);
    }

    public boolean find(String toFind) {
        return basket.contains(toFind);
    }

    public int position(String position) {
        return basket.indexOf(position);
    }

    public Set<String> distinct() {
        return new HashSet<>(basket);
    }

    public int count() {
        return basket.size();
    }

    public int customCount() {
        int count = 0;
        for (int i = 0; i < basket.size(); i++) {
            count += i;
        }
        return count;
    }
}
