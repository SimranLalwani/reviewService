package com.dataOne.reviewService.service;

import java.util.List;

import com.dataOne.reviewService.entity.Review;

public interface ReviewService {
	
	public List<Review> getReviews(String mname);
	
	public List<Review> AddReviews(String mName, Integer rating, String comment);
}
