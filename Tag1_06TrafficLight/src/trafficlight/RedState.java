package trafficlight;

public class RedState extends AbstractTrafficLightColorState {
    public RedState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getCurrentColor() {
        return "RED";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().green;
    }
}
