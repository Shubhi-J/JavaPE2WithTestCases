package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseAndPalindromeCheckerTest {
    ReverseAndPalindromeChecker objReverseAndPalindromeChecker;

    @Before
    public void setUp() {
        System.out.println("Before");
        objReverseAndPalindromeChecker = new ReverseAndPalindromeChecker();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objReverseAndPalindromeChecker = null;
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
    public void givenIntegerPalindromeStringShouldReturnReverseAndTrue() {
        //arrange

        //act
        String result=objReverseAndPalindromeChecker.reverseAndPalindromeChecker("12321");

        //assert
        assertEquals("12321 true",result);
    }


    @Test
    public void givenPalindromeStringShouldReturnReverseAndTrue() {
        //arrange

        //act
        String result=objReverseAndPalindromeChecker.reverseAndPalindromeChecker("icici");

        //assert
        assertEquals("icici true",result);
    }

    @Test
    public void givenIntegerNonPalindromeStringShouldReturnReverseAndFalse() {
        //arrange

        //act
        String result=objReverseAndPalindromeChecker.reverseAndPalindromeChecker("12345");

        //assert
        assertEquals("54321 false",result);
    }

    @Test
    public void givenNonPalindromeStringShouldReturnReverseAndfalse() {
        //arrange

        //act
        String result=objReverseAndPalindromeChecker.reverseAndPalindromeChecker("hello");

        //assert
        assertEquals("olleh false",result);
    }

    @Test

    public void givenNullShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objReverseAndPalindromeChecker.reverseAndPalindromeChecker(null);

        //assert
        assertEquals("null not allowed",result);
    }
}