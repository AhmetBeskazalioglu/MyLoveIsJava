package codetraining.kt;

public class CT03_ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers= new int[4];
        numbers[0] = 2;
        numbers[1] = 9;
        numbers[2] = 5;
        numbers[3] = 6;

        int[] newNumbers= new int[4];

        //toplamları ilk elemana atar
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        newNumbers[0]=sum;

        //çarpımları ikinci elemana atar
        int multiply=1;
        for (int i = 0; i < numbers.length; i++) {
            multiply*=numbers[i];
        }
        newNumbers[1]=multiply;

        //tek sayıların toplamını üçüncü elemana atar
        newNumbers[2]=oddNumbersTotalInArray(numbers);

        //çift sayıların toplamını dördüncü elemana atar
        newNumbers[3]=evenNumbersTotalInArray(numbers);

        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }

    }

    public static int evenNumbersTotalInArray(int[] num){
        int total=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                total+=num[i];
            }
        }
        return total;
    }

    public static int oddNumbersTotalInArray(int[] num){
        int total=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2!=0){
                total+=num[i];
            }
        }
        return total;
    }
}
