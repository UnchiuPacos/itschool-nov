package com.itschool.session5.homework;

public class Ex6 {
    public static void main(String[] args) {
        int temperature = 31;

        //check temperature and print
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
