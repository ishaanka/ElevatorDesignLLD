package InternalButton;

import ElevatorCarHandler.IElevatorCarHandler;

import java.util.List;

public class InternalButtonDispatcher {
    List<IElevatorCarHandler> listElevators;

    public InternalButtonDispatcher(List<IElevatorCarHandler> elevatorCarHandlers) {
        this.listElevators = elevatorCarHandlers;
    }

    public void handleRequest(int floorId, IElevatorCarHandler elevatorCarHandler) {
        // elevatorCarHandler.addRequest();
    }
}
