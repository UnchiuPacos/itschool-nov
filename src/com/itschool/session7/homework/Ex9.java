package com.itschool.session7.homework;

public class Ex9 {
    public static void main(String[] args) {
        //array of int
        int[] numbers = {10, 15, 25, 33, 50, 55, 66};

        System.out.println("Checking if each number is Even or Odd: ");

        //loop
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " - Even");
            } else {
                System.out.println(number + " - Odd");
            }
        }
    }
}
