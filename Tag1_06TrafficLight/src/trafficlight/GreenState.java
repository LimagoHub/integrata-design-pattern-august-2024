package trafficlight;

public class GreenState extends AbstractTrafficLightColorState{
    public GreenState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getCurrentColor() {
        return "GREEN";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().red;
    }
}
