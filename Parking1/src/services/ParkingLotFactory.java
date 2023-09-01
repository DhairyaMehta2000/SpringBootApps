package services;

import java.util.List;

import interfaces.Floor;
import interfaces.Parking;

public class ParkingLotFactory {

	public Parking createParkingLot(List<Floor>floors,int id) {
		return new ParkingService(floors, id);
	}
}
