package com.itschool.session4.homework.ex1;
import java.util.Scanner;

public class RelationalOperator2 {
 public static void main(String[] args) {

     int lowerLimit = 1;
     int upperLimit = 100;

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a number: ");
     int number = sc.nextInt();

     if (number >= lowerLimit && number <= upperLimit) {
         System.out.println("The number is within the range of " +lowerLimit + " to " +upperLimit + ".");
     } else {
         System.out.println("The number is not within the range of " +lowerLimit + " to " +upperLimit +"." );
     }
     sc.close();
 }
}
