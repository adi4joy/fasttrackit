package ro.fasttrackit.curs13;

import static ro.fasttrackit.curs13.CardinalPoints.EAST;
import static ro.fasttrackit.curs13.CardinalPoints.NORTH;

public class CardinalsMain {
    public static void main(String[] args) {
        getCardinalPoints(NORTH);
        getCardinalPoints(EAST);
    }

    private static void getCardinalPoints(CardinalPoints cardinalPoints) {
        switch (cardinalPoints) {
            case NORTH:
                System.out.println("up");
                break;
            case SOUTH:
                System.out.println("down");
                break;
            case EAST:
                System.out.println("right");
                break;
            case WEST:
                System.out.println("left");
        }
    }
}
