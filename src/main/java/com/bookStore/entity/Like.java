package com.bookStore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "LikeTable")
public class Like {
    @EmbeddedId
    private LikeId id;

    public Like(User user, Movie movie) {
        this.id = new LikeId();
        this.id.setUser(user);
        this.id.setMovie(movie);
    }

    public Like() {
    }

    public LikeId getId() {
        return id;
    }

    public void setId(LikeId id) {
        this.id = id;
    }

    // Other methods...
}
