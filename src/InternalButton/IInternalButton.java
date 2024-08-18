package InternalButton;

import ElevatorCarHandler.IElevatorCarHandler;

public abstract class IInternalButton {
    public abstract void pressButton(int floorId, IElevatorCarHandler elevatorCarHandler);
    public int buttonNumber;
    public InternalButtonDispatcher dispatcher;
}
