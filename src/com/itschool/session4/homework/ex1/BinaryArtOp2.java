package com.itschool.session4.homework.ex1;
import java.util.Scanner;

public class BinaryArtOp2 {
    public static void main(String[] args) {

        // create a scanner for user inp
        Scanner sc = new Scanner(System.in);

        //user input to enter length and breadth
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;

        System.out.println("The area of the rectangle is " + area);

        sc.close();

    }
}
