package p1;

import java.util.PriorityQueue; 

public class Elevator_one {
	int currentFloor;
	Direction direction;
	PriorityQueue<Request> upQueue;
	PriorityQueue<Request> downQueue;

	public Elevator_one(int currentFloor) {
		this.direction = Direction.IDLE;
		this.currentFloor = 0;
		upQueue = new PriorityQueue<>((a, b) -> a.destination - b.destination);// minn heap
		downQueue = new PriorityQueue<>((a, b) -> b.destination - a.destination);// max heap
	}

	public void addRequests() {
		Request upRequest1 = new Request(this.currentFloor,Direction.UP,Location.OUTSIDE);
		Request upRequest2 = new Request(0,4,Direction.UP,Location.INSIDE);
		Request upRequest3 = new Request(1,Direction.UP,Location.OUTSIDE);
		Request upRequest4 = new Request(1,5,Direction.UP,Location.INSIDE);
		
		Request downRequest1 = new Request(5,Direction.DOWN,Location.OUTSIDE);
		Request downRequest2 = new Request(5,3,Direction.DOWN,Location.INSIDE);
		Request downRequest3 = new Request(2,Direction.DOWN,Location.OUTSIDE);
		Request downRequest4 = new Request(2,0,Direction.DOWN,Location.INSIDE);
		
		sendUpRequest(upRequest1);
		sendUpRequest(upRequest2);
		sendDownRequest(downRequest1);
		sendDownRequest(downRequest2);
		sendUpRequest(upRequest3);
		sendUpRequest(upRequest4);
		
		
		sendDownRequest(downRequest3);
		sendDownRequest(downRequest4);
//		System.out.println(upQueue.size());
//		System.out.println(downQueue.size());
	}
	public void sendDownRequest(Request downRequest) {
	    if (downRequest.location == Location.OUTSIDE && downRequest.currentPos != this.currentFloor) {
	        downQueue.offer(new Request(this.currentFloor, downRequest.currentPos, Direction.DOWN, Location.OUTSIDE));
	        System.out.println("Initialized a request to pick someone up at floor " + downRequest.currentPos);
	    } else if (downRequest.location == Location.INSIDE) {
	        downQueue.offer(downRequest);
	    }
	}


	public void sendUpRequest(Request upRequest) {
		if (upRequest.location == Location.OUTSIDE && upRequest.currentPos!=this.currentFloor) {
			upQueue.offer(new Request(this.currentFloor, upRequest.currentPos, Direction.UP, Location.OUTSIDE));
			System.out.println("Initialsed a request to pickup some at floor " +upRequest.currentPos);
		}else if(upRequest.location == Location.INSIDE) {
			upQueue.offer(upRequest);
		}
		
	}

	

	public void processUpRequests() {
		while (!upQueue.isEmpty()) {
			Request currentRequest = upQueue.poll();
			System.out
					.println("Processed an Up Request from " + this.currentFloor + " to " + currentRequest.destination +" from "+currentRequest.location);
			this.currentFloor = currentRequest.destination;

		}

	}

	public void processDownRequests() {
		while (!downQueue.isEmpty()) {
			Request currentRequest = downQueue.poll();
			System.out.println(
					"Processed a Down Request from " + this.currentFloor + " to " + currentRequest.destination+" from "+currentRequest.location);
			this.currentFloor = currentRequest.destination;
			
		}
	}

	public void processRequests() {
		if (this.direction == Direction.UP || this.direction == Direction.IDLE) {
			processUpRequests();
			processDownRequests();
		} else {
			processDownRequests();
			processUpRequests();
		}

	}

	public void run() {
		while (!upQueue.isEmpty() || !downQueue.isEmpty()) {
			processRequests();
		}
		System.out.println("Completed all Requests.");
		this.direction = Direction.IDLE;
	}
}
