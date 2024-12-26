package com.itschool.session7.homework;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //predefined number to guess
        final int predefinedNumber = 16;

        //variable to store the user's guess
        int userGuess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number! ");

        //do while loop
        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess < predefinedNumber) {
                System.out.println("The guess is too low.");
            } else if (userGuess > predefinedNumber) {
                System.out.println("The guess is too high.");
            }
        } while (userGuess != predefinedNumber);

        System.out.println("You guessed: " + predefinedNumber);
    }
}
