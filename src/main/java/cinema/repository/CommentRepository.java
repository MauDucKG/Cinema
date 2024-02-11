package cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
