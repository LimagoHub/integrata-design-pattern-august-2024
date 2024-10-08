package mainobserver;

import events.PropertyChangedEvent;
import events.PropertyChangedListener;
import tiere.PigTooFatListener;
import tiere.Schwein;

public class Main implements PropertyChangedListener {

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();
    public static void main(String[] args) {

        new Main().run();
    }

    public void run() {
        final Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(spediteur::fahren);
        piggy.addPropertyChangedListener(this);
        for (int i = 0; i < 11 ; i++) {
            piggy.fuettern();
        }
    }

    @Override
    public void propertyChanged(PropertyChangedEvent event) {
        System.out.println(event);
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