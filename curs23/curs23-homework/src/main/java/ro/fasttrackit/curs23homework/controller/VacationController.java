package ro.fasttrackit.curs23homework.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs23homework.Vacation;
import ro.fasttrackit.curs23homework.service.VacationService;

import java.util.List;

@RestController
@RequestMapping("vacations")
public class VacationController {
    private final VacationService vacationService;

    public VacationController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping
    public List<Vacation> getAll(@RequestParam(required = false) String location, @RequestParam(required = false) Integer maxPrice) {
        if (maxPrice != null && location != null) {
            return vacationService.getCheaperLocations(maxPrice, location);
        } else if (maxPrice != null) {
            return vacationService.findCheaperVacations(maxPrice);
        } else if (location != null && !location.isEmpty()) {
            return vacationService.getAllForLocation(location);
        } else {
            return vacationService.getAll();
        }
    }

    @GetMapping("{id}")
    public Vacation getById(@PathVariable int id) {
        return vacationService.getById(id);
    }

    @PostMapping
    public Vacation addVacation(@RequestBody Vacation vacation) {
        return vacationService.addVacation(vacation);
    }

    @DeleteMapping("{id}")
    public void deleteVacation(@PathVariable int id) {
        vacationService.deleteVacation(id);
    }

    @PutMapping("{id}")
    public Vacation replaceVacation(@PathVariable int id, @RequestBody Vacation vacation) {
        return vacationService.replaceVacation(id, vacation);
    }
}
