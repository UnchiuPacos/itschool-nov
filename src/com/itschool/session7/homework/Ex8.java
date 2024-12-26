package com.itschool.session7.homework;

public class Ex8 {
    public static void main(String[] args) {
        int n = 10;

        //init the first 2 Fibonacci nr
        int first = 0, second = 1;

        System.out.println("The first " + n + " numbers in the fibonacci series are: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");

            //calculate the next nr in series
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
