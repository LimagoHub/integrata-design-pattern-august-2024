package tiere;
@FunctionalInterface
public interface PigTooFatListener {
    /* normalerweise mit Eventklasse als Parameter */
    void pigTooFat(Schwein schwein);
}
