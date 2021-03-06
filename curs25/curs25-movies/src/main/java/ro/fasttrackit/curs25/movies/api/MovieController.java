package ro.fasttrackit.curs25.movies.api;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs25.movies.domain.Movie;
import ro.fasttrackit.curs25.movies.service.MovieService;

//curs 26
@RestController
@RequestMapping("api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    Movie addMovie(@RequestBody Movie newMovie) {
        return movieService.addMovie(newMovie);
    }

    @DeleteMapping("{id}")
    Movie deleteMovie(@PathVariable int id) {
        return movieService.deleteMovie(id);
    }

    @PutMapping("{id}")
    Movie replaceMovie(@PathVariable int id, @RequestBody Movie movie) {
        return movieService.replaceMovie(id, movie);
    }
}
