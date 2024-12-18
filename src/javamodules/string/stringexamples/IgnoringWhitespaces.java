package javamodules.string.stringexamples;

import java.util.Scanner;

public class IgnoringWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // Boşlukları tamamen kaldır ve karşılaştır
        System.out.println(str1.replaceAll("\\s", "").equals(str2.replaceAll("\\s", "")));
    }
}
