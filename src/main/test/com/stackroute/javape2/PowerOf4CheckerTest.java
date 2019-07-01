package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOf4CheckerTest {
    PowerOf4Checker objPowerOf4Checker;

    @Before
    public void setUp() {
        System.out.println("Before");
        objPowerOf4Checker = new PowerOf4Checker();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objPowerOf4Checker = null;
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
    public void given64StringShouldReturnTrue() {
        //arrange

        //act
        boolean result=objPowerOf4Checker.powerOf4Checker(64);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void given62StringShouldReturnFalse() {
        //arrange

        //act
        boolean result=objPowerOf4Checker.powerOf4Checker(62);

        //assert
        assertEquals(false,result);
    }

    @Test
    public void given1StringShouldReturnTrue() {
        //arrange

        //act
        boolean result=objPowerOf4Checker.powerOf4Checker(1);

        //assert
        assertEquals(true,result);
    }


    @Test
    public void givenZeroStringShouldReturnFalse() {
        //arrange

        //act
        boolean result=objPowerOf4Checker.powerOf4Checker(0);

        //assert
        assertEquals(false,result);
    }
}