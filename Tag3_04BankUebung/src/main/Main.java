package main;
import composite.AbstractKontoNode;
import composite.Konto;
import composite.KontoGruppe;

public class Main {
    public static void main(String[] args) {
        KontoGruppe root = new KontoGruppe("root");

        KontoGruppe child1 = new KontoGruppe("child1");
        KontoGruppe child2 = new KontoGruppe("child2");

        root.appendChild(child1);
        root.appendChild(child2);

        KontoGruppe child1_1 = new KontoGruppe("child1_1");
        child1.appendChild(child1_1);

        KontoGruppe child1_2 = new KontoGruppe("child1_2");
        child1.appendChild(child1_2);

        KontoGruppe child2_1 = new KontoGruppe("child2_1");
        child2.appendChild(child2_1);

        Konto konto2_2 = new Konto("konto2_2");
        child2.appendChild(konto2_2);

        root.print();
    }


}