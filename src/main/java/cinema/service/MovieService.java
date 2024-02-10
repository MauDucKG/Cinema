package cinema.service;
import java.util.List;

import cinema.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import cinema.model.Movie;
import cinema.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie save(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(long id) {
        return movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not exist with id :" + id));
    }

    public void deleteById(long id) {
        movieRepository.deleteById(id);
    }
}
