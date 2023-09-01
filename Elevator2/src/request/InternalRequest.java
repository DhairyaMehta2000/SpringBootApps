package request;

import enums.Direction;
import enums.Location;

public class InternalRequest implements Request {

	public int currentFloor;
	public int destinationFloor;
	Direction direction;
	Location location;

	public InternalRequest(Direction direction, Location location, int...arguments ) {
		this.currentFloor = arguments[0];
		this.destinationFloor = arguments[1];
		this.direction = direction;
		this.location = location;
	}

	@Override
	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getDestinationFloor() {
		return destinationFloor;
	}

	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
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

	

	
	
	


}
