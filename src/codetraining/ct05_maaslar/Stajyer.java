package codetraining.ct05_maaslar;

public class Stajyer extends Calisan{

    public Stajyer() {
    }

    public Stajyer(double maas) {
        super(maas);
    }

    @Override
    public double getirMaas() {
        return super.getirMaas();
    }

    public String toString() {
        return "Stajyer Maasi: " + getirMaas();
    }
}
