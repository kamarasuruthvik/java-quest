package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        arr.forEach((a)-> System.out.print(a+" "));

        //after sorting
        arr.sort((a,b)-> b-a);
        System.out.println();
        System.out.println(arr);


    }
};