package com.bookStore.entity;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId")
    private int commentId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;

    @Column(name = "date")
    private Date date;

    public Comment(int commentId, User user, String content, Movie movie, Date date) {
        this.commentId = commentId;
        this.user = user;
        this.content = content;
        this.movie = movie;
        this.date = date;
    }

    public Comment() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
