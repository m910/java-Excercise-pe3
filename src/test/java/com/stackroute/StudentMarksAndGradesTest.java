package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksAndGradesTest {
    StudentMarksAndGrades studentMarksAndGrades;

    @Before
    public void setUp() throws Exception {
        studentMarksAndGrades = new StudentMarksAndGrades();
    }

    @After
    public void tearDown() throws Exception {
        studentMarksAndGrades =null;
    }

    @Test
    public void inputdataChecksForRange(){
        int[] data={30,40,50};
        assertEquals("within range",studentMarksAndGrades.studentsGradeCheck(data));
    }

    @Test
    public void inputdataChecksForRangeAndReturnsNotEqual(){
        int[] data={30,40,50};
        assertNotEquals("90",studentMarksAndGrades.studentsGradeCheck(data));
    }

    @Test
    public void inputdataIsBeyondRangeSoExpectsException(){
        int[] data={120,10,150,120};

        assertEquals("Error: Out of range",studentMarksAndGrades.studentsGradeCheck(data));

    }

    @Test
    public void inputNodataReturnsNull(){
        int[] data={ };
        assertNull(studentMarksAndGrades.studentsGradeCheck(data));
    }
}