package p1;

import java.util.PriorityQueue;

public class Elevator {
	Request request;
	PriorityQueue<Request> upQueue;
	PriorityQueue<Request> downQueue;
	int currentFloor;
	Direction direction;

	public Elevator(int currentFloor) {
		this.currentFloor = currentFloor;
		upQueue = new PriorityQueue<>((a, b) -> a.destination - b.destination);
		downQueue = new PriorityQueue<>((a, b) -> b.destination - a.destination);

	}
	
	public void sendUpRequest(Request upRequest) {
		if(upRequest.location==Location.OUTSIDE) {
			upQueue.offer(new Request(this.currentFloor,upRequest.currentPos,Direction.UP,Location.OUTSIDE));
		}
		upQueue.offer(upRequest);
	}
	
	public void sendDownRequest(Request downRequest) {
		if(downRequest.location==Location.OUTSIDE) {
			downQueue.offer(new Request(this.currentFloor,downRequest.currentPos,Direction.DOWN,Location.OUTSIDE));
		}
		downQueue.offer(downRequest);
		
	}

	public void processUpRequests() {
        while (!upQueue.isEmpty()) {
            Request upRequest = upQueue.poll();
            this.currentFloor = upRequest.destination;
            System.out.println("Processing up requests. Elevator stopped at floor " + this.currentFloor + ".");
        }

	}

	public void processDownRequests() {
		while (!downQueue.isEmpty()) {
            Request downRequest = downQueue.poll();
            this.currentFloor = downRequest.destination;
            System.out.println("Processing down requests. Elevator stopped at floor " + this.currentFloor + ".");
        }
	}

	public void addRequests() {
		Request upRequest1 = new Request(currentFloor, 4, Direction.UP, Location.OUTSIDE);
		Request upRequest2 = new Request(1, 2, Direction.UP, Location.OUTSIDE);
		Request upRequest3 = new Request(3, 5, Direction.UP, Location.OUTSIDE);
		Request upRequest4 = new Request(1,3,Direction.UP,Location.INSIDE);

		Request downRequest1 = new Request(5, 1, Direction.DOWN, Location.INSIDE);
		Request downRequest2 = new Request(4, 3, Direction.DOWN, Location.INSIDE);
		Request downRequest3 = new Request(3, 0, Direction.DOWN, Location.OUTSIDE);

		
		upQueue.add(upRequest1);
		sendUpRequest(upRequest1);
		sendUpRequest(upRequest2);
		sendUpRequest(upRequest3);
		sendUpRequest(upRequest4);
		

		sendDownRequest(downRequest1);
		sendDownRequest(downRequest2);
		sendDownRequest(downRequest3);
		
		sendUpRequest(upRequest2);
		sendUpRequest(upRequest1);
		sendDownRequest(downRequest2);
	}

	public void run() {
		while (!upQueue.isEmpty() || !downQueue.isEmpty()) {
			processUpRequests();
			processDownRequests();
		}
		System.out.println("Finished all Requests");
		this.direction = Direction.IDLE;
	}
}
