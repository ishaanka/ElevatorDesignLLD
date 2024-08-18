package ElevatorCar;

import Display.Direction;
import Display.IDisplay;
import ElevatorCarHandler.IElevatorCarHandler;

public abstract class IElevatorCar {
    public IDisplay display;
    public Direction direction;
    public Status state;
    public int id;

}
