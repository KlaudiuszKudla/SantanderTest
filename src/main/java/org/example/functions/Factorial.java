package org.example.functions;

public class Factorial {

    public int silnia(int n){
        if(n < 0){
            throw new IllegalArgumentException("Argument funkcji musi być nieujemną liczbą całkowitą");
        }
        if(n == 0){
            return 1;
        }
        else{
            return n*silnia(n-1);
        }
    }
}
