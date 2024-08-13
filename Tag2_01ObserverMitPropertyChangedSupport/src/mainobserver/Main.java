package mainobserver;


import tiere.PigTooFatListener;
import tiere.Schwein;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main  {

    final PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt);
        }
    };

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();
    public static void main(String[] args) {

        new Main().run();
    }

    public void run() {
        final Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPropertyChangeListener(propertyChangeListener);
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(spediteur::fahren);

        for (int i = 0; i < 11 ; i++) {
            piggy.fuettern();
        }
    }


    class SchweineMetzgerAdapter implements PigTooFatListener{

        @Override
        public void pigTooFat(Schwein schwein) {
            metzger.schlachten(schwein);
        }
    }

    class SchweineSpediteurAdapter implements PigTooFatListener{

        @Override
        public void pigTooFat(Schwein schwein) {
            spediteur.fahren(schwein);
        }
    }


}

class Metzger  {


    public void schlachten(Object schwein) {
        System.out.println("Messer wetz!");
    }
}

class Spediteur  {


    public void fahren(Object schwein) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}