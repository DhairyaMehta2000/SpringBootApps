package p1;

public class Parker {
	ParkingLot p;
	
	public Parker() {
		p = new ParkingLot();
	}
	
	public final void park() {
		p.park("Truck","Orange",12345);
		p.park("Bike","Black",12345);
		p.park("Bike","Blue",12345);
		p.park("Bike","Yellow",12345);
		p.park("Bike","Red",12345);
		p.park("Bike","Green",12345);
		p.park("Car","White",12345);
		p.park("Car", "Blue", 5678);
		p.park("Car", "Black", 1234568);
		p.park("Car", "Black", 1234568);
	}
	
	public final void unpark(String type, int reg_no) {
		p.unpark(type, reg_no);
	}
	
	public final void printTickets() {
		p.printTicket();
	}
	
	public int displayFreeCount(String type, int floor_no) {
		return p.displayFreeCount(type, floor_no);
	}
	
	public final void displayFreeSlots(String type, int floor_no) {
		p.displayFreeSlots(type, floor_no);
	}
	
	public final void displayOccupiedSlots(String type, int floor_no) {
		p.displayOccupiedSlots(type, floor_no);
	}

}
