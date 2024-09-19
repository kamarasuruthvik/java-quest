package org.example.interfaces;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String ErrorMessage){
        super(ErrorMessage);
    }
}
