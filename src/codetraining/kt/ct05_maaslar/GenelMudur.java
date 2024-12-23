package codetraining.kt.ct05_maaslar;

public class GenelMudur extends Calisan{
    private double maas;

    public GenelMudur() {
    }

    public GenelMudur(double maas) {
        //super(maas);
        this.maas = maas;
    }

    @Override
    public double getirMaas() {
        //return super.getirMaas();
        return maas;
    }

    public String toString() {
        return "Genel Mudur Maasi: " + getirMaas();
    }
}
