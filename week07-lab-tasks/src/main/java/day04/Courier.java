package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
	private List<Ride> rides = new ArrayList<>();

	public void addRide(Ride ride){
		if(isTheDayOk(ride)){
			if(isTheRideOk(ride)){
				rides.add(ride);
			}
			else{
				throw new IllegalArgumentException("Invalid number of rides");
			}
		}
		else{
			throw new IllegalArgumentException("Invalid value of day");
		}
	}

	public boolean isTheDayOk(Ride ride){
		boolean bool = true;
		if(rides.isEmpty()){
			bool = true;
		}
		else if(rides.get(rides.size()-1).getDayOfWeek() <= ride.getDayOfWeek()){
			bool = true;
		}
		else{
			bool = false;
		}
		return bool;
	}

	public boolean isTheRideOk(Ride ride){
		boolean bool = true;
		if(rides.isEmpty()){
			bool = true;
		}
		else if(rides.get(rides.size()-1).getDayOfWeek() == ride.getDayOfWeek()){
			if(rides.get(rides.size()-1).getNumberOfRide() + 1 != ride.getNumberOfRide()){
				bool = false;
			}
		}else if(ride.getNumberOfRide() != 1){
			bool = false;
		}
		return bool;
	}

	public List<Ride> getRides() {
		return rides;
	}
}
