package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Triangle Test.
 */
public class TriangleTest {

    private Triangle triangle;
    @Before
    public void setUp() throws Exception {
        triangle = new Triangle("TriangleTest", 10.48, 6.73);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 35.2652;
        final double ACTUAL = triangle.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.0001);
    }

}