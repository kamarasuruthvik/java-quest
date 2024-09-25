package org.example;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //TASK 1:
        //Create a list of integers and use Streams to filter out even numbers.
        //Map each number to its square and collect the results into a new list.
        //Print the resulting list using a stream.
        System.out.println("TASK 1:");
        List<Integer> nums = Arrays.asList(4,6,2, 1, 9);
        List<Integer> data = nums.stream().filter((n)-> n%2==0).map((n)->n*n).collect(Collectors.toList());
        data.forEach((n)-> System.out.println(n));
        System.out.println("\n");

        //TASK 2:
        //Filter out strings that are empty or null.
        //Sort the strings in alphabetical order.
        //Convert each string to uppercase and collect the results into a new list.
        System.out.println("TASK 2:");
        List<String> names = Arrays.asList("Ruthvik", "Arthi", "Varshith", "Baals", "");
        List<String> finalNames = names.stream()
                .filter((n) -> n!="")
                .sorted()
                .map((n) -> n.toUpperCase())
                .collect(Collectors.toList());


        finalNames.forEach((n)-> System.out.println(n));

        System.out.println("\n");
        //TASK 3:
        //Use the reduce() method to sum up all the numbers in a list.
        //Use the collect() method to gather stream results into a specific type of collection, like a Set.
        //Use findFirst() and anyMatch() to demonstrate how to retrieve specific elements from the stream.
        System.out.println("TASK 3:");
        List<Integer> newNums = Arrays.asList(1, 4, 5, 7, 10, 6);
        int sum = newNums.
                stream().
                reduce(0, (a, b)-> a+b);

        Set<Integer> uniques = newNums.stream().collect(Collectors.toSet());

        //using anyMatch to check if any number is even
        boolean hasEven = newNums.stream().anyMatch(n -> n%2 == 0);
        System.out.println(sum+ "\n" + uniques +"\n" + hasEven);

    }
};