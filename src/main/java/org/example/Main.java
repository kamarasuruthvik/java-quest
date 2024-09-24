package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@FunctionalInterface
interface A{
    void printSomething();
}


public class Main {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void printSomething() {
                System.out.println("in Show!");
            }
        };

        obj.printSomething();
    }
}