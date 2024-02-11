package cinema.service;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.model.Like;
import cinema.repository.LikeRepository;

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


    public int totalLikeByMovie(Long movieId) {
        List<Like> likes = likeRepository.findAll();
        List<Like> filteredLikes = likes.stream()
                .filter(like -> like.getId().getMovieId() == movieId)
                .collect(Collectors.toList());
        return filteredLikes.size();
    }
}