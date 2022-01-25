package com.lab3;

import java.util.Scanner;

public class question3 {

    public static int getTotal(int n) {
        int sum=0;
        sum = sum + n;
        return sum;
    }

    public static double getAverage(double s) {
        double average;
        average = s / 3;
        return average;
    }

    public static void printAll(double s, double a) {
        System.out.printf("\nThe total score of the quizzes is = %.0f" , s);
        System.out.printf("\nThe average of score is = %.2f" , a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        double average = 0;

        for(int i = 0; i<3; i++)
        {
            System.out.print("Enter score for Quiz " + (i+1) + ": ");
            num = input.nextInt();
            sum += getTotal(num);
        }
        average = getAverage(sum);

        printAll(sum,average);

    }

}
