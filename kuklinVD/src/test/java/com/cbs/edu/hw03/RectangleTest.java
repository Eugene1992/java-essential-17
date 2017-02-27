package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Rectangle Test.
 */
public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle("RectangleTest", 7.71, 6.78);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 52.2738;
        final double ACTUAL = rectangle.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.001);
    }
}