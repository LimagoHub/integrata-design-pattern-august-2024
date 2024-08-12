package status;

public class StatusA extends AbstractStatus{

    public StatusA(Front front) {
        super(front);
    }

    @Override
    public void changeToB() {
        getFront().current = getFront().stateB;
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt a");
    }
}
