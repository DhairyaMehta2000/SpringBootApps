package p1;

public class Vehicle {

	final String color;
	final String type;
	final int reg_no;
	
	public Vehicle(String type,String color,int reg_no) {
		this.color=color;
		this.type=type;
		this.reg_no=reg_no;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public int getReg_no() {
		return reg_no;
	}
	
	
}
