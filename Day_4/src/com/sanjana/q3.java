package com.sanjana;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // Write a program that prompts the user to input a positive integer. It should then print
        // the multiplication table of that number.
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = input.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

}
