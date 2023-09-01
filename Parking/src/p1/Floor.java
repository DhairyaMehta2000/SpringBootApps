package p1;

import java.util.List;

public class Floor {
	int floorNo;
	List<Slot> slots;

	public Floor(int floorNo, List<Slot> slots) {
		this.floorNo = floorNo;
		this.slots = slots;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}

}
