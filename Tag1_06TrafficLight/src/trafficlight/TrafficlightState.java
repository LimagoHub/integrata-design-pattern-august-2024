package trafficlight;

public interface TrafficlightState {

    String getCurrentColor();
    void nextColor();
    void switchOn();
    void switchOff();
}
