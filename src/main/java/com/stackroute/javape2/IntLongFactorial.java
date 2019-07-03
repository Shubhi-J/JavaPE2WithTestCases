package com.stackroute.javape2;

import java.math.BigInteger;

public class IntLongFactorial {

    // find factorial of integer which is in range of Integer
    public String findFactorialInRangeOfInteger() {
        String outputMsg = "the factorial of " + 1 + " is " + 1 + "\n";
        long fact = 1;

        for (int loopIndex = 2; loopIndex <= fact + 1; loopIndex++) {
            fact = fact * loopIndex;
            // if factorial of number is in range of Integer, calculate factorial
            if (fact <= Integer.MAX_VALUE) {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is " + fact + "\n";
            // if factorial of number is out of range of Integer, return out of bound message
            } else {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is out of bound";
                return outputMsg;
            }
        }
        return outputMsg;
    }

    // find factorial of integer which is in range of Long
    public String findFactorialInRangeOfLong() {
        String outputMsg = "the factorial of " + 1 + " is " + 1 + "\n";
        long fact = 1;
        for (int loopIndex = 2; loopIndex <= fact + 1; loopIndex++) {
            fact = fact * loopIndex;
            // if factorial of number is in range of Long, calculate factorial
            if (fact > 0 && fact <= Long.MAX_VALUE) {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is " + fact + "\n";
             // if factorial of number is out of range of Long, return out of bound message
            } else {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is out of bound";
                return outputMsg;
            }
        }
        return outputMsg;
    }
}
