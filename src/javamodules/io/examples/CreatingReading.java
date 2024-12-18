package javamodules.io.examples;

import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class CreatingReading {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("FormatterTest2.txt");
            int count = 0;
            while(count < 3) {
                f.format("%s\n",input.nextLine());
                count++;
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("FormatterTest2.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
