package status;

public class Front {

    final Status stateA = new StatusA(this);
    final Status stateB = new StatusB(this);
    Status current = stateA;

    public void changeToA() {
        current.changeToA();
    }

    public void changeToB() {
        current.changeToB();
    }

    public void drucken() {
        current.drucken();
    }
}
