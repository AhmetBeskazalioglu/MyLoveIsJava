package javamodules.general;

public class SumInString {

    public static void main(String[] args) {
        newString();
    }

    /**
     * This method is used to sum the digits in a string group
     *
     * @return
     */
    public static String sumInStringGroup() {
        String str = "123 45 678 954 12347 89567 69874 5664";
        String[] strArr = str.split(" ");
        String newStr = "";
        for (int i = 0; i < strArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < strArr[i].length(); j++) {
                sum += Integer.parseInt(strArr[i].substring(j, j + 1));
            }
            newStr += sum + " ";
        }
        return newStr;
    }

    /**
     * This method is used to sort the string array
     *
     * @return
     */
    public static String[] sortedInStringArray() {

        String[] newStrArr = sumInStringGroup().split(" ");
        for (int i = 0; i < newStrArr.length; i++) {
            for (int j = i + 1; j < newStrArr.length; j++) {
                if (Integer.parseInt(newStrArr[i]) > Integer.parseInt(newStrArr[j])) {
                    String temp = newStrArr[i];
                    newStrArr[i] = newStrArr[j];
                    newStrArr[j] = temp;
                }
            }
        }
        return newStrArr;
    }

    /**
     * This method is used to print the new string
     */
    public static void newString() {
        String newStr = "";
        for (int i = 0; i < sortedInStringArray().length; i++) {
            newStr += sortedInStringArray()[i] + " ";
        }
        System.out.println(newStr);
    }
}


