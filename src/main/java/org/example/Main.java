package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Counter
{
    int count;

    public synchronized void increment(){
        count++;
    }

}
public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();

        try{
            Thread t1= new Thread(new Runnable(){
            public void run()
                    {
                        for(int i=1; i<=1000; i++){
                            c.increment();
                        }
                    }
            });

            Thread t2= new Thread(new Runnable(){
                public void run()
                {
                    for(int i=1; i<=1000; i++){
                        c.increment();
                    }
                }
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();

        } catch (Exception e){
            System.out.println("Throws error: "+ e.getMessage());
        }
        System.out.println("Count: "+ c.count);
    }
}