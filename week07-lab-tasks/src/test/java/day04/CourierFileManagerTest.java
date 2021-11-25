package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {
	CourierFileManager courierFileManager = new CourierFileManager();
	Courier courier = new Courier();

	@Test
	void createCourierByFileTest() {
		IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> courierFileManager.createCourierByFile(Paths.get("src/test/resources/NOK.txt")));
		assertEquals("Unable to read file", ise.getMessage());
	}

	@Test
	void createCourierByFileTest2() {
		courier = courierFileManager.createCourierByFile(Paths.get("src/test/resources/rides.txt"));
		assertEquals("Ride: dayOfWeek = 2, numberOfRide = 1, rideInKm = 10", courier.getRides().get(2).toString());
	}
}