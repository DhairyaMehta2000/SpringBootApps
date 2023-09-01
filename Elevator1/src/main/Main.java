package main;

import elevator.Elevator;
import elevator.ElevatorControlSystem;
import elevator.ElevatorService;
import enums.Direction;
import enums.Location;
import service.Request;

public class Main {

	public static void main(String[] args) {
		ElevatorService elevator = new Elevator(0);
        ElevatorControlSystem controlSystem = new ElevatorControlSystem(elevator);

        // Add elevator requests
        Request request1 = new Request(3, Direction.UP, Location.OUTSIDE);
        Request request2 = new Request(1, Direction.DOWN, Location.OUTSIDE);
        Request request3 = new Request(5, Direction.DOWN, Location.OUTSIDE);
        Request request4 = new Request(1,4,Direction.UP,Location.INSIDE);
        Request request5 = new Request(5,2,Direction.DOWN,Location.INSIDE);

        controlSystem.requestElevator(request1);
        controlSystem.requestElevator(request2);
        controlSystem.requestElevator(request3);
        controlSystem.requestElevator(request4);
        controlSystem.requestElevator(request5);

        // Process elevator requests
        controlSystem.runElevatorSystem();

	}

}
