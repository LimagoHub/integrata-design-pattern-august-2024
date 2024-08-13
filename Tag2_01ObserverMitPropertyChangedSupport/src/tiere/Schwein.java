package tiere;



import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Schwein {

    private final List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();


    public void addPigTooFatListener(final PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }

    public void removePigTooFatListener(final PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }


    private void firePigTooFatEvent(){
        pigTooFatListeners.forEach(listener -> listener.pigTooFat(this));
    }


    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);


    private String name;
    private int gewicht;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

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
        this.name = name;
        propertyChangeSupport.firePropertyChange("name", this.name, this.name = name);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
        propertyChangeSupport.firePropertyChange("gewicht", this.gewicht, this.gewicht = gewicht);
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
