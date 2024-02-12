package cinema.service;

import java.util.List;
import java.util.stream.Collectors;

import cinema.model.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.model.Comment;
import cinema.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment getCommentById(int commentId) {
        return commentRepository.findById(commentId).orElse(null);
    }

    public void deleteById(int commentId) {
        commentRepository.deleteById(commentId);
    }
    public List<Comment> getCommentByMovieId(Integer movieId) {
        List<Comment> comments = commentRepository.findAll();
        List<Comment> filteredComments = comments.stream()
                .filter(like -> like.getMovieId() == movieId)
                .collect(Collectors.toList());
        return filteredComments;
    }
}
