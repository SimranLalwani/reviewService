package com.dataOne.reviewService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataOne.reviewService.entity.Movie;
import com.dataOne.reviewService.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	
		public List<Review> findAllReviewByMovie(Movie movie);
}
