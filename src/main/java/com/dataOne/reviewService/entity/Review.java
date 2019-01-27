package com.dataOne.reviewService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Review {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column
	private Integer rating;
	
	@Column
	private String comment;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="movie_id")
	private Movie movie;
	
	public Integer getRating()
	{
		return this.rating;
	}
	
	public String getComment()
	{
		return this.comment;
	}
	
	public Movie getMovie()
	{
		return this.movie;
	}
	
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
	
	public void setComment(String comment)
	{
		this.comment = comment;
	}
	
	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}
	
	
}
