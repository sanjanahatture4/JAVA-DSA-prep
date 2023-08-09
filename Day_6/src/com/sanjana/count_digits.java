package com.sanjana;

public class count_digits {
    static int count(int n)
    {
        int count = 0;
        while(n>0)
        {
            count++;
            n = n / 10;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 1122334455;
        System.out.println(count(n));
    }
}
