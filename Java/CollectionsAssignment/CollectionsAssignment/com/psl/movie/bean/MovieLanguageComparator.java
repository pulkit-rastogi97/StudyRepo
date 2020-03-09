package com.psl.movie.bean;

import java.util.Comparator;

public class MovieLanguageComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		   String language1 = m1.getLanguage().toUpperCase();
		   String language2 = m2.getLanguage().toUpperCase();

		   //ascending order
		   return language1.compareTo(language2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }

	
}
