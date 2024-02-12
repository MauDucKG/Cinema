package cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer> {

}
