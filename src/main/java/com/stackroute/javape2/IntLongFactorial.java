package com.stackroute.javape2;

import java.math.BigInteger;

public class IntLongFactorial {

    public String findFactorialInRangeOfInteger() {
        String outputMsg = "the factorial of " + 1 + " is " + 1 + "\n";
        long fact = 1;

        for (int loopIndex = 2; loopIndex <= fact + 1; loopIndex++) {
            fact = fact * loopIndex;
            if (fact <= Integer.MAX_VALUE) {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is " + fact + "\n";
            } else {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is out of bound";
                return outputMsg;
            }
        }
        return outputMsg;
    }

    public String findFactorialInRangeOfLong() {
        String outputMsg = "the factorial of " + 1 + " is " + 1 + "\n";
        long fact = 1;
        for (int loopIndex = 2; loopIndex <= fact + 1; loopIndex++) {
            fact = fact * loopIndex;
            if (fact > 0 && fact <= Long.MAX_VALUE) {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is " + fact + "\n";
            } else {
                outputMsg = outputMsg + "the factorial of " + loopIndex + " is out of bound";
                return outputMsg;
            }
        }
        return outputMsg;
    }
}
