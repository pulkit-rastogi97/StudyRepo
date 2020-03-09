package com.psl.movie.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movie{

	private String name;
	private String language;
	private LocalDate releaseDate;
	private LocalTime duration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	
	
	public Movie(String name, String language, LocalDate releaseDate, LocalTime duration) {
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", releaseDate=" + releaseDate + ", duration="
				+ duration + "]";
	}
	
}
