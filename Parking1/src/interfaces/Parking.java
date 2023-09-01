package interfaces;

import java.util.List;

public interface Parking {

	List<Floor> getFloors();
	void setFloors(List<Floor> floors);
	int getId();
	void setId(int id);
	void unpark(int reg_no);
	void park( String type, String color, int reg_no);
}
