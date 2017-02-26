package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Rhombus Test.
 */
public class RhombusTest {

    private Rhombus rhombus;

    @Before
    public void setUp() throws Exception {
        rhombus = new Rhombus("RhombusTest", 8.29, 4.16);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 34.4864;
        final double ACTUAL = rhombus.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.0001);
    }

}