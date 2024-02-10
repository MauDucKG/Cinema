package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.CategoryMovie;
import com.bookStore.repository.CategoryMovieRepository;

@Service
public class CategoryMovieService {

    @Autowired
    private CategoryMovieRepository categoryMovieRepository;

    public void save(CategoryMovie categoryMovie) {
        categoryMovieRepository.save(categoryMovie);
    }

    public List<CategoryMovie> getAllCategoryMovies() {
        return categoryMovieRepository.findAll();
    }

//    public CategoryMovie getCategoryMovieById(int categoryId, int artworkId) {
//        // CategoryMovie là một composite primary key
//        return categoryMovieRepository.findById(categoryId, artworkId).orElse(null);
//    }
//
//    public void deleteById(int categoryId, int artworkId) {
//        // CategoryMovie là một composite primary key
//        categoryMovieRepository.deleteById(categoryId, artworkId);
//    }
}
