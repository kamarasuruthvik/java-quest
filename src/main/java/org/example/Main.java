package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 1, 2, 3};
        int high = -1000, low = 1000;
        for(int i: numbers){
            high = Math.max(high, i);
            low = Math.min(low, i);
        }

        System.out.println("The highest number is: "+ high);
        System.out.println("The lowest number is: "+ low);
    }
}