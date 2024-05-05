package javamodules.lambdaExpression;

//04.05.24 Cumartesi

public class Lambda_FI_Create {

    public static <O, I> void main(String[] args) {

        // IFunction interface'ini kullanarak lambda ifadesi oluşturuyoruz.

        IFunction<Integer, Integer> iFunction_1_Square = (num) -> (int) Math.sqrt(num); // 1. adım: IFunction interface'ini implemente eden lambda ifadesi oluşturuyoruz.
        System.out.println("iFunction_1_Square.apply(5) = " + iFunction_1_Square.apply(5)); // 2. adım: Lambda ifadesini kullanarak sonucu yazdırma

        IFunction<String, Double> iFunction_2_Root = (string) -> Math.sqrt(Double.parseDouble(string)); // 1. adım: IFunction interface'ini implemente eden lambda ifadesi oluşturuyoruz.
        System.out.println("iFunction_2_Root.apply(\"25\") = " + iFunction_2_Root.apply("25")); // 2. adım: Lambda ifadesini kullanarak sonucu yazdırma

        IFunction<String, Void> print = (string) -> {
            System.out.println(string);
            return null;
        };
        print.apply("Hello World");


        // NotFunctionExample class'ı ile de aynı işlemi yapabiliriz. ???
        NotFunction notFunction = new NotFunctionaExample(); // 3. adım: NotFunction interface'ini implemente eden class'tan nesne oluşturuyoruz.
        System.out.println("notFunction.apply(5) = " + notFunction.apply(5)); // 4. adım: Oluşturulan nesne üzerinden apply metodu ile sonucu yazdırıyoruz.


        // String inputunu verip Void outputu istersem yeni bir class tanımlamam lazım.


    }
}

/**
 * Oluşturulan functional interface ile parametre tipini ve return tipini belirtip,
 * bu input ve output a göre lambda ifadesi oluşturuyoruz.
 *
 * @param <I>
 * @param <O>
 */
@FunctionalInterface
interface IFunction<I, O> {
    O apply(I inputVariable);
}


interface NotFunction<I, O> {
    O apply(I inputVariable);
}

/**
 * 1. adım NotFunction interface'ini implemente edecek metodu barındıran class oluşturuyoruz.
 */
class NotFunctionaExample implements NotFunction<Integer, Integer> {

    /**
     * 2. adım NotFunction interface'ini implemente eden class içerisinde apply metodu oluşturuyoruz.
     */
    @Override
    public Integer apply(Integer inputVariable) {
        return inputVariable * inputVariable;
    }

}