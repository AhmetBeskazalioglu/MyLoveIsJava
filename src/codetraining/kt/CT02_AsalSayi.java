package codetraining.kt;

public class  CT02_AsalSayi {
    public static void main(String[] args) {
        int sayi;
        for (sayi = 20; sayi <= 90; sayi++) {
            boolean asalMi = true;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println(sayi + " sayısı asaldır.");
            }
        }
    }
}
