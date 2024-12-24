package codetraining.exercism;

import java.util.HashMap;
import java.util.Map;

public class SqueakyClean {
    private static final Map<Character, Character> REPLACEMENTS = new HashMap<>();

    static {
        REPLACEMENTS.put('1', 'l');
        REPLACEMENTS.put('3', 'e');
        REPLACEMENTS.put('4', 'a');
        REPLACEMENTS.put('7', 't');
        REPLACEMENTS.put('0', 'o');
    }

    public static String clean(String input) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;

        for (char c : input.toCharArray()) {
            if (toUpperCase) {
                result.append(Character.toUpperCase(c));
                toUpperCase = false;
            } else if (c == '-') {
                toUpperCase = true; // Sonraki harfi büyük yap.
            } else if (c == ' ') {
                result.append('_');
            } else if (REPLACEMENTS.containsKey(c)) {
                result.append(REPLACEMENTS.get(c));
            } else if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

class SqueakyCleanTest {
    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("this-is-a-test")); // thisIsATest
        System.out.println(SqueakyClean.clean("this is a test")); // this_is_a_test
        System.out.println(SqueakyClean.clean("this is a test 4 3 0 1 7")); // this_is_a_testlate
    }
}
