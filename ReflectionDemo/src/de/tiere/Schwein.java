package de.tiere;

import java.io.Serial;
import java.io.Serializable;

public class Schwein implements Serializable {



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



    public int getGewicht() {
        return gewicht;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setGewicht(int gewicht) {
        this.gewicht = gewicht;
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
