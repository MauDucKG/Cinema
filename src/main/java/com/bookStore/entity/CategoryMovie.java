package com.bookStore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Category_Movie")
public class CategoryMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private int categoryId;


    @Column(name = "artworkId")
    private int artworkId;

    public CategoryMovie(int categoryId, int artworkId) {
        this.categoryId = categoryId;
        this.artworkId = artworkId;
    }

    public CategoryMovie() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(int artworkId) {
        this.artworkId = artworkId;
    }
}
