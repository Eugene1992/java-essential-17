package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Square Test.
 */
public class SquareTest {

    private Square square;

    @Before
    public void setUp() throws Exception {
        square = new Square("SquareTest", 7.71);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 59.4441;
        final double ACTUAL = square.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.001);
    }

}