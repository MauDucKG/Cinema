package com.bookStore.controller;

import com.bookStore.entity.MyBookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Movie;
import com.bookStore.service.MovieService;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;



    @GetMapping("/movie_register")
    public String movieRegister() {
        return "movieRegister";
    }

    @GetMapping("/available_movies")
    public ModelAndView getAllMovies() {
        List<Movie> movieList = movieService.getAllMovies();
        return new ModelAndView("movieList", "movie", movieList);
    }

    @GetMapping("/my_movie")
    public String getMyMovie(Model model)
    {
        List<Movie>list=movieService.getAllMovies();
        model.addAttribute("movie",list);
        return "myMovie";
    }
    @PostMapping("/saveMovie")
    public String addMovie(@ModelAttribute Movie movie) {
        movieService.save(movie);
        return "redirect:/available_movies";
    }

    @RequestMapping("/editMovie/{id}")
    public String editMovie(@PathVariable("id") int id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "movieEdit";
    }

    @RequestMapping("/deleteMovie/{id}")
    public String deleteMovie(@PathVariable("id") int id) {
        movieService.deleteById(id);
        return "redirect:/available_movies";
    }
}
