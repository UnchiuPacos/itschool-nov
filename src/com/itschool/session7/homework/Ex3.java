package com.itschool.session7.homework;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //read the size of the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        //read the elements of array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int negativeCount = 0;

        //count the negative nr in array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Number of negative integers in the array: " + negativeCount);
    }
}
