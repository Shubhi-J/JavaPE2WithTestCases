package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable objMember_variable;

    @Before
    public void setUp() {
        System.out.println("Before");
        objMember_variable = new Member_Variable();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objMember_variable = null;
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
    public void givenVariablesShouldReturnVariables() {
        //arrange

        //act
        objMember_variable.setVariables();

        //assert
        assertEquals("name is Shubhi age is 22 salary is 27500.0",objMember_variable.display());
    }


}