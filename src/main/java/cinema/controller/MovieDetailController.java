package cinema.controller;

import cinema.model.Comment;
import cinema.model.Like;
import cinema.model.Movie;
import cinema.service.CommentService;
import cinema.service.LikeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/movie_detail")
public class MovieDetailController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private LikeService likeService;

    @GetMapping("/likeandcomment/{movieId}")
    public Map<String, Object> getLikeAndComment(@PathVariable Long movieId){
        int totalLike = likeService.totalLikeByMovie(movieId);
        List<Comment> listComment = commentService.getCommentByMovieId(movieId);

        Map<String, Object> response = new HashMap<>();
        response.put("movieId", movieId);
        response.put("totalLike", totalLike);
        response.put("listComment", listComment);

        return response;
    }

}
