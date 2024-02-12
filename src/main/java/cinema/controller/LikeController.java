package cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import cinema.model.Like;
import cinema.service.LikeService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @GetMapping("/like_register")
    public String likeRegister() {
        return "likeRegister";
    }

    @GetMapping("/available_likes")
    public ModelAndView getAllLikes() {
        List<Like> likeList = likeService.getAllLikes();
        return new ModelAndView("likeList", "like", likeList);
    }

    @PostMapping("/saveLike")
    public String addLike(@ModelAttribute Like like) {
        likeService.save(like);
        return "redirect:/available_likes";
    }

//    @RequestMapping("/deleteLike/{userId}/{movieId}")
//    public String deleteLike(@PathVariable("userId") int userId, @PathVariable("movieId") int movieId) {
//        likeService.deleteByUserIdAndMovieId(userId, movieId);
//        return "redirect:/available_likes";
//    }
}
