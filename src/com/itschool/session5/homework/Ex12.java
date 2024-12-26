package com.itschool.session5.homework;

public class Ex12 {
    public static void main(String[] args) {
        //declare and init bool var
        boolean isRaining = true;
        boolean isSunny = false;

        //negate the values using the logical operator
        boolean notRaining = !isRaining;
        boolean notSunny = !isSunny;

        System.out.println("Original value of isRaining: " + isRaining);
        System.out.println("Negated value of isRaining: " +notRaining);
        System.out.println("Original value of isSunny: " + isSunny);
        System.out.println("Negated value of isSunny: " +notSunny);
    }
}
