package com.bookStore.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    private String name;
    private boolean status;
    private double price;
    private String description;
    private java.sql.Date createdDate;
    private String image;

   // private LocalTime Time;

    public Movie(int movieId, String name, boolean status, double price, String description, java.sql.Date createdDate, String image) {
        this.movieId = movieId;
        this.name = name;
        this.status = status;
        this.price = price;
        this.description = description;
        this.createdDate = createdDate;
        this.image = image;
        //this.Time = time;
    }

    public Movie() {
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(java.sql.Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
