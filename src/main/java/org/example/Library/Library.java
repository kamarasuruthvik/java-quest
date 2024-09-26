package org.example.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    ArrayList<Book> books = new ArrayList<>();


    void addBook(Book book){
        books.add(book);
        System.out.println("Book is added: "+ book);
    }

    void removeBook(String isbn){
        Optional<Book> bookToRemove = books
                .stream()
                .filter(i -> i.getISBN().equals(isbn)).findFirst();

        if(bookToRemove.isEmpty()){
            books.remove(bookToRemove);
            System.out.println("The book " +bookToRemove +" is Removed!");
        } else {
            System.out.println("The book with ISBN:" + isbn + " is not found.");
        }
    }

    List<Book> searchBooks(String keyword) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword) ||
                        book.getAuthor().toLowerCase().contains(keyword))
                .toList();
    }

    void listAllBooks(){
        books.stream().forEach(book -> System.out.println(book));
    }
}
