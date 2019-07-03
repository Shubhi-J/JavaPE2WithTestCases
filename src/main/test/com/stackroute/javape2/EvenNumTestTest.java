package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void givenEvenNumberShouldReturnTrue() {
        //arrange

        //act
        boolean result=EvenNumTest.isEven(2);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenOddNumberShouldReturnFalse() {
        //arrange

        //act
        boolean result=EvenNumTest.isEven(2);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenZeroShouldReturnTrue() {
        //arrange

        //act
        boolean result=EvenNumTest.isEven(0);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenEvenNumberOutOfBoundShouldReturnFalse() {
        //arrange

        //act
        boolean result=EvenNumTest.isEven(872837287);

        //assert
        assertEquals(false,result);
    }
}