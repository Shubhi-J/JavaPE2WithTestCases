package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class FindFilesOfFolderAndReadAFileTest {
    FindFilesOfFolderAndReadAFile objFindFilesOfFolderAndReadAFile;

    @Before
    public void setUp() {
        System.out.println("Before");
        objFindFilesOfFolderAndReadAFile = new FindFilesOfFolderAndReadAFile();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objFindFilesOfFolderAndReadAFile = null;
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
        String result=objFindFilesOfFolderAndReadAFile.getFilesFromFolder();

        //assert
        assertEquals("lib HelloWorld.txt\n" +
                "Hello World!!!!!!!\n" +
                "I am a woman.I like to sleep.I like to eat.",result);
    }
}