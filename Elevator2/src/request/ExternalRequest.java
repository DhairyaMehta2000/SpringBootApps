package request;

import enums.Direction;
import enums.Location;

public class ExternalRequest implements Request {

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	int currentFloor;
	Direction direction;
	Location location;

	public ExternalRequest(Direction direction, Location location, int... arguments) {
		this.currentFloor = arguments[0];
		this.direction = direction;
		this.location = location;
	}

	@Override
	public int getDestinationFloor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
