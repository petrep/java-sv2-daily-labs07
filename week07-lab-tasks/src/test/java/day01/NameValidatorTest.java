package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameValidatorTest {
	NameValidator nv = new NameValidator();

	@Test
	public void isNameValidTest() {
		boolean result = nv.isNameValid("John Doe");

		assertTrue(result);
	}

	@Test
	void isNameValidWithNullTest() {
	IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nv.isNameValid(null));
	assertEquals("Name is invalid!", iae.getMessage());
	}

	@Test
	void isNameValidWithWrongNameTest() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nv.isNameValid("John"));
		assertEquals("Name is invalid!", iae.getMessage());
	}
}
