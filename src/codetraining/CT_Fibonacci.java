package codetraining;

public class CT_Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci2(10));
    }

    // 1. way
    // Recursive
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 2. way
    public static int fibonacci2(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }
}
