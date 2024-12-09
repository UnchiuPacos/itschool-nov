package com.itschool.session4.homework.ex1;
import java.util.Scanner;
public class IncrementDecrement2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Original number: " + number);

        int increment = number + 1;
        System.out.println("Increment number: " + increment);

        int decrement = number - 1;
        System.out.println("Decrement number: " + decrement);

        sc.close();
 }
}
