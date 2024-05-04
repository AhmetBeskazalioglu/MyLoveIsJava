package javamodules.tricks;

public class NAdetParametre {

    public static void main(String[] args) {
        System.out.println("deneme(1,2,3,4,5,6,7,8,9,10) = " + deneme(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    static double deneme(double... doubleNum){
        double sum = 0;
        for (double d: doubleNum) {
            sum += d;
        }
        return sum;
    }
}
