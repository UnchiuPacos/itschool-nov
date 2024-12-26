package com.itschool.session5.homework;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declare variable
        double sideOne, sideTwo, sideThree;

        System.out.println("Enter the length of side one: ");
        sideOne = sc.nextDouble();

        System.out.println("Enter the length of side two: ");
        sideTwo = sc.nextDouble();

        System.out.println("Enter the length of side three: ");
        sideThree = sc.nextDouble();

        //determine the type of the triangle
        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("The triangle is Equilateral.");
        } else if (sideOne == sideTwo || sideTwo == sideThree) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}
// cu ocazia asta am mai si repetat geometria. <3