import java.util.PriorityQueue;

public class Elevator {

    int currentFloor;
    Direction direction;
    PriorityQueue<Request> upQueue;
    PriorityQueue<Request> downQueue;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;

        this.direction = Direction.IDLE;

        // use default, which is a min heap
        upQueue = new PriorityQueue<>((a, b) -> a.desiredFloor - b.desiredFloor);

        // use a max heap
        downQueue =  new PriorityQueue<>((a, b) -> b.desiredFloor - a.desiredFloor);
    }

    public void sendUpRequest(Request upRequest) {
        if (upRequest.location == Location.OUTSIDE_ELEVATOR) {
            // First, handle the pickup request to stop at the requester's current floor
            Request pickupRequest = new Request(this.currentFloor,
                upRequest.currentFloor,
                Direction.UP,
                Location.OUTSIDE_ELEVATOR);

            upQueue.offer(pickupRequest);
            
            System.out.println("Append up pickup request going to floor " + upRequest.currentFloor + ".");
        }

        // Then, handle the desired floor request
        upQueue.offer(upRequest);
        System.out.println("Append up request going to floor " + upRequest.desiredFloor +"from " +upRequest.currentFloor+" .");
    }


    public void sendDownRequest(Request downRequest) {
        // Similar to the sendUpRequest logic
        if (downRequest.location == Location.OUTSIDE_ELEVATOR) {
            downQueue.offer(new Request(this.currentFloor,
                downRequest.currentFloor,
                Direction.DOWN,
                Location.OUTSIDE_ELEVATOR));

            System.out.println("Append down request inside if going to floor " + downRequest.currentFloor + ".");
        }

        // Go to the desired floor
        downQueue.offer(downRequest);

        System.out.println("Append down request going to floor " + downRequest.desiredFloor + ".");
    }

    public void run() {
        while (!upQueue.isEmpty() || !downQueue.isEmpty()) {
            processRequests();
        }

        System.out.println("Finished all requests.");
        this.direction = Direction.IDLE;
    }

    private void processRequests() {
        processUpRequest();
        processDownRequest();

        // Update direction based on remaining requests
        if (!upQueue.isEmpty()) {
            this.direction = Direction.UP;
        } else if (!downQueue.isEmpty()) {
            this.direction = Direction.DOWN;
        } else {
            this.direction = Direction.IDLE;
        }
    }


    private void processUpRequest() {
        while (!upQueue.isEmpty()) {
            Request upRequest = upQueue.poll();
            // Communicate with hardware
            this.currentFloor = upRequest.desiredFloor;
            System.out.println("Processing up requests. Elevator stopped at floor " + this.currentFloor + ".");
        }
//        if (!downQueue.isEmpty()) {
//            this.direction = Direction.DOWN;
//        } else {
//            this.direction = Direction.IDLE;
//        }
    }

    private void processDownRequest() {
        while (!downQueue.isEmpty()) {
            Request downRequest = downQueue.poll();
            // Communicate with hardware
            this.currentFloor = downRequest.desiredFloor;
            System.out.println("Processing down requests. Elevator stopped at floor " + this.currentFloor + ".");
        }
//        if (!upQueue.isEmpty()) {
//            this.direction = Direction.UP;
//        } else {
//            this.direction = Direction.IDLE;
//        }
    }


    public static void main(String[] args) {
        Elevator elevator = new Elevator(0);
        Request upRequest4 = new Request(1,4,Direction.UP,Location.OUTSIDE_ELEVATOR);
        Request upRequest3 = new Request(elevator.currentFloor,2 ,Direction.UP,Location.OUTSIDE_ELEVATOR);
        Request upRequest1 = new Request(3, 5, Direction.UP, Location.OUTSIDE_ELEVATOR);
        
        Request upRequest2 = new Request(elevator.currentFloor, 3, Direction.UP, Location.INSIDE_ELEVATOR);

        Request downRequest1 = new Request(elevator.currentFloor, 1, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest2 = new Request(elevator.currentFloor, 2, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest3 = new Request(4, 0, Direction.DOWN, Location.OUTSIDE_ELEVATOR);

        // Two people inside of the elevator pressed button to go up to floor 5 and 3.
        elevator.sendUpRequest(upRequest3);
        elevator.sendUpRequest(upRequest1);
        elevator.sendUpRequest(upRequest2);
        elevator.sendUpRequest(upRequest4);
        
        // One person outside of the elevator at floor 4 pressed button to go down to floor 0
        elevator.sendDownRequest(downRequest3);

        // Two person inside of the elevator pressed button to go down to floor 2 and 1.
        elevator.sendDownRequest(downRequest1);
        elevator.sendDownRequest(downRequest2);


        elevator.run();
    }

}
