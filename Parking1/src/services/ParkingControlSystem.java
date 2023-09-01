package services;

import interfaces.Parking;

public class ParkingControlSystem {

	private Parking parkingLot;

	public Parking getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(Parking parkingLot) {
		this.parkingLot = parkingLot;
	}

	public ParkingControlSystem(Parking parkingLot) {
		super();
		this.parkingLot = parkingLot;
	}
	
	public void park(String type, String color, int reg_no) {
		parkingLot.park(type, color, reg_no);
	}
	
	public void unpark(int reg_no) {
		parkingLot.unpark(reg_no);
	};
}
