package p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parker parker  = new Parker();
		parker.park();
//		parker.printTickets();
//		parker.unpark("Truck",12345);
//		parker.printTickets();
		
//		System.out.println(parker.displayFreeCount("Car",2));
		
//		parker.displayFreeSlots("Truck", 1);
//		
//		parker.displayOccupiedSlots("Truck", 1);
//		
		parker.displayOccupiedSlots("Car",1);
		parker.displayOccupiedSlots("Car",2);

//		
//		
		
	}
/*
 * # 3 types of vehicle - truck, bike, car
 * floors - 2 floor.
 * per floor 6 slot.
 * each slot has 1 type of vehicle
 * floor - 1st slot is for truck, 2nd and 3rd slot is for bike, 4-6 slots are for cars.
 * 
 * each vehicle has reg_no, color, type of vehicle.
 * each slot has vehicle_type, slot number.
 * each floor has List<Slot>
 * Each parking lot has List<Floors>
 * 
 * park("Car","blue",reg_no);
 * 
 * unpark("Car",reg_no);
 * 
 * displayFreeCount("Car",2) - returns number of free slots for a particular vehicle type in a particular floor.
 * 
 * displayFreeSlots("Car",2) - returns the particular slot free for a particular vehicle type in a floor.
 * 
 * displayOccupiedSlots("Car",2) - returns the slots free for a floor and its vehicle type
 */
}
