package status;

public abstract class AbstractStatus implements Status {

    private final Front front;

    public AbstractStatus(Front front) {
        this.front = front;
    }

    public final Front getFront() {
        return front;
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinen Sinn");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinen Sinn");
    }

    @Override
    public void drucken() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinen Sinn");
    }

}
