package Display;

import ElevatorCarHandler.IElevatorCarHandler;
import InternalButton.IInternalButton;

import java.util.List;

public abstract class IDisplay {
    public Direction direction;
    public List<IInternalButton> buttons;
    public abstract void interactDisplay(int floorId, IElevatorCarHandler carHandler, IInternalButton button);
}
