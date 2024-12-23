package codetraining.kt;

public class CT_Fibonacci {

    public static void main(String[] args) {
        /*
         * Buradaki amaç iki fibonacci methodunun ne kadar sürede işlem yaptığını ölçmek.
         * Dolayısıyla algoritmanın zaman karmaşıklığını tespit etmek.
         */

        long fibonacci = 30;
        long fibonacci2 = 300000;

        long startTime = System.nanoTime();
        long fibonacciResult = fibonacci(fibonacci);
        //System.out.println("Fibonacci(" + fibonacci + "): " + fibonacciResult);
        long endTime = System.nanoTime();
        double time = (endTime - startTime);
        System.out.println("Execution time for fibonacci: " + time + " nanotime");
        System.out.println("");


        long startTime2 = System.nanoTime();
        long fibonacciResult2 = fibonacci2(fibonacci2);
        //System.out.println("Fibonacci(" + fibonacci2 + "): " + fibonacciResult2);
        long endTime2 = System.nanoTime();
        double time2 = (endTime2 - startTime2);
        System.out.println("Execution time2 for fibonacci2: " + time2 + " nanotime");

        double fb=(double) fibonacci;
        double fb2=(double) fibonacci2;
        double n=fb2/fb;
        System.out.println("");

        System.out.println("n oranı, kaç katı: " + n + " kat daha büyük");
        System.out.println("zaman oranı, kaç katı: " + (time / time2)+" kat daha hızlı");
    }

    /**
     * 1. way
     * Time complexity: O(2^n)
     * @param n
     * @return
     */
    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 2. way
     * Mükemmel bir time complexity'ye sahip olan bu algoritma, recursive algoritmadan çok daha hızlı çalışır.
     * Time complexity: O(n)
     * @param n
     * @return
     */
    public static long fibonacci2(long n) {
        if (n <= 1) {
            return n;
        }

        long a = 0, b = 1;
        for (long i = 0; i < n; i++) {
            long temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }
}
