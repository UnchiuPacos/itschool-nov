package com.itschool.session5.homework;

public class Ex9 {
    public static void main(String[] args) {
        //2 string var
        String countryOne = "USA";
        String countryTwo = "USA";

        //check if countryOne and countryTwo are = using equals() method
        boolean areEqual = countryOne.equals(countryTwo);
        System.out.println("Are countryOne and countryTwo equal? " + areEqual);

        //changes for countryTwo
        countryTwo = "UK";

        //check for equality again
        areEqual = countryOne.equals(countryTwo);
        System.out.println("Are countryOne and countryTwo equal? " + areEqual);
    }
}
