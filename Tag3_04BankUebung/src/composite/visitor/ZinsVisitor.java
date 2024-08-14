package composite.visitor;

import composite.Konto;

public class ZinsVisitor extends AbstractKontoVisitor {

    private final double zins;

    public ZinsVisitor(double zins) {
        this.zins = zins;
    }

    @Override
    public void visit(Konto konto) {
        konto.setSaldo(konto.getSaldo() * zins);
    }
}
