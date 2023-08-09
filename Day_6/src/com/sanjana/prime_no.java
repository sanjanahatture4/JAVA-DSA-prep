package com.sanjana;

import java.util.Scanner;

public class prime_no {
    static boolean isnotprime(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean ans = isnotprime(n);

        if(isnotprime(n))
        {
            System.out.println(n+ " is a prime number");
        }
        else
        {
            System.out.println(n + " is not a prime number");
        }

    }
}
