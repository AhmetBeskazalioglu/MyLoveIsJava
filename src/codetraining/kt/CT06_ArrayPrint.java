package codetraining.kt;

public class CT06_ArrayPrint {
    public static void main(String[] args) {
        int[] sayilar = new int[]{3,7,12,5,8,10};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Çift sayı adedi: " + evenCount);
        System.out.println("Tek sayı adedi: " + oddCount);
    }
}
