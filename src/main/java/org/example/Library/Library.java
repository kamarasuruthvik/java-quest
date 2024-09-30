package org.example.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book){
        books.add(book);
        System.out.println("Book is added: "+ book);
    }

    public void removeBook(String isbn){
        System.out.println("Removing books...");
        Optional<Book> bookToRemove = books
                .stream()
                .filter(i -> i.getISBN().equals(isbn)).findFirst();
        if(!bookToRemove.isEmpty()){
            books.remove(bookToRemove.get());
            System.out.println("The book " +bookToRemove +" is Removed!");
        } else {
            System.out.println("The book with ISBN:" + isbn + " is not found.");
        }
    }

    public List<Book> searchBooks(String keyword) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword) ||
                        book.getAuthor().toLowerCase().contains(keyword))
                .toList();
    }

    public void listAllBooks(){
        books.stream().forEach(book -> {
            System.out.print("\nTitle: "+ book.getTitle() +" @ " +" ISBN: " +book.getISBN());
        });
        System.out.println();
    }
}
