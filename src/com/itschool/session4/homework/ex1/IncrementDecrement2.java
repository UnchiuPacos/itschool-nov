package com.itschool.session4.homework.ex1;
import java.util.Scanner;
public class IncrementDecrement2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();


        System.out.println("Original number: " + number);

       //increment
        System.out.println("Incremented number: " + ++number);

        //Decrement
        System.out.println("Decremented number: " + --number);

        sc.close();
 }
}
