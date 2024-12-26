package com.itschool.session5.homework;

public class Ex16 {
    public static void main(String[] args) {
        //example score
        double score = 69.9;

        //letter grades
        if(score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
