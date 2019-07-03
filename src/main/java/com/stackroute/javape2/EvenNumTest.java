package com.stackroute.javape2;

public class EvenNumTest {
    public static boolean isEven(int number){
        try{
            // if number mod 2 is zero, then number is even number
            if(number%2==0) {
                return true;
            // if number mod 2 is not zero, then number is odd number
            } else {
                return false;
            }
            // return false if exception occurs
        } catch (Exception e) {
            return false;
        }

    }
}
