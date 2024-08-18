package ExternalButton;

public abstract class IExternalButton {
    ExternalButtonDispatcher dispatcher;
    public abstract void pressButton(int floorId);
}
