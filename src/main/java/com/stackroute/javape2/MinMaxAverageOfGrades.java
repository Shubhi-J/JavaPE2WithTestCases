package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MinMaxAverageOfGrades {
    public String findMinMaxAverageOfGrade(int noOfStudent,int[] grades) {
        String outputMsg="";
        float sumOfGrades=0,average=0;
        int min=0,max=0;
        for(int loopIndex=0;loopIndex<grades.length;loopIndex++) {
            // check if grades are between 0 and 100
            if(grades[loopIndex]>=0 && grades[loopIndex]<=100) {
               if(loopIndex<grades.length-1) {
                    // find minimum grade
                    if (grades[loopIndex] < grades[loopIndex + 1]) {
                        min = grades[loopIndex];
                    } else {
                        // find maximum grade
                        max = grades[loopIndex];
                    }
                }
               // find sum of grades
            sumOfGrades=sumOfGrades+grades[loopIndex];

            } else {
                outputMsg="the grade should be between 0 and 100";
                return outputMsg;
            }
        }
        // calculate average of all grades
        average=sumOfGrades/noOfStudent;
        outputMsg="the average is "+average+" the minimum is "+min+" the maximum is "+max;



        return outputMsg;
    }
}
