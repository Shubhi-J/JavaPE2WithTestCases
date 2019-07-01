package com.stackroute.javape2;

public class ReverseAndPalindromeChecker {
    public String reverseAndPalindromeChecker(String inputString) {
        String outputString="";
        if(inputString!=null) {
            for(int loopIndex=inputString.length()-1;loopIndex>=0;loopIndex--) {
                outputString= outputString+ inputString.charAt(loopIndex);
            }
            if(inputString.equals(outputString)) {
                outputString = outputString + " true";
            } else {
                outputString = outputString + " false";
            }
        } else {
            outputString="null not allowed";
        }

        return outputString;
    }
}
