package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
	@Test
	void createHumanWithWrongYear() {
		assertThrows(IllegalArgumentException.class, () -> new Human("John Doe", 1900));
	}
}
