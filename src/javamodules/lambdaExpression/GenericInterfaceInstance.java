package javamodules.lambdaExpression;

public class GenericInterfaceInstance {
    public static void main(String[] args) {
        /**
         * Example: Generic interface kullanarak bir objenin tipine göre işlem yapacak
         */
        GenericInterface<Object> refObj;
        refObj = (obj) -> {
            String result = "";
            if (obj instanceof String) {
                String str = (String) obj;
                for (int i = str.length() - 1; i >= 0; i--) {
                    result += str.charAt(i);
                }
                return result;

            } else if (obj instanceof Integer) {
                int n = (int) obj;
                int sonuc = 1;
                for (int i = 1; i <= n; i++) {
                    sonuc *= i;
                }
                return sonuc;
            } else {
                return null;
            }
        };
        System.out.println("***************");
        System.out.println("Java tersine çevirldi: " + refObj.func("Java"));
        System.out.println("7! = " + refObj.func(7));

    }

    @FunctionalInterface
    public interface GenericInterface<T> {
        T func(T t);

    }
}
