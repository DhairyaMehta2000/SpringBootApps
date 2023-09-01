package elevator;

import service.Request;

public interface ElevatorService {
	void addUpRequest(Request request);
	
	void addDownRequest(Request request);
	
	void processUpRequests();
	
	void processDownRequests();

	void processRequests();
}
