package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Hi implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1, "Hi Thread");
        Thread t2 = new Thread(obj2, "Hello Thread");

        t1.start();
        t2.start();
        try{
            Thread.sleep(10);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();

        System.out.println("Bye!");
    }
}