package com.itschool.session7.homework;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //prompt the user
        System.out.println("Enter a number between 1 and 12: ");
        int monthNumber = sc.nextInt();

        //determine the month name
        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
               monthName = "February";
               break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;

                default:
                    monthName = "Invalid month number";
        }
        System.out.println(monthName);
    }
}
