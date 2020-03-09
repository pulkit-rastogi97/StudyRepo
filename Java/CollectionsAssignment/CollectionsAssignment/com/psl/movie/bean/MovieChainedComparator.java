package com.psl.movie.bean;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class MovieChainedComparator implements Comparator<Movie>{

	
		 
	    private List<Comparator<Movie>> listComparators;
	 
	    @SafeVarargs
	    public MovieChainedComparator(Comparator<Movie>... comparators) {
	        this.listComparators = Arrays.asList(comparators);
	    } 
	    @Override
	    public int compare(Movie m1, Movie m2) {
	        for (Comparator<Movie> comparator : listComparators) {
	            int result = comparator.compare(m1, m2);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	    }
	}

	


