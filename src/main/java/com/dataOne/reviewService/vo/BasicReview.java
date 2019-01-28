package com.dataOne.reviewService.vo;

public class BasicReview {

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
	
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
	
	public void setComment(String comment)
	{
		this.comment = comment;
	}
}
