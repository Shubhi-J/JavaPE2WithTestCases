package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable objMember_variable;

    @Before
    public void setUp() {
        objMember_variable = new Member_Variable();
    }
    @After
    public void tearDown () {
        objMember_variable = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenVariablesShouldReturnVariables() {
        //arrange

        //act
        objMember_variable.setVariables();

        //assert
        assertEquals("name is Shubhi age is 22 salary is 27500.0",objMember_variable.display());
    }


}