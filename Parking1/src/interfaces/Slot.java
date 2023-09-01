package interfaces;

import java.util.List;

public interface Slot {
	Vehicle getVehicleType();

	void setVehicleType(String vehicleType);

	boolean isBooked();

	void setBooked(boolean isBooked);

	int getNumber();

	void setNumber(int number);
	
	int getReg_no();
	
	void setReg_no(int reg_no);
	
	List<Slot> createSlotsFloor2();
	
	List<Slot> createSlotsFloor1();
}
