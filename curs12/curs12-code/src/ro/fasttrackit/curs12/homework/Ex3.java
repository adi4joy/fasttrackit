package ro.fasttrackit.curs12.homework;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mary", 22, "brown", "Dell", 5_000));
        employeeList.add(new Employee("John", 25, "black", "HP", 4_000));
        employeeList.add(new Employee("Laura", 25, "yellow", "HP", 4_500));
        employeeList.add(new Employee("Victor", 26, "brown", "Dell", 5_500));
        employeeList.add(new Employee("Paula", 23, "red", "Dell", 2_000));

        // 3.1

        Set<String> salaryOverAmount = new HashSet<>();
        int salaryAmount = 3_000;
        for (Employee employee : employeeList) {
            if (employee.getSalary() > salaryAmount) {
                salaryOverAmount.add(employee.getName());
            }
        }
        System.out.println("Employees with salary over 3,000: " + salaryOverAmount);

        // 3.2

        Map<String, List<String>> companyEmployees = new HashMap<>();
        String company = "Dell";
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getCompany().equals(company)) {
                employeeNames.add(employee.getName());
            }
        }
        companyEmployees.put(company, employeeNames);
        System.out.println("Employees who work for " + companyEmployees);

        // 3.3

        int salarySum = 0;
        for (Employee employee : employeeList) {
            salarySum += employee.getSalary();
        }
        System.out.println("The total sum of all salaries is: " + salarySum);

        // 3.4

        List<Integer> salaryList = new ArrayList<>();
        for (Employee employee : employeeList) {
            salaryList.add(employee.getSalary());
        }

        List<String> companyList = new ArrayList<>();
        for (Employee employee : employeeList) {
            companyList.add(employee.getCompany());
        }

        System.out.println("Highest paying company is " + companyList.get((salaryList.indexOf(Collections.max(salaryList)))) + " with a salary of " + Collections.max(salaryList));

    }
}
