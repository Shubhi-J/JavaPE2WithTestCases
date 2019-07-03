package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileAndConvertIntoUppercaseTest {
    ReadFileAndConvertIntoUppercase objReadFileAndConvertIntoUppercase;

    @Before
    public void setUp() {
        objReadFileAndConvertIntoUppercase = new ReadFileAndConvertIntoUppercase();
    }
    @After
    public void tearDown () {
        objReadFileAndConvertIntoUppercase = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenFolderShouldReturnFilesAndReadAFile() throws IOException {
        //arrange

        //act
        String result=objReadFileAndConvertIntoUppercase.CalculateFrequency();

        //assert
        assertEquals("length of file is 63\n" +
                "The content of file in uppercase is: HELLO WORLD!!!!!!!\n" +
                "I AM A WOMAN.I LIKE TO SLEEP.I LIKE TO EAT.\n",result);
    }
}