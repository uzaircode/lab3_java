package com.lab3;

import java.util.Scanner;

public class question1 {

    //method definition
    public static void checkNumbers(int num)
    {

        if (num > 0)
            System.out.println(num +" is a positive number.");
        else if (num < 0)
            System.out.println(num +" is a negative number.");
        else
            System.out.println(num +" is a zero number.");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print ("Enter a number: ");
            int n = input.nextInt ();

            checkNumbers(n);
        }

    }
}
