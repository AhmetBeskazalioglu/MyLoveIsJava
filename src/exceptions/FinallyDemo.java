package exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to divide by zero...");
            int result = 10 / 0;
            System.out.println("This line won't be executed.");
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}
