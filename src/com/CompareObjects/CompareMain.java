package com.CompareObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareMain {

	public static void main(String[] args) {
		//Comparable Interface
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Force Awakens", 8.3, 2015));
		movies.add(new Movie("Star Wars", 8.7, 1977));
		movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
		movies.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		Collections.sort(movies);
		System.out.println("Comparable interface");
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
		System.out.println("");
		
		
		//Comparator - By Name
		Collections.sort(movies, NameComparator);
		System.out.println("Comparator interface - By Name");
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
		System.out.println("");
		
		//Comparator - By Year
		Collections.sort(movies, YearComparator);
		System.out.println("Comparator interface - By Year");
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
		System.out.println("");
		
		//Comparator - By Year
		Collections.sort(movies, RatingComparator);
		System.out.println("Comparator interface - By Rating");
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
		System.out.println("");
		
		//Comparator - By All
		Collections.sort(movies, AllComparator);
		System.out.println("Comparator interface - By All");
		for (Movie movie : movies) {
			System.out.println(movie.toString());
		}
		System.out.println("");
		
	}
	
	public static Comparator<Movie> YearComparator = new Comparator<Movie>() {
		@Override
		public int compare(Movie m1, Movie m2) {
			return m1.getYear() - m2.getYear();
		}
    };
    
    public static Comparator<Movie> NameComparator = new Comparator<Movie>() {
		@Override
		public int compare(Movie m1, Movie m2) {
			return m1.getName().compareTo(m2.getName());
		}
    };
    
    public static Comparator<Movie> RatingComparator = new Comparator<Movie>() {
		@Override
		public int compare(Movie m1, Movie m2) {
			if (m1.getRating() < m2.getRating()) {
				return -1;
			}
			
			if (m1.getRating() > m2.getRating()) {
				return 1;
			}
			
			return 0;
		}
    };
    
    public static Comparator<Movie> AllComparator = new Comparator<Movie>() {
    	@Override
    	public int compare(Movie m1, Movie m2) {
    		int yearComp = Integer.compare(m1.getYear(), m2.getYear());
    		if (yearComp != 0) {
    			return yearComp;
    		}
    		
    		int nameComp = m1.getName().compareTo(m2.getName());
    		if (nameComp != 0) {
    			return nameComp;
    		}
    		
    		if (m1.getRating() < m2.getRating()) {
    			return -1;
    		}
    		if (m1.getRating() > m2.getRating()) {
    			return 1;
    		}
    		
    		return 0;
    	}
    };

}
