package codetraining.freeexamples;

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan giriş al
        System.out.println("Birinci sayıyı giriniz:");
        int num1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int num2 = scanner.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        int num3 = scanner.nextInt();

        // En büyük sayıyı bulma
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Sonucu yazdır
        System.out.println("En büyük sayı: " + max);

        MaxThree m=new MaxThree();
        System.out.println(m.maxThree());

    }


}

class MaxThree{
    int maxThree(){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        return a>=b?(a>=c?a:c):(b>=c?b:c);
    }
}

