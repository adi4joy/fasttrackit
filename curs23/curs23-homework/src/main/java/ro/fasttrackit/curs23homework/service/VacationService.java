package ro.fasttrackit.curs23homework.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs23homework.ResourceNotFoundException;
import ro.fasttrackit.curs23homework.Vacation;
import ro.fasttrackit.curs23homework.repository.VacationRepository;

import java.util.List;

@Service
public class VacationService {
    private final VacationRepository vacationRepository;

    public VacationService(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    public List<Vacation> getAll() {
        return vacationRepository.findAll();
    }

    public List<Vacation> getAllForLocation(String location) {
        return vacationRepository.findByLocationIgnoreCase(location);
    }

    public Vacation getById(int id) {
        if (id != 0) {
            return vacationRepository.findById(id);
        } else {
            throw new ResourceNotFoundException("Could not find vacation with id: " + id);
        }
    }

    public Vacation addVacation(Vacation vacation) {
        return vacationRepository.save(vacation);
    }

    public void deleteVacation(int id) {
        vacationRepository.delete(getById(id));
    }

    public Vacation replaceVacation(int id, Vacation vacation) {
        var oldVacation = getById(id);
        oldVacation.setLocation(vacation.getLocation());
        oldVacation.setPrice(vacation.getPrice());
        oldVacation.setDuration(vacation.getDuration());
        return vacationRepository.save(oldVacation);
    }

    public List<Vacation> findCheaperVacations(int maxPrice) {
        return vacationRepository.findByPriceLessThan(maxPrice);
    }

    public List<Vacation> getCheaperLocations(Integer maxPrice, String location) {
        return vacationRepository.findByLocationIgnoreCaseAndPriceLessThan(location, maxPrice);
    }
}
