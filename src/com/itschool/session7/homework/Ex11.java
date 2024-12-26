package com.itschool.session7.homework;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0; //to count how many nr are

        System.out.println("Enter numbers to calculate the average. Enter 0 to stop:");

        while (true) {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }
            //add the number to the sum and increment the count
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered. ");
        }
    }
}
