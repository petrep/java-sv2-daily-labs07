package day04;

public class Ride {
	private int dayOfWeek;
	private int numberOfRide;
	private int rideInKm;

	public Ride(int dayOfWeek, int numberOfRide, int rideInKm) {
		this.dayOfWeek = dayOfWeek;
		this.numberOfRide = numberOfRide;
		this.rideInKm = rideInKm;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public int getNumberOfRide() {
		return numberOfRide;
	}

	public int getRideInKm() {
		return rideInKm;
	}

	@Override
	public String toString() {
		return "Ride: " +
				  "dayOfWeek = " + dayOfWeek +
				  ", numberOfRide = " + numberOfRide +
				  ", rideInKm = " + rideInKm;
	}
}
