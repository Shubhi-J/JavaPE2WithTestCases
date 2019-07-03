package com.stackroute.javape2;

public class ReverseAndPalindromeChecker {
    public String reverseAndPalindromeChecker(String inputString) {
        String outputString="";
        // check if input is null
        if(inputString!=null) {
            // run a reverse loop to find reverse of input string
            for(int loopIndex=inputString.length()-1;loopIndex>=0;loopIndex--) {
                outputString= outputString+ inputString.charAt(loopIndex);
            }
            // if input string and reverse string is same, it means it is a palindrome string
            if(inputString.equals(outputString)) {
                outputString = outputString + " true";
            } else {
                outputString = outputString + " false";
            }
        } else {
            // in case of null, give error message
            outputString="null not allowed";
        }

        return outputString;
    }
}
