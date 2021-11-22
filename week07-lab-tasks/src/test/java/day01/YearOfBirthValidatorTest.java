package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YearOfBirthValidatorTest {
	YearOfBirthValidator yearOfBirthValidator = new YearOfBirthValidator();

	@Test
	void isYearOfBirthValidTest() {
		assertTrue(yearOfBirthValidator.isYearOfBirthValid(1901));
	}

	@Test
	void isYearOfBirthValidWithWrongParametersTest() {
		assertThrows(IllegalArgumentException.class,() -> yearOfBirthValidator.isYearOfBirthValid(1900));
	}


}
