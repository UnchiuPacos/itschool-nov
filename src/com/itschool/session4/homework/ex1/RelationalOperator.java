package com.itschool.session4.homework.ex1;
import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("The first number is greater than the second");
        } else if (a < b) {
            System.out.println("The first number is less than the second");
        } else {
            System.out.println("The first number is equal to the second");
        }
        sc.close();
    }
}
