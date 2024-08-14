package composite;

public class Konto extends AbstractKontoNode {
    private double saldo=0;
    public Konto(String label) {
        super(label);
    }

    public Konto(String label, double saldo) {
        super(label);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", saldo: " + saldo;
    }
}
