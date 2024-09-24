package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@FunctionalInterface
interface MathOperation{
    public int operate(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a+b ;
        MathOperation subtract = (a, b) -> a-b;
        MathOperation multiply = (a, b) -> a*b;

        System.out.println("add: " + add.operate(3, 4));
        System.out.println("subtract: " + subtract.operate(3, 4));
        System.out.println("multiply: " + multiply.operate(3, 4));
    }
};