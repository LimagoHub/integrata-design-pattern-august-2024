package tiere;

import events.PropertyChangedEvent;
import events.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

public class Schwein {

    private final List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private final List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

    public void addPigTooFatListener(final PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }

    public void removePigTooFatListener(final PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }

    public void addPropertyChangedListener(final PropertyChangedListener listener) {
        propertyChangedListeners.add(listener);
    }

    public void removePropertyChangedListener(final PropertyChangedListener listener) {
        propertyChangedListeners.remove(listener);
    }

    private void firePigTooFatEvent(){
        pigTooFatListeners.forEach(listener -> listener.pigTooFat(this));
    }

    private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
        firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
    }

    private void firePropertyChangedEvent(PropertyChangedEvent event){
        propertyChangedListeners.forEach(listener->listener.propertyChanged(event));
    }


    private String name;
    private int gewicht;

    public Schwein() {
        this("Nobody");
    }
    public Schwein(String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        firePropertyChangedEvent("name", this.name, this.name=name);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
        firePropertyChangedEvent("gewicht", this.gewicht, this.gewicht=gewicht);
        if(gewicht > 20) firePigTooFatEvent();
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
