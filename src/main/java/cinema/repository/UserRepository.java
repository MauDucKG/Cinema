package cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
