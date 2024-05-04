package javamodules.lambdaExpression;

public class Lambda_FI_Create {

    public static void main(String[] args) {

        // Lambda ifadesi
        Functioni<Integer, Integer> square = (num) -> (int) Math.sqrt(num);
        Functioni<String, Double> squareRoot = (string) -> Math.sqrt(Double.parseDouble(string));
        Functioni<String, Void> print = (string) -> {
            System.out.println(string);
            return null;
        };

        // Lambda ifadesini kullanma
        int result = square.apply(5); // 5'in karesini alır: 25
        System.out.println("Result: " + result);

        System.out.println("squareRoot.apply(\"25\") = " + squareRoot.apply("25"));

        print.apply("Hello World");
    }
}

@FunctionalInterface
interface Functioni<t, r> {
    r apply(t a);
}
