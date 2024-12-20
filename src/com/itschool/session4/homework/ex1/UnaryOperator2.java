package com.itschool.session4.homework.ex1;
import java.util.Scanner;

public class UnaryOperator2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int a = sc.nextInt();

        // reverse the sign using unary minus op "-"
        int reversedA = -a;

        //display the og and reversed val
        System.out.println("original number: "+ a);
        System.out.println("reversed number: "+ reversedA);

        sc.close();

    }
}
