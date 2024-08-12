package status;

public class StatusB extends AbstractStatus{

    public StatusB(Front front) {
        super(front);
    }

    @Override
    public void changeToA() {

        getFront().current = getFront().stateA;
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt b");
    }
}
