package org.example;
import java.util.Scanner;
import org.example.interfaces.InvalidAgeException;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int x, y;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator/ denominator;

            System.out.println("This is the result: " + result);
        } catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        } catch (Exception e){
            System.out.println("Unexpected error occured! " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program has ended!");
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age< 18)
            throw new InvalidAgeException("Age must be 18 years or more!");
        else
            System.out.println("Access Granted!");
    }
}