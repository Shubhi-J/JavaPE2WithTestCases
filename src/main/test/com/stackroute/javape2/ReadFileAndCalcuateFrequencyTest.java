package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileAndCalcuateFrequencyTest {
    ReadFileAndCalcuateFrequency objReadFileAndCalcuateFrequency;

    @Before
    public void setUp() {
        objReadFileAndCalcuateFrequency = new ReadFileAndCalcuateFrequency();
    }
    @After
    public void tearDown () {
        objReadFileAndCalcuateFrequency = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


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