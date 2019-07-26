package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() throws Exception {
        chessBoard=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard=null;
    }

    @Test
    public void chessBoardPatternIsSameAsExpectedOutput(){
        assertEquals("Pattern Formed",chessBoard.chessBoardPattern(5,5));

    }


    @Test
    public void chessBoardPatternIsNotSameAsExpectedOutput(){
        assertNotEquals("Pattern Not Formed",chessBoard.chessBoardPattern(6,6));

    }


    @Test
    public void nullInput(){

        assertNull(chessBoard.chessBoardPattern(0,0));
    }
}