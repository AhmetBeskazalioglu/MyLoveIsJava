package javamodules.io.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
        public static void main(String[ ] args) {
            File x = new File("/Users/anke/Desktop/my-time-machine/message.txt");
            if(x.exists()) {
                System.out.println(x.getName() +  " is exists!");
            }
            else {
                System.out.println("The file does not exist");
            }

            try {
                Scanner sc = new Scanner(x);
                while(sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            }
            catch (FileNotFoundException e) {

            }
        }
}
