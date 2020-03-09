package com.psl.movie.bean;

import java.time.Duration;
import java.util.Comparator;

public class MovieDurationComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		Duration duration = Duration.between(o1.getDuration(), o2.getDuration());
		return (int)duration.getSeconds();
	}

}
