package services;

import java.util.List;

import interfaces.Slot;
import interfaces.Vehicle;

public class SlotService implements Slot{

	private Vehicle vehicleType;
	private boolean isBooked;
	private int reg_no;

	public SlotService() {}
	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}

	public SlotService(Vehicle vehicleType, int number) {
		super();
		this.vehicleType = vehicleType;
		this.number = number;
		this.isBooked=false;
	}

	public Vehicle getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Vehicle vehicleType) {
		this.vehicleType = vehicleType;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private int number;
	
	public List<Slot> createSlotsFloor1() {
		
		Slot slot1 = new SlotService(new VehicleService("Black", "Truck", 112233), 1);
//		Slot slot2 = new SlotService("Bike", 2);
//		Slot slot3 = new SlotService("Bike", 3);
//		Slot slot4 = new SlotService("Car", 4);
//		Slot slot5 = new SlotService("Car", 5);
//		Slot slot6 = new SlotService("Car", 6);
		return List.of(slot1);
		
	}
	
	public List<Slot> createSlotsFloor2() {
		Slot slot7 = new SlotService(new VehicleService("Black", "Truck", 112233), 7);
//		Slot slot8 = new SlotService("Bike", 8);
//		Slot slot9 = new SlotService("Bike", 9);
//		Slot slot10 = new SlotService("Car",10);
//		Slot slot11 = new SlotService("Car", 11);
//		Slot slot12 = new SlotService("Car", 12);
		
		return List.of(slot7);
	}
	@Override
	public void setVehicleType(String vehicleType) {
		// TODO Auto-generated method stub
		
	}

}
