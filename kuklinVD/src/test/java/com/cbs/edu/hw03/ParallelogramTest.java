package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Parallelogram Test.
 */
public class ParallelogramTest {
    private Parallelogram parallelogram;

    @Before
    public void setUp() throws Exception {
        parallelogram = new Parallelogram("ParallelogramTest", 4.11, 5.7, 6.93);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 28.4823;
        final double ACTUAL = parallelogram.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.001);
    }

}