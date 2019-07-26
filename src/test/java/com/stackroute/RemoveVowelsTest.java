package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;

    @Before
    public void setUp() throws Exception {
        removeVowels = new RemoveVowels();

    }

    @After
    public void tearDown() throws Exception {
        removeVowels = null;
    }

    @Test
    public void givenInputMatchesOutput(){
        String[] data = {"India","United State","Germany","Ezypt","czechoslovakia"};
        String[] value = {"Ind","Untd Stt","Grmny","Ezypt","czchslvk"};

        assertEquals(value,removeVowels.vowelRemoval(data));
    }

    @Test
    public void givenInputDoesNotMatchOutput(){
        String[] data = {"India","Germany","Australia"};
        String[] value = {"Ind","","Astrli"};

        assertNotEquals(value,removeVowels.vowelRemoval(data));


    }

    @Test
    public void nullInput(){

        assertNull(removeVowels.vowelRemoval(null));
    }
}