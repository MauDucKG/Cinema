package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Like;
import com.bookStore.repository.LikeRepository;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public void save(Like like) {
        likeRepository.save(like);
    }

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

//    public Like getLikeById(int userId, int movieId) {
//        // Like là một composite primary key
//        return likeRepository.findById(userId, movieId).orElse(null);
//    }
//
//    public void deleteById(int userId, int movieId) {
//        // Like là một composite primary key
//        likeRepository.deleteById(userId, movieId);
//    }
}
