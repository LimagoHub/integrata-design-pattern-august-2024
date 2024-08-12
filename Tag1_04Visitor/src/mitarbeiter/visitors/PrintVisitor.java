package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class PrintVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(Lohnempfaenger lohnempfaenger) {
        System.out.println(lohnempfaenger);
    }

    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        System.out.println(gehaltsempfaenger);
    }
}
