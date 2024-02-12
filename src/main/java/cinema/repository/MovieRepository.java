package cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cinema.model.Movie;

import java.util.ArrayList;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}