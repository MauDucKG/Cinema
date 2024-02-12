package cinema.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cinema.model.Comment;
import cinema.service.CategoryService;
import cinema.service.CommentService;
import cinema.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cinema.model.Movie;
import cinema.service.MovieService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class IndexController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private LikeService likeService;

    @Autowired
    private CategoryService CategoryService;

    // API to get list of 3 movies
    @GetMapping("/index/infoMovie")
    public Map<String, Object> getInfoMovie(@PathVariable Integer movieId) {

       // int totalLike = likeService.totalLikeByMovie(movieId);
        //List<Comment> listComment = commentService.getCommentByMovieId(movieId);
        Movie movie = movieService.getMovieById(movieId);
        Map<String, Object> response = new HashMap<>();
        response.put("movieId", movieId);
        response.put("name", movie.getName());
        response.put("image", movie.getImage());
       // response.put("totalLike", totalLike);
        //response.put("totalComment", listComment);

        return response;
    }




    // API to get list of 3 movies
    @GetMapping("/index/movies")
    public Map<String, Object> getThreeMovies() {
        int movieId =3;
        int totalLike = likeService.totalLikeByMovie(movieId);
        List<Comment> listComment = commentService.getCommentByMovieId(movieId);

        Map<String, Object> response = new HashMap<>();
        response.put("movieId", movieId);
        response.put("totalLike", totalLike);
        response.put("listComment", listComment);

        return response;
    }

    // API to search movie by name
    @PostMapping("/index/movies/searchByName")
    public ResponseEntity<List<Movie>> searchMovieByName(@RequestBody String name) {
        List<Movie> movies = movieService.searchMovieByName(name);
        return ResponseEntity.ok(movies);
    }

    // API to get 3 suggested movies based on likes
    @GetMapping("/index/movies/suggestedByLike")
    public List<Movie> getThreeSuggestedMovies() {
        return movieService.getTop3MoviesByLikes();
    }
}
