package composite.visitor;

import composite.Konto;
import composite.KontoGruppe;

public interface KontoVisitor {
    void init();
    void dispose();
    void visit(Konto konto);
    void visit(KontoGruppe kontoGruppe);
}
