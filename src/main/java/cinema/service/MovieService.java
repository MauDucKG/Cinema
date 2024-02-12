package cinema.service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Movie> searchMovieByName(String name) {
        List<Movie> Movies = movieRepository.findAll();
        for(Movie o : Movies){
            if(o.getName().equals(name.trim())){
                Movies.remove(o);
            }
        }
        return Movies;
    }

    public List<Integer> getLimitedMovieIds(int limit) {
        List<Movie> movies = movieRepository.findAll();

        List<Integer> movieIds = movies.stream()
                .map(Movie::getMovieId)
                .limit(limit)
                .collect(Collectors.toList());

        return movieIds;
    }
    public List<Movie> getTop3MoviesByLikes() {
        // Lấy tất cả các bộ phim
        List<Movie> movies = movieRepository.findAll();

        // Sắp xếp danh sách theo số lượt thích giảm dần
        List<Movie> top3Movies = movies.stream()
                .sorted(Comparator.comparingInt(o -> -o.getMovieId()))
                .limit(3)
                .collect(Collectors.toList());

        return top3Movies;
    }
    public void deleteById(long id) {
        movieRepository.deleteById(id);
    }
}
