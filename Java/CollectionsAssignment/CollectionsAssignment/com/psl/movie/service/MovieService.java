package com.psl.movie.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.psl.movie.bean.Movie;
import com.psl.movie.bean.MovieChainedComparator;
import com.psl.movie.bean.MovieDurationComparator;
import com.psl.movie.bean.MovieLanguageComparator;
import com.psl.movie.bean.MovieReleaseDateComparator;
import com.psl.movie.exception.MovieException;

public class MovieService implements MovieServiceI {

	Scanner sc = new Scanner(System.in);
	Movie movie;

	@Override
	public List<Movie> createMovieList() throws MovieException{
		List<Movie> movieList = new ArrayList<>();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter the no. of movies you want to add :: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Enter the name :: ");
			String name = sc.nextLine();
			System.out.println("Enter the language :: ");
			String language = sc.next();
			System.out.println("Enter the release date (dd/mm/yyyy) :: ");
			String inputDate = sc.next();
			LocalDate releaseDate;
			LocalTime duration;
			try {
				releaseDate = LocalDate.parse(inputDate, f);
				System.out.println("Enter the duration (hh:mm:ss) :: ");
				String time = sc.next();
			    duration = LocalTime.parse(time);
			} catch (DateTimeParseException e) {
				throw new MovieException(e.getMessage());
			}
			movie = new Movie(name, language, releaseDate, duration);
			movieList.add(movie);
		}
		return movieList;
	}

	@Override
	public void sortByLanguage(List<Movie> movieList) {
	
		if(movieList.isEmpty())
		{
			System.out.println("No movies Found");
			return;
		}
		else
		{
			Collections.sort(movieList,new MovieLanguageComparator());
			
			for(Movie m : movieList)
			{
				System.out.println(m);
			}
		}
		
	}

	@Override
	public void sortByDuration(List<Movie> movieList) {
		if(movieList.isEmpty())
		{
			System.out.println("No movies Found");
			return;
		}
		else
		{
			Collections.sort(movieList,new MovieDurationComparator());
			
			for(Movie m : movieList)
			{
				System.out.println(m);
			}
		}

	}

	@Override
	public void SortByLanguageAndReleaseDate(List<Movie> movieList) {
		if(movieList.isEmpty())
		{
			System.out.println("No movies Found");
			return;
		}
		else
		{
			Collections.sort(movieList,new MovieChainedComparator(new MovieLanguageComparator(),new MovieReleaseDateComparator()));
			
			for(Movie m : movieList)
			{
				System.out.println(m);
			}
		}

	}

}
