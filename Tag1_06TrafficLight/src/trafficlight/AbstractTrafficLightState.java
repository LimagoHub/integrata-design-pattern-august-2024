package trafficlight;

public class AbstractTrafficLightState implements TrafficlightState{

    private final TrafficLight trafficLight;

    public AbstractTrafficLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    @Override
    public String getCurrentColor() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void nextColor() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void switchOn() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void switchOff() {
        throw new UnsupportedOperationException("Not supported");
    }
}
