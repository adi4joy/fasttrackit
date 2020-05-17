package ro.fasttrackit.curs23homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs23homework.repository.VacationRepository;

import java.util.List;

@SpringBootApplication
public class Curs23HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs23HomeworkApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(VacationRepository vacationRepository) {
		return args -> {
			vacationRepository.save(new Vacation("Mamaia", 4000, 6));
			vacationRepository.save(new Vacation("Neptun", 4000, 6));
			vacationRepository.saveAll(List.of(
					new Vacation("Jupiter", 4000, 6),
					new Vacation("Saturn", 4000, 6),
					new Vacation("Venus", 4000, 6)

			));
		};
	}
}
