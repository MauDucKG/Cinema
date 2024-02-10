package cinema.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cinema.model.Movie;
import cinema.service.MovieService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // get all movies
    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    // create movie rest api
    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    // get movie by id rest api
    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        Movie movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    // update movie rest api

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movieDetails){
        Movie movie = movieService.getMovieById(id);

        movie.setDescription(movieDetails.getDescription());
        movie.setImage(movieDetails.getImage());
        movie.setName(movieDetails.getName());
        movie.setPrice(movieDetails.getPrice());

        Movie updatedMovie = movieService.save(movie);
        return ResponseEntity.ok(updatedMovie);
    }

    // delete movie rest api
    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteMovie(@PathVariable Long id){
        Movie movie = movieService.getMovieById(id);

        movieService.deleteById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
