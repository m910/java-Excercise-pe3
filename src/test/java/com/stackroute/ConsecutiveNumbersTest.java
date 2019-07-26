package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumbers;

    @Before
    public void setUp() throws Exception {
        consecutiveNumbers=new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers=null;
    }

    @Test
    public void givenInputNumberStringInDescendingOrderAreConsecutive() {

        assertEquals("Numbers are Consecutive", consecutiveNumbers.consecutiveNumbers("54,53,52,51,50,49,48"));
    }

    @Test
    public void givenInputNumbersStringInAscendingOrderAreConsecutive() {
        assertEquals("Numbers are Consecutive", consecutiveNumbers.consecutiveNumbers("1,2,3,4,5,6,7"));
    }


    @Test
    public void givenInputNumbersStringInDescendingOrderAreNotConsecutive() {
        assertNotEquals("Numbers are Not Consecutive", consecutiveNumbers.consecutiveNumbers("98,96,95,94,93,90"));
    }


    @Test
    public void givenInputNumbersStringInAscendingOrderAreNotConsecutive() {
        assertNotEquals("Numbers are Not Consecutive", consecutiveNumbers.consecutiveNumbers("1,2,3,4,5,6,6"));
    }



    @Test
    public void nullInput(){
        assertNull(consecutiveNumbers.consecutiveNumbers(null));

    }
}