package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Example extends Thread{
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
        Example c1 = new Example(1), c2 = new Example(2);
        c1.start();
        c2.start();

        System.out.println("Threads finished execution");

    }
}