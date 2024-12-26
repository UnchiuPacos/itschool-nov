package com.itschool.session5.homework;

public class Ex15 {
    public static void main(String[] args) {
        //declare and init boolean var
        boolean hasUsername = true;
        boolean hasPassword = false;

        //check authentication conditions
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication failed");
        }
    }
}
