package com.itschool.session4.homework.ex1;
import java.util.Scanner;

public class LogicalOp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input by user for first boolean value
        System.out.println("Enter the first boolean value (true/false): ");
        boolean firstInput = sc.nextBoolean();

        System.out.println("Enter the second boolean value (true/false): ");
        boolean secondInput = sc.nextBoolean();

        boolean negFirstInput = !firstInput;
        boolean negSecondInput = !secondInput;

        System.out.println("original first input: " + firstInput);
        System.out.println("Negated first input: " + negFirstInput);

        System.out.println("original second input: " + secondInput);
        System.out.println("Negated second input: " + negSecondInput);

        sc.close();

    }
}
