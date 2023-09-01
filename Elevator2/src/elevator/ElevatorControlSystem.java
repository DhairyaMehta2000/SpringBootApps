package elevator;

public class ElevatorControlSystem {
	private Elevator elevator;
	
	public ElevatorControlSystem(Elevator elevator) {
		this.elevator = elevator;
	}
	
	public void addRequests() {
		elevator.addRequests();
		
	}
	
	public void run() {
		elevator.run();
	}
}
