package javamodules.exceptions;

public class CustomExceptionDemo {
    public static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative");
        } else if (age > 120) {
            throw new CustomException("Age seems unrealistic");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Validating age 25:");
            validateAge(25);
            System.out.println("Validating age -5:");
            validateAge(-5);
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling");
    }
}