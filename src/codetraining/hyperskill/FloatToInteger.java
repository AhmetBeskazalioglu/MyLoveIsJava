package codetraining.hyperskill;

import java.util.Scanner;

public class FloatToInteger {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read float value from user and assign it to floatVariable
        float floatVariable = scanner.nextFloat();

        // Divide the float variable by 2 and round down the result
        // Here you need to write the code to perform the division and the type cast operation
        // The result should be of integer type
        int dividingNumber = (int) (floatVariable / 2);

        // Print the integer result
        // Here again, you need to write the code part
        System.out.println(dividingNumber);

        float floatVariable1 = scanner.nextFloat();
        int dividingNumber1 = (int) (floatVariable1 / 2);
        System.out.println(dividingNumber1);

        // Close the Scanner
        scanner.close();
    }
}
