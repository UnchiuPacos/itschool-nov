package com.itschool.session7.homework;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (true) {
            //display the menu
            System.out.println("\nMenu: ");
            System.out.println("1. Print 'Hello world' ");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello world!");
                    continue;
                case 2:
                    if (name.isEmpty()) {
                        System.out.println("Enter your name: " + name);
                        name = sc.next(); //store the user's name
                    }
                    System.out.println("Hello " + name + "!");
                    continue; // show the menu again
                case 3:
                    System.out.println("Bye bye!");
                    break;
            }
            if (choice == 3) {
                break; //exit loop
            }
            //invalid choice
            System.out.println("Invalid choice! ");
        }
    }
}
