package org.fasttrackit.curs22.homework;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VacationService {
    private final List<Vacation> vacations = new ArrayList<>();

    private Vacation vacationOperations(final int id) {
        return vacations.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Could not find vacation with id: " + id));
    }

    public Vacation getVacationById(int id) {
        return vacationOperations(id);
    }

    public List<Vacation> getAllVacations() {
        return vacations;
    }

    public List<Vacation> getVacationsForLocation(String location) {
        return vacations.stream()
                .filter(v -> v.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public List<Vacation> getCheaperVacations(int maxPrice) {
        return vacations.stream()
                .filter(v -> v.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    public List<Vacation> getCheaperLocations(int maxPrice, String location) {
        return vacations.stream()
                .filter(v -> v.getPrice() < maxPrice)
                .filter(v -> v.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public Vacation addVacation(Vacation vacation) {
        Vacation newVacation = new Vacation(vacations.size() + 1, vacation.getLocation(), vacation.getPrice(), vacation.getDuration());
        vacations.add(newVacation);
        return newVacation;
    }

    public Vacation deleteVacation(int id) {
        Vacation vacationToDelete = vacationOperations(id);
        vacations.remove(vacationToDelete);
        return vacationToDelete;
    }

    public Vacation replaceVacation(int id, Vacation vacation) {
        Vacation vacationToReplace = vacationOperations(id);
        vacations.remove(vacationToReplace);
        var newVacation = new Vacation(id, vacation.getLocation(), vacation.getPrice(), vacation.getDuration());
        vacations.add(id - 1, newVacation);
        return newVacation;
    }
}
