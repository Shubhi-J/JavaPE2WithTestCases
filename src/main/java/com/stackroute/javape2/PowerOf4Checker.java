package com.stackroute.javape2;

public class PowerOf4Checker {
    public boolean powerOf4Checker(int inputNum) {
        boolean output=false;
        // check if number is zero, then it is not a power of 4
        if(inputNum==0) {
            return false;
        }
        // check if number is one, then it is always a power of 4
        if(inputNum==1) {
            return true;
        } else {
            // run loop until the quotient less then one
            while(inputNum/4<=1) {
                inputNum=inputNum/4;
            }
            // check if number mod zero is 0, if yes return true, else return false
            if(inputNum%4==0) {
                return true;
            } else {
                return false;
            }
        }

    }
}
