package javamodules.lambdaExpression;

public class LambdaInstance {

    public static void main(String[] args) {
        // Lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2 * x);
        FuncInterface fobj2 = (int x) -> System.out.println(x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
        fobj2.abstractFun(5);
    }
}

// A sample functional interface (An interface with single abstract method)
interface FuncInterface {
    // An abstract function
    void abstractFun(int x);
}
