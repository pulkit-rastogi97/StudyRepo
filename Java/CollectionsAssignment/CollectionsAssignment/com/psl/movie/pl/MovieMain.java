package com.psl.movie.pl;

import java.util.List;
import java.util.Scanner;

import com.psl.movie.bean.Movie;
import com.psl.movie.exception.MovieException;
import com.psl.movie.service.MovieService;
import com.psl.movie.service.MovieServiceI;

public class MovieMain {

	public static void main(String[] args) {
		MovieServiceI msi = new MovieService();
		Scanner sc = new Scanner(System.in);
		List<Movie> movieList=null;
		System.out.println("\t**********************************************************");
		System.out.println("\t**********WELCOME TO MOVIE MANAGEMENT SYSTEM**************");
		System.out.println("\t**********************************************************");
		int ch = 0;
		do{
		System.out.println("What would you like to do ? ");
		System.out.println("1. Create Movie List ");
		System.out.println("2. Display Movie List ");
		System.out.println("3. Exit ");
		ch = sc.nextInt();
		try{
		switch(ch)
		{
			case 1: movieList = msi.createMovieList();
					break;
			case 2: int ch1=0;
					do{
					System.out.println("\t**********************************************************");
					System.out.println("How would you like to sort the movie list ? ");
					System.out.println("1. Sort By Language ");
					System.out.println("2. Sort By Duration ");
					System.out.println("3. Sort By Language & Release Date ");
					System.out.println("4. Exit ");
					ch1 = sc.nextInt();
					switch(ch1)
					{
						case 1: msi.sortByLanguage(movieList);
								break;
						case 2: msi.sortByDuration(movieList);
								break;
						case 3: msi.SortByLanguageAndReleaseDate(movieList);
								break;
						case 4: ch1 = 5;
								break;
						default:System.out.println("Invalid Choice !! ");
					}
					}while(ch1>0 && ch1<=3);
					break;
			case 3: ch = 5;
					break;
			default:System.out.println("Invalid Choice !! ");					
		}
	}catch(MovieException e)
	{
		System.out.println(e.getMessage());
		}

}while(ch>0 && ch<=2);
		sc.close();
	}
}
