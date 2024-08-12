package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {
    @Override
    public void visit(Lohnempfaenger lohnempfaenger) {
        // Ok
    }

    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        // NOP
    }


}
