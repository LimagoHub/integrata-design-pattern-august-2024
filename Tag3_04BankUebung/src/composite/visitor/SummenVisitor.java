package composite.visitor;

import composite.Konto;

public class SummenVisitor extends AbstractKontoVisitor {

    private double sum;
    @Override
    public void init() {
        sum = 0;
    }

    @Override
    public void dispose() {
        System.out.println(sum);
    }

    @Override
    public void visit(Konto konto) {
        sum += konto.getSaldo();
    }
}
