package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MovieSlot;
import com.bookStore.repository.MovieSlotRepository;

@Service
public class MovieSlotService {

    @Autowired
    private MovieSlotRepository movieSlotRepository;

    public void save(MovieSlot movieSlot) {
        movieSlotRepository.save(movieSlot);
    }

    public List<MovieSlot> getAllMovieSlots() {
        return movieSlotRepository.findAll();
    }

//    public MovieSlot getMovieSlotById(int movieId, int slotId) {
//        // MovieSlot là một composite primary key
//        return movieSlotRepository.findById(movieId, slotId).orElse(null);
//    }
//
//    public void deleteById(int movieId, int slotId) {
//        // MovieSlot là một composite primary key
//        movieSlotRepository.deleteById(movieId, slotId);
//    }
}
