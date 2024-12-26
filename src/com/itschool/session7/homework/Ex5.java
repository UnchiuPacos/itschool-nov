package com.itschool.session7.homework;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input to enter number of terms
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        //check for input
        if (n <= 0) {
            System.out.println("Please enter a positive integer. ");
        } else {
            System.out.println("Fibonacci series is " + n + ".");

            //init first 2 terms
            int first = 0, second = 1;
            for ( int i = 1; i <= n; i++ ) {
                System.out.println(first + " ");

                //calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
