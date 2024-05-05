package codetraining.ct07_notortalamasi;

public class Fizik {

    private int vize;
    private int finalNot;

    public Fizik() {
    }

    public Fizik(int vize, int finalNot) {
        this.vize = vize;
        this.finalNot = finalNot;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalNot() {
        return finalNot;
    }

    public void setFinalNot(int finalNot) {
        this.finalNot = finalNot;
    }

    public String toString() {
        return "Fizik{" + "vize=" + vize + ", finalNot=" + finalNot + '}';
    }
}
