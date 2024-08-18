package ExternalButton;

public class ExternalButton extends IExternalButton {

    public ExternalButton(ExternalButtonDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void pressButton(int floorId) {
         dispatcher.handleRequest(floorId);
    }
}
