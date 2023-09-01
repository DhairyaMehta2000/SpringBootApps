package elevator;

import service.Request;

public class ElevatorControlSystem {
    private ElevatorService elevator;

    public ElevatorControlSystem(ElevatorService elevator) {
        this.elevator = elevator;
    }

    public void requestElevator(Request request) {
        elevator.addUpRequest(request);
        elevator.addDownRequest(request);
        elevator.addUpRequest(request);
    }

    public void runElevatorSystem() {
        elevator.processRequests();
    }
}