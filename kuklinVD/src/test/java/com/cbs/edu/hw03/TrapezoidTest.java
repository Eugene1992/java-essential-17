package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Trapezoid Test.
 */
public class TrapezoidTest {

    private Trapezoid trapezoid;

    @Before
    public void setUp() throws Exception {
        trapezoid = new Trapezoid("TrapezoidTest", 8.25, 3.4, 5.27);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 30.69775;
        final double ACTUAL = trapezoid.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.00001);
    }

}