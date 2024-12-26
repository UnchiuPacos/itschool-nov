package com.itschool.session7.homework;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0; //to store the sum of nr
        System.out.println("Enter 10 nr: ");

        //loop
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter " + i + " nr: ");
            int number = sc.nextInt();

            if (number <= 5) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum of nr greater than 5 is: " + sum);
    }
}
