package day02.day02;

import day02.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

	private List<Movie> movies = new ArrayList<>();

	public MovieService(Path path) {
		//Beolvas
		//Darabol
		//Raktároz

		try {
			List<String> lines = Files.readAllLines(path);
			fillListWithMoview(lines);
		} catch (IOException e) {
			throw new IllegalStateException("Cannot read file", e);
		}
	}

	private void fillListWithMoview(List<String> lines) {
		for (String s : lines) {
			String[] tmp = s.split(";");
			movies.add(new Movie(tmp[0], Integer.parseInt(tmp[1]), tmp[2]));
		}
	}

	public List<Movie> getMovies() {
		return movies;
	}
}
