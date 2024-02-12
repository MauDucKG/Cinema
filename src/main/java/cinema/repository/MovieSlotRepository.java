package cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.model.MovieSlot;

@Repository
public interface MovieSlotRepository extends JpaRepository<MovieSlot, Integer> {

}
