package com.itschool.session7.homework;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input for a string
        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();

        //reverse the string
        String reversedString = new StringBuilder(userInput).reverse().toString();

        //print reversed string
        System.out.println(reversedString);
    }

}
