package com.itschool.session4.homework.ex1;
import java.util.Scanner;

public class BinaryArtOp {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        // perform calc
        double addition = num1 + num2;
        double substraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = (num2 != 0) ? num2 / num1 : 0;
        double modulus = (num2 != 0) ? num2 % num1 : 0;

        //display results
        System.out.println("Results: ");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Division and modulus oper. cannot be performed by 0");
        }

        sc.close();


    }
}
