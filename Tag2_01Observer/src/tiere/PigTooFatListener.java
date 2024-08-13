package tiere;
@FunctionalInterface
public interface PigTooFatListener {
    /* normalerweise mit Eventklasse als Parameter */
    void pigTooFat(Schwein schwein);
}
/*
class event {
    Object source
    String propertyName
    Object oldValue
    Object newValue
}

 */