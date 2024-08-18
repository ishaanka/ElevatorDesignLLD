package InternalButton;


import ElevatorCarHandler.IElevatorCarHandler;

public class FirstInternalButton extends IInternalButton {
    public FirstInternalButton(InternalButtonDispatcher obj) {
        this.buttonNumber =1;
        this.dispatcher = obj;
    }

    @Override
    public void pressButton(int floorId, IElevatorCarHandler elevatorCarHandler) {
         dispatcher.handleRequest(floorId, elevatorCarHandler);
    }
}
