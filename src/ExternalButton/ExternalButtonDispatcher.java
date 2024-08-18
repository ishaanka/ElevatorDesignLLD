package ExternalButton;

import ElevatorCarHandler.IElevatorCarHandler;

import java.util.ArrayList;
import java.util.List;

public class ExternalButtonDispatcher {
    List<IElevatorCarHandler> listElevators;
    public ExternalButtonDispatcher(List<IElevatorCarHandler> l1){
        this.listElevators = l1;
    }
    public void handleRequest(int floorId) {
        // Handle outside elevator assignee logic, like which elevator should be assigned
        // like oddEven floors or half floors on one and half on other
        // l1[0].addRequest(floorId);
    }
}
