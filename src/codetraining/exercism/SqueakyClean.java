package codetraining.exercism;

public class SqueakyClean {
    static String clean(String input) {
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
            } else if (c == '4' || c == '3' || c == '0' || c == '1' || c == '7') {
                switch (c) {
                    case '1':
                        result.append('l');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '4':
                        result.append('a');
                        break;
                    case '7':
                        result.append('t');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    default:
                        break;
                }
            } else if (!Character.isLetter(c)) {
                continue;
            } else
                result.append(c);
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
