package codetraining.leetcode;


public class Plus_One {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            // Eğer son basamak 9 değilse, 1 ekle ve geri dön
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Eğer son basamak 9 ise, bu basamağı 0 yap
            digits[i] = 0;
        }

        // Eğer tüm basamaklar 9 ise, yeni bir dizi oluştur
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        Plus_One s = new Plus_One();
        int[] nums = {6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3};
        int[] result = s.plusOne(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
