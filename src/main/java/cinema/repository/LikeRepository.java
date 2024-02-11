package cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.model.Like;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {

}
