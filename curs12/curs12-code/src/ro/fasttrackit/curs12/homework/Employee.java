package ro.fasttrackit.curs12.homework;

public class Employee extends Person {
    private final String company;
    private final int salary;

    public Employee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getHairColor() {
        return super.getHairColor();
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
