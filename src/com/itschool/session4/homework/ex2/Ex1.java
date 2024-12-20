package com.itschool.session4.homework.ex2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();

        //perform arithmetic op
        int add = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;
        int mod = number1 % number2;

        //display
        System.out.println("Addition: " +add);
        System.out.println("Subtraction: " +sub);
        System.out.println("Multiplication: " +mul);
        System.out.println("Division: " +div);
        System.out.println("Modulus: " +mod);

        sc.close();

    }
}
