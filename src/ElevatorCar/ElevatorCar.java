package ElevatorCar;

import Display.Direction;
import Display.IDisplay;

public class ElevatorCar extends IElevatorCar {
    public ElevatorCar(IDisplay display) {
        this.state = Status.Idle;
        this.direction = Direction.Up;
        this.id = 1;
        this.display = display;
    }


}
