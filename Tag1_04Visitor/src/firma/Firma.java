package firma;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.visitors.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();
    public void addMitarbeiter(AbstractMitarbeiter mitarbeiter) {
        mitarbeiters.add(mitarbeiter);
    }
    public void removeMitarbeiter(AbstractMitarbeiter mitarbeiter) {
        mitarbeiters.remove(mitarbeiter);
    }

    /*public void print() {
        mitarbeiters.forEach(System.out::println);
    }

     */

    public void iterate(MitarbeiterVisitor visitor) {
       for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
           //visitor.visit(mitarbeiter);
           mitarbeiter.accept(visitor);
       }
    }
}
