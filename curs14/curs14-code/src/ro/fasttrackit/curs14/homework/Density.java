package ro.fasttrackit.curs14.homework;

public enum Density {
    HIGH,
    AVERAGE,
    LOW;

    public static Density density(long density) {
        if (density >= 1000) {
            return HIGH;
        } else if (density < 200) {
            return LOW;
        } else {
            return AVERAGE;
        }
    }
}

