package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        System.out.println("Even or odd: ");
        System.out.println("Enter a number");



        //using scanner class
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean result = util.checkEven(x);
        if(result)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

        System.out.println("Enter a number to find fibonacci");
        x = scanner.nextInt();

        System.out.println("Printing Pattern");

        util.fibonacci(x);

    }
}