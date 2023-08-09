package com.sanjana;

public class Multiply {
    public static void main(String[] args) {

        int n = 12;
        int sum = 1;
        //so the table is in the format as below
        // 12 x 1 = 12
        for(int i = 1; i <= 10; i++)
        {
            sum = i * n;
            System.out.println(n+ " X " + i + " = " +sum);
        }

    }
}
