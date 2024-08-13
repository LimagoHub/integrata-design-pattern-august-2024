package trafficlightmain;

import trafficlight.TrafficLight;

public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchOn();
        for (int i = 0; i < 5; i++) {
            System.out.println(trafficLight.getCurrentColor());
            trafficLight.nextColor();
        }
        trafficLight.switchOff();

    }
}