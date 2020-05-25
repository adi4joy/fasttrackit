package ro.fasttrackit.curs25.movies.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ro.fasttrackit.curs25.movies.service.MovieService;

@Controller
public class MovieUIController {
    private final MovieService movieService;

    public MovieUIController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("movies")
    public String moviesPage(Model pageModel) {
        pageModel.addAttribute("movies", movieService.getAll());
        return "movies";
    }

    @GetMapping("movies/{id}")
    public String moviesPageWithDetails(@PathVariable Integer id, Model pageModel) {
        pageModel.addAttribute("showDetails", true);
        pageModel.addAttribute("selectedMovie", movieService.getMovie(id));
        return moviesPage(pageModel);
    }
}
