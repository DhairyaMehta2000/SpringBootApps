package p1;

public class Request {
	int currentPos;
	int destination;
	Direction direction;
	Location location;

//	for inside
	public Request(int currentPos, int destination, Direction direction, Location location) {
		this.currentPos = currentPos;
		this.destination = destination;
		this.direction = direction;
		this.location = location;
	}
//	for otuside
	public Request(int currPos,Direction direction, Location location) {
		this.currentPos=currPos;
		this.direction=direction;
		this.location=location;
	}
}
