package com.itschool.session5.homework;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter a number to calculate factorial: ");
        number = sc.nextInt();

        //calculate factorial using a for loop
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
