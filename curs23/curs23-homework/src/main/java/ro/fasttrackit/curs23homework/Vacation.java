package ro.fasttrackit.curs23homework;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Vacation {
    @Id
    @GeneratedValue
    private int id;
    private String location;
    private int price;
    private int duration;

    public Vacation() {
    }

    public Vacation(String location, int price, int duration) {
        this.location = location;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacation vacation = (Vacation) o;
        return id == vacation.id &&
                price == vacation.price &&
                duration == vacation.duration &&
                Objects.equals(location, vacation.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location, price, duration);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
