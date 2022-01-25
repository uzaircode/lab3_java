package com.lab3;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;

        System.out.println("=======MENU=======");
        System.out.println("1. Calculate Area of Rectangle");
        System.out.println("2. Calculate Area of Circle");
        System.out.println("3. Exit Program");

        System.out.print("Please enter your choice: ");
        int choice = input.nextInt();

        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();
                    area = width * length;
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();
                    area = Math.PI * Math.pow(radius, 2);
                    break;

                default:
                    System.out.println("Invalid input.");
                    area = 0;
            }
            System.out.printf("The area is %.2f\n", area);
            System.out.print("\nPlease enter your choice: ");
            choice = input.nextInt();
        }
        System.out.println ("Program End.");
    }
}
