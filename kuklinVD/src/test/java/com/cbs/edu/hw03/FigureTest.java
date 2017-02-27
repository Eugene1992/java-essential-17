package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Figure Test.
 */
public class FigureTest {

    private Figure figure;

    @Before
    public void setUp() throws Exception {
        figure = new Figure("FigureTest", 5.69);
    }

    @Test
    public void calculateArea() throws Exception {
        final double EXPECTED = 5.69;
        final double ACTUAL = figure.calculateArea();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.001);
    }

}