package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourierTest {
	Courier courier = new Courier();

	@Test
	void addRideTest() {
		Ride ride = new Ride(1,1,12);
		Ride ride2 = new Ride(1,2,11);
		Ride ride3 = new Ride(2,1,12);
		Ride ride4 = new Ride(2,2,4);
		Ride ride5 = new Ride(3,1,5);
		Ride ride6 = new Ride(5,1,7);

		courier.addRide(ride);
		courier.addRide(ride2);
		courier.addRide(ride3);
		courier.addRide(ride4);
		courier.addRide(ride5);
		courier.addRide(ride6);

		assertEquals(6,courier.getRides().size());
	}

	@Test
	void addRideTest2(){
		Ride ride = new Ride(1,1,12);
		Ride ride2 = new Ride(1,3,11);

		courier.addRide(ride);

		assertThrows(IllegalArgumentException.class, ()-> courier.addRide(ride2));
	}

	@Test
	void addRideTest3(){
		Ride ride = new Ride(3,1,12);
		Ride ride2 = new Ride(2,1,11);

		courier.addRide(ride);

		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> courier.addRide(ride2));
		assertEquals("Invalid value of day", iae.getMessage());
	}
}