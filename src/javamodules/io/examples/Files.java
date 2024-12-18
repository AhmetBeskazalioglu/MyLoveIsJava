package javamodules.io.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
        public static void main(String[ ] args) {
            try {
                File x = new File("/Users/anke/Desktop/my-time-machine/message.txt");
                Scanner sc = new Scanner(x);
                while(sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error");
            }
        }
}
