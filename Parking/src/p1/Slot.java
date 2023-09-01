package p1;

public class Slot {
	Vehicle vehicle;
	boolean isBooked;
	String type;
	int num;
	int reg_no;

	public Slot(int num, String type) {
		this.num = num;
		this.type = type;
		this.isBooked = false;
		this.reg_no = 0;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
