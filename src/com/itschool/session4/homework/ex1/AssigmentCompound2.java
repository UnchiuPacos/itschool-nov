package com.itschool.session4.homework.ex1;
import java.util.Scanner;
public class AssigmentCompound2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Original price: ");
        double ogPrice = sc.nextDouble();

        System.out.println("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double discountAmount = ogPrice * (discountPercentage / 100);

        ogPrice -= discountAmount;

        System.out.printf("The price after a %.2f%% discount is: %.2f" , discountPercentage, ogPrice);

        sc.close();
    }

}
