package ElevatorCarHandler;

import ElevatorCar.IElevatorCar;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class ElevatorCarHandler extends IElevatorCarHandler {
    public ElevatorCarHandler(IElevatorCar elevator ) {
      this.elevatorCar = elevator;
      this.minHeap = new PriorityQueue<>();
      this.maxHeap = new PriorityQueue<>((a,b) -> b-a);
      this.pendingRequest = new LinkedList<>();
    }

    @Override
    public void moveElevator() {
        // We have to write logic for seek and look.
        // This will process request in minHeap and maxHeap based on elevator direction
    }

    @Override
    public void addRequest(int floorId) {
        // Based on elevator's direction and status we will be adding request in minheap maxheap or pending request
    }
}
