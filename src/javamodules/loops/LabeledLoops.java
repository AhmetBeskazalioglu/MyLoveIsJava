package javamodules.loops;

public class LabeledLoops {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 3) {
                    break outerLoop; // Dış döngüden çıkar.
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
