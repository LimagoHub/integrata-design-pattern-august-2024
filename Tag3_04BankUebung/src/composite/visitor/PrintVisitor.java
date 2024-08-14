package composite.visitor;

import composite.AbstractKontoNode;
import composite.Konto;
import composite.KontoGruppe;

public class PrintVisitor extends AbstractKontoVisitor{
    @Override
    public void visit(Konto konto) {
        ausgabe(konto);
    }

    @Override
    public void visit(KontoGruppe kontoGruppe) {
       ausgabe(kontoGruppe);
    }

    private void ausgabe(AbstractKontoNode node) {
        System.out.println(node);
    }
}
