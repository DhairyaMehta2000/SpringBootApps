package interfaces;

import java.util.List;

public interface Floor {
	List<Slot> getSlots();
	void setSlots(List<Slot> slots);
	int getFloorNumber();
	void setFloorNumber(int floorNumber);
	

}
