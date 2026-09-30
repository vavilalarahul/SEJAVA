package com.example.my_maven_project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest 
{
    @Test
    public void testSum() 
    {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testSubtraction() 
    {
        assertEquals(2, 5 - 3);
    }

    @Test
    public void testMultiplication() 
    {
        // Deliberately wrong to simulate a failure
        assertEquals(6, 2 * 3);
    }

    @Test
    public void testDivision() 
    {
        // Deliberately wrong to simulate a failure
        assertEquals(5, 10 / 2);
    }
}