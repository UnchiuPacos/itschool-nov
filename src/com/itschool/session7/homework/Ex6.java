package com.itschool.session7.homework;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0; //store the sum of nr
        int number;

        System.out.println("Enter numbers to sum. Type -1 to stop. ");

        //loop
        while (true) {
            number = sc.nextInt();

            if (number == -1) {
                break;
            }
            sum += number;
        }
            System.out.println("The sum is: " + sum);

    }
}
