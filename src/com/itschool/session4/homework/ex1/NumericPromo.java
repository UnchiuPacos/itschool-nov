package com.itschool.session4.homework.ex1;

public class NumericPromo {
    public static void main(String[] args) {
        //int and a double
        int integerNr = 5;
        double doubleNr = 2.5;

        //arithmetic oper
        double addResult = integerNr + doubleNr;
        double subResult = integerNr - doubleNr;
        double multResult = integerNr * doubleNr;
        double divResult = integerNr / doubleNr;

        //results
        System.out.println("integer: " + integerNr);
        System.out.println("double: " + doubleNr);

        System.out.println("addition: " + addResult);
        System.out.println("subtraction: " + subResult);
        System.out.println("multiplication: " + multResult);
        System.out.println("division: " + divResult);
    }
}
