package com.sanjana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// CONDITIONALS
        Scanner in = new Scanner(System.in);
        int fruits = in.nextInt();

        switch(fruits) {
            case 1:
                System.out.println("'APPLE'");
                break;
            case 2:
                System.out.println("'BANANA'");
                break;
            default:
                System.out.println("'NO MORE FRUITS'");
        }
    }
}
