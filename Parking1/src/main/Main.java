package main;

import java.util.List;

import interfaces.Floor;
import interfaces.Parking;
import interfaces.Slot;
import services.FloorService;
import services.ParkingControlSystem;
import services.ParkingLotFactory;
import services.ParkingService;
import services.SlotService;

public class Main {

	public static void main(String[] args) {
	
		Slot slot = new SlotService();
		List<Slot>slot2 = slot.createSlotsFloor2();
		List<Slot>slot1 = slot.createSlotsFloor1();
		
		
		Floor floor1 = new FloorService(slot1,1);
		Floor floor2 = new FloorService(slot2,2);
		
		ParkingLotFactory factory = new ParkingLotFactory();
		Parking parkingLot1 = factory.createParkingLot(List.of(floor1,floor2), 1);
		
				
		
		ParkingControlSystem parker = new ParkingControlSystem(parkingLot1);
		
		parker.park("Truck", "Black", 123456);
		
//		parker.unpark(123456);
		
//		parker.park("Bike", "Blue", 334455);
		
		System.out.println(floor1.getSlots().get(0).getVehicleType().getType());
//		System.out.println(floor1.getSlots().get(1).getReg_no());
		
		

	}

}
