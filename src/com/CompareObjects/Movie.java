package com.CompareObjects;

public class Movie implements Comparable<Movie> {
	private double rating;
    private String name;
    private int year;
    
    @Override
	public int compareTo(Movie m) {
    	int yearComp = Integer.compare(this.getYear(), m.getYear());
		if (yearComp != 0) {
			return yearComp;
		}
		
		int nameComp = this.getName().compareTo(m.getName());
		if (nameComp != 0) {
			return nameComp;
		}
		
		if (this.getRating() < m.getRating()) {
			return -1;
		}
		if (this.getRating() > m.getRating()) {
			return 1;
		}
		
		return 0;
	}
    
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
    
}
