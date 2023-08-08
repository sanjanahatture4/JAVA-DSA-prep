package com.sanjana;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


       // WHILE LOOP
        int i = 12;
        while(i < 15){
            System.out.println("GREAT");
            i++;
        }

        //FOR LOOP
        for(int l=8; l<=10; l++)
        {
            System.out.println("VALUE AT " + l + "th POSITION: " + l);
        }

        //DO WHILE LOOP
        int j = 8;
        do{
            System.out.println(j);
            j++;
        }
        while(j < 10);
    }

}
