package com.dataOne.reviewService.vo;

import java.util.List;

import com.dataOne.reviewService.entity.Movie;

public class ResultReview {

	Movie movie;
	
	List<BasicReview> reviews;
	
	public Movie getMovie() {
		return this.movie;
	}
	
	public List<BasicReview> getReviews(){
		return this.reviews;
	}
	
	public void setMovie(Movie movie){
		this.movie = movie;
	}
	
	public void setReviews(List<BasicReview> reviews){
		this.reviews = reviews;
	}
}
