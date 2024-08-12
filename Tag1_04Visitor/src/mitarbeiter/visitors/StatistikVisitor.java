package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class StatistikVisitor implements MitarbeiterVisitor {

    private int gehaltCout;
    private int lohnCount;


    public int getGehaltCout() {
        return gehaltCout;
    }

    public int getLohnCount() {
        return lohnCount;
    }

    public int getTotal() {
        return lohnCount + gehaltCout;
    }

    @Override
    public void visit(Lohnempfaenger lohnempfaenger) {
        lohnCount ++;
    }

    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        gehaltCout++;
    }

    @Override
    public void init() {
        lohnCount = gehaltCout = 0;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("gehaltCout=").append(gehaltCout);
        sb.append(", lohnCount=").append(lohnCount);
        sb.append(", total=").append(lohnCount + gehaltCout);
        sb.append('}');
        return sb.toString();
    }
}
