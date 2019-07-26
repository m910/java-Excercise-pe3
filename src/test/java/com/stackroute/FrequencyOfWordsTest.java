package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {
    FrequencyOfWords frequencyOfWords;

    @Before
    public void setUp() throws Exception {
        frequencyOfWords=new FrequencyOfWords();
    }

    @After
    public void tearDown() throws Exception {
        frequencyOfWords =null;
    }

    @Test
    public void inputPathNameIsReadAndFrequencyOfWordsIsReturned(){
        try {
            File file = new File("/home/cgi/Downloads/random/hello.txt");

            assertEquals("[hello : 1, world : 1, welcome : 1, to : 1, programming : 1, experience : 1, the : 1, commitment : 1]", frequencyOfWords.frequencyWord(new File("/home/cgi/Downloads/random/hello.txt")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void inputPathNameChecksForNotEquality(){
        try {
            File file = new File("/home/cgi/Downloads/random/hello.txt");

            assertNotEquals("[hello : 1, the : 1, commitment : 1]", frequencyOfWords.frequencyWord(new File("/home/cgi/Downloads/random/hello.txt")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void inputPathNameShouldReturnSomeValues(){
        try {
            File file = new File("/home/cgi/Downloads/random/hello.txt");

            assertNotNull(frequencyOfWords.frequencyWord(new File("/home/cgi/Downloads/random/hello.txt")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

