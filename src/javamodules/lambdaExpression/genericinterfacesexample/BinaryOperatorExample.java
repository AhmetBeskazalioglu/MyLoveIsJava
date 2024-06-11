package javamodules.lambdaExpression.genericinterfacesexample;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        Book book1 = BookFactory.getBookList().get(6);
        Book book2 = BookFactory.getBookList().get(15);

        BinaryOperator<Book> binaryOperator = BinaryOperator.maxBy(Comparator.comparing(Book::getPages));
        System.out.println("Book with more pages: " + binaryOperator.apply(book1, book2));

    }
}