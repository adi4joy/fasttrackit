package ro.fasttrackit.curs24heroservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs24heroservice.domain.Hero;
import ro.fasttrackit.curs24heroservice.persistence.HeroRepository;

import java.util.List;

@SpringBootApplication
public class Curs24HeroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Curs24HeroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(HeroRepository repository) {
        return args -> {
            repository.saveAll(List.of(
                    new Hero("Hercules", 9, 100, 0),
                    new Hero("Gerbil-Man", 1, 100, 0),
                    new Hero("Remarkable-Man", 3, 100, 0),
                    new Hero("Agent Remarkable", 5, 100, 0),
                    new Hero("Remarkable-Gerbil", 10, 100, 0)
            ));
        };
    }
}
