package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class MinMaxAverageOfGradesTest {
    MinMaxAverageOfGrades objMinMaxAverageOfGrades;

    @Before
    public void setUp() {
        System.out.println("Before");
        objMinMaxAverageOfGrades = new MinMaxAverageOfGrades();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objMinMaxAverageOfGrades = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass () {
        System.out.println("AfterClass");
    }


    @Test
    public void givenGradesofFourInRangeShouldReturnMinMaxAverage(){
        //arrange

        //act
        String result=objMinMaxAverageOfGrades.findMinMaxAverageOfGrade(4,new int[] {89,90,67,87});

        //assert
        assertEquals("the average is 83.25 the minimum is 67 the maximum is 90",result);
    }

    @Test
    public void givenGradesofFiveOutOfRangeShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objMinMaxAverageOfGrades.findMinMaxAverageOfGrade(5,new int[] {89,105,67,87,0});

        //assert
        assertEquals("the grade should be between 0 and 100",result);
    }

    @Test
    public void givenFourStudentsFiveGradesShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objMinMaxAverageOfGrades.findMinMaxAverageOfGrade(5,new int[] {89,105,67,87,0});

        //assert
        assertEquals("the grade should be between 0 and 100",result);
    }


    @Test
    public void givenGradesofFourAsStringShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objMinMaxAverageOfGrades.findMinMaxAverageOfGrade(4,new int[] {89,'u',67,87});

        //assert
        assertEquals("the grade should be between 0 and 100",result);
    }

}