package com.itschool.session7.homework;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        //create a scanner
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter an int
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        //check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
