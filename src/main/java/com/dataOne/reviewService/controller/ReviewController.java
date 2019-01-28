package com.dataOne.reviewService.controller;

import java.util.ArrayList;
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
import com.dataOne.reviewService.vo.BasicReview;
import com.dataOne.reviewService.vo.ResultReview;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService; 
	
	
	@RequestMapping("/review")
	public ResultReview display(@RequestParam("name") String name){
		
		List<Review> r = reviewService.getReviews(name);
		ResultReview reviews = new ResultReview();
		if(r.size() > 0)
		{
			List<BasicReview> revs = new ArrayList<BasicReview>(); 
			reviews.setMovie(r.get(0).getMovie());
			for(Review review : r)
			{
				BasicReview br = new BasicReview();
				br.setRating(review.getRating());
				br.setComment(review.getComment());
				revs.add(br);
			}
			reviews.setReviews(revs);
		}
		return reviews;
	}
	
	@RequestMapping(value = "/review",
			method = RequestMethod.POST)
	public ResultReview add(@RequestBody ModifyReview modifyReview){
		List<Review> r = reviewService.AddReviews(modifyReview.getMovieName(), modifyReview.getRating(), modifyReview.getComment());
		ResultReview reviews = new ResultReview();
		if(r.size() > 0)
		{
			List<BasicReview> revs = new ArrayList<BasicReview>(); 
			reviews.setMovie(r.get(0).getMovie());
			for(Review review : r)
			{
				BasicReview br = new BasicReview();
				br.setRating(review.getRating());
				br.setComment(review.getComment());
				revs.add(br);
			}
			reviews.setReviews(revs);
		}
		return reviews;
	}
}
