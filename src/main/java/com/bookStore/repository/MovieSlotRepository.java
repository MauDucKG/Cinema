package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.MovieSlot;

@Repository
public interface MovieSlotRepository extends JpaRepository<MovieSlot, Integer> {

}
