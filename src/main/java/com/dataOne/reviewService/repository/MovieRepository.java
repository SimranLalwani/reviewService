package com.dataOne.reviewService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataOne.reviewService.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
		public Movie findMovieByName(String name);
}
