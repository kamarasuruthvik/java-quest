package org.example;

public class Util {
    public boolean checkEven(int x){
        if(x%2==0)
            return true;
        return false;
    }

    public void fibonacci(int n){
            int a = 0, b= 1;
            System.out.print(a+ " ");
            for(int i=2; i<=n; i++){
                System.out.print(b+" ");
                int temp = b;
                b = a+ b;
                a = temp;
            }
            System.out.println();
    }
}
