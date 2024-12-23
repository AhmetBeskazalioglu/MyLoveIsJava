package codetraining.kt;

public class CT09_Taxi {
    public static void main(String[] args) {
        taxi();
    }

    public static void taxi() {
        int km = (int) (Math.random() * 10);
        if (km < 3) {
            System.out.println("Ödenecek tutar: 90 TL.   ("+km+" km gidildi.)");
        } else {
            System.out.println("Ödenecek tutar: " + ((km + 1) * 24.55) + " TL.   ("+km+" km gidildi.)");
        }
    }
}