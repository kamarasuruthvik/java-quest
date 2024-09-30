package org.example;

import org.example.Library.Library;

import org.example.Library.Book;

import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean userInput = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting Application...");

        System.out.println("Welcome to Ruthviks Library Management system :)");



        while(userInput){
            System.out.println("How may I help you?");
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Books");
            System.out.println("4. List Available Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    System.out.print("Enter isbn: ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;
                case 3:
                    System.out.println("Enter a keyword: ");
                    String keyword = scanner.nextLine();
                    List<Book> matchingBooks = library.searchBooks(keyword);
                    matchingBooks.forEach((b) -> System.out.print(b.getTitle() + ", "));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Listing books... ");
                    library.listAllBooks();
                    break;
                default:
                    System.out.println("exiting application...");
                    userInput = false;
                    break;
            }
        }
    }
};