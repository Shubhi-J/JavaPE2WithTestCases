package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileAndCalcuateFrequencyTest {
    ReadFileAndCalcuateFrequency objReadFileAndCalcuateFrequency;

    @Before
    public void setUp() {
        System.out.println("Before");
        objReadFileAndCalcuateFrequency = new ReadFileAndCalcuateFrequency();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objReadFileAndCalcuateFrequency = null;
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
    public void givenFolderShouldReturnFilesAndReadAFile() throws IOException {
        //arrange

        //act
        String result=objReadFileAndCalcuateFrequency.CalculateFrequency();

        //assert
        assertEquals("Count of [Hello] is : 1\n" +
                "Count of [World] is : 1\n" +
                "Count of [] is : 7\n" +
                "Count of [I] is : 3\n" +
                "Count of [am] is : 1\n" +
                "Count of [a] is : 1\n" +
                "Count of [woman] is : 1\n" +
                "Count of [like] is : 2\n" +
                "Count of [to] is : 2\n" +
                "Count of [sleep] is : 1\n" +
                "Count of [eat] is : 1",result);
    }
}