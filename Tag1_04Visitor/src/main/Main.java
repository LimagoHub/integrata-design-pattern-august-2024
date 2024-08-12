package main;

import firma.Firma;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;
import mitarbeiter.visitors.PrintVisitor;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();

        firma.addMitarbeiter(new Lohnempfaenger("Schulz", 20,20));
        firma.addMitarbeiter(new Gehaltsempfaenger("Hinz", 1500));
        firma.addMitarbeiter(new Gehaltsempfaenger("Kunz", 200));
        firma.addMitarbeiter(new Lohnempfaenger("Meier", 20,20));
        firma.addMitarbeiter(new Lohnempfaenger("Schmitt", 20,20));
        firma.iterate(new PrintVisitor());


        firma.iterate(new PrintVisitor());
    }
}