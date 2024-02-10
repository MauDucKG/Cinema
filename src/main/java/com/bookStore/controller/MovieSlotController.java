package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.MovieSlot;
import com.bookStore.service.MovieSlotService;

import java.util.List;

@Controller
public class MovieSlotController {

    @Autowired
    private MovieSlotService movieSlotService;

    @GetMapping("/movie_slot_register")
    public String movieSlotRegister() {
        return "movieSlotRegister";
    }

    @GetMapping("/available_movie_slots")
    public ModelAndView getAllMovieSlots() {
        List<MovieSlot> movieSlotList = movieSlotService.getAllMovieSlots();
        return new ModelAndView("movieSlotList", "movieSlot", movieSlotList);
    }

    @PostMapping("/saveMovieSlot")
    public String addMovieSlot(@ModelAttribute MovieSlot movieSlot) {
        movieSlotService.save(movieSlot);
        return "redirect:/available_movie_slots";
    }

//    @RequestMapping("/editMovieSlot/{id}")
//    public String editMovieSlot(@PathVariable("id") int id, Model model) {
//        MovieSlot movieSlot = movieSlotService.getMovieSlotById(id);
//        model.addAttribute("movieSlot", movieSlot);
//        return "movieSlotEdit";
//    }
//
//    @RequestMapping("/deleteMovieSlot/{id}")
//    public String deleteMovieSlot(@PathVariable("id") int id) {
//        movieSlotService.deleteById(id);
//        return "redirect:/available_movie_slots";
//    }
}
