package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.BiPredicate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@FunctionalInterface
interface MathOperation{
    public int operate(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        // four different types of built-in interfaces
        //1 : Supplier. This interface ALWAYS returns something and DOESN'T accept ANYTHING
        //The built-in method is get
        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());

        //2: Consumer. This interface ALWAYS accepts something and returns nothing
        //method is accept
        // there is also Bi-Consumer
        Consumer<Integer>  consumer = (a) -> System.out.print(a + " ");
        consumer.accept(200);

        // example of using consumer with for each
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        arr.forEach(consumer);
        System.out.println();
        //3: Predicate: This interface ALWAYS takes a value does a logical test and returns a boolean
        //method is test
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a> b;
        System.out.println(biPredicate.test(3, 4));

        //4: Function. Takes AN ARGUMENT and RETURNS a VALUE
        // method is apply
        Function<Integer, Integer> square = n -> n*n;
        System.out.println(square.apply(2));



    }
};