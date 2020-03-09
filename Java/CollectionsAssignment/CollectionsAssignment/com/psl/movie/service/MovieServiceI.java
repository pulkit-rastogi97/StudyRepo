package com.psl.movie.service;

import java.util.List;

import com.psl.movie.bean.Movie;
import com.psl.movie.exception.MovieException;

public interface MovieServiceI {
	
	public List<Movie> createMovieList() throws MovieException;
	public void sortByLanguage(List<Movie> movieList);
	public void sortByDuration(List<Movie> movieList);
	public void SortByLanguageAndReleaseDate(List<Movie> movieList);

}
