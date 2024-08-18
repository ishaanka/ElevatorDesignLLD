package Floor;
import ExternalButton.IExternalButton;

public class Floor extends IFloor {
    public Floor(int floorNumber, IExternalButton externalButton) {
        this.floorNumber = floorNumber;
        this.externalButton = externalButton;
    }
}
