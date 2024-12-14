package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Attempting to access the fourth element...");
            System.out.println(numbers[3]);
            System.out.println("This line won't be executed if an exception occurs.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! An error occurred: " + e.getMessage());
            System.out.println("The array only has " + numbers.length + " elements.");
        }

        System.out.println("The program continues running after handling the exception.");
    }
}
