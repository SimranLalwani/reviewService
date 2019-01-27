package com.dataOne.reviewService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataOne.reviewService.entity.Movie;
import com.dataOne.reviewService.entity.Review;
import com.dataOne.reviewService.repository.AddReviewRepository;
import com.dataOne.reviewService.repository.MovieRepository;
import com.dataOne.reviewService.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	MovieRepository movieRepo;
	
	@Autowired
	ReviewRepository reviewRepo;
	
	@Autowired
	AddReviewRepository addReviewRepo;
	
	public List<Review> getReviews(String mname){
		Movie m = movieRepo.findMovieByName(mname);
		
		return reviewRepo.findAllReviewByMovie(m);
	}
	
	public List<Review> AddReviews(String mName, Integer rating, String comment){
		System.out.println(mName);
		Movie m = movieRepo.findMovieByName(mName);
	
		if(m != null) {
			Review review = new Review();
			review.setRating(rating);
			review.setComment(comment);
			review.setMovie(m);
			Review r = addReviewRepo.save(review);
		}
	
		return getReviews(mName);
	}
}
