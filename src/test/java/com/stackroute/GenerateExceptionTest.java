package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionTest {
    GenerateException generateException;

    @Before
    public void setUp() throws Exception {
        generateException = new GenerateException();
    }

    @After
    public void tearDown() throws Exception {

        generateException=null;
    }

    @Test
    public void inputDataWillThrowExceptions(){
        assertEquals("Done",generateException.exceptionGenerate(0,3,-1));
    }

    @Test
    public void inputDataValidatesForNotEquality(){
        assertEquals("Done",generateException.exceptionGenerate(0,3,-1));
    }





}