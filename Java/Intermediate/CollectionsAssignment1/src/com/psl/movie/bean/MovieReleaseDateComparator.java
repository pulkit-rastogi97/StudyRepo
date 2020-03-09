package com.psl.movie.bean;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class MovieReleaseDateComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {		
		return (int) ChronoUnit.DAYS.between(o1.getReleaseDate(), o2.getReleaseDate());
	}

}
