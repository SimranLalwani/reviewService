package com.dataOne.reviewService.repository;

import org.springframework.data.repository.CrudRepository;

import com.dataOne.reviewService.entity.Review;

public interface AddReviewRepository extends CrudRepository<Review, Long>{
	
		public Review save(Review review);
}
