package org.fasttrackit.curs22.homework;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vacations")
public class VacationController {
    private final VacationService vacationService;

    public VacationController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    //get vacation by id
    @GetMapping("{id}")
    public Vacation getVacationById(@PathVariable int id) {
        return vacationService.getVacationById(id);
    }

    //get vacations that don't have price higher than maxPrice
    //get all vacations for location
    //get all vacations
    @GetMapping
    public List<Vacation> getAllVacations(@RequestParam(required = false) String location, @RequestParam(required = false) Integer maxPrice) {
        if (maxPrice != null && location != null) {
            return vacationService.getCheaperLocations(maxPrice, location);
        } else if (maxPrice != null) {
            return vacationService.getCheaperVacations(maxPrice);
        } else if (location != null && !location.isEmpty()) {
            return vacationService.getVacationsForLocation(location);
        } else {
            return vacationService.getAllVacations();
        }
    }

    //add a vacation
    @PostMapping
    public Vacation addVacation(@RequestBody Vacation vacation) {
        return vacationService.addVacation(vacation);
    }

    //delete a vacation
    @DeleteMapping("{id}")
    public Vacation deleteVacation(@PathVariable int id) {
        return vacationService.deleteVacation(id);
    }

    //replace a vacation
    @PutMapping("{id}")
    public Vacation replaceVacation(@PathVariable int id, @RequestBody Vacation vacation) {
        return vacationService.replaceVacation(id, vacation);
    }

}
