package com.stackroute.javape2;

public class PowerOf4Checker {
    public boolean powerOf4Checker(int inputNum) {
        boolean output=false;
        if(inputNum==0) {
            return false;
        }
        if(inputNum==1) {
            return true;
        } else {
            while(inputNum/4<=1) {
                inputNum=inputNum/4;
            }
            if(inputNum%4==0) {
                return true;
            } else {
                return false;
            }
        }

    }
}
