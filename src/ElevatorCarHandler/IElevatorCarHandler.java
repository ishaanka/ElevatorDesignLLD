package ElevatorCarHandler;

import java.util.PriorityQueue;
import java.util.Queue;
import ElevatorCar.IElevatorCar;

public abstract class IElevatorCarHandler {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    Queue<Integer> pendingRequest;
    IElevatorCar elevatorCar;

    public abstract void moveElevator();

    public abstract void addRequest(int floorId);

}
