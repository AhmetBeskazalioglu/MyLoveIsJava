package exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4; // This will cause an ArrayIndexOutOfBoundsException
            int result = numbers[index] / 0; // This line would throw an ArithmeticException if reached
            System.out.println("This line won't be executed.");
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
