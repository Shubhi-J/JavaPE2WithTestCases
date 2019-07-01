package com.stackroute.javape2;

public class EvenNumTest {
    public static boolean isEven(int number){
        try{
            if(number%2==0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }
}
