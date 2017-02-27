package com.cbs.edu.hw03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class TriangleTest {
    private Triangle triangle;

    @Before
    public void result1() throws Exception {
        triangle = new Triangle("Triangle", 6, 2);
    }

    @Test
    public void result() throws Exception {
        final double EXPECTED = 6;
        final double ACTUAL = triangle.result();
        Assert.assertEquals(EXPECTED, ACTUAL, 0.1);
    }

}