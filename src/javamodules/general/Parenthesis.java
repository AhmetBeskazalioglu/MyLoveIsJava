package javamodules.general;

public class Parenthesis {
    // This method is used to check the parenthesis in a string
    // must be this logic String str="((()))" or this String str="(()))" or this String str="((())"
    // if the parenthesis is correct then it will return true otherwise false
    // not this String str=")(())"

    public static boolean checkParenthesis() {
        String str = ")(()))((";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkParenthesis());
    }
}
