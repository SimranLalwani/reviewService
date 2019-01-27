package com.dataOne.reviewService.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Column
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String coverImageUrl;
	
	@Column
	private Date releaseDate;
	
	@Column
	private String genre;
	
	@Column
	private Integer directorId;
	
	
	
	public String getName() {
		return name;
	}
	
	public String getCoverImageUrl() {
		return coverImageUrl;
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public Integer getDirectorId() {
		return this.directorId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}
	
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setDirectorId(Integer directorId) {
		this.directorId = directorId;
	}
}
