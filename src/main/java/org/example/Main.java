package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Example implements Runnable{
    public int threadNum = 1;

     Example(int threadNum){
        this.threadNum = threadNum;
    }

    public void run(){
        System.out.println("Thread" + threadNum + "is running");
        for(int i=0; i<5; i++){
            try{
                System.out.println(threadNum+ ": " + i);
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(threadNum + "raised exception "+ e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Example(1)), t2 = new Thread(new Example(2));
        t1.start();
        t2.start();
        System.out.println("Threads finished execution");

    }
}