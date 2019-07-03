package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class IntLongFactorialTest {
    IntLongFactorial objIntLongFactorial;

    @Before
    public void setUp() {
        objIntLongFactorial = new IntLongFactorial();
    }
    @After
    public void tearDown () {
        objIntLongFactorial = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void invokeIntFactorialShouldReturnFactorialOfAllNumbersInIntegerRange(){
        //arrange

        //act
        String result=objIntLongFactorial.findFactorialInRangeOfInteger();

        //assert
        assertEquals("the factorial of 1 is 1\n" +
                "the factorial of 2 is 2\n" +
                "the factorial of 3 is 6\n" +
                "the factorial of 4 is 24\n" +
                "the factorial of 5 is 120\n" +
                "the factorial of 6 is 720\n" +
                "the factorial of 7 is 5040\n" +
                "the factorial of 8 is 40320\n" +
                "the factorial of 9 is 362880\n" +
                "the factorial of 10 is 3628800\n" +
                "the factorial of 11 is 39916800\n" +
                "the factorial of 12 is 479001600\n" +
                "the factorial of 13 is out of bound",result);
    }


    @Test
    public void invokeLongFactorialShouldReturnFactorialOfAllNumbersInLongRange(){
        //arrange

        //act
        String result=objIntLongFactorial.findFactorialInRangeOfLong();

        //assert
        assertEquals("the factorial of 1 is 1\n" +
                "the factorial of 2 is 2\n" +
                "the factorial of 3 is 6\n" +
                "the factorial of 4 is 24\n" +
                "the factorial of 5 is 120\n" +
                "the factorial of 6 is 720\n" +
                "the factorial of 7 is 5040\n" +
                "the factorial of 8 is 40320\n" +
                "the factorial of 9 is 362880\n" +
                "the factorial of 10 is 3628800\n" +
                "the factorial of 11 is 39916800\n" +
                "the factorial of 12 is 479001600\n" +
                "the factorial of 13 is 6227020800\n" +
                "the factorial of 14 is 87178291200\n" +
                "the factorial of 15 is 1307674368000\n" +
                "the factorial of 16 is 20922789888000\n" +
                "the factorial of 17 is 355687428096000\n" +
                "the factorial of 18 is 6402373705728000\n" +
                "the factorial of 19 is 121645100408832000\n" +
                "the factorial of 20 is 2432902008176640000\n" +
                "the factorial of 21 is out of bound",result);
    }
}