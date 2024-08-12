package mitarbeiter.visitors;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(Lohnempfaenger lohnempfaenger) {
        System.out.println(lohnempfaenger);
    }

    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        System.out.println(gehaltsempfaenger);
    }
}
