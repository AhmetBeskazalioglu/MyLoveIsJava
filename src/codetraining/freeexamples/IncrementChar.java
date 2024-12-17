package codetraining.freeexamples;
import java.util.Scanner;

public class IncrementChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input character
        char inputChar = scanner.next().charAt(0);

        char outputChar;

        if(inputChar=='z') {
            outputChar='a';
        } else
            outputChar=++inputChar;


        // Print the result
        System.out.println(outputChar);
    }
}
