package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Ruthvik", 3);
        students.put("Baals", 5);

        System.out.println(students.get("Ruthvik"));
        System.out.println(students);
        System.out.println(students.remove("Ruthvik"));
        System.out.println(students);

    }
}