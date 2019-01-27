package com.dataOne.reviewService.model;

public class ModifyReview {
	
	String movieName;
	
	Integer rating;
	
	String comment;
	
	
	public Integer getRating()
	{
		return this.rating;
	}
	
	public String getComment()
	{
		return this.comment;
	}
	
	public String getMovieName()
	{
		return this.movieName;
	}
	
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
	
	public void setComment(String comment)
	{
		this.comment = comment;
	}
	
	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}

}
