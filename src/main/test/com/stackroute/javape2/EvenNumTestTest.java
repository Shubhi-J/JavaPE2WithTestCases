package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    // EvenNumTest objEvenNumTest;

//    @Before
//    public void setUp() {
//        System.out.println("Before");
//       // objEvenNumTest = new EvenNumTest();
//    }
//    @After
//    public void tearDown () {
//        System.out.println("After");
//        // objEvenNumTest = null;
//    }
//
//    @BeforeClass
//    public static void setUpBeforeClass() {
//        System.out.println("BeforeClass");
//    }
//    @AfterClass
//    public static void tearDownAfterClass () {
//        System.out.println("AfterClass");
//    }
//

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