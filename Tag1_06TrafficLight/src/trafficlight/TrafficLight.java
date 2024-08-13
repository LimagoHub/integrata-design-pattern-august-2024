package trafficlight;

public class TrafficLight {
    final TrafficlightState red = new RedState(this);
    final TrafficlightState green = new GreenState(this);
    final TrafficlightState off = new OffState(this);
    TrafficlightState current = off;

    public String getCurrentColor() {
        return current.getCurrentColor();
    }

    public void nextColor() {
        current.nextColor();
    }

    public void switchOn() {
        current.switchOn();
    }

    public void switchOff() {
        current.switchOff();
    }
}
