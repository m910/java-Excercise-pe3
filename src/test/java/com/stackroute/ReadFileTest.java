package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ReadFileTest {
    ReadFile readFile;

    @Before
    public void setUp() throws Exception {
        readFile=new ReadFile();
    }

    @After
    public void tearDown() throws Exception {
        readFile=null;
    }

    @Test
    public void inputPathNameShouldReturnEqualStringValue(){
        try {
            File input = new File("/home/cgi/Downloads/random/hello.txt");
            assertEquals("Done", readFile.contentRead(input));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void inputPathNameIsCheckingForNotEqualStringValue(){
        try {
            File input = new File("/home/cgi/Downloads/random/hello.txt");
            assertNotEquals("adasdasdasd", readFile.contentRead(input));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

