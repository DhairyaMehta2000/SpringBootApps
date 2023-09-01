package elevator;

import java.util.PriorityQueue;

import enums.Direction;
import enums.Location;
import service.Request;

public class Elevator implements ElevatorService {
    private int currentFloor;
    private Direction direction;
    private PriorityQueue<Request> upQueue;
    private PriorityQueue<Request> downQueue;
    
    public Elevator(int currentFloor) {
    	upQueue=new PriorityQueue<>((a,b)->a.destination-b.destination);
    	downQueue = new PriorityQueue<>((a,b)->b.destination-a.destination);
    	this.direction=direction.IDLE;
    	this.currentFloor=currentFloor;
    }
	@Override
	public void addUpRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.location==Location.OUTSIDE && this.currentFloor!=request.currentPos) {
			upQueue.offer(new Request(this.currentFloor,request.currentPos,direction.UP,Location.OUTSIDE));
		}else if(request.location==Location.INSIDE) {
			upQueue.offer(request);
		}
		
	}
	@Override
	public void addDownRequest(Request request) {
		if(request.location==Location.OUTSIDE && this.currentFloor!=request.currentPos) {
			downQueue.offer(new Request(this.currentFloor, request.currentPos, direction.DOWN,Location.OUTSIDE));
			
		}else if(request.location==Location.INSIDE) {
			downQueue.offer(request);
		}
		
	}
	@Override
	public void processUpRequests() {
		while(!upQueue.isEmpty()) {
			Request currentRequest = upQueue.poll();
			System.out.println("Processed an Up Request from " + this.currentFloor + " to " + currentRequest.destination +" from "+currentRequest.location);
			this.currentFloor = currentRequest.destination;
		}
		
	}
	@Override
	public void processDownRequests() {
		while(!downQueue.isEmpty()) {
			Request currentRequest = downQueue.poll();
			System.out.println("Process a down request from "+this.currentFloor + " to "+currentRequest.destination);
			this.currentFloor = currentRequest.destination;
		}
		
	}
	@Override
	public void processRequests() {
		while(!upQueue.isEmpty() && !downQueue.isEmpty() ) {
			processUpRequests();
			processDownRequests();
		}
		
	}

    
}