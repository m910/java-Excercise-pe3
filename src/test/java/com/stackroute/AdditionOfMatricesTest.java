package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {
    AdditionOfMatrices additionOfMatrices;

    @Before
    public void setUp() throws Exception {
        additionOfMatrices=new AdditionOfMatrices();
    }


    @After
    public void tearDown() throws Exception {
        additionOfMatrices=null;
    }

    @Test
    public void givenTwoMatrixAreAddedAreOfSameSize(){
        int a[][]={{1,2,3},{2,3,4},{3,4,5}};
        int b[][]={{1,1,1},{2,3,4},{3,6,7}};
        int c[][]={{2,3,4},{4,6,8},{6,10,12}};
        assertEquals(c,additionOfMatrices.additionOfMatrix(a,b));
    }

    @Test
    public void givenTwoMatrixAreAddedAreOfDifferentSize(){
        int a[][]={{1,2,3},{2,3,4},{3,4,5}};
        int b[][]={{1,1,1},{2,3,4},{3,6,7}};
        int c[][]={{2,3,4},{4,6,8}};
        assertNotEquals(c,additionOfMatrices.additionOfMatrix(a,b));
    }

    @Test
    public void nullInput(){
        assertNull(additionOfMatrices.additionOfMatrix(null,null));
    }
}