package codetraining.freeexamples;

/**
 * String result = "done"; Where is the variable result inserted?
 */
public class WhereToAdd {
    // 1. String result = "done";
    public void shed(boolean time) {
        // 2. String result = "done";
        if (time) {
        // 3. String result = "done";
        }
       // System.out.println(result); // After inserting the variable result, you can uncomment this line
    }

    public static void main(String[] args) {
        WhereToAdd whereToAdd = new WhereToAdd();
        whereToAdd.shed(false);
    }

}