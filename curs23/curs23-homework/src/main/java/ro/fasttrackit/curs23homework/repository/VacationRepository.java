package ro.fasttrackit.curs23homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs23homework.Vacation;

import java.util.List;

public interface VacationRepository extends JpaRepository<Vacation, Integer> {
    List<Vacation> findByLocationIgnoreCase(String location);

    Vacation findById(int id);

    List<Vacation> findByPriceLessThan(int maxPrice);

    List<Vacation> findByLocationIgnoreCaseAndPriceLessThan(String location, int maxPrice);
}
