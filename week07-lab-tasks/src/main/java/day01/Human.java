package day01;

import java.time.LocalDate;

public class Human {
	private static final int MIN_YEAR = 1900;
	private String name;
	private int yearOfBirth;

//	public Human(String name, int yearOfBirth) {
//		if(!name.contains(" ")) {
//			throw new IllegalArgumentException("Name must not be empty");
//		}

//		if (Math.abs(LocalDate.now().getYear() - yearOfBirth) <= 120 && name!=null && name.indexOf(" ")>0) {
//			this.name = name;
//			this.yearOfBirth = yearOfBirth;
//		} else {
//			throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
//		}

//		if (yearOfBirth <= MIN_YEAR) {
//			throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
//		}
//		this.name = name;
//		this.yearOfBirth = yearOfBirth;
//	}

	public Human(String name, int yearOfBirth) {
		YearOfBirthValidator yobv = new YearOfBirthValidator();
		NameValidator nv = new NameValidator();

		if (yobv.isYearOfBirthValid(yearOfBirth) && nv.isNameValid(name)) {
			this.name = name;
			this.yearOfBirth = yearOfBirth;
		}
	}

	public String getName() {
		return name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}
}
