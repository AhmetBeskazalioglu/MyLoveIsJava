package codetraining.freeexamples;

public class IncrementChallenge {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        int result = (++a * b--) + (c++ + a) - (--b * c++) + (a++ - b++);
        // a:3 b:1 c:5 4 + 5 - 0 + 2

        System.out.println("Result: " + result); // 11
        System.out.println("Final a: " + a); // 3
        System.out.println("Final b: " + b); // 1
        System.out.println("Final c: " + c); // 5
    }
}

