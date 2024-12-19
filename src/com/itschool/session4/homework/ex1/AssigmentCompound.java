package com.itschool.session4.homework.ex1;

public class AssigmentCompound {
    public static void main(String[] args) {

        // Init a variable
        int number = 10;

        // initial value
        System.out.println("Initial value: " + number);

        // += operator: Add and assign
        number += 5;
        System.out.println("After += 5: " + number);

        //  subtract
        number -= 3;
        System.out.println("After -= 3: " + number);

        number *= 2;
        System.out.println("After *= 2: " + number);

        number /= 4;
        System.out.println("After /= 4: " + number);

        number %= 3;
        System.out.println("After %= 3: " + number);
    }
}
