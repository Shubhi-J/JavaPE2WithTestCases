package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class FindFilesOfFolderAndReadAFileTest {
    FindFilesOfFolderAndReadAFile objFindFilesOfFolderAndReadAFile;

    @Before
    public void setUp() {
        objFindFilesOfFolderAndReadAFile = new FindFilesOfFolderAndReadAFile();
    }
    @After
    public void tearDown () {
        objFindFilesOfFolderAndReadAFile = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenFolderShouldReturnFilesAndReadAFile() throws IOException {
        //arrange

        //act
        String result=objFindFilesOfFolderAndReadAFile.getFilesFromFolder();

        //assert
        assertEquals("lib HelloWorld.txt\n" +
                "Hello World!!!!!!!\n" +
                "I am a woman.I like to sleep.I like to eat.",result);
    }
}