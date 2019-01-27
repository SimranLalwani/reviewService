package com.dataOne.reviewService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dataOne.reviewService.entity.Review;
import com.dataOne.reviewService.model.ModifyReview;
import com.dataOne.reviewService.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService; 
	
	
	@RequestMapping("/review")
	public List<Review> display(@RequestParam("name") String name){
		
		List<Review> r = reviewService.getReviews(name);
		return r;
	}
	
	@RequestMapping(value = "/review",
			method = RequestMethod.POST)
	public List<Review> add(@RequestBody ModifyReview modifyReview){
		List<Review> r = reviewService.AddReviews(modifyReview.getMovieName(), modifyReview.getRating(), modifyReview.getComment());
		return r;
	}

}
