package day01;

public class NameValidator {

	public boolean isNameValid(String name) {
		if (!(name != null && name.indexOf(" ") > 0)) {
			throw new IllegalArgumentException("Name is invalid!");
		}
		return true;
	}

}
