package com.itschool.session5.homework;

public class Ex4 {
    public static void main(String[] args) {
        //declare 2 integer var
        int heightOne = 175;
        int heightTwo = 190;

        //ternary operator
        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("The greater height is: " + maximumHeight);
    }
}
