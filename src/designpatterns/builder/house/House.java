package designpatterns.builder.house;

public class House {

    private String basement;
    private String structure;
    private String roof;
    private String interior;

    public String getBasement() {
        return basement;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
                + "]";
    }
}
