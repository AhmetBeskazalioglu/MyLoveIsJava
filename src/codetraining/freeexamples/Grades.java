package codetraining.freeexamples;

import java.util.Scanner;
import java.util.LinkedList;

public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        LinkedList<String> list = new LinkedList<String>();
        int x=1;
        while(x<14){
            String str = scanner.next();
            list.add(str);
            x++;
        }
        int a = 0,b=0,c=0,d=0;
        for(String str:list){
            if(str.equalsIgnoreCase("A")){
                a++;
            }else if(str.equalsIgnoreCase("B")){
                b++;
            }else if(str.equalsIgnoreCase("C")){
                c++;
            }else if(str.equalsIgnoreCase("D")){
                d++;
            }
        }

        System.out.println(a+" "+b+" "+c+" "+d);
    }

}
