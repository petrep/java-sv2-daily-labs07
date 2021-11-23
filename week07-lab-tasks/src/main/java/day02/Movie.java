package day02;

public class Movie {
	private String movieName;
	private int yearOfProduction;
	private String director;

	public Movie(String movieName, int yearOfProduction, String director) {
		this.movieName = movieName;
		this.yearOfProduction = yearOfProduction;
		this.director = director;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public String getDirector() {
		return director;
	}
}
