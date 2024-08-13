package trafficlight;

public class AbstractTrafficLightColorState extends AbstractTrafficLightState{
    public AbstractTrafficLightColorState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void switchOff() {
       getTrafficLight().current = getTrafficLight().off;
    }
}
