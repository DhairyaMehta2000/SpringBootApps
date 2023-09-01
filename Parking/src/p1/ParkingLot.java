package p1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
	List<Floor> floors;
	Map<Ticket,String> ticket;
	List<Integer> freeSlotsfloor1;
	List<Integer> freeSlotsfloor2;
	List<Integer> occupiedSlotsfloor1;
	List<Integer> occupiedSlotsfloor2;
	
	
	
	public ParkingLot() {
		floors = new ArrayList<>();
		ticket = new LinkedHashMap<>();
		freeSlotsfloor1 = new ArrayList<>();
		freeSlotsfloor2 = new ArrayList<>();
		
		occupiedSlotsfloor1 = new ArrayList<>();
		occupiedSlotsfloor2 = new ArrayList<>();
		
		Slot slot1 = new Slot(1,"Truck");
		Slot slot2 = new Slot(2,"Bike");
		Slot slot3 = new Slot(3,"Bike");
		Slot slot4 = new Slot(4,"Car");
		Slot slot5 = new Slot(5,"Car");
		Slot slot6 = new Slot(6,"Car");
		
		Slot slot7 = new Slot(7,"Truck");
		Slot slot8 = new Slot(8,"Bike");
		Slot slot9 = new Slot(9,"Bike");
		Slot slot10 = new Slot(10,"Car");
		Slot slot11 = new Slot(11,"Car");
		Slot slot12 = new Slot(12,"Car");
		
		
		Floor floor1 = new Floor(1,List.of(slot1,slot2,slot3,slot4,slot5,slot6));
		
		Floor floor2 = new Floor(2,List.of(slot7,slot8,slot9,slot10,slot11,slot12));
		
		floors.add(floor1);
		floors.add(floor2);
		
	}
	
	final public void park(String type,String color, int reg_no) {
		for(Floor floor:floors) {
			for(Slot slot:floor.getSlots()) {
				if(slot.type==type) {
					if(!slot.isBooked) {
						slot.isBooked = true;
						slot.reg_no = reg_no;
						Ticket newTicket = new Ticket(floor.floorNo,reg_no,slot.num,color);
						ticket.put(newTicket, type);
						return;
					}
				}
			}
		}
	}
	
	final public void unpark(String type, int reg_no) {
		for(Floor floor:floors) {
			for(Slot slot:floor.getSlots()) {
				if(slot.type == type && slot.reg_no == reg_no) {
					slot.isBooked = false;
					Ticket ticket_to_remove;
					for(Map.Entry<Ticket, String> entry: ticket.entrySet()) {
						if(entry.getValue()==type && entry.getKey().reg_no==reg_no) {
							ticket_to_remove = entry.getKey();
							ticket.remove(ticket_to_remove);
							System.out.println("Vehicle "+type + " is unparked "+reg_no);
							return;
						}
					}
				}
			}
		}
		
	}
	
	final public int displayFreeCount(String type, int floor_no) {
		int count=0;
		for(Floor floor:floors) {
			for(Slot slot:floor.getSlots()) {
				if(slot.type==type && slot.isBooked==false && floor.floorNo==floor_no) {
					count++;
				}
			}
		}
		return count;
	}
	
	final public void displayFreeSlots(String type, int floor_no) {
		boolean isAnySlotFree=false;
		for(Floor floor:floors) {
			for(Slot slot:floor.getSlots()) {
				if(slot.type==type && slot.isBooked==false && floor.floorNo == floor_no) {
					isAnySlotFree = true;
					if(floor_no==1) {
						freeSlotsfloor1.add(slot.num);
						System.out.println("Free slots for "+slot.type +" on floor number "+floor.floorNo + " is/are slot nos- " +freeSlotsfloor1);
					}else if(floor_no==2) {
						freeSlotsfloor2.add(slot.num);
						System.out.println("Free slots for "+slot.type +" on floor number "+floor.floorNo + " is/are slot nos- " +freeSlotsfloor2);
					}
					
				}
				
			}
			
		}
		if(isAnySlotFree==false) {
			System.out.println("No free slots avaiable currently");
		}
	}
	
	final public void displayOccupiedSlots(String type, int floor_no) {
		boolean isAnySpotBooked=false;
		
		for(Floor floor:floors) {
			for(Slot slot:floor.getSlots()) {
				if(slot.type==type && slot.isBooked==true && floor.floorNo == floor_no) {
					isAnySpotBooked=true;
					if(floor_no==1) {
						occupiedSlotsfloor1.add(slot.num);
						System.out.println("Free slots for "+slot.type +" on floor number "+floor.floorNo + " is/are slot nos- " +occupiedSlotsfloor1);
					}else if(floor_no==2) {
						occupiedSlotsfloor2.add(slot.num);
						System.out.println("Free slots for "+slot.type +" on floor number "+floor.floorNo + " is/are slot nos- " +occupiedSlotsfloor2);
					}
				}
			}
		}
		if(isAnySpotBooked==false) {
			System.out.println("All slots are available");
		}
	}
	
	final public void printTicket() {
		ticket.forEach((key,value)->System.out.println(key.floor+" "+key.reg_no+" "+value +" "+key.num +" "+key.color));
	}
}
