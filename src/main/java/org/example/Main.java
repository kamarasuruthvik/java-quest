package org.example;
import java.util.Scanner;
import org.example.interfaces.InvalidAgeException;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            int age;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the age: ");
            age = scanner.nextInt();
            validateAge(age);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age< 18)
            throw new InvalidAgeException("Age must be 18 years or more!");
        else
            System.out.println("Access Granted!");
    }
}