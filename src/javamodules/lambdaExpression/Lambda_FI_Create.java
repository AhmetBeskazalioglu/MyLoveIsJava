package javamodules.lambdaExpression;

import java.lang.foreign.FunctionDescriptor;
import java.util.function.Function;

public class Lambda_FI_Create {

    public static void main(String[] args) {

        // Lambda ifadesi
        //Function<Integer, Integer> square1 = (num) -> num * num;
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

/**
 * Oluşturulan functional interface ile parametre tipini ve return tipini belirtip,
 * bu input ve output a göre lambda ifadesi oluşturuyoruz.
 * @param <I>
 * @param <O>
 */
@FunctionalInterface
interface Functioni<I, O > {
    O apply(I inputVariable);
}
