package com.sanjana;

public class Factorial {
    public static void main(String[] args) {
        int Factorial = 1;
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
    }
}
