package com.itschool.session5.homework;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int age = sc.nextInt();

        //if else
        if (age >= 18) {
            System.out.println("I am adult");
        } else {
            System.out.println("I am a child");
        }
    }
}
