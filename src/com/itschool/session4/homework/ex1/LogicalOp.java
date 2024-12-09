package com.itschool.session4.homework.ex1;
import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number: ");

        int nr = sc.nextInt();

        //logical complement operator to determine if the nr + or -
        if (!(nr < 0)) {
            System.out.println("The number is positive. ");
        } else {
            System.out.println("The number is negative. ");
        }

        sc.close();

    }
}
