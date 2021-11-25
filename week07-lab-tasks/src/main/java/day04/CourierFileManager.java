package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {
	public Courier createCourierByFile(Path path){
		Courier courier = new Courier();
		try {
			List<String> lines = Files.readAllLines(path);
			for(String s: lines){
				String[] stringArray = s.split(" ");
				Ride ride = new Ride(Integer.parseInt(stringArray[0]),Integer.parseInt(stringArray[1]),
						  Integer.parseInt(stringArray[2]));
				courier.addRide(ride);
			}
		}catch(IOException ioe){
			throw new IllegalStateException("Unable to read file", ioe);
		}
		return courier;
	}
}
