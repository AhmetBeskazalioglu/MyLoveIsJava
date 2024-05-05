package codetraining.ct07_notortalamasi;

public class Kimya {

    private int vize;
    private int finalNotu;

    public Kimya() {
    }

    public Kimya(int vize, int finalNotu) {
        this.vize = vize;
        this.finalNotu = finalNotu;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(int finalNotu) {
        this.finalNotu = finalNotu;
    }

    public String toString() {
        return "Kimya{" + "vize=" + vize + ", finalNotu=" + finalNotu + '}';
    }
}
