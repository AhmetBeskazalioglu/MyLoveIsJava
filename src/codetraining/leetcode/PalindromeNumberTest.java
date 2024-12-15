package codetraining.leetcode;

import java.util.Arrays;

class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String[] strArr = String.valueOf(x).split("");
        String[] strArrReversed = new String[strArr.length];

        for (int i = strArr.length - 1, j = 0; i >= 0; i--, j++) {
            strArrReversed[j] = strArr[i];
        }

        return Arrays.equals(strArr, strArrReversed);
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == reverse;
    }
}

public class PalindromeNumberTest {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome2(-121));
    }
}
