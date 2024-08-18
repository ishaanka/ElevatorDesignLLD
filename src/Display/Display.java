package Display;

import ElevatorCarHandler.IElevatorCarHandler;
import InternalButton.IInternalButton;

import java.util.List;

public class Display extends IDisplay {
    public Display(List<IInternalButton> l1) {
        this.buttons = l1;
    }

    public void interactDisplay(int floorId, IElevatorCarHandler carHandler, IInternalButton button) {
        button.pressButton(floorId, carHandler);
    }
}
