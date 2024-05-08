package javamodules.lambdaExpression;

/**
 * Most common functional interfaces
 */
public class Functional_Interfaces {
    /**
     * Represents a predicate (boolean-valued function) of one argument.
     * Tek bir parametre alan ve boolean değer döndüren bir işlevi temsil eder.
     * @param <T>
     */
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    /**
     * Represents an operation that accepts a single input argument and returns no result.
     * Tek bir parametre alan ve sonuç döndürmeyen bir işlevi temsil eder.
     * @param <T>
     */
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    /**
     * Represents a function that accepts one argument and produces a result.
     * Tek bir parametre alan ve farklı tipte bir sonuç döndüren bir işlevi temsil eder.
     * @param <T>
     * @param <R>
     */
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }

    /**
     * Represents a supplier of results.
     * Parametre almayan ve herhangi bir tipte sonuç döndüren bir işlevi temsil eder.
     * @param <T>
     */
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    /**
     * Represents a function that accepts an argument and produces a result.
     * Tek bir parametre alan ve aynı tipte bir sonuç döndüren bir işlevi temsil eder.
     * @param <T>
     */
    @FunctionalInterface
    public interface UnaryOperator<T> {
        T apply(T t);
    }

    /**
     * Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
     * Aynı tipte iki parametre alan ve aynı tipte bir sonuç döndüren bir işlevi temsil eder.
     * @param <T>
     */
    @FunctionalInterface
    public interface BinaryOperator<T> {
        T apply(T t1, T t2);
    }


}
