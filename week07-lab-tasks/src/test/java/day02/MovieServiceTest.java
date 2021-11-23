package day02;

import day02.day02.MovieService;
import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

	@Test
	void testFillMovies() {
		MovieService movieService = new MovieService(Path.of("src/test/resources/movies.csv"));

		assertEquals(5, movieService.getMovies().size());

	}

	@Test
	void testFillMoviesFileNotFound() {
		IllegalStateException ise = assertThrows(IllegalStateException.class, () -> new MovieService(Path.of("movies.txt)")));

		assertEquals("Cannot read file", ise.getMessage());
		assertEquals(NoSuchFileException.class, ise.getCause().getClass());

	}



}
